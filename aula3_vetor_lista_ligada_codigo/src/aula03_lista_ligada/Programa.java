package aula03_lista_ligada;

public class Programa {
    public static void main(String[] args) {

        ListaLigada<String> lista = new ListaLigada<String>();
        lista.adicionar("RJ");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
      /*  System.out.println("primeiro "+ lista.getPrimeiro().getValor());
        System.out.println("ultimo "+ lista.getUltimo().getValor());
        System.out.println("tamanho "+ lista.getTamanho());
        System.out.println(lista.get(0).getValor());
        System.out.println(lista.get(1).getValor());
        System.out.println(lista.get(2).getValor());
        System.out.println(lista.get(3).getValor());
*/
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        System.out.println("APOS REMOVER");
        ///remover estado CE
        lista.remover("CE");
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
    }

}
