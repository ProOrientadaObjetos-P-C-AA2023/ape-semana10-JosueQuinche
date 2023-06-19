package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

public class PrestamoAutomovil extends Prestamo{
    public  String tipoAutomovil;
    public String marcaAutomovil;
    public Persona garante1;
    public double valorAutomovil;
    public double valorAutomovilPrestamo_Automovil;
    public PrestamoAutomovil() {}

    public PrestamoAutomovil(String tipoAutomovil, String marcaAutomovil, Persona garante1, double valorAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;    
    }
    

    public PrestamoAutomovil(Persona beneficiario,int tiempoPrestamo,String ciudadPrestamo, String tipoAutomovil, String marcaAutomovil, Persona garante1,double valorAutomovil) {
        super(beneficiario, tiempoPrestamo, ciudadPrestamo);
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
        this.valorAutomovilPrestamo_Automovil = valorAutomovil / tiempoPrestamo;
    }
    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public double getValorAutomovil() {
        return valorAutomovil;
    }    

    public void setValorMensual(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
        this.valorAutomovilPrestamo_Automovil = valorAutomovil / tiempoPrestamo;
    }

    public double getValorMensualPrestamo_Automovil() {
        return valorAutomovilPrestamo_Automovil;
    }
    public double getValorMensual() {
        return valorAutomovil;
    }   
    @Override
    public String toString(){
        return super.toString()+
                "\nTIPO DE AUTOMOVIL: " +tipoAutomovil+
                "\nMARCA DEL AUTOMOVIL: " +marcaAutomovil+
                "\nGARANTE 1:\n" +garante1.toString()+
                "\nVALOR DEL AUTOMOVIL: $" +valorAutomovil+
                "\nVALOR MENSUAL DEL PRÉSTAMO DEL AUTOMOVIL: $" +valorAutomovilPrestamo_Automovil;
    }    
}
