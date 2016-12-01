package com.tallerAutos.view;

import com.tallerAutos.model.ServletModelAutos;
import com.tallerAutos.model.ServletModelPilotos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletIngresoExitoso extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ServletModelAutos item1=(ServletModelAutos)request.getAttribute("ServletModelAutos");
        ServletModelPilotos item2=(ServletModelPilotos)request.getAttribute("ServletModelPilotos");
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletIngresoExitoso</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("Rut: <br>"+item1.getRutCliente()+" Marca: <br>"+item1.getMarca()+" Patente: <br>"+item1.getPatente()+" Tipo: <br>"+item1.getTipoVehiculo()+" Estado: <br>"+item1.getEstado());
            out.println("Rut Piloto: <br>"+item2.getRutPiloto()+" Nombre Piloto: <br>"+item2.getNombre()+" Edad: <br>"+item2.getEdad()+" Cantidad de visitas al taller: <br>"+item2.getCantVisitas()+" Empresa: <br>"+item2.getEmpresa()+" Patente: <br>"+item2.getPatente()+" Sexo: <br>"+item2.getSexo());
            out.println("<a href=PaginPrincipalTallerMecanico.html>Regresar a la pagina principal</a>");
            out.println("</body>");
            out.println("</html>");
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
