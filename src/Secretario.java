public class Secretario extends Funcionario {
    public Secretario(String nome, java.time.LocalDate dataContratacao) {
        super(nome, dataContratacao);
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        int anosServico = ano - dataContratacao.getYear();
        return 7000 + (1000 * anosServico);
    }
    @Override
    public double calcularBeneficio(int mes, int ano) {
        return calcularSalario(mes, ano) * 0.2;
    }
}
