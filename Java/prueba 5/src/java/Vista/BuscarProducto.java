package Vista;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 18132020-6
 */
public class BuscarProducto extends HttpServlet {
Connection cnn=null;
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
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<table border=1 width=60% align=center");
        out.println("<tr align=center>");
        String codigo= request.getParameter("txtCodigo");
        
        ResultSet rs=null;
        Statement stmt=null;
    
        try {
            stmt=cnn.createStatement();
            rs=stmt.executeQuery("SELECT PRODUCTO.CODIGO, PRODUCTO.NOMBRE, PRODUCTO.PRECIO FROM PRODUCTO WHERE CODIGO='"+codigo+"'");
            while(rs.next()){
                
                 out.println("<html>");
                 out.println("<head>");
                 out.println("<title>Servlet NewServlet</title>");            
                 out.println("</head>");
                 out.println("<body>");
                 out.println("table align=center");
                 out.println("<tr>");
                 out.println("<td>");
                 out.println(rs.getString(1));
                 out.println("</td>");
                 out.println("<td>");
                 out.println(rs.getString(2));
                 out.println("</td>");
                 out.println("<td>");
                 out.println(rs.getInt(3));
                 out.println("</td>");
                 out.println("</tr>");            
            }
        }
        catch(SQLException ex){
            out.println("SQL ERROR"+ex.getMessage());
        }
        
          out.println("</table>");
          out.println("<br><br><br><br><center><a href=index.jsp >Volver</a></center>");
          out.println("</body>");
          out.println("</html>");
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
