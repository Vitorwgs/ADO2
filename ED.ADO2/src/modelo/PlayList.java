 package modelo;

/*
 *  Professor Gerson Risso
 */
public class PlayList {
  private int id;
  private static int valor=1;
  private String musica;
  private String autor;
  private String link;
  
  
  public PlayList(String musica, String autor, String link) {
        this.id = valor++;
        this.musica = musica;
        this.autor = autor;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getValor() {
        return valor;
    }

    public static void setValor(int valor) {
        PlayList.valor = valor;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
              
    }
    @Override
    public String toString() {
        return "PlayList{" + "id=" + id + ", musica=" + musica + ", autor=" + autor + ", link=" + link + '}';
    }

}