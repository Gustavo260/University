using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace admbiblioteca
{
    
    public class Program
    {
        static void Main(string[] args)
        {
            #region se definen las variables para publicacion y otros
            /// <summary>
            /// Se definen las variables de la publicacion
            /// </summary>
            int codigo, dias = 0, dias2 = 0, mes=0, mes2=0;
            string autor, editorial, tipo, deside;
            string nombre="";
            string fdevolucion, fprestamo;
            #endregion

            #region Se ingresan los datos requeridos con publicacion
            /// <summary>
            /// se le pide al usuario ingresar valores para cada una de las variables definidas
            /// </summary>
            Console.Write("Ingrese el tipo de la publicación: ");
            tipo = Console.ReadLine();

            Console.Write("Ingrese el código de la publicación: ");
            codigo = Convert.ToInt32(Console.ReadLine());
            Console.Write("Ingrese el autor de la publicación: ");
            autor = Console.ReadLine();
            Console.Write("Ingrese el editorial de la publicación: ");
            editorial = Console.ReadLine();
            Console.Write("Ingrese la fecha de prestación: ");
            fprestamo = Console.ReadLine();
            Console.Write("Ingrese la fecha de devolución: ");
            fdevolucion= Console.ReadLine();
            Console.Write("\n");
            #endregion

            #region  se instancias las clases para su uso posterior
            /// <summary>
            /// Se instancian las clases para poder usarse las clases libro, periodico, revista y publicacion en el main
            /// </summary>
            Publicacion publicacion1 = new Publicacion();
            publicacion1.Codigo = codigo;
            publicacion1.Autor = autor;
            publicacion1.Editorial = editorial;
            
            Revista revista1 = new Revista();
            Libro libro1 = new Libro();
            Periodico periodico1 = new Periodico();
           #endregion

            #region se muestra informacion de la publicacion
            /// <summary>
            /// Se imprime los resultados de la publicacion
            /// </summary>
            Console.WriteLine("El tipo de publicacion es: " + tipo);
            Console.WriteLine("El autor de la publicacion es: " + publicacion1.Autor);
            Console.WriteLine("El codigo de la publicacion es: " + publicacion1.Codigo);
            Console.WriteLine("El editorial de la publicacion es: " + publicacion1.Editorial);
            Console.ReadKey();
            Console.Write("\n");
            #endregion

            #region el usuario escoje si devolver, salir o prestar
            /// <summary>
            /// Se le pide al usuario escojer entre 3 opciones
            /// </summary>
            Console.Write("¿Que acción desea realizar?\ningrese una letra [P=Prestar ; D=Devolver ; S=salir]: ");
            deside = Console.ReadLine();
            #endregion

            #region seccion para devolucion
            /// <summary>
            /// el usuario escoje de las 3 publicaciones si desea devolver una publicacion
            /// </summary>
            if (deside == "D" || deside == "d")
            {
                Console.Write("Tipo de publicación a devolver: ");
                //Console.ReadLine();
                String deside2 = Console.ReadLine();
                deside2 = deside2.ToLower();
                #region se devuelve revista

                if (deside2 == "revista")
                {
                    Console.Write("Ingrese el nombre de la revista: ");
                    nombre = Console.ReadLine();
                    revista1.Nombre = nombre;
                    publicacion1.Devolver();
                    Console.Write("La revista "+revista1.Nombre+" se devolvio el :"+fdevolucion);
                    Console.ReadKey();
                }
                #endregion

                #region se devuelve libro
                else if (deside2 == "libro")
                {
                    
                    Console.Write("Ingrese el nombre del libro: ");
                    nombre = Console.ReadLine();
                    publicacion1.Devolver();
                    libro1.Titulo = nombre;
                    Console.Write("El libro "+libro1.Titulo+" se devolvio el :" + fdevolucion);
                    Console.ReadKey();
                }
                #endregion

                #region Se devuelve periodico
                else if (deside2 == "periodico")
                {
                    Console.Write("Ingrese el nombre del periodico: ");
                    nombre = Console.ReadLine();
                    periodico1.Nombre = nombre;
                    publicacion1.Devolver();
                    Console.Write("El periodico "+periodico1.Nombre+" se devolvio el :" + fdevolucion);
                    Console.ReadKey();

                }
                #endregion

                else
                {
                    Console.Write("\nNo existe ese tipo de publicación..\n[presione un boton para salir]");
                    Console.ReadKey();
                    System.Environment.Exit(-1);
                }
            }
            #endregion

            #region seccion de prestado
            /// <summary>
            /// el usuario escoje de las 3 publicaciones si desea prestar una publicacion
            /// </summary>
            else if (deside == "P" || deside == "p")
            {
                Console.Write("Tipo de publicación a prestar: ");
                String deside2 = Console.ReadLine();
                Console.ReadLine();
                deside2 = deside2.ToLower();

                if (deside2 == "revista")
                {
                    int resta = 0;
                    int restames = 0;
                    Console.Write("Ingrese el nombre de la revista: ");
                    nombre = Console.ReadLine();
                    DateTime fechaPre = Convert.ToDateTime(fprestamo);
                    DateTime fechaDev = Convert.ToDateTime(fdevolucion);
                    revista1.Fecha = fechaPre;
                    revista1.Nombre = nombre;
                    dias = fechaPre.Day;
                    dias2 = fechaDev.Day;
                    mes = fechaPre.Month;
                    mes2 = fechaDev.Month;
                    restames = mes2-mes;
                    resta = (dias2 - dias)+ 30*restames;
                    publicacion1.Prestar(dias);
                    Console.Write("La revista "+revista1.Nombre+" se prestó por: " + resta + " dias ");
                    Console.ReadKey();
                }
                else if (deside2 == "libro")
                {
                    int resta = 0;
                    int restames = 0;
                    Console.Write("Ingrese el nombre del libro: ");
                    nombre = Console.ReadLine();
                    DateTime fechaPre = Convert.ToDateTime(fprestamo);
                    DateTime fechaDev = Convert.ToDateTime(fdevolucion);
                    dias2= fechaDev.Day;
                    dias = fechaPre.Day;
                    mes = fechaPre.Month;
                    mes2 = fechaDev.Month;
                    restames = mes2 - mes;
                    resta = (dias2 - dias) + 30 * restames;
                    libro1.Titulo = nombre;
                    publicacion1.Prestar(dias);
                    Console.Write("El libro " + libro1.Titulo + " ISBN:" + codigo + " se prestó por: " + resta + " dias ");
                    Console.ReadKey();
                }
                else if (deside2 == "periodico")
                {
                    int resta = 0;
                    int restames = 0;
                    Console.Write("Ingrese el nombre del periodico: ");
                    nombre = Console.ReadLine();
                    DateTime fechaPre = Convert.ToDateTime(fprestamo);
                    DateTime fechaDev = Convert.ToDateTime(fdevolucion);
                    periodico1.Nombre = nombre;
                    periodico1.Fecha = fechaPre;
                    dias = periodico1.Fecha.Day;
                    dias2 = fechaDev.Day;
                    mes = fechaPre.Month;
                    mes2 = fechaDev.Month;
                    restames = mes2 - mes;
                    resta = (dias2 - dias) + 30 * restames;
                    publicacion1.Prestar(dias);
                    Console.Write("El periodico "+periodico1.Nombre+" se prestó por: " + resta + " dias ");
                    Console.ReadKey();
                }
                else
                {
                    Console.Write("\nNo existe ese tipo de publicación..\n[presione un boton para salir]");
                    Console.ReadKey();
                    System.Environment.Exit(-1);
                }
            }
            #endregion 

            #region seccion de salir del programa
            /// <summary>
            /// de caso contrario el usuario puede escojer salir del programa al presior S o s
            /// </summary>
            else if (deside == "S" || deside == "s")
            {
                Console.Write("\nGracias por visitarnos");
                Console.ReadKey();
                System.Environment.Exit(-1);
            }
            else
            {
                Console.Write("\nno existe esa opción..\n[presione un boton para salir]");
                Console.ReadKey();
                System.Environment.Exit(-1);
            }
            #endregion
        }
    }
}

