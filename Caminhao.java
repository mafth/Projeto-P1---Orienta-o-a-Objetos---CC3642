import java.util.Random;

/**
 * Classe que gera um ve�culo do tipo Caminh�o
 * 
 * @author Matheus
 * 
 * @see Veiculo
 */

public class Caminhao extends Veiculo{
	Veiculo v = new Veiculo();
	
	/**
	 * Construtor da classe Caminh�o, que usa o super pra chamar o construtor da classe Veiculo
	 * 
	 * @see Veiculo
	 * @param x
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
	public Caminhao (int x, int y, int vel, String cor, boolean fabrica) {
		super(x, y, vel, cor, fabrica);
	}
	
	/**
	 * Random declarado no import usado para gerar numeros aleat�rios
	 */
	Random aleatorio = new Random();
	
	/**
	 * Fun��o para movimentar o caminh�o para posi��es aleat�rias na Matriz , recebendo um objeto da pr�pria classe como par�metro.
	 * @param d
	 */
	public void movimento(Caminhao vw) {
		mover = aleatorio.nextInt(4); /// < Gerar posi��o aleat�ria , sendo cada numero � equivalente a uma dire��o de 0 � 3.
		
		/**
		 * Verifica��o do random para movimentar o caminh�o ,com a utiliza��o de getters
		 */
		if(mover == 0) {//<If para verificar se a posi��o que ira se movimentar tem valor igual a 0, caso n�o ir� cair nas outras condi��es.
			int x = vw.getX();
			x = x + 1;
			vw.moveX(AnalisarX(x));
		}
		
		if(mover == 1) {
			int x = vw.getX();
			x = x - 1;
			vw.moveX(AnalisarX(x));
		}
		
		if(mover == 2) {
			int y = vw.getY();
			y = y + 1;
			vw.moveY(AnalisarY(y));
		}
		
		if(mover == 3) {
			int y = vw.getY();
			y = y - 1;
			vw.moveY(AnalisarY(y));
		}
	
	}
	
		/**
	 * Fun��o para verificar se o caminh�o chegou ao limite do mapa em Y resetando a coordenada(das colunas);
	 * @param y
	 * @return
	 */
	public int AnalisarY(int y) {
		if (y >= 59) {
			y = 1;
		}
		if(y <= 0) {
			y = 58;
		}
		return y;
	}

	/**
	 * Fun��o para verificar se ao caminh�o chegou ao limite do mapa em X, resetando a posic�o inicial(nesse caso em X)
	 * 
	 * @param x
	 * @return
	 */
	 
	 
	public int AnalisarX(int x) {
		if (x >= 29) {
			x = 1;
		}
		if(x <= 0) {
			x = 28;
		}
		return x;
	}
	

	
	private int mover; /// Vari�vel para mover o caminhao na matriz 

}
