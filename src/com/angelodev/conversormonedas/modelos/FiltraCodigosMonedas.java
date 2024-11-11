package com.angelodev.conversormonedas.modelos;

public class FiltraCodigosMonedas {

    private String monedaBase;

    private String monedaObjetivo;

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public void setCodigosMoneda(int opcionUsuario){
        switch (opcionUsuario){
            case 1:
                this.monedaBase = "USD";
                this.monedaObjetivo = "MXN";
            break;
            case 2:
                this.monedaBase = "MXN";
                this.monedaObjetivo = "USD";
                break;
            case 3:
                this.monedaBase = "USD";
                this.monedaObjetivo = "ARS";
                break;
            case 4:
                this.monedaBase = "ARS";
                this.monedaObjetivo = "USD";
                break;
            case 5:
                this.monedaBase = "USD";
                this.monedaObjetivo = "BRL";
                break;
            case 6:
                this.monedaBase = "BRL";
                this.monedaObjetivo = "USD";
                break;
            case 7:
                this.monedaBase = "USD";
                this.monedaObjetivo = "COP";
                break;
            case 8:
                this.monedaBase = "COP";
                this.monedaObjetivo = "USD";
                break;
            default:
                System.out.println("Ha ocurrido un error, intente de nuevo");
                break;
        }
    }
}
