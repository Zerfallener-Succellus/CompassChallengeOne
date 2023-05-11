# Desafio 1 da compass UOL

Esse é o repositorio utilizado para eu fazer o primeiro desafio da compass que consiste em 5 questões sendo 3 sobre java e duas sobre banco de dados.

## Estrutura das pastas

O projeto utiliza a seguinte pasta:

- `src`: a pasta que contém os exercicios

dentro da `src` estão as seguintes pastas contendo as questões:

- `question_one`: a pasta que contém o projeto proposto pela q1 em java
- `question_two`: a pasta que contém o projeto proposto pela q2 em java
- `question_three`: a pasta que contém o projeto proposto pela q3 em java
- `question_four`: a pasta que contém o projeto proposto pela q4 em forma de script PostgreSQL
- `question_five`: a pasta que contém o projeto proposto pela q5 em forma de script MongoDB

> O código foi feito pelo VScode e *NÃO CONTEM NENHUMA DEPENDÊNCIA ADICIONAL*

# Lógica aplicada nas questões

## Questão 1

Primeiro o Programa recebe o número de empregados que deve cadastrar e armazenar o nome e salário de cada um, ele deve validar quando dar um aumento ou desconto no salario do funcionario	: 

- se salario <= 1000 {salario += 20%}
- se salario > 1000 e < 2000 {salario += 10%} 
- se salario >= 2000 {salario -= 10%} /rn

no final exibir todos os funcionários nesse formato:

- Employer: ABCD

- Salary: R$ 1.200,00

- Bonus: R$ 120,00

- Liquid salary: R$ 1.320,00


O tratamento de exceções deve levar em conta caracteres inválidos como por exemplo informar um salário negativo ou utilizar um ! para o nome.

## Questão 2

O programa deve receber uma entrada String, e percorrer essa String, ao identificar as sequências de caracteres :-) e :-( deve classificar da seguinte forma: 

- neutral: se o número de “:-)” for igual o de “:-(“
- fun: se o número de “:-)” for maior que o de “:-(“
- upset: se o número de “:-(” for maior que o de “:-)”

após isso imprimir a classificação 

## Questão 3

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

Meanwhile, the compiled output files will be generated in the `bin` folder by default.