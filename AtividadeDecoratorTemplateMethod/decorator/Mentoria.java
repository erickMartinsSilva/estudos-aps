package decorator;
import templatemethod.*; 

public class Mentoria extends CursoDecorator{

    public Mentoria(Curso curso){
        super(curso);
    }

    public void templateMethod(){
        super.templateMethod(); //aq tava fiquei com medo de dar erro ai coloquei o super p nn quebrar o padrao do templateMethod
        System.out.println("Mentoria individual incluída no pacote de estudos");
    }   

    public double calcularValorTotal(){
        return super.calcularValorTotal() + 56;
    }
}