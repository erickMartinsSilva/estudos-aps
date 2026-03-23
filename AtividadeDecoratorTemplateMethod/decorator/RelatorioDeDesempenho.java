package decorator;
import templatemethod.*; 

public class RelatorioDeDesempenho extends CursoDecorator{
	protected double valor = 12.99;
	
    public RelatorioDeDesempenho(Curso curso){
        super(curso);
        System.out.println("Relatório de Desempenho personalizado incluído no pacote de estudos");
    }

    @Override
    public double calcularValorTotal(){
        return super.calcularValorTotal() + this.valor;
    }
}