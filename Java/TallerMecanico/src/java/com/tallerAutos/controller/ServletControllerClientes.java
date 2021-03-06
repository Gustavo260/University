package com.tallerAutos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletControllerClientes extends HttpServlet {

    private int Rut, Edad, Cantidad;
    private String Nombre, Empresa, Patente, sexo;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int Rut= Integer.parseInt(request.getParameter("RutText"));
        int Cantidad= Integer.parseInt(request.getParameter("CantidadText"));
        int Edad= Integer.parseInt(request.getParameter("EdadText"));
        
        double total;
        
        String Nombre= request.getParameter("NombreText");
        String Empresa= request.getParameter("EmpresaText");
        String Patente= request.getParameter("PatenteText");
        String sexo= request.getParameter("SexoText");
        
        PrintWriter out = response.getWriter();
        try {
             Cantidad= Integer.parseInt(request.getParameter("CantidadText"));
             if(Cantidad!=-1) {
                 out.println("<title>Ingrese valores positivos</title>");
             }
        ServletModelPilotos item= new ServletModelPilotos(Rut,Edad,Cantidad,Nombre,Empresa,Patente,sexo);
        RequestDispatcher rd= request.getRequestDispatcher("ServletIngresoExitoso.view");
        rd.forward(request,response);
        
         } finally {            
            out.close();
        }
        List erroresMsg= new ArrayList();
        try{
            if(!erroresMsg.isEmpty()){

                request.setAttribute("erroresTaller", erroresMsg);
                RequestDispatcher rd=request.getRequestDispatcher("ServletIngresoFallido.view");
                rd.forward(request, response);
                return;
            }     
        }
        catch(RuntimeException e1){
            
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
