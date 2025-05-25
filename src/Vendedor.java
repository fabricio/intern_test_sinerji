import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Map;

public class Vendedor extends Funcionario {
    private Map<YearMonth, Double> vendas;

    public Vendedor(String nome, LocalDate dataContratacao, Map<YearMonth, Double> vendas) {
        super(nome, dataContratacao);
        this.vendas = vendas;
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        int anosServico = ano - dataContratacao.getYear();
        return 12000 + (1800 * anosServico);
    }

    @Override
    public double calcularBeneficio(int mes, int ano) {
        YearMonth anoMes = YearMonth.of(ano, mes);
        return vendas.getOrDefault(anoMes, 0.0) * 0.3;
    }

    public double getVendaDoMes(int mes, int ano) {
        return vendas.getOrDefault(YearMonth.of(ano, mes), 0.0);
    }
}
