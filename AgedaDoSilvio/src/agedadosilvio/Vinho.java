package agedadosilvio;

import java.time.LocalDate;

public class Vinho {
    private char tipo;
    private String marca;
    private int volume;
    private LocalDate dataDeProducao;
    private float valor;
    private boolean vazio;

    public Vinho(char tipo, String marca, int volume, LocalDate dataDeProducao, float valor, boolean vazio) {
        this();
        this.tipo = tipo;
        this.marca = marca;
        this.volume = volume;
        this.dataDeProducao = dataDeProducao;
        this.valor = valor;
        this.vazio = vazio;
    }

    public Vinho() {
        this.tipo = 0;
        this.marca = null;
        this.volume = 0;
        this.dataDeProducao = null;
        this.valor = 0;
        this.vazio = true;
    }
    
    public void setTipo(char tipo) {  
        
        tipo = Character.toUpperCase(tipo);
        
        if(tipo == 'T' || tipo == 'B')
            this.tipo = tipo;
    }

    public void setMarca(String marca) {
          this.marca = (marca!= "")?marca:null;
    }

    public void setVolume(int volume) {
        this.volume = (volume>0)? volume: null;
    }

    public void setDataDeProducao(LocalDate dataDeProducao) {
        this.dataDeProducao = dataDeProducao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setVazio(boolean vazio) {
        this.vazio = vazio;
    }

    public boolean isVazio() {
        return vazio;
    }

    public char getTipo() {
        return tipo;
    }

    public chargetMarca() {
        return marca;
    }

    public int getVolume() {
        return volume;
    }

    public LocalDate getDataDeProducao() {
        return dataDeProducao;
    }

    public float getValor() {
        return valor;
    }
    
    
    
    
}
