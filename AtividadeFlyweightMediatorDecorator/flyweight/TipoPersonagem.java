public class TipoPersonagem {
	public String nome;
	public String textura3D;
	public String animacoesBase;
	public int ataque;
	public int defesa;
	public int velocidade;

	public TipoPersonagem(String nome, String textura3D, String animacoesBase, int ataque, int defesa, int velocidade) {
		this.nome = nome;
		this.textura3D = textura3D;
		this.animacoesBase = animacoesBase;
		this.ataque = ataque;
		this.defesa = defesa;
		this.velocidade = velocidade;
	}
	
	public void mover(int x, int y) {
		System.out.println(this.nome + " movido para a posição x = " + x + ", y = " + y);
	}
}