package templatemethod;

public class CursoIntensivo extends Curso {
	public CursoIntensivo(int prazoConclusaoDias, double valorDia) {
		super(prazoConclusaoDias, valorDia);
	}
	
	@Override
	protected void aplicarAtividades() {
		System.out.println("Aplicando atividades em grande carga");
	}
	
	@Override
	protected void aplicarAvaliacoes() {
		System.out.println("Aplicando avaliações com base nas atividades intensivas");
	}
}