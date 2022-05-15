using System;
using System.Collections.Generic;
using System.Linq;
using CityQuery.Models;
using static System.Console;

namespace CityQuery
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Instances
            List<Customer> customers = new List<Customer>();
            List<string> custCities = new List<string>();

            // Getting Customer Data to List
            using (var ctx = new AppDbContext())
            {
                var queryCust = from cust in ctx.Customers
                                select cust;
                customers = queryCust.ToList();
            }

            // Getting & Printing Unique Cities
            foreach (var cust in customers)
            {
                custCities.Add(cust.City);
            }

            var uniqueCustCities = (from city in custCities
                                    select city).Distinct().ToList();


            WriteLine("List of available cities:");
            WriteLine("------------------------------------");

            for (int i = 0; i < uniqueCustCities.Count; i++)
            {
                if (i > 0)
                {
                    if (i % 5 == 0)
                    {
                        WriteLine();
                    }
                }

                if (i < uniqueCustCities.Count - 1)
                {
                    Write($"{uniqueCustCities[i]}, ");
                }
                else
                {
                    WriteLine(uniqueCustCities[i]);
                    WriteLine();
                }
            }

            // Prompt for City Input
            string input = string.Empty;

            Write("Enter the name of a city: ");
            input = Console.ReadLine().Trim().ToLower();

            // Match User Input to Get List of Customers in the Specified City
            var cityMatch = (from cust in customers
                             where cust.City.ToLower() == input
                             select cust).ToList();

            // Printing Results
            WriteLine($"There are {cityMatch.Count} customers in {input}:");

            for (int i = 0; i < cityMatch.Count; i++)
            {
                WriteLine($"{i + 1}: {cityMatch[i].Company}, {cityMatch[i].FirstName} {cityMatch[i].LastName}");

                if (i + 1 == cityMatch.Count)
                {
                    WriteLine();
                }
            }

        }
    }
}
