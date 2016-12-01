using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Prueba1.MontoInterez
{
    public partial class Pagina1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnCalcular_Click(object sender, EventArgs e)
        {
            #region variables
            String nombre;
            double ValorCuota, Monto, ValorTotal, Interes;
            String resumen, cadenaMonto;
            nombre = txtNombre.Text;
            cadenaMonto = txtMonto.Text;
            #endregion

            #region Validaciones
            if (txtNombre == null)
            {
                LblMensaje.Text = "Error!, tiene que ingresar nombre";
            }

            if (txtMonto.Text == null)
            {
                LblMensaje.Text = "Error!, tiene que ingresar monto";
            }

            if (Rbt1.Checked == false || Rbt6.Checked == false || Rbt12.Checked==false || Rbt24.Checked==false)
            {
                LblMensaje.Text = "Tiene que seleccionar una opcion!";
            }
            #endregion

            #region calculo del costo total
            if (Double.TryParse(cadenaMonto, out Monto)) // Este if valida si se ingreso numeros en el monto y no letras
            {
                //Monto con 1 cuota
                if (Rbt1.Checked == true)
                {
                    ValorCuota = Monto / 1;
                    if (Monto < 200000)
                    {
                        Interes = (Monto * 120) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 1 cuota, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 20% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                    if (Monto >= 200000 && Monto < 500000)
                    {
                        Interes = (Monto * 130) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 1 cuota, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 30% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                    if (Monto >= 500000 && Monto < 1000000)
                    {
                        Interes = (Monto * 140) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 1 cuota, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 40% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                    if (Monto >= 1000000)
                    {
                        Interes = (Monto * 150) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 1 cuota, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 50% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                }

                //Monto con 6 cuotas
                if (Rbt6.Checked == true)
                {
                    ValorCuota = Monto / 6;
                    if (Monto < 200000)
                    {
                        Interes = (Monto * 140) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 6 cuotas, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 40% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                    if (Monto >= 200000 && Monto < 500000)
                    {
                        Interes = (Monto * 150) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 6 cuotas, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 50% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                    if (Monto >= 500000 && Monto < 1000000)
                    {
                        Interes = (Monto * 160) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 6 cuotas, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 60% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                    if (Monto >= 1000000)
                    {
                        Interes = (Monto * 170) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 6 cuotas, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 70% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                }

                //Monto con 12 cuotas
                if (Rbt12.Checked == true)
                {
                    ValorCuota = Monto / 12;
                    if (Monto < 200000)
                    {
                        Interes = (Monto * 160) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 12 cuotas, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 60% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                    if (Monto >= 200000 && Monto < 500000)
                    {
                        Interes = (Monto * 170) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 12 cuotas, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 70% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                    if (Monto >= 500000 && Monto < 1000000)
                    {
                        Interes = (Monto * 180) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 12 cuotas, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 80% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                    if (Monto >= 1000000)
                    {
                        Interes = (Monto * 190) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 12 cuotas, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 90% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                }

                //Monto con 24 cuotas
                if (Rbt24.Checked == true)
                {
                    ValorCuota = Monto / 24;
                    if (Monto < 200000)
                    {
                        Interes = (Monto * 180) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 24 cuotas, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 80% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                    if (Monto >= 200000 && Monto < 500000)
                    {
                        Interes = (Monto * 190) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 24 cuotas, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 90% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                    if (Monto >= 500000 && Monto < 1000000)
                    {
                        Interes = (Monto * 200) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 24 cuotas, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 100% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                    if (Monto > 1000000)
                    {
                        Interes = (Monto * 210) / 100;
                        ValorTotal = ValorCuota + Interes;
                        resumen = "Sr/Sra " + nombre + " a solicitado un monto de unos " + Monto + " pesos de 24 cuotas, el valor de la cuota es de unos " + ValorCuota + " pesos con un interes de un 110% y con un valor total a pagar de unos " + ValorTotal.ToString() + " pesos";
                        LblMensaje.Text = resumen;
                    }
                }
            }
            else //Este else envia mensaje de error en caso que no se halla realizado la conversion
            {
                LblMensaje.Text = "Error de conversion, tiene que ingresar numeros en el pedido del monto";
            }
        }
            #endregion 

        #region Limpieza
        protected void btnLimpiar_Click(object sender, EventArgs e)
        {
            txtMonto.Text = "";
            txtNombre.Text = "";
            Rbt1.Checked = false;
            Rbt6.Checked = false;
            Rbt12.Checked = false;
            Rbt24.Checked = false;
            LblMensaje.Text = "";
            txtNombre.Focus();
        }
        #endregion
    }
}