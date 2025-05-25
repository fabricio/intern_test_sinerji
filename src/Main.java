import java.time.LocalDate;
import java.time.YearMonth;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Map<YearMonth, Double> vendasAna = new HashMap<>();
        Map<YearMonth, Double> vendasJoao = new HashMap<>();

        vendasAna.put(YearMonth.of(2021, 12), 5200.0);
        vendasAna.put(YearMonth.of(2022, 1), 4000.0);
        vendasAna.put(YearMonth.of(2022, 2), 4200.0);
        vendasAna.put(YearMonth.of(2022, 3), 5850.0);
        vendasAna.put(YearMonth.of(2022, 4), 7000.0);

        vendasJoao.put(YearMonth.of(2021, 12), 3400.0);
        vendasJoao.put(YearMonth.of(2022, 1), 7700.0);
        vendasJoao.put(YearMonth.of(2022, 2), 5000.0);
        vendasJoao.put(YearMonth.of(2022, 3), 5900.0);
        vendasJoao.put(YearMonth.of(2022, 4), 6500.0);

        funcionarios.add(new Secretario("Jorge Carvalho", LocalDate.of(2018, 1, 1)));
        funcionarios.add(new Secretario("Maria Souza", LocalDate.of(2015, 12, 1)));
        Vendedor ana = new Vendedor("Ana Silva", LocalDate.of(2021, 12, 1), vendasAna);
        Vendedor joao = new Vendedor("João Mendes", LocalDate.of(2021, 12, 1), vendasJoao);
        funcionarios.add(ana);
        funcionarios.add(joao);
        funcionarios.add(new Gerente("Juliana Alves", LocalDate.of(2017, 7, 1)));
        funcionarios.add(new Gerente("Bento Albino", LocalDate.of(2014, 3, 1)));

        int mes = 4;
        int ano = 2022;

        System.out.println("Total pago no mês: R$ " + FolhaPagamento.totalPago(funcionarios, mes, ano));
        System.out.println("Total de salários no mês: R$ " + FolhaPagamento.totalSalarios(funcionarios, mes, ano));

        List<Funcionario> comBeneficios = Arrays.asList(
            new Secretario("Jorge Carvalho", LocalDate.of(2018, 1, 1)),
            new Secretario("Maria Souza", LocalDate.of(2015, 12, 1)),
            ana, joao
        );

        System.out.println("Total de benefícios no mês: R$ " + FolhaPagamento.totalBeneficios(comBeneficios, mes, ano));
        System.out.println("Maior remuneração no mês: " + FolhaPagamento.maiorRemuneracao(funcionarios, mes, ano).getNome());
        System.out.println("Maior benefício no mês: " + FolhaPagamento.maiorBeneficio(comBeneficios, mes, ano).getNome());

        List<Vendedor> vendedores = Arrays.asList(ana, joao);
        System.out.println("Quem mais vendeu no mês: " + FolhaPagamento.maiorVendedor(vendedores, mes, ano).getNome());
    }
}
