package templatemethod;

public class CursoGratuito extends Curso {
	public CursoGratuito(int prazoConclusaoDias) {
		super(prazoConclusaoDias, 0.0);
	}
	
	@Override
	protected void aplicarAtividades() {
		System.out.println("Aplicando atividades simples");
	}
	
	@Override
	protected void aplicarAvaliacoes() {
		System.out.println("Aplicando avaliações com base nas atividades");
	}
	
	@Override
	protected void emitirCertificado() {
		System.out.println("Este curso não emite certificados!");
	}
}