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
        
        String musica=JOptionPane.showInputDialog("Nome da Musica");
        String autor=JOptionPane.showInputDialog("Nome do Autor");
        String link=JOptionPane.showInputDialog("link");
        lista.inserir(new PlayList (musica, autor, link));
        lista.exibir();
        
        String mensagem = "Música: " + musica + "\nAutor: " + autor + "\nLink: " + link;
        JOptionPane.showMessageDialog(null, mensagem, "Música Adicionada", JOptionPane.INFORMATION_MESSAGE);
        
        lista.pesquisar(3);
        
        System.out.println("=== Removendo ===");
        if(lista.remover(5)){
            System.out.println("Removido com sucesso!");
        }else{
            System.out.println("ID  não encontrado!");
        }
        
         
    }

}