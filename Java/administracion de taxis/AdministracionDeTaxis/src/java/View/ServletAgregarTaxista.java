package View;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAgregarTaxista extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    
    PrintWriter out = response.getWriter();
    int rut=Integer.parseInt(request.getParameter("txtRut"));
    String nombre=request.getParameter("txtNombre");
    String apellido=request.getParameter("txtApellido");
    String direccion=request.getParameter("txtDireccion");
    String telefono=request.getParameter("txtTelefono");
    int vali=0;
    Statement stmt=null;
    try
    {
       
            stmt=cnn.createStatement();
            vali=stmt.executeUpdate("INSERT INTO ADMINTURNOS.TAXISTAS (RUT,NOMBRE,APELLIDO,DIRECCION,TELEFONO) VALUES("+rut+",'"+nombre+"','"+apellido+"','"+direccion+"','"+telefono+"')");
        
        
        
    if(vali==1)
    {
        out.println("<body bgcolor=gray>");
        out.println("<br><br><br><br><br><br><br><br><br><br><br><br><br>");
        out.println("<center><h2>La accion se realizo con exito</h2></center> ");
        out.println("<br><br><br><br><center><a href=index.jsp>Volver</a></center>");
    }
    else
        out.println("Hubo un problema");
    }
    catch(SQLException ex)
    {
        out.println("SQL ERROR"+ex.getMessage());
    }
        out.println("</body>");
        out.println("</html>");
        out.close();
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
