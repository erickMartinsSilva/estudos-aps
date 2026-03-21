package Cliente;

import FactoryMethod.*;
import Strategy.*;

import java.util.*;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("====================================\n");
        System.out.println("   SIMULADOR DE BATALHA MEDIEVAL\n");
        System.out.println("====================================\n");

        // === Criando unidades usando o Factory Method ===
        Creator soldadoCreator = new SoldadoCreator(); 
        Creator arqueiroCreator = new ArqueiroCreator();
        Creator cavalariaCreator = new CavalariaCreator();

        Unidade soldado = soldadoCreator.criarUnidade();
        Unidade arqueiro = arqueiroCreator.criarUnidade();
        Unidade cavalaria = cavalariaCreator.criarUnidade();

        // === Definindo estratégias iniciais para as unidades ===
        System.out.println("\nDefinindo estratégias iniciais...\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Os soldados seguem a estratégia defensiva.");
        soldado.setStrategy(new DefensivaStrategy());
        System.out.println("Os arqueiros seguem a estratégia agressiva.");
        arqueiro.setStrategy(new AgressivaStrategy());
        System.out.println("A cavalaria está flanqueando os inimigos.");
        cavalaria.setStrategy(new FlanqueamentoStrategy());

        System.out.println("\n=== BATALHA INICIADA ===\n");

        System.out.print("Soldado - ");
        soldado.executeStrategy();
        System.out.print("Arqueiro - ");
        arqueiro.executeStrategy();
        System.out.print("Cavalaria - ");
        cavalaria.executeStrategy();

        // === Exemplo de mudança de estratégia em tempo de execução ===
        System.out.println("\nEVENTO: Reforços inimigos surgem no campo de batalha!");
        System.out.println("Os soldados estão sendo pressionados!");

        System.out.println("Comandante altere a estratégia de batalha para que possamos sair triunfosos!");
        System.out.println("\nModificando estratégias de combate...");

        System.out.println("Escolha a estratégia para os SOLDADOS:");
        System.out.println("1 - Agressiva");
        System.out.println("2 - Defensiva");
        System.out.println("3 - Flanqueamento");
        
        try {
            int escolhaSoldado = scanner.nextInt();
            
            switch (escolhaSoldado) {
                case 1:
                    soldado.setStrategy(new AgressivaStrategy());
                    break;
                case 2:
                    soldado.setStrategy(new DefensivaStrategy());
                    break;
                case 3:
                    soldado.setStrategy(new FlanqueamentoStrategy());
                    break;
                default:
                    System.out.println("Opção inválida. Estratégia defensiva aplicada.");
                    soldado.setStrategy(new DefensivaStrategy());
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Aplicando estratégia defensiva.");
            soldado.setStrategy(new DefensivaStrategy());
            scanner.nextLine();
        }

        System.out.println("\nEscolha a estratégia para os ARQUEIROS:");
        System.out.println("1 - Agressiva");
        System.out.println("2 - Defensiva");
        System.out.println("3 - Flanqueamento");
        
        try {
            int escolhaArqueiro = scanner.nextInt();
            switch (escolhaArqueiro) {
                case 1:
                    arqueiro.setStrategy(new AgressivaStrategy());
                    break;
                case 2:
                    arqueiro.setStrategy(new DefensivaStrategy());
                    break;
                case 3:
                    arqueiro.setStrategy(new FlanqueamentoStrategy());
                    break;
                default:
                    System.out.println("Opção inválida. Estratégia defensiva aplicada.");
                    arqueiro.setStrategy(new DefensivaStrategy());
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Aplicando estratégia defensiva.");
            arqueiro.setStrategy(new DefensivaStrategy());
            scanner.nextLine();
        }

        System.out.println("\nEscolha a estratégia para a CAVALARIA:");
        System.out.println("1 - Agressiva");
        System.out.println("2 - Defensiva");
        System.out.println("3 - Flanqueamento");
        
        try {
            int escolhaCavalaria = scanner.nextInt();
            switch (escolhaCavalaria) {
                case 1:
                    cavalaria.setStrategy(new AgressivaStrategy());
                    break;
                case 2:
                    cavalaria.setStrategy(new DefensivaStrategy());
                    break;
                case 3:
                    cavalaria.setStrategy(new FlanqueamentoStrategy());
                    break;
                default:
                    System.out.println("Opção inválida. Estratégia defensiva aplicada.");
                    cavalaria.setStrategy(new DefensivaStrategy());
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Aplicando estratégia defensiva.");
            cavalaria.setStrategy(new DefensivaStrategy());
            scanner.nextLine();
        }

        System.out.print("\nSoldado - ");
        soldado.executeStrategy();
        System.out.print("Arqueiro - ");
        arqueiro.executeStrategy();
        System.out.print("Cavalaria - ");
        cavalaria.executeStrategy();

        System.out.println("\nO contra-ataque força o inimigo a recuar!");
        System.out.println("Seu exército conquistou vantagem no campo de batalha e saiu triunfoso!");
        scanner.close();
    }
}
    