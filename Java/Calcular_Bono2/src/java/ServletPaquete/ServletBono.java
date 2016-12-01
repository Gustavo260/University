package ServletPaquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletBono extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String nombre;
        int sueldobase, RadioAfp;
        
        try {
            nombre= request.getParameter("NombreEmpleado");
            sueldobase= Integer.parseInt(request.getParameter("SueldoBase"));
            RadioAfp= Integer.parseInt(request.getParameter("radioSeleccion"));
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Sueldo de una Persona</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4>Los Datos del empleado son : </></h4>");
            out.println("<table>");
            out.println("Nombre empleado : "+nombre+"<br> Sueldo base: "+sueldobase);
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            
            if(RadioAfp==1)
            {
                sueldobase= (sueldobase*85/100);
                out.println("<body>");
                out.println("<table>");
                out.println("<tr><td>El sueldo total con un descuento de un 15% es: "+sueldobase+"</td></tr>");
                out.println("</table>");
                out.println("</body>");
                
            }
            if(RadioAfp==2)
            {
                sueldobase= (sueldobase*90/100);
                out.println("<body>");
                out.println("<table>");
                out.println("<tr><td>El sueldo total con un descuento de un 10% es: "+sueldobase+"</td></tr>");
                out.println("</table>");
                out.println("</body>");
            }
            if(RadioAfp==3)
            {
                float numero=87.5f;
                float sueldof=(int)sueldobase;
                sueldof=(sueldof*numero/100);
                out.println("<body>");
                out.println("<table>");
                out.println("<tr><td>El sueldo total con un descuento de un 12.5% es: "+sueldof+"</td></tr>");
                out.println("</table>");
                out.println("</body>");
            }
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
