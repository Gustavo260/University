package View;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConsultaTurnos extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Statement stmt=null;
        ResultSet rs=null;
        int rut= Integer.parseInt(request.getParameter("txtRut"));
        try {
            stmt=cnn.createStatement();
            rs= stmt.executeQuery("select TURNOS.ORDENDETURNOS, TAXISTAS.NOMBRE, TAXISTAS.APELLIDO, TAXIS.PATENTE, TURNOS.FECHA, TURNOS.HORARIO from TURNOS JOIN TAXISTAS on TURNOS.RUT=TAXISTAS.RUT JOIN TAXIS on TURNOS.PATENTE=TAXIS.PATENTE where TURNOS.RUT="+rut);
            
            out.println("<table width='600' border='1' align='center'");
            out.println("<tr>");
            out.println("<td colspan='6' align=center>DATOS DE LOS TURNOS</td><td></td>");            
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Orden de turnos</td><td>Nombre del taxista</td><td>Apellido del taxista</td><td>Patente del taxi</td><td>Fecha</td><td>Horario turno</td>");
            out.println("</tr>");
            
        while(rs.next()){
            out.println("<tr>");
            
            out.println("<tr>");
            out.println("<td>"+rs.getString(1)+"</td>");
            out.println("<td>"+rs.getString(2)+"</td>");
            out.println("<td>"+rs.getString(3)+"</td>");
            out.println("<td>"+rs.getString(4)+"</td>");
            out.println("<td>"+rs.getString(5)+"</td>");
            out.println("<td>"+rs.getString(6)+"</td>");
            out.println("</tr>");
        }
        }
        catch(SQLException sql){
            System.out.println("se produjo");
        }
         finally { 
            try{
                if(stmt!=null){
                    stmt.close();
                }
            }
            catch(SQLException e22){
                System.out.println("se ha producido en el statement");
                System.out.println(e22.getMessage());
            }
            out.close();
        }
    }

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    Connection cnn=null;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
    @Override
    public void init(ServletConfig config) throws ServletException{
    super.init(config);

    String dsn = new String("jdbc:derby://localhost:1527/AdministracionDeTurnos");
    try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    }
    catch(ClassNotFoundException ex){
        System.out.println("error el cargar el driver");
        System.out.println(ex.getMessage());
    }
    
    try
    {
        cnn=DriverManager.getConnection(dsn,"AdminTurnos","inacap");
    }
    catch(SQLException sqlEx)
    {
        System.out.println("se ha producido un error al establecer la conexion");
        System.out.println(sqlEx.getMessage());
    }
        System.out.println("iniciando servlet...");
}
}