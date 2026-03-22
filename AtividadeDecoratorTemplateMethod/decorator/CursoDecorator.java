package decorator;
import templatemethod.*; 

public abstract class CursoDecorator extends Curso {

    protected Curso aux;

    public CursoDecorator(Curso curso) {
        super(curso.getPrazoConclusaoDias(), curso.getValorDia()); 
        this.aux = curso;
    }

    public void templateMethod() {
        aux.templateMethod(); 
    }

    public double calcularValorTotal() {
        return aux.calcularValorTotal(); 
    }
    
}