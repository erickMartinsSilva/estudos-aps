package decorator;
import templatemethod.*; 

public class Mentoria extends CursoDecorator{
	protected double valor = 56;
	
    public Mentoria(Curso curso){
        super(curso);
        System.out.println("Mentoria individual incluída no pacote de estudos");
    }

    @Override
    public double calcularValorTotal(){
        return super.calcularValorTotal() + this.valor;
    }
}