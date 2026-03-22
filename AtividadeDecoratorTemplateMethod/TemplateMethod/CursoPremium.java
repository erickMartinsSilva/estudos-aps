public class CursoPremium extends Curso {
	public CursoPremium(int prazoConclusaoDias, double valorDia) {
		super(prazoConclusaoDias, valorDia);
	}
	
	@Override
	private void aplicarAtividades() {
		System.out.println("Aplicando atividades com maior profundidade");
	}
	
	@Override
	private void aplicarAtividadesAvancadas() {
		System.out.println("Aplicando atividades avançadas com maior valor pro mercado");
	}
	
	@Override
	private void aplicarAvaliacoesAvancadas() {
		System.out.println("Aplicando avaliações avançadas com base nas atividades");
	}
}