package agedadosilvio;

import java.time.LocalDate;

public class Vinho {
    private char tipo;
    private String marca;
    private int volume;
    private LocalDate dataDeProducao;
    private float valor;
    private boolean vazio;

    public Vinho(char tipo, String marca, int volume, float valor) {
        this();
        setTipo(tipo);
        setMarca(marca);
        setVolume(volume);
        setDataDeProducao();
        setValor(valor);
        setVazio(true);
    }

    public Vinho() {
        this.tipo = 0;
        this.marca = null;
        this.volume = 0;
        this.dataDeProducao = null;
        this.valor = 0;
        this.vazio = true;
    }
    
    // ---------> SET
    
    public void setTipo(char tipo) {  
        
        tipo = Character.toUpperCase(tipo);
        
        if(tipo == 'T' || tipo == 'B')
            this.tipo = tipo;
    }

    public void setMarca(String marca) {
          this.marca =marca;
    }

    public void setVolume(int volume) {
        this.volume = (volume>0)? volume:0;
    }

    public void setDataDeProducao() {
        this.dataDeProducao = LocalDate.now();
    }

    public void setValor(float valor) {
        this.valor = (valor>=0)?valor: 0;
    }

    public void setVazio(boolean vazio) {
        this.vazio = vazio;
    }
    
    // -----------> GET

    public boolean isVazio() {
        return this.vazio;
    }

    public char getTipo() {
        return tipo;
    }

    public String getMarca() {
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
