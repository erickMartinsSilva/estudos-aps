package cliente;

import  decorator.*;
import  templatemethod.*;    

public class Cliente {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE CURSOS ONLINE ===\n");

        // ================================
        // TESTE 1: Curso Gratuito (sem extras)
        // ================================
        System.out.println("=== TESTE 1: Curso Gratuito ===");

        Curso curso1 = new CursoGratuito(15);
        curso1.templateMethod();
        System.out.println("Valor total: R$ " + curso1.calcularValorTotal());
        System.out.println();


        // ================================
        // TESTE 2: Curso Premium + Mentoria + Material
        // ================================
        System.out.println("=== TESTE 2: Curso Premium com Mentoria e Material ===");

        Curso curso2 = new CursoPremium(30, 20);
        curso2 = new Mentoria(curso2);
        curso2 = new MaterialComplementar(curso2);

        curso2.templateMethod();
        System.out.println("Valor total: R$ " + curso2.calcularValorTotal());
        System.out.println();

        // ================================
        // TESTE 3: Curso Intensivo + TODOS recursos
        // ================================
        System.out.println("=== TESTE 3: Curso Intensivo completo ===");

        Curso curso3 = new CursoIntensivo(10, 30);
        curso3 = new Mentoria(curso3);
        curso3 = new MaterialComplementar(curso3);
        curso3 = new AulasGravadas(curso3);
        curso3 = new RelatorioDeDesempenho(curso3);

        curso3.templateMethod();
        System.out.println("Valor total: R$ " + curso3.calcularValorTotal());
        System.out.println();

        // ================================
        // TESTE 4: Curso Intensivo + poucos extras
        // ================================
        System.out.println("=== TESTE 4: Curso Intensivo com Aulas Gravas e Relatório de Desempenho ===");

        Curso curso4 = new CursoIntensivo(7, 25);
        curso4 = new AulasGravadas(curso4);
        curso4 = new RelatorioDeDesempenho(curso4);

        curso4.templateMethod();
        System.out.println("Valor total: R$ " + curso4.calcularValorTotal());
        System.out.println();

        // ================================
        // TESTE 5: Curso Premium sem extras
        // ================================
        System.out.println("=== TESTE 5: Curso Premium sem extras ===");

        Curso curso5 = new CursoPremium(20, 15);
        curso5.templateMethod();
        System.out.println("Valor total: R$ " + curso5.calcularValorTotal());
        System.out.println();

        // ================================
        // TESTE 6: Curso Gratuito + Material (mesmo sendo gratuito)
        // ================================
        System.out.println("=== TESTE 6: Curso Gratuito com Material Complementar ===");

        Curso curso6 = new CursoGratuito(10);
        curso6 = new MaterialComplementar(curso6);

        curso6.templateMethod();
        System.out.println("Valor total: R$ " + curso6.calcularValorTotal());
        System.out.println();

        // ================================
        // TESTE 7: Curso Premium + Aulas Gravadas + Relatorio de Desempenho
        // ================================
        System.out.println("=== TESTE 7: Curso Premium com Aulas Gravadas e Relatorio de Desempenho ===");

        Curso curso7 = new CursoPremium(25, 18);
        curso7 = new AulasGravadas(curso7);
        curso7 = new RelatorioDeDesempenho(curso7);

        curso7.templateMethod();
        System.out.println("Valor total: R$ " + curso7.calcularValorTotal());
        System.out.println();

        // ================================
        // TESTE 8: Curso Intensivo + Mentoria
        // ================================
        System.out.println("=== TESTE 8: Curso Intensivo com Mentoria ===");

        Curso curso8 = new CursoIntensivo(5, 40);
        curso8 = new Mentoria(curso8);

        curso8.templateMethod();
        System.out.println("Valor total: R$ " + curso8.calcularValorTotal());
        System.out.println();
    }
}