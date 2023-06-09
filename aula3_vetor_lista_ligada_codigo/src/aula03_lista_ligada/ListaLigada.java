package aula03_lista_ligada;

public class ListaLigada<TIPO> {
    private  Elemento <TIPO>primeiro;
    private  Elemento <TIPO> ultimo;
    private  int tamanho;

    public ListaLigada(){
        this.tamanho=0;
    }


    public Elemento<TIPO> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento<TIPO> primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento<TIPO> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento<TIPO> ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    public void adicionar(TIPO novoValor){
        Elemento novoElemento = new Elemento<TIPO>(novoValor);
        if( this.primeiro ==null && this.ultimo ==null){
            this.primeiro = novoElemento;
            this.ultimo   = novoElemento;

        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;

        }
        tamanho++;
    }

    //metodo remover
    public void remover(TIPO valorProcurado) {
        Elemento<TIPO> anterior = null;
        Elemento<TIPO> atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equals(valorProcurado)) {
                //zerar a lista
                if(this.tamanho ==1){
                    this.primeiro = null;
                    this.ultimo= null;
                }
                //verifica se é o primeiro
                if (atual == primeiro) {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                    //verifica se é o ultimo
                } else if (atual == ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                } else {//meio
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                    this.tamanho--;
                    break;
                }
                anterior = atual;
                atual = atual.getProximo();
            }
        }
    }

    public Elemento get(int posicao){
        Elemento atual = this.primeiro;
        for (int i=0; i< posicao; i++){
            if(atual.getProximo() != null){
               atual = atual.getProximo();
            }
        }
        return atual;
    }

    public InteratorListaLigada<TIPO>getInterator(){
        return new InteratorListaLigada<TIPO>(this.primeiro);
    }
}




