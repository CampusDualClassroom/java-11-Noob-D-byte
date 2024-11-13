package com.campusdual.classroom;

public class TVRemote {

    //1--Atributos
    int channel;     //en que canal está la tele
    int volume;   // en que nivel de volumen está la tele
    boolean on;    // la tv esta encendida o no
    String color; // color del mando a distancia

    //2--constructores
    public TVRemote(String color){
        this.channel = 0;
        this.volume = 20;
        this.color = color;       //this --> hace referencia al que pertenece la clase, siempre hay que ponerlo(Buena práctica de código)
    }

    //3--metodos
    public boolean turnOn(){
        this.on = true;
        return this.on;
    }

    public boolean turnOff(){
        this.on = false;
        return  this.on;
    }

    public void channelUp(){
        this.channel++;
    }

    public void channelDown(){
        if(this.checkMinValue(this.channel)){
            this.channel--;
        }
    }
    public void volumeUp(){
        this.volume++;
    }
    public void volumeDown(){
        if(this.checkMinValue(this.volume)){
            this.volume--;
        }
    }
    public String getColor(){
        return this.color;
    }
    public boolean checkMinValue(int value){
        if (value == 0){
            System.out.println("O canal xa é 0, non se pode baixar");
        return false;
        }else {
            return true;
        }
    }


    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
