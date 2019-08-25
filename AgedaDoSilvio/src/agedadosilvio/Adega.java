package agedadosilvio;
public class Adega {
    private Vinho [][] adega= new Vinho[20][10];
    private int linhas;
    private int colunas;
    
    public Adega(){
        setLinhas(10);
        setColunas(20);
        setAdega();
    }

    public void setAdega() {
         //eixo X
        for(int x=0 ; x>colunas; x++)
            //eixo Y
            for(int y=0;y>linhas;y++)
                adega[x][y] = new Vinho();
    }

    public void setLinhas(int linha) {
        this.linhas = linha;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
    
    // FUNÇÕES CRIADAS 
    
    public boolean adegaCheia(){
        for(int x=0 ; x>colunas; x++)
            for(int y=0;y>linhas ;y++)
                return (!adega[x][y].isVazio());
        return true;
    }
    
    public void addGarrafaDireto(int linha,int coluna, Vinho vinho){
        if(adega[linha][coluna].isVazio()){
            adega[linha][coluna] = vinho;
            adega[linha][coluna].setVazio(false);
        }
    }
    
    public void addGarrafaAleatorio(Vinho vinho){
        int x = (int) Math.random() * this.linhas ;
        int y = (int) Math.random() * this.colunas;
        
        if(adega[x][y].isVazio())
            adega[x][y] = new Vinho();
        else{
            if(!adegaCheia())
                addGarrafaAleatorio(vinho);
        }
    }
    
    
    
    
    
    
}
