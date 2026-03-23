package decorator;
import templatemethod.*; 

public class AulasGravadas extends CursoDecorator{
	protected double valor = 249.99;
	
    public AulasGravadas(Curso curso){
        super(curso);
        System.out.println("Aulas ao vivo gravadas incluída no pacote de estudos");
    }

    @Override
    public double calcularValorTotal(){
        return super.calcularValorTotal() + this.valor;
    }
}