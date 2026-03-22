package decorator;
import templatemethod.*; 

public class RelatorioDeDesempenho extends CursoDecorator{

    public RelatorioDeDesempenho(Curso curso){
        super(curso);
    }

    public void templateMethod(){
        super.templateMethod(); //aq tava fiquei com medo de dar erro ai coloquei o super p nn quebrar o padrao do templateMethod
        System.out.println("Relatório de Desempenho personalizado incluído no pacote de estudos");
    }   

    public double calcularValorTotal(){
        return super.calcularValorTotal() + 12.99 ;
    }
}