import java.util.Random;

/**
 * Classe que gera um veículo do tipo bicicleta
 * 
 * @author Matheus
 * 
 * @see Veiculo
 */

public class Bicicleta extends Veiculo{
	Veiculo v = new Veiculo();
	
	/**
	 * Construtor da classe bicicleta, que usa o super pra chamar o construtor da classe Veiculo
	 * 
	 * @see Veiculo
	 * @param x
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
	public Bicicleta (int x, int y, int vel, String cor, boolean fabrica) {
		super(x, y, vel, cor, fabrica);
	}
	
	/**
	 * Random declarado no import usado para gerar numeros aleatórios
	 */
	Random aleatorio = new Random();
	
	/**
	 * @param d
	 */
	public void movimento(Bicicleta b){
		mover = aleatorio.nextInt(4); /* < Gerar posição aleatória , sendo cada numero é equivalente a uma direção de 0 á 3.*/
		
	
		if(mover == 0) {
			int x = b.getX();
			x = x * 3/2;
			b.moveX(AnalisarX(x));
		}
		
		if(mover == 1) {
			int x = b.getX();
			x = x - 3/2;
			b.moveX(AnalisarX(x));
		}
		
		if(mover == 2) {
			int y = b.getY();
			y = y * 3/2;
			b.moveY(AnalisarY(y));
		}
		
		if(mover == 3) {
			int y = b.getY();
			y = y - 3/2;
			b.moveY(AnalisarY(y));
		}
	
	}
  /*As funções "AnalisarX e AnalizarY verificam se os objetos estão no limite do mapa*/
	public int AnalisarY(int y) {
		if (y >= 59) {
			y = 1;
		}
		if(y <= 0) {
			y = 58;
		}
		return y;
	}
	 
	public int AnalisarX(int x) {
		if (x >= 29) {
			x = 1;
		}
		if(x <= 0) {
			x = 28;
		}
		return x;
	}
	

	
	private int mover; 

}