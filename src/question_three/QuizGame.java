package question_three;

import java.util.Scanner;

public class QuizGame{

  private int right = 0;
  private int wrong = 0;
  private String name;


public void quizGame(){

  Scanner sc = new Scanner(System.in);

  
  String[][] questions = {
    {"Qual é a capital do Brasil?", "A) São Paulo", "B) Rio de Janeiro", "C) Brasília", "D) Salvador", "C"},
    {"Em que ano ocorreu a Proclamação da República no Brasil?", "A) 1822", "B) 1889", "C) 1900", "D) 1945", "B"},
    {"Qual é o rio mais extenso do Brasil?", "A) Amazonas", "B) São Francisco", "C) Tocantins", "D) Paraná", "A"},
    {"Em que ano foi fundada a cidade de São Paulo?", "A) 1554", "B) 1750", "C) 1800", "D) 1902", "A"},
    {"Qual é a maior ilha do Brasil?", "A) Fernando de Noronha", "B) Ilha do Bananal", "C) Ilhabela", "D) Marajó", "D"},
    {"Qual é a principal produção agrícola do Brasil?", "A) Soja", "B) Café", "C) Algodão", "D) Arroz", "A"},
    {"Qual é o estado brasileiro que possui a maior população?", "A) São Paulo", "B) Minas Gerais", "C) Rio de Janeiro", "D) Bahia", "A"},
    {"Qual é o monumento mais conhecido do Brasil?", "A) Cristo Redentor", "B) Torre Eiffel", "C) Coliseu", "D) Grande Muralha da China", "A"},
    {"Em que ano o Brasil sediou a Copa do Mundo de futebol pela primeira vez?", "A) 1950", "B) 1962", "C) 1970", "D) 1986", "A"},
    {"Qual é o principal porto do Brasil?", "A) Porto de Santos", "B) Porto de Paranaguá", "C) Porto de Salvador", "D) Porto de Recife", "A"},
    {"Qual é o principal cartão postal do Rio de Janeiro?", "A) Maracanã", "B) Pão de Açúcar", "C) Corcovado", "D) Copacabana", "C"}
};

System.out.println("Whats's your name ? :");
this.name = sc.next();

for (int i = 0; i < questions.length; i ++){
  String question = questions[i][0];
  String option1 = questions[i][1];
  String option2 = questions[i][2];
  String option3 = questions[i][3];
  String option4 = questions[i][4];
  String answerCorrect = questions[i][5];

  System.out.println("\nQuestão " + (i+1) + "#: " + question + "\n" + option1 + "\n" + option2 + "\n" + option3 + "\n" + option4 + "\n");
  System.out.println("Qual a opção correta?: ");
  String userAnswer = sc.next();
  while (!userAnswer.matches("[aA-dD]")) {
    System.out.println("OPÇÃO INVALIDA, DIGITE UMA DAS OPÇÕES MOSTRADAS: ");
    userAnswer = sc.next();
}

  if (userAnswer.equalsIgnoreCase(answerCorrect)) {
    System.out.println("CERTA RESPOSTA!!");
    this.right++;
    System.out.println(toString());
} else {
    System.out.println("NÃO FOI DESSA VEZ, A RESPOSTA CORRETA ERA: " + answerCorrect);
    this.wrong++;
    System.out.println(toString());
}
}

sc.close();

}

@Override
  public String toString() {
    return "\nUser " + this.name + "\nRight: " + this.right + "\nWrong: " + this.wrong;
  }

    /**
     * @return int return the right
     */
    public int getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(int right) {
        this.right = right;
    }

    /**
     * @return int return the wrong
     */
    public int getWrong() {
        return wrong;
    }

    /**
     * @param wrong the wrong to set
     */
    public void setWrong(int wrong) {
        this.wrong = wrong;
    }


    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}