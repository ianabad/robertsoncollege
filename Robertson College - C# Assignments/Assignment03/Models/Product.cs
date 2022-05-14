using System;
using System.Collections.Generic;
using System.Runtime.Serialization;
using System.Xml.Serialization;

#nullable disable

namespace Assignment03.Models
{
    [Serializable()]
    [XmlInclude(typeof(Product))]
    public partial class Product
    {
        public Product()
        {
            InventoryTransactions = new HashSet<InventoryTransaction>();
            OrderDetails = new HashSet<OrderDetail>();
            PurchaseOrderDetails = new HashSet<PurchaseOrderDetail>();
        }

        public Product(SerializationInfo info, StreamingContext context)
        {
            SupplierIds = info.GetString("SupplierIds");
            Id = info.GetInt32("Id");
            ProductCode = info.GetString("ProductCode");
            ProductName = info.GetString("ProductName");
            Description = info.GetString("Description");
            StandardCost = info.GetDecimal("StandardCost");
            ListPrice = info.GetDecimal("ListPrice");
            ReorderLevel = info.GetInt32("ReorderLevel");
            TargetLevel = info.GetInt32("TargetLevel");
            QuantityPerUnit = info.GetString("QuantityPerUnit");
            Discontinued = info.GetBoolean("Discontinued");
            MinimumReorderQuantity = info.GetInt32("MinimumReorderQuantity");
            Category = info.GetString("Category");
        }

        public string SupplierIds { get; set; }
        public int Id { get; set; }
        public string ProductCode { get; set; }
        public string ProductName { get; set; }
        public string Description { get; set; }
        public decimal? StandardCost { get; set; }
        public decimal ListPrice { get; set; }
        public int? ReorderLevel { get; set; }
        public int? TargetLevel { get; set; }
        public string QuantityPerUnit { get; set; }
        public bool Discontinued { get; set; }
        public int? MinimumReorderQuantity { get; set; }
        public string Category { get; set; }
        public byte[] Attachments { get; set; }

        [XmlIgnore]
        public virtual ICollection<InventoryTransaction> InventoryTransactions { get; set; }
        [XmlIgnore]
        public virtual ICollection<OrderDetail> OrderDetails { get; set; }
        [XmlIgnore]
        public virtual ICollection<PurchaseOrderDetail> PurchaseOrderDetails { get; set; }

        public void GetObjectData(SerializationInfo info, StreamingContext context)
        {
            info.AddValue("SupplierIds", SupplierIds);
            info.AddValue("Id", Id);
            info.AddValue("ProductCode", ProductCode);
            info.AddValue("ProductName", ProductName);
            info.AddValue("Description", Description);
            info.AddValue("StandardCost", StandardCost);
            info.AddValue("ListPrice", ListPrice);
            info.AddValue("ReorderLevel", ReorderLevel);
            info.AddValue("TargetLevel", TargetLevel);
            info.AddValue("QuantityPerUnit", QuantityPerUnit);
            info.AddValue("Discontinued", Discontinued);
            info.AddValue("MinimumReorderQuantity", MinimumReorderQuantity);
            info.AddValue("Category", Category);
        }
    }
}
