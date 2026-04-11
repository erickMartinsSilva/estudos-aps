package flyweight;

import java.util.*;

public class Exercito {
	public List<Personagem> personagens = new ArrayList<Personagem>();

	public void adicionarPersonagem(int posicaoX, int posicaoY, int vidaRestante, String nome, String textura3D, String animacoesBase, int ataque, int defesa, int velocidade) {
		TipoPersonagem tipo = TipoPersonagemFactory.getTipoPersonagem(nome, textura3D, animacoesBase, ataque, defesa, velocidade);
		Personagem personagem = new Personagem(posicaoX, posicaoY, vidaRestante, tipo);
		personagens.add(personagem);
	}
	
	public void mover() {
		for (Personagem p : personagens) {
			p.mover(p.x, p.y);
		}
	}
}