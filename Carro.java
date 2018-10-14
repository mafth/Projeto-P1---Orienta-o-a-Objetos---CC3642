/*
 * 
 * Classe que gera um veículo do tipo Carro
 * 
 * @author Matheus
 * 
 * @see Veiculo
 */
import java.util.Random;

public class Carro extends Veiculo{
	Veiculo v = new Veiculo();
	
	/**
	 * Construtor da classe Carro, que usa um Super para chamar o construtor da classe veiculo
	 * 
	 * @see Veiculo
	 * @param x
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
	public Carro (int x, int y, int vel, String cor, boolean fabrica) {
		super(x, y, vel, cor, fabrica);
	}
	
	/**
	 * Random utilizado para gerar movimentos aleatórios na movimentação do Carro
	 */
	Random aleatorio = new Random();
	
	/**
	 * Função que movimenta o carro, recebendo um objeto da própria classe como parâmetro para armazenar as posições dos eixos individualmente
	 * @param c
	 */
	public void movimento(Carro gm) {
		mover = aleatorio.nextInt(4); ///<Gerar posição aleatória , sendo cada numero é equivalente a uma direção de 0 á 3.
		
		/**
		 *Verificação do random para movimentar o caminhão ,com a utilização de getters 
		 */
		if(mover == 0) {
			int x = gm.getX(); 
			x = x + 2; 
			gm.moveX(analisarX(x)); 
		}
		
	
		 
		if(mover == 1) {
			int x = gm.getX();
			x = x - 2;
			gm.moveX(analisarX(x));
		}
		
		if(mover == 2) {
			int y = gm.getY();
			y = y + 2;
			gm.moveY(analisarY(y));
		}
		
		if(mover == 3) {
			int y = gm.getY();
			y = y - 2;
			gm.moveY(analisarY(y));
		}
		
	}
	
		/**
	 * Função para verificar se o carro chegou ao limite da matriz(mapa) em Y e reseta a coordenada para a posição inicial
	 * @param y
	 * @return
	 */
	public int analisarY(int y) {
		if (y >= 59) {
			y = 1;
		}
		if(y <= 0) {
			y = 58;
		}
		return y;
	}
	
	/**
	 * Função para verificar se o carro chegou ao limite da matriz(mapa) em X e reseta a coordenada para a posição inicial
	 * @param x
	 * @return
	 */
	public int analisarX(int x) {
		if (x >= 29) {
			x = 1;
		}
		if(x <= 0) {
			x = 28;
		}
		return x;
	}
	


	

	private int mover; /// Variável de movimentação do Carro
}
