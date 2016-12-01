using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class Consultageneral : System.Web.UI.Page
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
        cmd.CommandText = "SELECT NOMBRE, HORAS FROM TRABAJADOR";
        dr = cmd.ExecuteReader();
        String cadena = "";
        if(dr.HasRows)
        {
            while(dr.Read())
            {
                if(Convert.ToInt16(dr[1])<=45)
                {
                    sueldo = 4000 * Convert.ToInt16(dr[1]);
                    cadena ="Nombre: "+ dr[0].ToString()+" Sueldo: "+sueldo.ToString();
                    ListBox1.Items.Add(cadena); 
                }
                else if (Convert.ToInt16(dr[1]) > 45)
                {
                    restantes = Convert.ToInt16(dr[1]) - 45;
                    sueldo =  (4000*45)+(5000*restantes);
                    cadena ="Nombre: "+ dr[0].ToString()+" Sueldo: "+sueldo.ToString();
                    ListBox1.Items.Add(cadena); 
                }
            }
        }
        cnn.Close();
    } 
}