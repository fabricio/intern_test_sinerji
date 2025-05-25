import java.time.LocalDate;

public abstract class Funcionario {
    protected String nome;
    protected LocalDate dataContratacao;

    public Funcionario(String nome, LocalDate dataContratacao) {
        this.nome = nome;
        this.dataContratacao = dataContratacao;
    }

    public abstract double calcularSalario(int mes, int ano);
    public abstract double calcularBeneficio(int mes, int ano);

    public double calcularTotalRecebido(int mes, int ano) {
        return calcularSalario(mes, ano) + calcularBeneficio(mes, ano);
    }

    public String getNome() {
      return nome;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
}
