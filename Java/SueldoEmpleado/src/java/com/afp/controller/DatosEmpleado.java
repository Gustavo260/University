package com.afp.controller;

import com.afp.model.AFPmod;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatosEmpleado extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        List msjerror=new ArrayList();
        try{
        String nombreEmpleado= request.getParameter("txt_empleado");
        int sueldobase= Integer.parseInt(request.getParameter("txt_sueldo"));
        String RadioAfp= request.getParameter("r_afp");
        
        try{
           if(sueldobase!=0){
              
           } 
        }
        catch(NumberFormatException m1)
        {
            msjerror.add("El sueldo debe ser numerico");
        }
        
        if (!msjerror.isEmpty()){
            request.setAttribute("errores", msjerror);
            RequestDispatcher rd=request.getRequestDispatcher("error.view");
            rd.forward(request,response);
            return;
        }
       
        AFPmod item=new AFPmod(nombreEmpleado,sueldobase,RadioAfp);
        request.setAttribute("Item",item);
        
        RequestDispatcher rd=request.getRequestDispatcher("exito.view");
        rd.forward(request, response);
        }
        catch (RuntimeException m1){
            
        }  
    }
}
   