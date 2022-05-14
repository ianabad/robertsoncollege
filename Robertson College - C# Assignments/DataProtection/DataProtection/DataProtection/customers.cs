using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace DataProtection
{
    [Serializable()]
    [XmlRoot(ElementName = "customers")]
    public class customers
    {
        [XmlElement(ElementName = "customer")]
        public List<customer> customerList { get; set; }

        public customers() 
        {
            customerList = new List<customer>();
        }

        
    }
}
