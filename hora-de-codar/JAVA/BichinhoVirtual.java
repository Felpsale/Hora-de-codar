
class BichinhoVirtual {
    String nome;
    int nivelDeFome = 50;
    int nivelFelicidade = 50;
    int nivelDeCansaco = 50;
    int idade = 0;

    public BichinhoVirtual(String nome) {
        this.nome = nome;
    }

    public void alimentar() {
        nivelDeFome -= 10;

        if (nivelDeFome < 0) {
            nivelDeFome = 0;
        }

        System.out.println(nome + " foi alimentado!");
    }

    public void brincar() {
        nivelFelicidade += 10;
        nivelDeCansaco += 5;

        if (nivelFelicidade > 100) {
            nivelFelicidade = 100;
        }

        if (nivelDeCansaco > 100) {
            nivelDeCansaco = 100;
        }

        System.out.println(nome + " brincou e ficou mais feliz!");
    }

    public void descansar() {
        nivelDeCansaco -= 30;

        if (nivelDeCansaco < 0) {
            nivelDeCansaco = 0;
        }

        System.out.println(nome + " descansou e recuperou energia!");
    }

    public void passarTempo() {
        nivelDeFome += 3;
        nivelFelicidade -= 3;
        nivelDeCansaco += 10;
        idade++;

        if (nivelDeFome > 100) {
            nivelDeFome = 100;
        }

        if (nivelFelicidade < 0) {
            nivelFelicidade = 0;
        }

        if (nivelDeCansaco > 100) {
            nivelDeCansaco = 100;
        }

        System.out.println(nome + " envelheceu! Agora tem " + idade + " anos.");
    }

    public void verificarStatus() {
        System.out.println("\n===== STATUS DO PET =====");
        System.out.println("Nome: " + nome);
        System.out.println("Fome: " + nivelDeFome);
        System.out.println("Felicidade: " + nivelFelicidade);
        System.out.println("Cansaço: " + nivelDeCansaco);
        System.out.println("Idade: " + idade);
        System.out.println("=========================");
    }

    public boolean verificarFimDeJogo() {
        if (nivelDeFome >= 100) {
            System.out.println("\n" + nome + " morreu de fome!");
            return true;
        }

        if (nivelDeCansaco >= 100) {
            System.out.println("\n" + nome + " ficou extremamente cansado!");
            return true;
        }

        if (nivelFelicidade <= 0) {
            System.out.println("\n" + nome + " ficou muito triste!");
            return true;
        }

        if (idade >= 50) {
            System.out.println("\nPARABÉNS! " + nome + " chegou aos 50 anos!");
            System.out.println("Você venceu o jogo!");
            return true;
        }

        return false;
    }
}
