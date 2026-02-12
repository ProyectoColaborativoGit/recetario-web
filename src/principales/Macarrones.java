package principales;

import interfaz.Comida;

public class Macarrones implements Comida {
    private String tipoPasta; 
    private String salsa; 
    private String queso; 
    public Macarrones(String tipoPasta, String salsa, String queso) { 
        this.tipoPasta = tipoPasta; 
        this.salsa = salsa; 
        this.queso = queso; 
    }
    public String getTipoPasta() { 
        return tipoPasta; 
    } 
    public String getSalsa() { 
        return salsa; 
    } 
    public String getQueso() { 
        return queso; 
    }
    @Override
    public void preparar() {
        System.out.println("Preparando los macarrones");
    }
    @Override
    public void servir() {
        System.out.println("Sirviendo los macarrones");
    }
    @Override
    public void comer() {
        System.out.println("Comiendo los macarrones");
    }
    @Override
    public void calentar() {
        System.out.println("Calentando los macarrones");
    }
    @Override
    public void enfriar() {
       System.out.println("Enfriando los macarrones");
    }
}
