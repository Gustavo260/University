package Vista;

import java.sql.*;
import javax.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IngresoDatosCliente extends HttpServlet {
    Connection cnn=null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String numero= request.getParameter("txtNumero");
        String nombre= request.getParameter("txtNombre");
        int vali=0;
        Statement stmt=null;
        try {
            stmt=cnn.createStatement();
            vali=stmt.executeUpdate("INSERT INTO CLIENTE (NUMERO,NOMBRE) VALUES('"+numero+"','"+nombre+"');");
            if(vali==1){
                out.println("<center><h2>La accion se realizo con exito</h2></center>");
                out.println("");
            }
            else{
                out.println("Error de ingreso");
            }
        }
        catch(SQLException ex){
            out.println("SQL ERROR"+ex.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
    public void init(ServletConfig config)throws ServletException{
        super.init();
        String dsn=new String("jdbc:derby://localhost:1527/PRUEBA3");
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Class"+ex.getMessage());
        }
        try{
            cnn=DriverManager.getConnection(dsn,"","");
        }
        catch(SQLException ex){
            System.out.println("Driver"+ex.getMessage());
        }
    }
    @Override
    public void destroy(){
        super.destroy();
        try
        {
            cnn.close();
        }
        catch(SQLException ex){
            System.out.println("cnn close"+ex.getMessage());
        }
    }  
}
