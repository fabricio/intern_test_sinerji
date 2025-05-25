# Teste Prático – Java: Orientação a Objetos

Este projeto consiste em um sistema de cálculo de salários e benefícios para funcionários de uma empresa, utilizando os princípios da programação orientada a objetos em Java.

## 📋 Descrição

A empresa possui três tipos de cargos:

- **Secretário**: Salário fixo + adicional por ano de serviço + benefício de 20% sobre o salário.
- **Vendedor**: Salário fixo + adicional por ano de serviço + 30% sobre o valor vendido no mês.
- **Gerente**: Salário fixo + adicional por ano de serviço. **Não recebe benefícios**.

Com base nesses dados, o sistema realiza cálculos relacionados a salários, benefícios e vendas mensais.

## 🧱 Estrutura de Classes

- `Funcionario` (classe abstrata)
  - `Secretario`
  - `Vendedor`
  - `Gerente`
- `FolhaPagamento` (classe utilitária para os cálculos)

## 🔍 Funcionalidades

A classe `FolhaPagamento` implementa os seguintes métodos:

- `totalPago(...)`: retorna o total de salários + benefícios pagos no mês.
- `totalSalarios(...)`: retorna apenas o total em salários no mês.
- `totalBeneficios(...)`: retorna o total pago em benefícios no mês.
- `maiorRemuneracao(...)`: retorna o funcionário com maior remuneração total (salário + benefício).
- `maiorBeneficio(...)`: retorna o funcionário que recebeu o maior valor em benefícios.
- `maisVendeu(...)`: retorna o vendedor com o maior valor de vendas no mês.

## 🛠️ Requisitos

- Java 8 ou superior
- IDE ou terminal com suporte à compilação Java

## ▶️ Como Executar

1. Compile os arquivos Java:

```bash
javac *.java
```

2. Execute a classe `Main` com exemplos.

```bash
java Main
```

## 📄 Licença

Este projeto é apenas para fins educacionais e testes.