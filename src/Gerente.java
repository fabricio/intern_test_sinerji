public class Gerente extends Funcionario {
    public Gerente(String nome, java.time.LocalDate dataContratacao) {
        super(nome, dataContratacao);
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        int anosServico = ano - dataContratacao.getYear();
        return 20000 + (3000 * anosServico);
    }
    @Override
    public double calcularBeneficio(int mes, int ano) {
        return 0;
    }
}
