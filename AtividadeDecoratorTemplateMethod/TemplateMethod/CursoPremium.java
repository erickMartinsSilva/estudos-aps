package templatemethod;

public class CursoPremium extends Curso {
	public CursoPremium(int prazoConclusaoDias, double valorDia) {
		super(prazoConclusaoDias, valorDia);
	}
	
	@Override
	protected void aplicarAtividades() {
		System.out.println("Aplicando atividades com maior profundidade");
	}
	
	@Override
	protected void aplicarAtividadesAvancadas() {
		System.out.println("Aplicando atividades avançadas com maior valor pro mercado");
	}
	
	@Override
	protected void aplicarAvaliacoesAvancadas() {
		System.out.println("Aplicando avaliações avançadas com base nas atividades");
	}
}