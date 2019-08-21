package agedadosilvio;

import java.time.LocalDate;

public class Vinho {
    private char tipo;
    private String marca;
    private int volume;
    private LocalDate dataDeProducao;
    private float valor;

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
        this.dataDeProducao = dataDeProducao.;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
}
