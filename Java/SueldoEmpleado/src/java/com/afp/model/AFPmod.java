package com.afp.model;

public class AFPmod {
    private String nombreEmpleado;
    private int sueldobase;
    private String RadioAfp;

    public AFPmod(String x, int y, String z) {
        this.nombreEmpleado = x;
        this.sueldobase = y;
        this.RadioAfp = z;
    }

    public int getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(int sueldobase) {
        this.sueldobase = sueldobase;
    }

    public String getRadioAfp() {
        return RadioAfp;
    }

    public void setRadioAfp(String RadioAfp) {
        this.RadioAfp = RadioAfp;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setnombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
}
