package templatemethod;

public abstract class Curso {
	protected int prazoConclusaoDias;
	protected double valorDia;

	public int getPrazoConclusaoDias() {
		return prazoConclusaoDias;
	}

	public double getValorDia() {
		return valorDia;
	}
	
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
	
	protected void aplicarAtividades() {
		System.out.println("Aplicando atividades");
	}
	
	protected void aplicarAtividadesAvancadas() {};
	
	protected void aplicarAvaliacoes() {
		System.out.println("Aplicando avaliações");
	}
	
	protected void aplicarAvaliacoesAvancadas() {};
	
	protected void emitirCertificado() {
		System.out.println("Certificado emitido");
	}
	
	public double calcularValorTotal() {
		return prazoConclusaoDias * valorDia;
	}
}