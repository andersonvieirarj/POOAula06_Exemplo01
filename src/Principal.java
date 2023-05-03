import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoa = new ArrayList<>();
        pessoa.add(new Pessoa("Eduardo", LocalDate.of(1955,2,28)));
        pessoa.add(new Pessoa("Janaína",LocalDate.of(2009, 1, 25)));
        pessoa.add(new Pessoa("Ivan",LocalDate.of(1980, 7, 1)));
        pessoa.add(new Pessoa("Fernando",LocalDate.of(2023, 8, 10)));
        pessoa.add(new Pessoa("David",LocalDate.of(1996, 11, 13)));
        System.out.println("Pessoas nascidas em ano bissexto");;

        for (Pessoa pessoasBissexto : pessoa) {
            if (pessoasBissexto.getDataNascimento().isLeapYear()){
                System.out.println(pessoasBissexto.getNome() + " " + pessoasBissexto.getDataNascimento());;
            }

        }
    }
}
