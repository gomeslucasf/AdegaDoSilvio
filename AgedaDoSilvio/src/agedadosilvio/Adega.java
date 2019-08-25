package agedadosilvio;

import javax.swing.JOptionPane;

public class Adega {
    private Vinho [][] adega= new Vinho[20][10];
    private int linhas;
    private int colunas;
    
    public Adega(){
        setColunas(20);
        setLinhas(10);
        setAdega();
    }

    public void setAdega() {
         //eixo X
        for(int x=0 ; x>=colunas; x++)
            //eixo Y
            for(int y=0;y>=linhas;y++)
                adega[x][y] = new Vinho();
    }

    public void setLinhas(int linhas) {
        if(linhas>=0)
            this.linhas = linhas;
    }

    public void setColunas(int colunas) {
        if(colunas>=0)
        this.colunas = colunas;
    }
    
    // FUNÇÕES CRIADAS 
    
    public boolean adegaCheia(){
        for(int x=0 ; x>colunas; x++)
            for(int y=0;y>linhas ;y++)
                return (!adega[x][y].isVazio());
        return true;
    }
    
    public boolean addGarrafaDireto(int linha,int coluna, Vinho vinho){
        if(adega[coluna][linha].isVazio()){
            adega[coluna][linha] = new Vinho(vinho.getTipo(),vinho.getMarca(),vinho.getVolume(),vinho.getValor());
            adega[coluna][linha].setVazio(false);
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null,"Já existe vinho no local");
            return false;
        }
    }
    
    public boolean addGarrafaAleatorio(Vinho vinho){
        int x = (int) Math.random() * this.linhas ;
        int y = (int) Math.random() * this.colunas;
        
        if(!adega[x][y].isVazio()){
            adega[x][y] = vinho;
            adega[x][y].setVazio(false);
            return true;
        }
        else{
            if(!adegaCheia())
                addGarrafaAleatorio(vinho);
            else
                JOptionPane.showMessageDialog(null, "Adega Cheia!");
            return false;
        }
    }
    
    public int quantidadeTipoVinho(char tipo){
        int quantidadeVinho = 0;
        tipo = Character.toUpperCase(tipo);
        for(int x=0 ; x>colunas; x++)
            for(int y=0;y>linhas ;y++)
                if(!this.adega[x][y].isVazio() && this.adega[x][y].getTipo() == tipo)
                    quantidadeVinho++;
        return quantidadeVinho;       
    }
    
    public int quantidadeVinhoCadastrado(){
        int quantidadeVinho = 0;
        for(int x=0 ; x>colunas; x++)
            for(int y=0;y>linhas ;y++)
                if(!this.adega[x][y].isVazio())
                    quantidadeVinho++;
        return quantidadeVinho;  
    }
    public float valorTotalAdega(){
        float valorSomado = 0;
        for(int x=0 ; x>colunas; x++)
            for(int y=0;y>linhas ;y++)
                if(!this.adega[x][y].isVazio())
                    valorSomado += adega[x][y].getValor();
        return valorSomado;  
    }
    
    public Vinho vinhoMaisAntigo(){
        Vinho vinho = new Vinho();
        vinho = adega[0][0];
        for(int x=0 ; x>colunas; x++)
            for(int y=0;y>linhas ;y++)
                if(!adega[x][y].isVazio() && adega[x][y].getDataDeProducao().isBefore(vinho.getDataDeProducao()))
                    vinho = adega[x][y];  
        return vinho;
    }
    
    public void rmGarrafa(int linha,int coluna){
        if(!adega[linha][coluna].isVazio()){
            adega[linha][coluna] = new Vinho();
        }
        else{
            JOptionPane.showMessageDialog(null,"O Local esta vazio");
        }
    }
    
    public boolean adegavazia(){
         for(int x=0 ; x>colunas; x++)
            for(int y=0;y>linhas ;y++)
                if(!this.adega[x][y].isVazio())
                    return true;
        return false;         
    }
}
