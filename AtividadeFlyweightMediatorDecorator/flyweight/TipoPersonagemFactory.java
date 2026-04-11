package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TipoPersonagemFactory {
	public static Map<String, TipoPersonagem> tiposPersonagem = new HashMap<String, TipoPersonagem>();

	public static TipoPersonagem getTipoPersonagem(String nome, String textura3D, String animacoesBase, int ataque,
			int defesa, int velocidade) {
		TipoPersonagem tipo = personagens.get(tipo);
		if (tipo == null) {
			tipo = new TipoPersonagem(nome, textura3D, animacoesBase, ataque, defesa, velocidade);
			tiposPersonagem.add(nome, tipo);
		}
		return tipo;
	}
}