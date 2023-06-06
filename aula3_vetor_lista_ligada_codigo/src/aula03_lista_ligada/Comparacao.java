package aula03_lista_ligada;

import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {

        ListaLigada<Integer> lista = new ListaLigada<>();

        ArrayList<Integer> vetor = new ArrayList<>();

        //Adicionar elementos no vetor
        int limite = 10000;
        long tempoinicial = System.currentTimeMillis();
        long tempofinal;

        //add vetor
        for(int i=0; i< limite; i++){
            vetor.add(i);
        }
        tempofinal = System.currentTimeMillis();
        System.out.println("Adicionou: " + limite + " elementos no vetor");
        System.out.println(tempofinal-tempoinicial);

        //adiocnar elementos na lista
        for(int i=0; i< limite; i++){
            lista.adicionar(i);
        }

        System.out.println("Adicionou: " + limite + " elementos no lista");
        System.out.println(tempofinal-tempoinicial);

        ///ler vetores
        for (int i=0; i < vetor.size(); i++){
            vetor.get(i);

        }
        tempofinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor");
        System.out.println(tempofinal - tempoinicial);



        tempoinicial = System.currentTimeMillis();
        InteratorListaLigada<Integer> interator = lista.getInterator();
        while (interator.temProximo()){
            interator.getProximo();
        }
        for(int i = 0; i <lista.getTamanho(); i++){
         lista.get(i);
        }
        tempofinal = System.currentTimeMillis();
        System.out.println("Tempo de leitura do lista");
        System.out.println(tempofinal - tempoinicial);

    }



}
