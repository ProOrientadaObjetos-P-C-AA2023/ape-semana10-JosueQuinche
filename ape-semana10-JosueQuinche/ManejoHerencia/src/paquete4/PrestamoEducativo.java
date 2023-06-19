package paquete4;

import paquete2.Prestamo;
import paquete5.InstitutoEducativo;
import paquete5.Persona;

public class PrestamoEducativo extends Prestamo{
    public String nivelEstudio;
    public InstitutoEducativo centroEducativo;
    public double valorCarrera;
    public double valorMensualPrestamo_Carrera;
    public PrestamoEducativo() {}

    public PrestamoEducativo(String nivelEstudio, InstitutoEducativo centroEducativo, double valorCarrera) {
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
    }

    public PrestamoEducativo(Persona beneficiario, int tiempoPrestamo, String ciudadPrestamo,String nivelEstudio, InstitutoEducativo centroEducativo, double valorCarrera) {
        super(beneficiario, tiempoPrestamo, ciudadPrestamo);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
        this.valorMensualPrestamo_Carrera = (valorCarrera /tiempoPrestamo)-(0.1*(valorCarrera/tiempoPrestamo));
    }
    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public InstitutoEducativo getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(InstitutoEducativo centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
        this.valorMensualPrestamo_Carrera = (valorCarrera /tiempoPrestamo)-(0.1*(valorCarrera/tiempoPrestamo));
    }

    public double getValorMensualPrestamo_Carrera() {
        return valorMensualPrestamo_Carrera;
    }
    @Override
    public String toString(){
        return super.toString()+
                "\nNIVEL DE ESTUDIO: " +nivelEstudio+
                "\nCENTRO EDUCATIVO: " +centroEducativo+
                "\nVALOR DE LA CARERA: $" +valorCarrera+
                "\nVALOR MENSUAL DEL PRÉSTAMO EDUCATIVO: $" +valorMensualPrestamo_Carrera;
    }
    
    
    
}
