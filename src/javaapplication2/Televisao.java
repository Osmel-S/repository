/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author OSMEL SANTOS FEITOSA
 */
public class Televisao {

    private int volume;
    private int canal;
    private String marca;
    private boolean ligado;
    private ControleRemoto controleRemoto = new ControleRemoto(this);

    public Televisao() {
    }

    public Televisao(int volume, int canal, String marca, boolean ligado, ControleRemoto controleRemoto) {
        this.volume = volume;
        this.canal = canal;
        this.marca = marca;
        this.ligado = ligado;
        this.controleRemoto = controleRemoto;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume <0){
            System.out.println("Volume inválido!");
        }else{
            this.volume = volume;
        }
        
    }

    public int getCanal() {
        return canal;
    }
    
     public ControleRemoto getControleRemoto() {
        return controleRemoto;
    }
        
    public void setCanal(int canal) {
        this.canal = canal;
    }
    
 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    
    
    @Override
    public String toString(){
        return "Volume: " +volume + ", Canal: " + canal + ",Marca: " + marca + ", Ligado: " +ligado; 
    }
    
}
