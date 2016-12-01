using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace admbiblioteca
{
    public class Revista : Publicacion
    {
        protected string nombre, portada;
        protected DateTime fecha;

        public string Nombre
        {
            get { return this.nombre; }
            set { this.nombre = value; }
        }

        public string Portada
        {
            get { return this.portada; }
            set { this.portada = value; }
        }

        public DateTime Fecha
        {
            get { return this.fecha; }
            set { this.fecha = value; }
        }
    }
}

