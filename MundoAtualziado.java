import java.util.ArrayList;

public class Mundo {
  /**
   * Instanciando a classe veículo para utilização de atributos da Classe no Mundo
   */
  Veiculo v = new Veiculo();
  /**
   * Fazendo os ArrayList dos veiculos:Carro, Caminhão, Moto, Bicicleta. Os arrays serão responsáveis por guardar uma certa quantidade de cada um dos objetos, portanto sao arrays que variam o tamanho
   */
  ArrayList <Carro> honda = new ArrayList<>();
  ArrayList <Caminhao> vw = new ArrayList<>();
  ArrayList <Moto> cg = new ArrayList<>();
  ArrayList <Bicicleta> calloi = new ArrayList<>();
/**
*Criação do Mundo(Matriz) de 30 linhas e 60 colunas
*/
  public int mundo[][] = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
  
  /**
   * Criando 10 de cada um dos veiculos no mundo, eles aprecerão em posições aleatórias.
   */
  public void geraVeiculos() {
    for(int i = 0; i < 10; i++) {
      honda.add(new Carro((v.setX()+1), (v.setY()+1), 2, "verde",false));
      while (mundo[honda.get(i).getX()][honda.get(i).getY()] == 2) { /**< Verifica se onde o carro aparece tem uma fábrica,caso tiver uma outra posição é criada para ele ser gerado */
        honda.get(i).setX();
        honda.get(i).setY();
      }

      vw.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "vermelho", false));
      while (mundo[vw.get(i).getX()][vw.get(i).getY()] == 2) {
      /**< Verificar se onde o caminhão aparece tem uma fábrica,caso tiver é criado uma outra posição para ele ser gerada */
        vw.get(i).setX();
        vw.get(i).setY();
      }

