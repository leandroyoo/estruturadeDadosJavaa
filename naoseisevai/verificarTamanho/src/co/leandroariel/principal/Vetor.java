package co.leandroariel.principal;


public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;

    }


    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    //função pra retornar o tamanho do vetor
    public int tamanho(){
        return this.tamanho;
    }

    //Função pra imprimir elementos do vetor




}