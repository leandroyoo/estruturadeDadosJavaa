package teste;

import co.leandroariel.principal.Vetor;

public class aula4 {

    public static void main(String[]args){
        Vetor vetor = new Vetor(10);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");


        System.out.println(vetor.tamanho());
    }

}
