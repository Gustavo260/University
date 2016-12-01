using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class Buscar : System.Web.UI.Page
{
    SqlConnection cnn = new SqlConnection("Data Source=localhost;Initial Catalog=bdBanko;Persist Security Info=True;User ID=sa;Password=inacap;Pooling=False");
    SqlCommand cmd = new SqlCommand();
    SqlDataReader dr;

    protected void Page_Load(object sender, EventArgs e)
    {
        cmd.Connection = cnn;
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        BuscarAbonados();
    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        BuscarTiposGiros();
    }

    protected void Button3_Click(object sender, EventArgs e)
    {
        BuscarGiros();
    }

    private void BuscarAbonados()
    {
        String opcionAbonados = dwnlistAbonados.SelectedItem.ToString();
        cnn.Open();
        cmd.CommandText = "SELECT nombre, apellido, email FROM Abonados WHERE rut='" + opcionAbonados + "'";
        dr = cmd.ExecuteReader();
        String cadena = "";
        if(dr.HasRows)
        {
            while(dr.Read())
            {
                cadena = " " + dr[0].ToString() + " " + dr[1].ToString() + " " + dr[2].ToString();
                lstAbonados.Items.Add(cadena);           
            }
        }
        cnn.Close();
    }

    private void BuscarGiros()
    {
        String opcionGiros = dwnlistGiros.SelectedItem.ToString();
        cnn.Open();
        cmd.CommandText = "SELECT Abonados.nombre, TiposGiros.nombre, Giros.fecha_giro, Giros.monto FROM Abonados JOIN Giros ON Abonados.rut=Giros.rut JOIN TiposGiros ON TiposGiros.codigo=Giros.codigo WHERE codigo="+opcionGiros;
        dr = cmd.ExecuteReader();
        String cadena = "";
        if (dr.HasRows)
        {
            while (dr.Read())
            {
                cadena = " " + dr[0].ToString() + " " + dr[1].ToString() + " " + dr[2].ToString() + " " + dr[3].ToString();
                lstGiros.Items.Add(cadena);
            }
        }
        cnn.Close();
    }

    private void BuscarTiposGiros()
    {
        String opcionTiposGiros = dwnlistTiposGiros.SelectedItem.ToString();
        cnn.Open();
        cmd.CommandText = "SELECT codigo, nombre FROM TiposGiros WHERE codigo=" + opcionTiposGiros;
        dr = cmd.ExecuteReader();
        String cadena = "";
        if (dr.HasRows)
        {
            while (dr.Read())
            {
                cadena = " " + dr[0].ToString() + " " + dr[1].ToString();
                lstTiposGiros.Items.Add(cadena);
            }
        }
        cnn.Close();
    }
}