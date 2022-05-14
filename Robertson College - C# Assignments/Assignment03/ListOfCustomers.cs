using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;
using Assignment03.Models;

namespace Assignment03
{
    [Serializable()]
    [XmlInclude(typeof(Customer))]
    [XmlRoot(ElementName = "ListofCustomers")]
    public class ListOfCustomers
    {
        [XmlElement(ElementName = "Customer")]
        public List<Customer> CustomersList { get; set; }
        public ListOfCustomers()
        {
            var context = new AppDbContext();
            CustomersList = context.Customers.ToList();
        }
    }
}
