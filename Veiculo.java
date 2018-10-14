/**
 * 
 * Classe utilizada para gerar Carros
 * 
 * @author Matheus
 * 
 * @see Veiculo
 */
import java.util.Random;

public class Veiculo {
	
	Random aleatorio = new Random(); /// Função random, utilizada para gerar posições aleatórias
	
	/**
	 * Construtor da classe Veículo
	 */
	public Veiculo() {
	     	x = 0; 
        y = 0; 
        velocidade = 0; 
        fabrica = false; 
        cor = null; 
	}
	
	/**
	 * Construtor da classe Veículo
	 * Cria veículos utilizando suas variaveis dependendo de cada chamada de um veiculo em especifico
	 * 
	 * @param x 
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
	public Veiculo(int x, int y, int velocidade, String cor, boolean fabrica) {
		this.x = x;
		this.y = y;
		this.velocidade = velocidade;
		this.cor = cor;
		this.fabrica = fabrica;
	}
	
	/**
	 * Cria um valor aleatório para o eixo X do veículo
	 * 
	 * @return O valor aleatório gerado para X
	 */
	public int setX() {
		x = aleatorio.nextInt(28);
		return x;
		
	}
	
	/**
	 * O valor de X do veiculo irá mudar dependendo no que sera passado no veiculo especifico
	 * 
	 * @param x
	 */
	public void moveX(int x) {
		this.x = x;
	}
	
	/**
	 * O valor de Y do veiculo irá mudar dependendo no que sera passado no veiculo especifico
	 * 
	 * @param y
	 */
	public void moveY(int y) {
		this.y = y;
	}
	
	/**
	 * Cria um valor aleatório para o Y do veículo
	 * 
	 * @return O valor aleatório gerado para Y
	 */
	public int setY() {
		y = aleatorio.nextInt(58);
		return y;
	}
	
	/**
	 * @return O valor de X do veículo
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * @return O valor de Y do veículo
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * @return A velocidade do veículo
	 */
	public int getVelocidade() {
		return velocidade;
	}
	
	/**
	 * @return A cor do veículo
	 */
	public String getCor() {
		return cor;
	}
	
	/**
	 * Verifica se um veiculo esta ou não em uma fabrica dependendo do que é recebido no condicao
	 * 
	 * @param condicao 
	 */
	public void setFabrica(boolean condicao) {
		fabrica = condicao;
	}
	
	/**
	 * @return Se um veículo está ou não em uma fábrica
	 */
	public boolean getFabrica() {
		return fabrica;
	}
	
	private int x; /// Coordenada X do veículo
	private int y; /// Coordenada Y do veículo
	private int velocidade; /// Variavel para velocidade
	private String cor; /// Cor do veículo
	private boolean fabrica; /// Variavel boolean para verificar se o veiculo está ou não em uma fabrica
	
}