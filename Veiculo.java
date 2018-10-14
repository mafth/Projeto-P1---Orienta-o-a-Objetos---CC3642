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
	
	Random aleatorio = new Random(); /// Fun��o random, utilizada para gerar posi��es aleat�rias
	
	/**
	 * Construtor da classe Ve�culo
	 */
	public Veiculo() {
	     	x = 0; 
        y = 0; 
        velocidade = 0; 
        fabrica = false; 
        cor = null; 
	}
	
	/**
	 * Construtor da classe Ve�culo
	 * Cria ve�culos utilizando suas variaveis dependendo de cada chamada de um veiculo em especifico
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
	 * Cria um valor aleat�rio para o eixo X do ve�culo
	 * 
	 * @return O valor aleat�rio gerado para X
	 */
	public int setX() {
		x = aleatorio.nextInt(28);
		return x;
		
	}
	
	/**
	 * O valor de X do veiculo ir� mudar dependendo no que sera passado no veiculo especifico
	 * 
	 * @param x
	 */
	public void moveX(int x) {
		this.x = x;
	}
	
	/**
	 * O valor de Y do veiculo ir� mudar dependendo no que sera passado no veiculo especifico
	 * 
	 * @param y
	 */
	public void moveY(int y) {
		this.y = y;
	}
	
	/**
	 * Cria um valor aleat�rio para o Y do ve�culo
	 * 
	 * @return O valor aleat�rio gerado para Y
	 */
	public int setY() {
		y = aleatorio.nextInt(58);
		return y;
	}
	
	/**
	 * @return O valor de X do ve�culo
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * @return O valor de Y do ve�culo
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * @return A velocidade do ve�culo
	 */
	public int getVelocidade() {
		return velocidade;
	}
	
	/**
	 * @return A cor do ve�culo
	 */
	public String getCor() {
		return cor;
	}
	
	/**
	 * Verifica se um veiculo esta ou n�o em uma fabrica dependendo do que � recebido no condicao
	 * 
	 * @param condicao 
	 */
	public void setFabrica(boolean condicao) {
		fabrica = condicao;
	}
	
	/**
	 * @return Se um ve�culo est� ou n�o em uma f�brica
	 */
	public boolean getFabrica() {
		return fabrica;
	}
	
	private int x; /// Coordenada X do ve�culo
	private int y; /// Coordenada Y do ve�culo
	private int velocidade; /// Variavel para velocidade
	private String cor; /// Cor do ve�culo
	private boolean fabrica; /// Variavel boolean para verificar se o veiculo est� ou n�o em uma fabrica
	
}