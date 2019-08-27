package agedadosilvio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class AgedaDoSilvio { 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Adega SilVinhos = new Adega();
        System.out.println(" ---------->  MENU DA ADEGA <----------");
        System.out.println();
        System.out.println();
        System.out.println("1 --> Incluir uma garrafa na adega pela posição posição ");
        System.out.println();
        System.out.println("2 --> Incluir uma garrafa na adega em uma posição aleatória");
        System.out.println();
        System.out.println("3 --> Obter a quantidade de vinhos (por tipo) que estão na adega");
        System.out.println();
        System.out.println("4 --> Obter a quantidade de garrafas cadastradas na adega");
        System.out.println();
        System.out.println("5 --> Obter o valor agregado da adega (somatório dos vinhos)");
        System.out.println();
        System.out.println("6 --> Obter o vinho mais antigo da adega (menor data de fabricação)");
        System.out.println();
        System.out.println("7 --> Retirar um determinado vinho, de acordo com sua localização");
        System.out.println();
        System.out.println("0 --> Sair");
        System.out.println();
        System.out.println("8 --> Seed (Alimentando o sistema sem input de Usuario)");
        System.out.println();
        int tecla =ler.nextInt();
        Vinho vinho;
        while(tecla != 0){
            switch(tecla){
                case 1:
                    vinho = new Vinho();
                    //--> tentei fazer com JOptionPane
                    vinho.setTipo(JOptionPane.showInputDialog("Digite o tipo do vinho (Tinto - T ou Branco - B)").charAt(0));
                    vinho.setMarca(JOptionPane.showInputDialog("Digite o a marca do vinho:"));
                    vinho.setVolume(Integer.valueOf(JOptionPane.showInputDialog("Digite o tamanho do vinho: em ml")));
                    vinho.setValor(Float.valueOf(JOptionPane.showInputDialog("Digite o Preço do vinho: com .")));
                    /*
                    
                    System.out.println("Digite o tipo (T ou B):");
                    vinho.setTipo(ler.next().toString().charAt(0));
                    System.out.println("Digite a marca do Vinho");
                    vinho.setMarca(ler.next().toString());
                    System.out.println("Digite o volume do Vinho em ml");
                    vinho.setVolume(ler.nextInt());
                    System.out.println("Digite o Valor do Vinho com  . ");
                    vinho.setValor(ler.nextFloat());
                    
                    */
                    String cordenadas[]=JOptionPane.showInputDialog("Digite a posição no formato -> (colunas/linhas)").split("/");
                    if(SilVinhos.addGarrafaDireto(Integer.valueOf(cordenadas[1]),Integer.valueOf(cordenadas[0]), vinho))
                        JOptionPane.showMessageDialog(null, "VinhoInserido com Sucesso");
                    break;
                case 2:
                    vinho = new Vinho();
 
                    //--> tentei fazer com JOptionPane
                    vinho.setTipo(JOptionPane.showInputDialog("Digite o tipo do vinho (Tinto - T ou Branco - B)").charAt(0));
                    vinho.setMarca(JOptionPane.showInputDialog("Digite o a marca do vinho:"));
                    vinho.setVolume(Integer.valueOf(JOptionPane.showInputDialog("Digite o tamanho do vinho: em ml")));
                    vinho.setValor(Float.valueOf(JOptionPane.showInputDialog("Digite o Preço do vinho: com .")));
                    /*
                    
                    System.out.println("Digite o tipo (T ou B):");
                    vinho.setTipo(ler.next().toString().charAt(0));
                    System.out.println("Digite a marca do Vinho");
                    vinho.setMarca(ler.next().toString());
                    System.out.println("Digite o volume do Vinho em ml");
                    vinho.setVolume(ler.nextInt());
                    System.out.println("Digite o Valor do Vinho com  . ");
                    vinho.setValor(ler.nextFloat());
                    
                    */
                    SilVinhos.addGarrafaAleatorio(vinho);
                    JOptionPane.showMessageDialog(null,"Vinho cadastrado com sucesso!");
                    break;
                case 3:
                    char tipo;
                    if(!SilVinhos.adegavazia()){
                        tipo= JOptionPane.showInputDialog("Digite o tipo do vinho (Tinto - T ou Branco - B)").charAt(0);
                        int quantidade = SilVinhos.quantidadeTipoVinho(tipo);
                        JOptionPane.showMessageDialog(null,"Quantidade do vinho " + tipo + " é "+ quantidade);
                    }
                    else
                        JOptionPane.showConfirmDialog(null, "Adega Vazia!");
                    
                    
                    break;
                case 4: 
                    if(!SilVinhos.adegavazia()){
                        int quantidade = SilVinhos.quantidadeVinhoCadastrado();
                        JOptionPane.showMessageDialog(null,"Quantidade do vinho cadastrado "+ quantidade);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Adega Vazia!");       
                    break;
                case 5:
                    if(!SilVinhos.adegavazia()){
                        float quantidade = SilVinhos.valorTotalAdega();
                        JOptionPane.showMessageDialog(null,"Valor total da adega é R$"+ quantidade);       
                    }
                    else
                        JOptionPane.showConfirmDialog(null, "Adega Vazia!");  
                    break;
                case 6:
                    if(!SilVinhos.adegavazia())
                         JOptionPane.showMessageDialog(null,"O vinho mais antigo é o "+ SilVinhos.vinhoMaisAntigo().getMarca());
                    else
                        JOptionPane.showConfirmDialog(null, "Adega Vazia!");
                    break;
                case 7:
                    if(!SilVinhos.adegavazia()){
                      cordenadas=JOptionPane.showInputDialog("Digite a posição ara remover no formato -> (colunas/linhas)").split("/");
                      SilVinhos.rmGarrafa(Integer.valueOf(cordenadas[1]),Integer.valueOf(cordenadas[0]));
                      JOptionPane.showMessageDialog(null,"Excluida com sucesso!");
                    }
                    else
                        JOptionPane.showConfirmDialog(null, "Adega Vazia!");
                    break;
                case 8: 
                    vinho = new Vinho('B',"SaoPaulo da posi 1,0",1000,155);
                    SilVinhos.addGarrafaDireto(1,0,vinho);
                    vinho = new Vinho('T',"sao bernardo",1000,15);
                    SilVinhos.addGarrafaAleatorio(vinho);
                    vinho = new Vinho('B',"Palmeras",1000,1055);
                    SilVinhos.addGarrafaAleatorio(vinho);
                    vinho = new Vinho('T',"Minero",500,45);
                    SilVinhos.addGarrafaAleatorio(vinho);
                    vinho = new Vinho('B',"SaoPaulo",1000,155);
                    SilVinhos.addGarrafaAleatorio(vinho);
                    JOptionPane.showMessageDialog(null,"CADASTRADOS COM SUCESSO!");
                    break;                    
                
            }
          tecla =ler.nextInt();  
        }
        
        
        
    }

   
    
    
}
