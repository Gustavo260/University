using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace admbiblioteca
{
    public class Publicacion
    {
        #region definicion de variables
        /// <summary>
        /// Se definen las variables de la clase publicacion
        /// </summary>
        protected int codigo, dias=0;
        protected string autor, editorial, estado;
        protected DateTime fechaDevolucion, fechaPrestamo;
        #endregion

        #region propiedades autor, codigo, editorial, estados
        /// <summary>
        /// Se agregan propiedades para hacer accesible los campos de la clase publicacion
        /// </summary>
        public string Autor
        {
            get { return this.autor; }
            set { this.autor = value; }
        }

        public int Codigo
        {
            get { return this.codigo; }
            set { this.codigo = value; }
        }

        public string Editorial
        {
            get { return this.editorial; }
            set { this.editorial = value; }
        }

        public string Estados
        /// <summary>
        /// Esta es una propiedad extra para el estado disponible o no disponible de los metodos prestar y devolver
        /// </summary>
        {
            get { return this.estado; }
            set { this.estado = value; }
        }
        #endregion

        #region metodos void prestar y devolver
        public void Devolver()
        {
            /// <summary>
            /// en el metodo devolver el estado cambia a disponible despues de averse devuelto una publicacion
            /// </summary>
            estado = "disponible";
            Console.WriteLine("La publicacion se encuentra en estado: "+estado);
            Console.ReadKey();
        }

        public void Prestar(int dias)
        {
            /// <summary>
            /// en el metodo prestar el estado cambia a no disponible despues de averse prestado una publicacion, teniendo como parametro "dias" 
            /// para despues calcular los dias en que se presta la publicacion
            /// </summary>
            estado = "no disponible";
            Console.WriteLine("La publicacion se encuentra en estado: "+estado);
            Console.ReadKey();
        }
        #endregion
    }
}
