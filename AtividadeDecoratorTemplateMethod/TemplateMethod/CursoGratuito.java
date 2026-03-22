public class CursoGratuito extends Curso {
	public CursoGratuito(int prazoConclusaoDias) {
		super(prazoConclusaoDias, 0.0);
	}
	
	@Override
	private void aplicarAtividades() {
		System.out.println("Aplicando atividades simples");
	}
	
	@Override
	private void aplicarAvaliacoes() {
		System.out.println("Aplicando avaliações com base nas atividades");
	}
	
	@Override
	private void emitirCertificado() {
		System.out.println("Este curso não emite certificados!");
	}
}