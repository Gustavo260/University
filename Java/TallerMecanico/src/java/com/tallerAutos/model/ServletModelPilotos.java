package com.tallerAutos.model;

public class ServletModelPilotos{
    private String Nombre, Empresa, Patente, Sexo;
    private int RutPiloto, Edad, CantVisitas;
    
    public ServletModelPilotos(int A, int B, int C, String D, String E, String F, String G){
        this.RutPiloto=A;
        this.Edad=B;
        this.CantVisitas=C;
        this.Nombre=D;
        this.Empresa=E;
        this.Patente=F;
        this.Sexo=G;
    }
    
    public void setRutPiloto(int A){
        this.RutPiloto=A;
    }
    
    public int getRutPiloto(){
        return RutPiloto;
    }
    
    public void setEdad(int B){
        this.Edad=B;
    }
    
    public int getEdad(){
        return Edad;
    }
    
    public void setCantVisitas(int C){
        this.CantVisitas=C;
    }
    
    public int getCantVisitas(){
        return CantVisitas;
    }
    
    public void setNombre(String D){
        this.Nombre=D;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setEmpresa(String E){
        this.Empresa=E;
    }
    
    public String getEmpresa(){
        return Empresa;
    }
    
    public void setPatente(String F){
        this.Patente=F;
    }
    
    public String getPatente(){
        return Patente;
    }
    
    public void setSexo(String G){
        this.Sexo=G;
    }
    
    public String getSexo(){
        return Sexo;
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

