package principales;

import interfaz.Comida;

public class Sopa implements Comida {
    private String tipoSopa; 
    private String ingredientes; 
    private String caldo; 
    public Sopa(String tipoSopa, String ingredientes, String caldo) { 
        this.tipoSopa = tipoSopa; 
        this.ingredientes = ingredientes; 
        this.caldo = caldo; } 
    public String getTipoSopa() { 
        return tipoSopa; 
    } 
    public String getIngredientes() { 
        return ingredientes; 
    } 
    public String getCaldo() { 
        return caldo; 
    }
    @Override
    public void preparar() {
        System.out.println("Preparando la sopa");
    }
    @Override
    public void servir() {
       System.out.println("Sirviendo la sopa");
    }
    @Override
    public void comer() {
        System.out.println("Comiendo la sopa");
    }
    @Override
    public void calentar() {
        System.out.println("Calentando la sopa");
    }
    @Override
    public void enfriar() {
        System.out.println("Enfriando la sopa");
    }
}
