public abstract class Curso {
	private int prazoConclusaoDias = 30;
	
	public Curso(int prazoConclusaoDias, double valorDia) {
		this.prazoConclusaoDias = prazoConclusaoDias;
		this.valorDia = valorDia;
	}
	
	public void templateMethod() {
		exibirNumeroDiasConclusao();
		aplicarAtividades();
		aplicarAtividadesAvancadas();
		aplicarAvaliacoes();
		aplicarAvaliacoesAvancadas();
		emitirCertificado();
		calcularValorTotal();
	}
	
	private void exibirNumeroDiasConclusao() {
		System.out.println("Prazo de conclusão: " + this.prazoConclusaoDias + " dias");
	}
	
	private void aplicarAtividades() {
		System.out.println("Aplicando atividades");
	};
	
	private void aplicarAtividadesAvancadas() {};
	
	private void aplicarAvaliacoes() {
		System.out.println("Aplicando avaliações");
	};
	
	private void aplicarAvaliacoesAvancadas() {};
	
	private void emitirCertificado() {
		System.out.println("Certificado emitido");
	}
	
	private void calcularValorTotal() {}
}