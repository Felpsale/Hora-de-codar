
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ao Simulador de Animal de Estimação Virtual!");
        System.out.println("Digite o nome do seu animal:");

        String nomePet = entrada.nextLine();

        BichinhoVirtual pet = new BichinhoVirtual(nomePet);

        boolean continuar = true;

        while (continuar) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Alimentar " + pet.nome);
            System.out.println("2. Brincar com " + pet.nome);
            System.out.println("3. Verificar status");
            System.out.println("4. Descansar " + pet.nome);
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = entrada.nextInt();

            switch (escolha) {

                case 1:
                    pet.alimentar();
                    break;

                case 2:
                    pet.brincar();
                    break;

                case 3:
                    pet.verificarStatus();
                    break;

                case 4:
                    pet.descansar();
                    break;

                case 5:
                    System.out.println("Saindo do jogo. Até mais!");
                    continuar = false;
                    continue;

                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            pet.passarTempo();

            continuar = !pet.verificarFimDeJogo();
        }

        entrada.close();
    }
}
