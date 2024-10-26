package lista;

/*
 *  Professor Gerson Risso
 */
import javax.swing.JOptionPane;
import modelo.PlayList;

public class Lista {

    private No inicio, aux, atual;

    private boolean listaVazia() {
        return inicio == null;
    }

    public void inserir(Object objeto) {
        if (listaVazia()) {
            inicio = new No(null, null, objeto);
            aux = inicio;
        } else {
            atual = new No(null, aux, objeto);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void exibir() {
        No ref = atual;
        StringBuilder sb = new StringBuilder();
        while (ref != null) {
            sb.append(ref.getObjeto().toString()).append("\n");
            ref = ref.getAnt();
        }
        if (sb.length() == 0) {
            sb.append("A lista está vazia.");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Playlist", JOptionPane.INFORMATION_MESSAGE);
    }

    public Object pesquisar(int id) {
        No ref = inicio;
        PlayList playlist;
        while (ref != null) {
            playlist = (PlayList) ref.getObjeto();//Casting
            if (id == playlist.getId()) {
                return playlist;
            }
            ref = ref.getProx();
        }
        return null;
    }

    public boolean remover(int id) {
        No ref = inicio;
        PlayList playlist;
        while (ref != null) {
            playlist = (PlayList) ref.getObjeto();
            if (id == playlist.getId()) {
                break;
            }
            ref = ref.getProx();
        }
        if (ref != null) {
            if (ref == inicio) {
                inicio = ref.getProx();
                ref.setProx(null);
                inicio.setAnt(null);
            } else if (ref == atual) {
                atual = ref.getAnt();
                aux = atual;
                ref.setAnt(null);
                atual.setProx(null);
            } else {
                ref.getAnt().setProx(ref.getProx());
                ref.getProx().setAnt(ref.getAnt());
            }
            return true;
        }
        return false;
    }

    public boolean atualizar(int id, PlayList novaMusica) {
        No ref = inicio;
        PlayList playlist;
        while (ref != null) {
            playlist = (PlayList) ref.getObjeto();
            if (id == playlist.getId()) {
                playlist.setMusica(novaMusica.getMusica());
                playlist.setAutor(novaMusica.getAutor());
                playlist.setLink(novaMusica.getLink());
                return true;
            }
            ref = ref.getProx();
        }
        return false;
    }

}
