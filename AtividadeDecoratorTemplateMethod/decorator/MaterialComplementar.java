package decorator;
import templatemethod.*; 

public class MaterialComplementar extends CursoDecorator{
	protected double valor = 25;
	
    public MaterialComplementar(Curso curso){
        super(curso);
        System.out.println("Material Complementar incluído no pacote de estudos");
    }

    @Override
    public double calcularValorTotal(){
        return super.calcularValorTotal() + this.valor;
    }
}