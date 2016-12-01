package com.afp.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class errorServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List erroresMsg=(List) request.getAttribute("erroresDVD");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Errores de ingreso</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Sus errores son los siguientes:</h1>");
            Iterator it=erroresMsg.iterator();
            while (it.hasNext()){
                String item=(String) it.next();
                out.println("<br>");
                 out.println(item);
            }
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }
}
