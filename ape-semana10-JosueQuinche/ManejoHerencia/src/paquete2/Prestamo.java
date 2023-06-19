package paquete2;

import paquete5.Persona;

public class Prestamo {
    public Persona beneficiario;
    public int tiempoPrestamo;
    public String ciudadPrestamo;
    public Prestamo() {}

    public Prestamo(Persona beneficiario, int tiempoPrestamo, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamo = tiempoPrestamo;
        this.ciudadPrestamo = ciudadPrestamo;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public int getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(int tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public String getCiudadPrestamo() {
        return ciudadPrestamo;
    }

    public void setCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo;
    }
    @Override
    public String toString(){
        return "BENEFICIARIO:\n"+ beneficiario.toString()+
                "\nTIEMPO DE PRÉSTAMO POR MES: "+ tiempoPrestamo +
                "\nCIUDAD DÓNDE SE REALIZO EL PRESTAMO:" + ciudadPrestamo;
    }
    
}
