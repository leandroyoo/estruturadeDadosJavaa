package aula03_lista_ligada;

public class InteratorListaLigada<TIPO> {
    private  Elemento<TIPO> elemento;
public InteratorListaLigada(Elemento<TIPO>atual){
    this.elemento = atual;
}
    public boolean temProximo(){
        if(elemento.getProximo() == null){
            return false;
        }else{
            return true;
        }
    }

    public Elemento<TIPO> getProximo(){
        elemento =  elemento.getProximo();
        return  elemento;
    }

}
