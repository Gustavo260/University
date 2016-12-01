using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class Eliminar : System.Web.UI.Page
{
    SqlConnection cnn = new SqlConnection("Data Source=localhost;Initial Catalog=bdBanko;Persist Security Info=True;User ID=sa;Password=inacap;Pooling=False");
    SqlCommand cmd = new SqlCommand();
    protected void Page_Load(object sender, EventArgs e)
    {
        cmd.Connection = cnn;
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        EliminarAbonados();
    }
    protected void Button2_Click(object sender, EventArgs e)
    {
        EliminarGiros();
    }
    protected void Button3_Click(object sender, EventArgs e)
    {
        EliminarTiposGiros();
    }

    private void EliminarAbonados()
    {
        cnn.Open();
        cmd.CommandText = "delete from Abonados where rut="+txtRut.Text;
        cmd.ExecuteNonQuery();
        cnn.Close();
    }

    private void EliminarGiros()
    {
        cnn.Open();
        cmd.CommandText = "delete from Giros where rut=" + txtCodigoGiro.Text;
        cmd.ExecuteNonQuery();
        cnn.Close();
    }

    private void EliminarTiposGiros()
    {
        cnn.Open();
        cmd.CommandText = "delete from TiposGiros where rut=" + txtCodigoTipoGiro.Text;
        cmd.ExecuteNonQuery();
        cnn.Close();
    }
}