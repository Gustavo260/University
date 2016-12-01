using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ReglasDeNegocio
{
    public class Prestamos
    {
        private string nombrePrestamo;
        private string fechavencimientoPrestamo;
        private string fecha_devolucion;
        private string fecha_solicitud;
        private List<Libros> libros;
        private Cliente clientePrestamo;

        public string NombrePrestamo
        {
            get { return this.nombrePrestamo; }
            set { this.nombrePrestamo = value; }
        }

        public string Fecha_solicitud
        {
            get { return this.fecha_solicitud; }
            set { this.fecha_solicitud = value; }
        }

        public string Fecha_vencimientoPrestamo
        {
            get { return this.fechavencimientoPrestamo; }
            set { this.fechavencimientoPrestamo = value; }
        }

        public string Fecha_devolucion
        {
            get { return this.fecha_devolucion; }
            set { this.fecha_devolucion = value; }
        }
        public List<Libros> Libros
        {
            get { return this.libros; }
            set { this.libros = value; }
        }

        public Cliente ClientePrestamo
        {
            get { return this.clientePrestamo; }
            set { this.clientePrestamo = value; }
        }

        public int ObtenerCantidadLibrosPrestados()
        {
            return this.libros.Count;
        }

        public void AñadirLibros(Libros libros)
        {
            if (libros != null)
            {
                this.libros.Add(libros);
            }
        }

        public override string ToString()
        {
            return this.nombrePrestamo;
        }

        public Prestamos() { }

        public Prestamos(string nombre, Cliente cliente)
        {
            this.nombrePrestamo = nombre;
            this.clientePrestamo = cliente;
            this.libros = new List<Libros>();
        }
    }
}
