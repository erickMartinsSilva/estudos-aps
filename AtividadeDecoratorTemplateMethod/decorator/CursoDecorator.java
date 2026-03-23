package decorator;
import templatemethod.*; 

public abstract class CursoDecorator extends Curso {
    protected Curso aux;

    public CursoDecorator(Curso curso) {
        super(curso.getPrazoConclusaoDias(), curso.getValorDia()); 
        this.aux = curso;
    }

    @Override
    public double calcularValorTotal() {
        return aux.calcularValorTotal(); 
    }
    
}