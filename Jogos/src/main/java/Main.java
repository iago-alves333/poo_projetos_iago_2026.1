public class Main {
    public static void main(String[] args) {
        GerenciadorDeJogos gerenciador = new GerenciadorDeJogos();

        Jogo jogo1 = new Jogo("The Witcher 3", 99.90, "RPG");
        Jogo jogo2 = new Jogo("Stardew Valley", 24.99, "Simulação");

        gerenciador.cadastrarJogo(jogo1);
        gerenciador.cadastrarJogo(jogo2);

        gerenciador.listarJogos();

        try {
            System.out.println("\nTentando remover o jogo 1...");
            gerenciador.removerJogo(jogo1.getId());

            System.out.println("\nTentando remover um ID falso...");
            gerenciador.removerJogo("ID-INVENTADO-123");

            System.out.println("Isso não vai aparecer!");

        } catch (JogoNaoEncontradoException e) {
            System.out.println( e.getMessage());
        }

        System.out.println("\nO programa continuou rodando normalmente após o erro!");
        gerenciador.listarJogos();
    }
}