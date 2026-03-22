package decorator;
import templatemethod.*; 

public class AulasGravadas extends CursoDecorator{

    public AulasGravadas(Curso curso){
        super(curso);
    }

    public void templateMethod(){
        super.templateMethod(); //aq tava fiquei com medo de dar erro ai coloquei o super p nn quebrar o padrao do templateMethod
        System.out.println("Aulas ao vivo gravadas incluída no pacote de estudos");
    }   

    public double calcularValorTotal(){
        return super.calcularValorTotal() + 249.99;
    }
}