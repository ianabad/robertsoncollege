using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;
using DataProtectionLibrary;

namespace DataProtection
{
    [Serializable()]
    public class customer
    {
        public customer() { }

        [XmlElement(ElementName = "name")]
        public string name { get; set; }

        [XmlElement(ElementName = "creditcard")]
        public string creditcard { get; set; }

        [XmlElement(ElementName = "password")]
        public string password { get; set; }

        public string getProtectedPassword()
        {
            return ProtectData.SaltAndHashPassword(password);
        }
    }
}
