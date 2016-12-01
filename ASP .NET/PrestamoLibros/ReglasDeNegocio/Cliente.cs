using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ReglasDeNegocio
{
    public class Cliente
    {
        private string nombreCliente;
        private string apellido;
        private string fono;
        private List<Prestamos> prestamos;

        public string NombreCliente
        {
            get { return this.nombreCliente; }
            set { this.nombreCliente = value; }
        }

        public string Apellido
        {
            get { return this.apellido; }
            set { this.apellido = value; }
        }

        public string Fono
        {
            get { return this.fono; }
            set { this.fono = value; }
        }

        public List<Prestamos> Prestamoss
        {
            get { return this.prestamos; }
            set { this.prestamos = value; }
        }

        public void AñadirPrestamo(Prestamos prestamo)
        {
            if (prestamo != null)
            {
                this.prestamos.Add(prestamo);
            }
        }

        public override string ToString()
        {
            return this.nombreCliente;
        }

        public Cliente() { }

        public Cliente(string nombre)
        {
            this.nombreCliente = nombre;
            this.prestamos = new List<Prestamos>();
        }

        public Cliente(string nombre, string apellido)
        {
            this.nombreCliente = nombre;
            this.apellido = apellido;
            this.prestamos = new List<Prestamos>();
        }

        public Cliente(string nombre, string apellido, List<Prestamos> prestamos)
        {
            this.nombreCliente = nombre;
            this.apellido = apellido;
            this.prestamos = prestamos;
        }
    }
}
