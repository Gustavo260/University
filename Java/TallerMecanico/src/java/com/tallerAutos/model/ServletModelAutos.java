package com.tallerAutos.model;

public class ServletModelAutos{
    private String Marca, Patente, TipoVehiculo, Estado;
    private int RutCliente;
    
    public ServletModelAutos(int A, String B, String C, String D, String E){
        this.RutCliente=A;
        this.Marca=B;
        this.Patente=C;
        this.TipoVehiculo=D;
        this.Estado=E;
    }
    
    public void setRutCliente(int A){
        this.RutCliente=A;
    }
    
    public int getRutCliente(){
        return RutCliente;
    }
    
    public void setMarca(String B){
        this.Marca=B;
    }
    
    public String getMarca(){
        return Marca;
    }
    
    public void setPatente(String C){
        this.Patente=C;
    }
    
    public String getPatente(){
        return Patente;
    }
    
    public void setTipoVehiculo(String D){
        this.TipoVehiculo=D;
    }
    
    public String getTipoVehiculo(){
        return TipoVehiculo;
    }
    
    public void setEstado(String E){
        this.Estado=E;
    }
    
    public String getEstado(){
        return Estado;
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
