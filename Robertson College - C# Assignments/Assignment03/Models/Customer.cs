using System;
using System.Collections.Generic;
using System.Runtime.Serialization;
using System.Xml.Serialization;

#nullable disable

namespace Assignment03.Models
{
    [Serializable()]
    [XmlInclude(typeof(Customer))]
    public partial class Customer
    {
        public Customer()
        {
            Orders = new HashSet<Order>();
        }

        public Customer(SerializationInfo info, StreamingContext context)
        {
            Id = info.GetInt32("Id");
            FirstName = info.GetString("FirstName");
            LastName = info.GetString("LastName");
            Company = info.GetString("Company");
            EmailAddress = info.GetString("EmailAddress");
            JobTitle = info.GetString("JobTitle");
            BusinessPhone = info.GetString("BusinessPhone");
            HomePhone = info.GetString("HomePhone");
            MobilePhone = info.GetString("MobilePhone");
            FaxNumber = info.GetString("FaxNumber");
            Address = info.GetString("Address");
            City = info.GetString("City");
            StateProvince = info.GetString("StateProvince");
            ZipPostalCode = info.GetString("ZipPostalCode");
            CountryRegion = info.GetString("CountryRegion");
            WebPage = info.GetString("WebPage");
            Notes = info.GetString("Notes");
        }

        public int Id { get; set; }
        public string Company { get; set; }
        public string LastName { get; set; }
        public string FirstName { get; set; }
        public string EmailAddress { get; set; }
        public string JobTitle { get; set; }
        public string BusinessPhone { get; set; }
        public string HomePhone { get; set; }
        public string MobilePhone { get; set; }
        public string FaxNumber { get; set; }
        public string Address { get; set; }
        public string City { get; set; }
        public string StateProvince { get; set; }
        public string ZipPostalCode { get; set; }
        public string CountryRegion { get; set; }
        public string WebPage { get; set; }
        public string Notes { get; set; }
        public byte[] Attachments { get; set; }

        [XmlIgnore]
        public virtual ICollection<Order> Orders { get; set; }

        public void GetObjectData(SerializationInfo info, StreamingContext context)
        {
            info.AddValue("Id", Id);
            info.AddValue("Company", Company);
            info.AddValue("LastName", LastName);
            info.AddValue("FirstName", FirstName);
            info.AddValue("EmailAddress", EmailAddress);
            info.AddValue("JobTitle", JobTitle);
            info.AddValue("BusinessPhone", BusinessPhone);
            info.AddValue("HomePhone", HomePhone);
            info.AddValue("MobilePhone", MobilePhone);
            info.AddValue("FaxNumber", FaxNumber);
            info.AddValue("Address", Address);
            info.AddValue("City", City);
            info.AddValue("StateProvince", StateProvince);
            info.AddValue("ZipPostalCode", ZipPostalCode);
            info.AddValue("CountryRegion", CountryRegion);
            info.AddValue("WebPage", WebPage);
            info.AddValue("Notes", Notes);

        }
    }
}
