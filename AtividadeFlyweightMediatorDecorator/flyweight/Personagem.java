package flyweight;

public class Personagem {
	private TipoPersonagem tipo;
	private int posicaoX;
	private int posicaoY;
	private int vidaRestante = 50;
	
	public Personagem(int posicaoX, int posicaoY, tipoPersonagem tipo) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.tipo = tipo;
	}
	
	public int getPosicaoX() {
		return posicaoX;
	}
	
	public int getPosicaoY() {
		return posicaoY;
	}
	
	public void setPosicaoX(int x) {
		this.posicaoX = x;
	}
	
	public void setPosicaoY(int y) {
		this.posicaoY = y;
	}
	
	public void curar(int pontosVida) {
		this.vidaRestante += pontosVida;
		System.out.println(this.tipo.nome + "foi curado em " + pontosVida + " pontos! Nova vida restante = " + this.vidaRestante);
	}
	
	public void reduzirVida(int pontos) {
		this.vidaRestante -= pontos;
		System.out.println("Vida de " + this.tipo.nome + " reduzida em " + pontos + " pontos! Vida restante = " + this.vidaRestante);;
	}
	
	public void mover() {
		this.tipo.mover(this.x, this.y);
	}
}