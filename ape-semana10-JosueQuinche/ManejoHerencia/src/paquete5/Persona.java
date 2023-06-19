package paquete5;
public class Persona {
    public String nombreP;
    public String apellidoP;
    public String username;
    public Persona() {}

    public Persona(String nombreP, String apellidoP, String username) {
        this.nombreP = nombreP;
        this.apellidoP = apellidoP;
        this.username = username;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombreP() {
        return nombreP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Persona" + "\nNOMBRE=" + nombreP + "\nAPELLIDO=" + apellidoP +"Y\n"+ "SU USERNAME=" + username ;
    }
    
       
}
