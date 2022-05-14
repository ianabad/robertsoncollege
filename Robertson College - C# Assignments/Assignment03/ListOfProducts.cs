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
    [XmlInclude(typeof(Product))]
    [XmlRoot(ElementName = "ListofProducts")]
    public class ListOfProducts
    {
        [XmlElement(ElementName = "Product")]
        public List<Product> ProductList { get; set; }
        public ListOfProducts()
        {
            var context = new AppDbContext();
            ProductList = context.Products.ToList();
        }
    }
}