      cg.add(new Moto((v.setX()+1), (v.setY()+1), 3, "amarelo", false));
      while (mundo[cg.get(i).getX()][cg.get(i).getY()] == 2) {
       /**< Verifica se onde a Moto aparece tem uma fábrica,caso tiver é criado uma outra posição para ela ser gerada */
        cg.get(i).setX();
        cg.get(i).setY();
      }
 calloi.add(new Bicicleta((v.setX()+1), (v.setY()+1),1/2, "rosa", false));
      while (mundo[calloi.get(i).getX()][calloi.get(i).getY()] == 2) {
       /**< Verifica se onde a bicicleta aparece tem uma fábrica,caso tiver é criada uma nova posição para ela ser gerada */
        calloi.get(i).setX();
        calloi.get(i).setY();
      }
    }   
  }
  
  /*Função de "reset" do mapa, para não ter bugs visuais como: deixar "rastros" quando ocorre o processo de movimentação de cada veiculo, isso impede que os objetos "destruam" as fabricas e as bordas*/
  public void refazerMapa() {
    for(int i = 0; i<30; i++) {
      for(int j = 0; j < 60; j++) {
        if(mundo[i][j] != 1 && mundo[i][j] != 2) {
          mundo[i][j] = 0;
        }
      }
    }
   /*Processo que cria novos veiculos no mapa*/
    for (int a = 0; a < honda.size(); a++) {
     /*Armazenamento das coordenadas do carro*/
      int xa = honda.get(a).getX(); 
      int ya = honda.get(a).getY();
      

      for(int i = 0; i<30; i++) {
        for(int j = 0; j < 60; j++) {
          if(i == xa && j == ya) {
            if(mundo[i][j] == 2) {
              mundo[i][j] = 2; 
              
            }
            else {
             /*Um novo carro é gerado após passar por uma fabrica*/
              mundo[i][j] = 3;
              
            }
          }
        }
      }
    }
    
    for(int a = 0; a < vw.size(); a++) {
      int ba = vw.get(a).getX();
      int ca = vw.get(a).getY();
      
      for(int i = 0; i<30; i++) {
        for(int j = 0; j < 60; j++) {
          if(i == ba && j == ca) {
            if(mundo[i][j] == 2) {
              mundo[i][j] = 2;
              
            }
            else {
             /*Um novo caminhao é gerado após passar por uma fabrica*/
              mundo[i][j] = 4;
              
            }
          }
        }
      }
    }
    
    for(int a = 0; a < cg.size(); a ++) {
      int ea = cg.get(a).getX();
      int fa = cg.get(a).getY();
      
      for(int i = 0; i<30; i++) {
        for(int j = 0; j < 60; j++) {
          if(i == ea && j == fa) {
            if(mundo[i][j] == 2) {
              mundo[i][j] = 2;
              
            }
            else {
            /*Uma nova Moto é gerada após passar por uma fabrica*/
              mundo[i][j] = 5;
              
            }
          }
        }
      } 
    }

 for(int a = 0; a < calloi.size(); a ++) {
      int ea = calloi.get(a).getX();
      int fa = calloi.get(a).getY();
      
      for(int i = 0; i<30; i++) {
        for(int j = 0; j < 60; j++) {
          if(i == ea && j == fa) {
            if(mundo[i][j] == 2) {
              mundo[i][j] = 2;
              
            }
            else {
             /*Uma nova Bicicleta é gerada após passar por uma fabrica*/
              mundo[i][j] = 6;
              
            }
          }
        }
      } 
    }
    
  }
  
 /*função para resetar o mundo com os veiculos em suas posições*/
  public void desenhandoMundo() {
    
    /**
     * Contadores para exibir quantidade de veículos 
     */
    int Carro = 0;
    int Motos = 0;
    int caminhoes = 0;
 int Bicicleta = 0;
    
      for(int i = 0; i<30; i++) {
        for(int j = 0; j < 60; j++) {
          
          /*Contadores para printar a quantidade de veiculos*/
          if(mundo[i][j] == 1) {
            System.out.print("\u001b[47m \033[0m");
          }
          else if(mundo[i][j] == 0) {
            System.out.print(" ");
          }
          
          else if(mundo[i][j] == 2) {
            System.out.print("\u001b[42m \033[0m");
          }
          else if(mundo[i][j] == 3){
            System.out.print("\u001b[44m \033[0m");
          }
          else if(mundo[i][j] == 4){
            System.out.print("\u001b[41m \033[0m");
          }
          else if(mundo[i][j] == 5){
           System.out.print("\u001b[43;1m \033[0m");
            
          }
          else if(mundo[i][j] == 6){
           System.out.print("\u001b[45;1m \033[0m");
            
          }
          
        }
        
        System.out.println("");
      } 
      
      /*Colocando as legendas no programa*/
      System.out.print("\u001b[44m \033[0m");
      System.out.print(" Carro ");

      System.out.print("\u001b[43;1m \033[0m");
      System.out.print(" Motos ");

      System.out.print("\u001b[41m \033[0m");
      System.out.println(" Caminhões ");

      System.out.print("\u001b[45m \033[0m");
      System.out.println(" Bicicletas ");
      
      
      for(int a = 0; a < honda.size(); a++) {
        Carro++;
      }
      for(int a = 0; a < vw.size(); a++) {
        caminhoes++;
      }
      for(int a = 0; a < cg.size(); a++) {
        Motos++;
      }
      for(int a = 0; a < calloi.size(); a++) {
        Bicicleta++;
      }
      /*contando os veiculos
      */
    
      System.out.println("Número de Carro: " + Carro);
      System.out.println("Número de Motos: " + Motos);
      System.out.println("Número de Caminhoes: " + caminhoes);
      System.out.println("Número de calloiicletas: " + Bicicleta);
  }
  
  
  public void mundoAtualizado() {
    /**
    Função de movimentação dos veiculos
    */
    for(int i = 0; i < honda.size(); i++) {
      honda.get(i).movimento(honda.get(i));
    }
    
    for (int i = 0; i < vw.size(); i ++) {
      vw.get(i).movimento(vw.get(i));
    }
    
    for (int i = 0; i < cg.size(); i ++) {
      cg.get(i).movimento(cg.get(i));
    }
    for (int i = 0; i < calloi.size(); i ++) {
      calloi.get(i).movimento(calloi.get(i));
    }
    
    geradorVeiculo();
    colisao();
    refazerMapa();
    desenhandoMundo();
  }
  

  public void colisao() {
    /**
    Função que detectará as colisões
    */
    /*Colisão entre carros e apenas carros*/
    for (int i = 0; i < honda.size(); i ++) {
      for (int j = 0; j < honda.size(); j++) {
        if(honda.get(j).getX() == honda.get(i).getX() && honda.get(j).getY() == honda.get(i).getY()) {
          if (i == j) { /*Verificação se o veiculo é realmente ele mesmo, não removendo o mesmo*/
              
            
          }
          else {
            honda.remove(honda.get(i));
          } 
        }
      }
    }
    
   /*Colisão entre caminhoes e apenas caminhoes*/
    for (int i = 0; i < vw.size(); i ++) {
      for (int j = 0; j < vw.size(); j++) {
        if(vw.get(j).getX() == vw.get(i).getX() && vw.get(j).getY() == vw.get(i).getY()) {
          if(i == j) {
            
          }
          else {
            vw.remove(vw.get(i));
          } 
        }
      }
    }
    
    /// Colisão entre Motos apenas
    for (int i = 0; i < cg.size(); i ++) {
      for (int j = 0; j < cg.size(); j++) {
        if(cg.get(j).getX() == cg.get(i).getX() && cg.get(j).getY() == cg.get(i).getY()) {
          if(i == j) {
            
          }
          else {
            cg.remove(cg.get(i));
          } 
        }
      }
    }
   for (int i = 0; i < calloi.size(); i ++) {
      for (int j = 0; j < calloi.size(); j++) {
        if(calloi.get(j).getX() == calloi.get(i).getX() && calloi.get(j).getY() == calloi.get(i).getY()) {
          if(i == j) {
            
          }
          else {
            calloi.remove(calloi.get(i));
          } 
        }
      }
    }
    
   
    for(int i = 0; i < vw.size(); i++) {
      for (int j = 0; j < honda.size(); j++) {
        if(honda.get(j).getX() == vw.get(i).getX() && honda.get(j).getY() == vw.get(i).getY()) {
          if(vw.size() > honda.size()) {
            
          }
          else {
            honda.remove(honda.get(j));
          }
        }
      }
    }
  
    for(int i = 0; i < vw.size(); i++) {
      for (int j = 0; j < cg.size(); j++) {
        if(cg.get(j).getX() == vw.get(i).getX() && cg.get(j).getY() == vw.get(i).getY()) {
          if(vw.size() > cg.size()) {
            
          }
          else {
            cg.remove(cg.get(j));
          }
        }
      }
    }
 for(int i = 0; i < vw.size(); i++) {
      for (int j = 0; j < calloi.size(); j++) {
        if(calloi.get(j).getX() == vw.get(i).getX() && calloi.get(j).getY() == vw.get(i).getY()) {
          if(vw.size() > calloi.size()) {
            
          }
          else {
            calloi.remove(calloi.get(j));
          }
        }
      }
    }

    

    for(int i = 0; i < honda.size(); i++) {
      for (int j = 0; j < cg.size(); j++) {
        if(cg.get(j).getX() == honda.get(i).getX() && cg.get(j).getY() == honda.get(i).getY()) {
          if(honda.size()>cg.size()) {
            
          }
          else {
            cg.remove(cg.get(i));
          }
          
        }
      }
    }
  
 for(int i = 0; i < honda.size(); i++) {
      for (int j = 0; j < calloi.size(); j++) {
        if(calloi.get(j).getX() == honda.get(i).getX() && calloi.get(j).getY() == honda.get(i).getY()) {
          if(honda.size()>calloi.size()) {
            
          }
          else {
            calloi.remove(calloi.get(i));
          }
          
        }
      }
    }
 for(int i = 0; i < cg.size(); i++) {
      for (int j = 0; j < calloi.size(); j++) {
        if(calloi.get(j).getX() == cg.get(i).getX() && calloi.get(j).getY() == cg.get(i).getY()) {
          if(cg.size()>calloi.size()) {
            
          }
          else {
            calloi.remove(calloi.get(i));
          }
          
        }
      }
    }
  }
  
  
 
  public void geradorVeiculo() {
    for(int a = 0; a < honda.size(); a++) {
      int x = honda.get(a).getX();
      int y = honda.get(a).getY();
        for(int i = 0; i < 30; i ++) {
          for(int j = 0; j < 60; j++) {
            if(i == x && j == y) {
              if(mundo[i][j] == 2 && honda.get(a).getFabrica() == false) {
                honda.get(a).setFabrica(true); 
                honda.add(new Carro((v.setX()+1), (v.setY()+1), 2,"azul",false));
                }
              }
            }
          }
        }
    
    for(int a = 0; a < vw.size(); a++) {
      int x = vw.get(a).getX();
      int y = vw.get(a).getY();
        for(int i = 0; i < 30; i ++) {
          for(int j = 0; j < 60; j++) {
            if(i == x && j == y) {
              if(mundo[i][j] == 2 && vw.get(a).getFabrica() == false) {
                vw.get(a).setFabrica(true);
                vw.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "vermelho", false));
                }
              }
            }
          }
        }
    
  
    for(int a = 0; a < cg.size(); a++) {
      int x = cg.get(a).getX();
      int y = cg.get(a).getY();
        for(int i = 0; i < 30; i ++) {
          for(int j = 0; j < 60; j++) {
            if(i == x && j == y) {
              if(mundo[i][j] == 2 && cg.get(a).getFabrica() == false) {
                cg.get(a).setFabrica(true);
                cg.add(new Moto((v.setX()+1), (v.setY()+1), 3, "amarelo", false));
              }
            }
          }
        }
    }
 for(int a = 0; a < calloi.size(); a++) {
      int x = calloi.get(a).getX();
      int y = calloi.get(a).getY();
        for(int i = 0; i < 30; i ++) {
          for(int j = 0; j < 60; j++) {
            if(i == x && j == y) {
              if(mundo[i][j] == 2 && calloi.get(a).getFabrica() == false) {
                calloi.get(a).setFabrica(true);
                calloi.add(new Bicicleta((v.setX()+1), (v.setY()+1), 1/2, "rosa", false));
              }
            }
          }
        }
    }
  }
}