using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace admbiblioteca
{
    public class Periodico : Publicacion
    {
        #region definicion de variables clase periodico
        /// <summary>
        /// se definen las variables nombre y fecha para despues ser modificados por las propiedades y sean accesibles para el main
        /// </summary>
        protected string nombre;
        protected DateTime fecha;
        #endregion

        #region propiedades para el nombre y la fecha del periodico
        /// <summary>
        /// las propiedades se definen aca para despues usarse en la clase program.cs
        /// </summary>
        public string Nombre
        {
            get { return this.nombre; }
            set { this.nombre = value; }
        }

        public DateTime Fecha
        {
            get { return this.fecha; }
            set { this.fecha = value; }
        }
        #endregion
    }
}

