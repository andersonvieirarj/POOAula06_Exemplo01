import java.util.ArrayList;
import java.util.LinkedList;

// Java Collections Frameworks
/* É um conjunto bem definido de interfaces e classes
para representar e tratar grupos de dados como uma única
"unidade".
 JCF -> Interfaces -> tipos abstratos que representam as classes
 JCF -> Implementações -> são as implementações concretas
 JCF -> Algoritmos  -> são os métodos que realizam as operações
    sobre os objetos.
 COLLECTIONS -> Interface principal da hierarquia
    * Set: Esta interface define uma coleção que não
    permite elementos duplicados.
    * List: Aqui a interface define uma coleção ordenada,
    podendo conter elementos duplicados.
        --> ArrayList: É um array cujo tamanho pode ir crescendo
        a medida que você necessitar, ele permite uma buscar rápida
        dentro de sua lista, PORÉM, as inclusões e exclusões são
        lineares.
        --> LinkedList: É um array cuja lista está "ligada", ou seja,
        cada "nó" contém o dado e uma referência para o próximo
        "nó". A busca aqui é mais lenta, PORÉM é mais rápido para
        incluir ou excluir elementos.
   */
public class Main {
    public static void main(String[] args) {

        /*LinkedList<String> meusNomes = new LinkedList<>();
        meusNomes.add("Eduardo");
        meusNomes.add("Ivan");
        meusNomes.add("Flávia");
        meusNomes.add("Adalberto");
        meusNomes.add("Fernando");

        System.out.println(meusNomes.get(2));
        meusNomes.add(1, "Henrique");
        System.out.println(meusNomes.get(2));
        */
        ArrayList<String> meusNomes2 = new ArrayList<>();
        meusNomes2.add("Everton");
        meusNomes2.add("Thais");
        meusNomes2.add("Janaína");
        meusNomes2.add("David");
        meusNomes2.add("Deborah");
        System.out.println(meusNomes2.get(2));

        meusNomes2.add(1, "Luan");
        System.out.println(meusNomes2.get(2));



    }
}