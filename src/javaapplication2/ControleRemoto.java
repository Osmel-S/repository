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
public class ControleRemoto {

    private int volumeMaximo = 100;
    private int canalMaximo = 10220;
    private Televisao televisao;
    
    ControleRemoto(Televisao televisao){
        this.televisao = televisao;
    }
    
    public int getVolumeMaximo(){
        return volumeMaximo;
    }
    
    public int getCanalMaximo(){
        return canalMaximo;
    }
    public void aumentarVolume() {
        int volume = televisao.getVolume();
        ++volume;
        televisao.setVolume(volume);
    }
    
    public void diminuirVolume() {
        int volume = televisao.getVolume();
        --volume;
        televisao.setVolume(volume);
    }
    
    public void subirCanal () {
       int canal = televisao.getCanal();
        canal++;
        televisao.setCanal(canal);
    }
    
    public void descerCanal() {
         int canal = televisao.getCanal();
        --canal;
        televisao.setCanal(canal);
    }
}
