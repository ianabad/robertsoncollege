using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace Shapes
{
    [Serializable()]
    public class Circle : Shape
    {
        public Circle() { }

        public double Radius { get; set; }

        public override string Name
        {
            get { return "Circle"; }
        }

        public override double Area
        {
            get { return Radius * Radius * Math.PI; }
        }
    }
}
