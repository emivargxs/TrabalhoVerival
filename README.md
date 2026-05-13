# Trabalho 1 - Teste de Mutação

Trabalho desenvolvido para a disciplina de **Verificação e Validação de Software** da PUCRS, com foco na utilização de **Teste de Mutação** utilizando Java, JUnit 5 e PIT Mutation Testing.

---

## 👨‍💻 Integrantes

- Natan De Aragão Müller
- Emile Vargas Bordin

---

# 📚 Sobre o Trabalho

O trabalho teve como objetivo explorar o conceito de **Teste de Mutação**, conforme solicitado no enunciado da disciplina.

A proposta consistiu na criação de uma apresentação em vídeo contendo:

- Explicação sobre o que é teste de mutação;
- Funcionamento do teste de mutação;
- Utilidade da técnica;
- Comparação com testes tradicionais;
- Demonstração prática utilizando Java e PIT Mutation Testing.

Além disso, foi desenvolvido um projeto exemplo contendo testes automatizados e execução real do teste de mutação.

---

# 🎥 Vídeo da Apresentação

Link do vídeo no YouTube:

👉 https://youtu.be/oK2A9SDpiYM

---

# 🛠️ Tecnologias Utilizadas

- Java
- JUnit 5
- Maven
- PIT Mutation Testing

---

# 📁 Estrutura do Projeto

```text
src/
 ├── main/java/
 │    └── Calculadora.java
 │
 ├── test/java/
 │    └── CalculadoraTest.java
 │
target/
 └── pit-reports/

pom.xml
```

---

# 🧮 Classe Principal

O projeto possui uma classe chamada `Calculadora.java`, responsável pelas operações matemáticas utilizadas nos testes automatizados.

Métodos implementados:

- adicionar
- subtrair
- multiplicar
- dividir
- sen
- cos

---

# 🧪 Testes Automatizados

Os testes foram desenvolvidos utilizando **JUnit 5**, validando:

- Entradas utilizadas;
- Resultados esperados;
- Funcionamento correto dos métodos.

Exemplo:

```java
@Test
void testeMultiplicar() {
    Calculadora calc = new Calculadora();

    assertEquals(6.0, calc.multiplicar(2, 3), EPSILON);
}
```

---

# ▶️ Execução dos Testes

## Executar testes tradicionais

```bash
mvn test
```

## Executar teste de mutação com PIT

```bash
mvn org.pitest:pitest-maven:mutationCoverage
```

---

# 📊 Relatório do PIT

Após a execução do PIT, é gerado automaticamente um relatório HTML contendo:

- Mutantes mortos;
- Mutantes sobreviventes;
- Cobertura dos testes;
- Qualidade dos testes automatizados.

Caminho do relatório:

```text
target/pit-reports/index.html
```

---

# 📖 Referências Utilizadas

- https://maven.apache.org/
- https://junit.org/junit5/
- https://docs.oracle.com/en/java/
- https://pitest.org/
- https://www.baeldung.com/java-mutation-testing-with-pitest
- https://www.geeksforgeeks.org/software-engineering/software-testing-mutation-testing/
