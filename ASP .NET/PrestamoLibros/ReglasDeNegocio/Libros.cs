using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ReglasDeNegocio
{
    public class Libros
    {
        private int ISBN;
        private string titulo, editorial;
        private int año_publicacion;
        private string codigo_interno;
        private Prestamos PrestamosLibros;

        public int ISBNn
        {
            get { return this.ISBN; }
            set { this.ISBN = value; }
        }

        public int Año_publicacion
        {
            get { return this.año_publicacion; }
            set { this.año_publicacion = value; }
        }

        public string Titulo
        {
            get { return this.titulo; }
            set { this.titulo = value; }
        }

        public string Editorial
        {
            get { return this.editorial; }
            set { this.editorial = value; }
        }

        public string Codigo_interno
        {
            get { return this.codigo_interno; }
            set { this.codigo_interno = value; }
        }

        public Prestamos PrestaLibros
        {
            get { return this.PrestamosLibros; }
            set { this.PrestamosLibros = value; }
        }

        public override string ToString()
        {
            return this.titulo;
        }

        public Libros() { }

        public Libros(int isbn)
        {
            this.ISBN = isbn;
        }

        public Libros(int isbn, string titulo)
        {
            this.ISBN = isbn;
            this.titulo = titulo;
        }

        public Libros(int isbn, string titulo, Prestamos prestamos)
        {
            this.ISBN = isbn;
            this.titulo = titulo;
            this.PrestamosLibros = prestamos;
        }

    }
}
