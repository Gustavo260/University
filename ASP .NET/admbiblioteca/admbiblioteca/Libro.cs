using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace admbiblioteca
{
    public class Libro : Publicacion
    {
        #region definicion de variables de la clase libro
        /// <summary>
        /// se definen las variables isbn y titulo
        /// </summary>
        protected string isbn, titulo;
        #endregion

        #region propiedades de la clase libro
        /// <summary>
        /// se crean las propiedades de la clase libro para hacerlas accesibles para el main
        /// </summary>
        public string ISBN
        {
            get { return this.isbn; }
            set { this.isbn = value; }
        }
        
        public string Titulo
        {
            get { return this.titulo; }
            set { this.titulo = value; }
        }
        #endregion
    }
}
