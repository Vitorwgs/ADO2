package lista;

/*
 *  Professor Gerson Risso
 */
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
    
    public void exibir(){
      No ref=atual;
      while(ref!=null){
          System.out.println(ref.getObjeto());
          ref=ref.getAnt();
      }
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
          //Pesquisa linear
          No ref = inicio;
          PlayList playlist;
          while (ref != null) {
              playlist = (PlayList) ref.getObjeto();//cast
              if (id == playlist.getId()) {
                  break;
              }
              ref = ref.getProx();
          }
          //verifica se achou
          if (ref != null) {
              //caso 1 - remover o primeiro nó
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
    }  

