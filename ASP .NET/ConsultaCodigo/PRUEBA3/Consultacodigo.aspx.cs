using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class Consultacodigo : System.Web.UI.Page
{
    SqlConnection cnn = new SqlConnection("Data Source=VLD_LAB0307;Initial Catalog=PRUEBA3;Persist Security Info=True;User ID=sa;Password=inacap;Pooling=False");
    SqlCommand cmd = new SqlCommand();
    SqlDataReader dr;

    protected void Page_Load(object sender, EventArgs e)
    {
        cmd.Connection = cnn;
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        cnn.Open();
        int sueldo;
        int restantes;
        cmd.CommandText = "SELECT CODIGO, NOMBRE, HORAS FROM TRABAJADOR WHERE CODIGO='" + txtCodigo.Text + "'";
        dr = cmd.ExecuteReader();
        String cadena = "";
        if(dr.HasRows)
        {
            while(dr.Read())
            {
                if (txtCodigo.Text !=null)
                {
                    if (Convert.ToInt16(dr[2]) <= 45)
                    {
                        sueldo = 4000 * Convert.ToInt16(dr[2]);
                        cadena = "Codigo " + dr[0].ToString() + " Nombre: " + dr[1].ToString() + " Sueldo: " + sueldo.ToString();
                        lblMensaje.Text = cadena;
                    }
                    else if (Convert.ToInt16(dr[2]) > 45)
                    {
                        restantes = Convert.ToInt16(dr[2]) - 45;
                        sueldo = (4000 * 45) + (5000 * restantes);
                        cadena = "Codigo " + dr[0].ToString() + " Nombre: " + dr[1].ToString() + " Sueldo: " + sueldo.ToString();
                        lblMensaje.Text = cadena;
                    }
                }
                else
                {
                    lblMensaje.Text = "Error en la consulta!, ingrese bien el codigo";
                }

            }
        }
        cnn.Close();
    } 
}