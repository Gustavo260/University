using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace SistemaCasino
{
    public partial class Ventas : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void ImgEscoba_Click(object sender, ImageClickEventArgs e)
        {
            int precioUnidad = 6990;
            int SubTotal = Convert.ToInt32(txtSubTotal.Text) + precioUnidad;
            txtSubTotal.Text = SubTotal.ToString();
            String ListaProducto = "Escoba $"+precioUnidad;
            ListBoxProductos.Items.Add(ListaProducto);
            txtValorUnidad.Text = precioUnidad.ToString();
        }

        protected void ImgGuantes_Click(object sender, ImageClickEventArgs e)
        {
            int precioUnidad = 4990;
            int SubTotal = Convert.ToInt32(txtSubTotal.Text) + precioUnidad;
            txtSubTotal.Text = SubTotal.ToString();
            String ListaProducto = "Guantes $" + precioUnidad;
            ListBoxProductos.Items.Add(ListaProducto);
            txtValorUnidad.Text = precioUnidad.ToString();
        }

        protected void ImgCloro_Click(object sender, ImageClickEventArgs e)
        {
            int precioUnidad = 3990;
            int SubTotal = Convert.ToInt32(txtSubTotal.Text) + precioUnidad;
            txtSubTotal.Text = SubTotal.ToString();
            String ListaProducto = "Cloro $" + precioUnidad;
            ListBoxProductos.Items.Add(ListaProducto);
            txtValorUnidad.Text = precioUnidad.ToString();
        }

        protected void ImgLecheSabor_Click(object sender, ImageClickEventArgs e)
        {
            int precioUnidad = 5990;
            int SubTotal = Convert.ToInt32(txtSubTotal.Text) + precioUnidad;
            txtSubTotal.Text = SubTotal.ToString();
            String ListaProducto = "Leche con sabor $" + precioUnidad;
            ListBoxProductos.Items.Add(ListaProducto);
            txtValorUnidad.Text = precioUnidad.ToString();
        }

        protected void ImgLecheSinLactosa_Click(object sender, ImageClickEventArgs e)
        {
            int precioUnidad = 5990;
            int SubTotal = Convert.ToInt32(txtSubTotal.Text) + precioUnidad;
            txtSubTotal.Text = SubTotal.ToString();
            String ListaProducto = "Leche sin lactosa $" + precioUnidad;
            ListBoxProductos.Items.Add(ListaProducto);
            txtValorUnidad.Text = precioUnidad.ToString();
        }

        protected void ImgLecheEntera_Click(object sender, ImageClickEventArgs e)
        {
            int precioUnidad = 5990;
            int SubTotal = Convert.ToInt32(txtSubTotal.Text) + precioUnidad;
            txtSubTotal.Text = SubTotal.ToString();
            String ListaProducto = "Leche entera $" + precioUnidad;
            ListBoxProductos.Items.Add(ListaProducto);
            txtValorUnidad.Text = precioUnidad.ToString();
        }

        protected void btnAceptar_Click(object sender, EventArgs e)
        {
            int vuelto, total;
            int SubTotal= Convert.ToInt32(txtSubTotal.Text);
           
            int efectivo = Convert.ToInt32(txtEfectivo.Text);

            if(SubTotal>efectivo)
            {
                vuelto = SubTotal - efectivo;
                txtVuelto.Text = vuelto.ToString();
            }
            else if (SubTotal < efectivo)
            {
                vuelto = efectivo - SubTotal;
                txtVuelto.Text = vuelto.ToString();
            }
            else if (SubTotal == efectivo)
            {
                vuelto = 0;
                txtVuelto.Text = vuelto.ToString();
            }
            else
            {
                lblMensajeCompra.Text = "Datos insuficientes!";
            }

            total = SubTotal;
            txtTotal.Text = total.ToString();
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            txtEfectivo.Text = null;
            txtValorUnidad.Text = null;
            txtVuelto.Text = null;
            ListBoxProductos.Items.Clear();
            lblMensajeCompra.Text = null;
        }

        protected void btnDeshacer_Click(object sender, EventArgs e)
        {
            txtVuelto.Text = null;
            txtTotal.Text = null;
            txtEfectivo.Text = null;
        }

        protected void btnComprar_Click(object sender, EventArgs e)
        {
            lblMensajeCompra.Text = "LA COMPRA SE A REALIZADO CON EXITO!";
        }  
    }
}