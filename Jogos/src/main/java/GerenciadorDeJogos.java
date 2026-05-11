import java.util.ArrayList;
import java.util.List;

class GerenciadorDeJogos {
    private List<Jogo> listaDeJogos;

    public GerenciadorDeJogos() {
        this.listaDeJogos = new ArrayList<>();
    }

    public void cadastrarJogo(Jogo jogo) {
        listaDeJogos.add(jogo);
        System.out.println("Jogo '" + jogo.getNome() + "' cadastrado com sucesso!");
    }

    public void removerJogo(String id) throws JogoNaoEncontradoException {
        for (Jogo jogo : listaDeJogos) {
            if (jogo.getId().equals(id)) {
                listaDeJogos.remove(jogo);
                System.out.println("Jogo '" + jogo.getNome() + "' removido com sucesso!");
                return;
            }
        }

        throw new JogoNaoEncontradoException("Erro: Não foi possível remover. Nenhum jogo encontrado com o ID '" + id + "'.");
    }

    public void listarJogos() {
        if (listaDeJogos.isEmpty()) {
            System.out.println("Nenhum jogo cadastrado.");
        } else {
            System.out.println("\n--- Lista de Jogos ---");
            for (Jogo jogo : listaDeJogos) {
                System.out.println(jogo.toString());
            }
            System.out.println("----------------------");
        }
    }
}