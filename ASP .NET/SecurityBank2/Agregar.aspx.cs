using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class Agregar : System.Web.UI.Page
{
    SqlConnection cnn = new SqlConnection("Data Source=localhost;Initial Catalog=bdBanko;Persist Security Info=True;User ID=sa;Password=inacap;Pooling=False");
    SqlCommand cmd = new SqlCommand();
    protected void Page_Load(object sender, EventArgs e)
    {
        cmd.Connection = cnn;
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        AgregarAbonados();
    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        AgregarGiros();
    }
    protected void Button3_Click(object sender, EventArgs e)
    {
        AgregarTiposGiros();
    }

    private void AgregarAbonados()
    {
        cnn.Open();
        cmd.CommandText = "insert into Abonados values ('" + txtRut.Text + "','" + txtNombre.Text + "','" + txtApellido.Text + "','" + txtEmail.Text + "')";
        cmd.ExecuteNonQuery();
        cnn.Close();
    }

    private void AgregarGiros()
    {
        cnn.Open();
        cmd.CommandText = "insert into Giros values ('" + txtRutAbonado.Text + "','" + txtCodigoGiro.Text + "','" + txtFechaGiro.Text + "','" + txtMontoGiro.Text + "')";
        cmd.ExecuteNonQuery();
        cnn.Close();
    }

    private void AgregarTiposGiros()
    {
        cnn.Open();
        cmd.CommandText = "insert into TiposGiros values ('" + txtCodigoTipoGiro.Text + "','" + txtNombreGiro.Text + "')";
        cmd.ExecuteNonQuery();
        cnn.Close();
    }
}