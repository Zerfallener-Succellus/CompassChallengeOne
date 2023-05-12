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

O programa recebe como entrada o número de empregados que devem ser cadastrados e armazena o nome e salário de cada um. O programa também valida quando deve ser aplicado um aumento ou desconto no salário do funcionário. Para isso, são seguidas as seguintes regras:

- Se o salário for menor ou igual a 1000, é aplicado um aumento de 20%.
- Se o salário for maior que 1000 e menor que 2000, é aplicado um aumento de 10%.
- Se o salário for maior ou igual a 2000, é aplicado um desconto de 10%.

Ao final do programa, são exibidos todos os funcionários com as seguintes informações:

- Employer: ABCD
- Salary: R$ 1.200,00
- Bonus: R$ 120,00
- Liquid salary: R$ 1.320,00

O tratamento de exceções é feito para caracteres inválidos, como um salário negativo ou um "!" no nome.

A classe Employer em Java implementa a lógica descrita acima. Ela possui vários campos para representar os dados de um empregador, como nome, salário e bônus ou desconto. A classe também possui vários métodos, incluindo um construtor que inicializa os dados do empregador, métodos getters e setters para os campos de dados do empregador e métodos para calcular o bônus ou desconto do empregador, salário líquido e determinar se o bônus ou desconto do empregador é um bônus ou um desconto.

O método setLiquidSalary calcula o salário líquido com base no salário do empregador e aplica porcentagens de bônus ou desconto com base em regras específicas. Se o salário do empregador for menor ou igual a 1000, o bônus é de 20% do seu salário. Se o salário estiver entre 1000 e 2000, o bônus é de 10% do seu salário. Se o salário for maior ou igual a 2000, o desconto é de 10% do seu salário.

O método setBonusAndDiscount calcula o bônus ou desconto do empregador com base nas mesmas regras usadas no método setLiquidSalary.

O método setTextIsBonusOrDiscount determina se o bônus ou desconto do empregador é um bônus ou um desconto com base nas mesmas regras usadas no método setLiquidSalary.

O método getSalaryFormated retorna o salário do empregador formatado como uma string, enquanto o método getLiquidSalaryFormated retorna o salário líquido do empregador formatado como uma string. O salário e o salário líquido são formatados de acordo com um formato decimal que arredonda os valores para duas casas decimais e usa vírgulas para separar os milhares.

## Questão 2

O programa deve receber uma entrada String e percorrer esta String para identificar as sequências de caracteres ":-)" e ":-(". Em seguida, deve classificar as sequências de acordo com as seguintes regras:

- "neutral": se o número de ":-)" for igual ao número de ":-("
- "fun": se o número de ":-)" for maior do que o número de ":-("
- "upset": se o número de ":-(" for maior do que o número de ":-)"

Após isso, o programa deve imprimir a classificação obtida.

O programa começa com a criação de uma classe chamada StringReceiver. O objetivo desta classe é receber uma mensagem digitada pelo usuário e determinar se a mensagem é mais "divertida" ou mais "triste" com base na contagem dos emoticons ":-)" e ":-(". O resultado final é armazenado em uma variável chamada "exit", que é retornada no final da execução do programa.

O código começa com a definição da variável "exit", que será usada para armazenar o resultado final. Em seguida, é definido o método "stringReceiver()", que é responsável por solicitar uma mensagem ao usuário e fazer a validação da entrada, garantindo que a mensagem digitada não esteja vazia.

Depois disso, é criado um objeto Scanner para ler a entrada do usuário. A mensagem é armazenada em uma variável "m" e é verificado se ela está vazia usando um laço "while". Se a mensagem estiver vazia, o usuário é solicitado a inserir uma mensagem válida.

Em seguida, é criado um objeto Pattern que procura pelos emoticons ":-)" e ":-(" usando uma expressão regular. Um objeto Matcher é criado a partir deste padrão e a mensagem do usuário é usada como entrada para este objeto. O método "matcher.find()" é usado para procurar pelos emoticons na mensagem e incrementar as variáveis "funEmote" e "upsetEmote" de acordo com os resultados encontrados.

Finalmente, é determinado se a mensagem é mais "divertida", "triste" ou "neutra" usando uma sequência de instruções "if". A variável "exit" é definida com base nessa determinação e o método "toString()" é usado para imprimir o resultado final na tela.

## Questão 3

O programa implementa um jogo de perguntas e respostas em que o usuário é solicitado a responder 11 perguntas de múltipla escolha. O programa exibe cada pergunta com quatro opções de resposta e solicita que o usuário selecione a opção correta. Se a resposta estiver correta, o programa informa o usuário e adiciona um ponto ao total de respostas corretas. Se não, o programa informa a resposta correta e adiciona um ponto ao total de respostas incorretas.

O programa usa uma matriz de strings para armazenar as perguntas, as letras e a resposta correta. Ele usa um loop for para iterar por todas as perguntas na matriz e exibe cada pergunta e suas opções de resposta ao usuário. O programa então espera pela entrada do usuário e valida se a entrada está dentro do intervalo de opções válidas. Se a entrada do usuário estiver correta, o programa verifica se a resposta do usuário corresponde à resposta correta e adiciona pontos apropriados ao total de respostas corretas ou incorretas, a classe QuizGame implementa o método toString para printar as infos do jogo após cada pergunta.

## Questão 4
The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

Meanwhile, the compiled output files will be generated in the `bin` folder by default.