package paquete5;
public class InstitutoEducativo {
    public String nombreInst;
    public String siglasInst;
    public InstitutoEducativo() {}

    public InstitutoEducativo(String nombreInst, String siglasInst) {
        this.nombreInst = nombreInst;
        this.siglasInst = siglasInst;
    }

    public void setNombreInst(String nombreInst) {
        this.nombreInst = nombreInst;
    }

    public void setSiglasInst(String siglasInst) {
        this.siglasInst = siglasInst;
    }

    public String getNombreInst() {
        return nombreInst;
    }

    public String getSiglasInst() {
        return siglasInst;
    }

    @Override
    public String toString() {
        return "InstitutoEducativo{" + "\nNOMBRE DEL INSTITUTO=" + nombreInst +"Y"+ ", SUS SIGLAS=" + siglasInst;
    }
    
    
}
