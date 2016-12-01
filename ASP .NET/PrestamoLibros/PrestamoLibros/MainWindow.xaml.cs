using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using ReglasDeNegocio;

namespace PrestamoLibros
{
    public partial class MainWindow : Window
    {
        private List<Cliente> ListaPrestamo;

        public MainWindow()
        {
            InitializeComponent();

            ListaPrestamo = new List<Cliente>();
            Limpieza();
        }

        private void aceptarButton_Click(object sender, RoutedEventArgs e)
        {

            Cliente nuevoCliente = new Cliente(this.Clientetxt.Text);
            Prestamos nuevoPrestamo = new Prestamos(this.PrestamoComboBox.Text, nuevoCliente);
            Libros nuevoLibro = new Libros(Int32.Parse(this.ISBNtxt.Text), this.titulotxt.Text, nuevoPrestamo);

            nuevoCliente.AñadirPrestamo(nuevoPrestamo);

            nuevoPrestamo.AñadirLibros(nuevoLibro);

            String devueltoOPrestado = this.devolverOprestartxt.Text;

            if (devueltoOPrestado == "Prestar")
            {
                string Fpres = this.Fprestamo.Text;
                DateTime fechaPrestamo = Convert.ToDateTime(Fpres);
                PrestamoComboBox.Items.Add("Titulo: " + titulotxt + " ISBN: " + ISBNtxt + " fecha de prestamo:" + fechaPrestamo);
                DisponiblesComboBox.Items.Remove(titulotxt);
                DisponiblesComboBox.Items.Remove(ISBNtxt);
            }

            if (devueltoOPrestado == "Devolver")
            {
                string Fdev = this.Fdevolucion.Text;
                DateTime fechadevolucion = Convert.ToDateTime(Fdev);
                PrestamoComboBox.Items.Add("Titulo: " + titulotxt + " ISBN: " + ISBNtxt + " fecha de devolucion:" + fechadevolucion);
                DisponiblesComboBox.Items.Add("Titulo: "+titulotxt+" ISBN: "+ISBNtxt);
            }

            ClientesComboBox.Items.Add(Clientetxt);

            this.ListaPrestamo.Add(nuevoCliente);

            Limpieza();
        }

        private void Limpieza()
        {

            this.ClientesComboBox.Items.Clear();
            this.DisponiblesComboBox.Items.Clear();
            this.PrestamoComboBox.Items.Clear();

            foreach (Cliente unCliente in ListaPrestamo)
            {
                this.DisponiblesComboBox.Items.Add(unCliente);

                foreach (Prestamos unPrestamo in unCliente.Prestamoss)
                {
                    this.PrestamoComboBox.Items.Add(unPrestamo);
                }
            }

            this.ClientesComboBox.Text = String.Empty;
            this.PrestamoComboBox.Text = String.Empty;
            this.DisponiblesComboBox.Items.Clear();

            this.ISBNtxt.Clear();
            this.Clientetxt.Clear();
            this.Clientetxt.Focus();
        } 
    }
}
