/*
 * @autor Matheus
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
	  /**
	   *Instanciando classe mundo para utilizar seus atributos e funções no Main 
	   */
		Mundo m = new Mundo();
		/**
		 * Gerar mundo com os veiculos pre estabelecidos
		 * */
		m.geraVeiculos(); 
		m.desenhandoMundo(); 
		
		int i = 0;
		/**
		 *Laço de repetição para o mapa ser atualizado e os veiculos se moverem de acordo com a classe medo;
		 */ 
		while (i == 0) {
			m.mundoAtualizado(); 
			Thread.sleep(400);  
		}
	}
}