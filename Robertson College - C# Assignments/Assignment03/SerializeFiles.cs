using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment03
{
    public class SerializeFiles
    {
        public string FileName { get; set; }
        public long FileSize { get; set; }

        public static long GetFileSize(string FileName)
        {
            return new FileInfo(FileName).Length;
        }
    }
}
