package cliente;

import javax.swing.JOptionPane;
import lista.Lista;
import modelo.PlayList;

/*
*  Professor Gerson Risso
 */
public class UsarLista {

    public static void main(String[] args) {
        Lista lista = new Lista();
        boolean continuar = true;

        while (continuar) {
            String menu = "Escolha uma opção:\n"
                        + "1. Inserir Música\n"
                        + "2. Remover Música por ID\n"
                        + "3. Pesquisar Música por ID\n"
                        + "4. Exibir Playlist\n"
                        + "5. Atualizar Música por ID\n"
                        + "6. Sair";
            
            String opcaoStr = JOptionPane.showInputDialog(menu);
            int opcao = Integer.parseInt(opcaoStr);

            switch (opcao) {
                case 1: // Inserir
                    String musica = JOptionPane.showInputDialog("Nome da Música:");
                    String autor = JOptionPane.showInputDialog("Nome do Autor:");
                    String link = JOptionPane.showInputDialog("Link:");
                    lista.inserir(new PlayList(musica, autor, link));
                    JOptionPane.showMessageDialog(null, "Música adicionada com sucesso!");
                    break;

                case 2: // Remover
                    String indiceRemover = JOptionPane.showInputDialog("Digite o ID da música que deseja remover:");
                    int idRemover = Integer.parseInt(indiceRemover);
                    boolean removido = lista.remover(idRemover);
                    String mensagemRemover = removido ? "Música removida com sucesso!" : "ID inválido!";
                    JOptionPane.showMessageDialog(null, mensagemRemover);
                    break;

                case 3: // Pesquisar
                    String indicePesquisa = JOptionPane.showInputDialog("Digite o ID da música que deseja pesquisar:");
                    int idPesquisar = Integer.parseInt(indicePesquisa);
                    String resultadoPesquisa = (String) lista.pesquisar(idPesquisar); // Supondo que o método retorna uma String
                    JOptionPane.showMessageDialog(null, resultadoPesquisa, "Resultado da Pesquisa", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 4: // Exibir
                    lista.exibir(); 
                    break;

                case 5: // Atualizar
                    String indiceAtualizar = JOptionPane.showInputDialog("Digite o ID da música que deseja atualizar:");
                    int idAtualizar = Integer.parseInt(indiceAtualizar);
                    String novaMusica = JOptionPane.showInputDialog("Novo Nome da Música:");
                    String novoAutor = JOptionPane.showInputDialog("Novo Nome do Autor:");
                    String novoLink = JOptionPane.showInputDialog("Novo Link:");
                    boolean atualizado = lista.atualizar(idAtualizar, new PlayList(novaMusica, novoAutor, novoLink));
                    String mensagemAtualizar = atualizado ? "Música atualizada com sucesso!" : "ID inválido!";
                    JOptionPane.showMessageDialog(null, mensagemAtualizar);
                    break;

                case 6: // Sair
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saindo do programa. Até logo!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        }
    }
}


