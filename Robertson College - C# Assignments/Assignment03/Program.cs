using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.Serialization.Formatters.Binary;
using System.Xml.Serialization;
using static System.Console;

namespace Assignment03
{
    public class Program
    {
        static void Main(string[] args)
        {
            WriteLine("Press anything to start the serialization process.");
            ReadKey(true);
            WriteLine("--------------------------------------------------");
            List<SerializeFiles> list = new List<SerializeFiles>();
            ListOfCustomers customers = new ListOfCustomers();
            ListOfProducts products = new ListOfProducts();

            // Binary Serialization 
            WriteLine("Binary serialization in progress...");
            string file = "Customer.dat";
            using (Stream stream = File.Open(file, FileMode.Create))
            {
                BinaryFormatter bf = new BinaryFormatter();
                bf.Serialize(stream, customers);
            }
            list.Add(new SerializeFiles { FileName = file, FileSize = SerializeFiles.GetFileSize(file) });

            file = "Product.dat";
            using (Stream stream = File.Open(file, FileMode.Create))
            {
                BinaryFormatter bf = new BinaryFormatter();
                bf.Serialize(stream, products);
            }
            list.Add(new SerializeFiles { FileName = file, FileSize = SerializeFiles.GetFileSize(file) });
            WriteLine("Binary serialization in completed");

            // XML Serialization
            WriteLine("XML serialization in progress...");
            file = "Customer.xml";
            XmlSerializer xs = new XmlSerializer(typeof(ListOfCustomers));

            using (FileStream fs = File.Create(file))
            {
                xs.Serialize(fs, customers);
            }
            list.Add(new SerializeFiles { FileName = file, FileSize = SerializeFiles.GetFileSize(file) });

            file = "Product.xml";
            xs = new XmlSerializer(typeof(ListOfProducts));

            using (FileStream fs = File.Create(file))
            {
                xs.Serialize(fs, products);
            }
            list.Add(new SerializeFiles { FileName = file, FileSize = SerializeFiles.GetFileSize(file) });
            WriteLine("XML serialization in completed");

            // JSON Serialization
            WriteLine("JSON serialization in progress...");
            file = "Customer.json";
            string jss = JsonConvert.SerializeObject(customers, Formatting.Indented);

            File.WriteAllText(file, jss);
            list.Add(new SerializeFiles { FileName = file, FileSize = SerializeFiles.GetFileSize(file) });

            file = "Product.json";
            jss = JsonConvert.SerializeObject(products, Formatting.Indented);

            File.WriteAllText(file, jss);
            list.Add(new SerializeFiles { FileName = file, FileSize = SerializeFiles.GetFileSize(file) });
            WriteLine("JSON serialization in completed");

            // Sorted List
            WriteLine("\nSerialization process completed");
            WriteLine("\nPrinting file uploaded (sorted by file size)...");
            WriteLine("\nFiles:");
            WriteLine("--------------------------------------------------");
            var finalList = list.OrderBy(x => x.FileSize);

            foreach (var item in finalList)
            {
                WriteLine($"{item.FileName} = {item.FileSize} bytes");
            }
        }
    }
}
