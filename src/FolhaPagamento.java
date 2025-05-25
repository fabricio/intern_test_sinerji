import java.util.Comparator;
import java.util.List;

public class FolhaPagamento {

    public static double totalPago(List<Funcionario> funcionarios, int mes, int ano) {
        return funcionarios.stream()
            .mapToDouble(f -> f.calcularTotalRecebido(mes, ano))
            .sum();
    }

    public static double totalSalarios(List<Funcionario> funcionarios, int mes, int ano) {
        return funcionarios.stream()
            .mapToDouble(f -> f.calcularSalario(mes, ano))
            .sum();
    }

    public static double totalBeneficios(List<Funcionario> funcionarios, int mes, int ano) {
        return funcionarios.stream()
            .mapToDouble(f -> f.calcularBeneficio(mes, ano))
            .sum();
    }

    public static Funcionario maiorRemuneracao(List<Funcionario> funcionarios, int mes, int ano) {
        return funcionarios.stream()
            .max(Comparator.comparingDouble(f -> f.calcularTotalRecebido(mes, ano)))
            .orElse(null);
    }

    public static Funcionario maiorBeneficio(List<Funcionario> funcionarios, int mes, int ano) {
        return funcionarios.stream()
            .max(Comparator.comparingDouble(f -> f.calcularBeneficio(mes, ano)))
            .orElse(null);
    }

    public static Vendedor maiorVendedor(List<Vendedor> vendedores, int mes, int ano) {
        return vendedores.stream()
            .max(Comparator.comparingDouble(v -> v.getVendaDoMes(mes, ano)))
            .orElse(null);
    }
}
