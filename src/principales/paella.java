package principales;

import interfaz.Comida;

public class paella implements Comida {
    private String arroz;
    private String marisco;
    private String verduras; 
    public paella(String arroz, String marisco, String verduras) { 
        this.arroz = arroz; 
        this.marisco = marisco; 
        this.verduras = verduras; 
    } 
    public String getArroz() { 
        return arroz; 
    } 
    public String getMarisco() { 
        return marisco; 
    } 
    public String getVerduras() { 
        return verduras; 
    }
    @Override
    public void preparar() {
        System.out.println("Preparando la paella");
    }
    @Override
    public void servir() {
        System.out.println("Sirviendo la paella");
    }
    @Override
    public void comer() {
        System.out.println("Comiendo la paella");
    }
    @Override
    public void calentar() {
        System.out.println("Calentando la paella");
    }
    @Override
    public void enfriar() {
        System.out.println("Enfriando la paella");   
    }



}
