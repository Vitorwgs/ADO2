package lista;

public class No {

    private No prox;
    private No ant;
    private Object objeto;

    public No(No prox, No ant, Object objeto) {
        this.prox = prox;
        this.ant = ant;
        this.objeto = objeto;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

}
