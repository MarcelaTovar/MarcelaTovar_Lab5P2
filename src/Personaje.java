/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcela
 */
public class Personaje {
    private String nombre;
    private String poder;
    private String debilidad;
    private String universo;
    private int fuerza;
    private int agilidadFisica;
    private int agilidadMental;
    private int puntosdeVida;
    private boolean S;

    public Personaje() {
    }

    public Personaje(String nombre, String poder, String debilidad, String universo, int fuerza, int agilidadFisica, int agilidadMental, int puntosdeVida, boolean S) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
        this.puntosdeVida = puntosdeVida;
        this.S = S;
    }

    

    public Personaje(String nombre, boolean S) {
        this.nombre = nombre;
        this.S = S;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(int agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public int getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(int agilidadMental) {
        this.agilidadMental = agilidadMental;
    }

    public int getPuntosdeVida() {
        return puntosdeVida;
    }

    public void setPuntosdeVida(int puntosdeVida) {
        this.puntosdeVida = puntosdeVida;
    }

    public boolean isS() {
        return S;
    }

    public void setS(boolean S) {
        this.S = S;
    }
    
    

    @Override
    public String toString() {
        if (S) {
            return nombre;
        }
        return this.nombre+"\nPoder-> "+this.poder+"\nFuerza-> "+this.fuerza+"\nDebilidad-> "+this.debilidad+"\nAgilidad Fisica-> "+this.agilidadFisica+"\nAgilidad Mental-> "+this.agilidadMental+"\nPuntos de vida-> "+this.puntosdeVida;
    }
    
    
    
}
