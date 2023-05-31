package question_two;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReciver {

  private String exit;

  public void stringReciver() {
    try {
      boolean isRunning = true;

      while (isRunning) {

        System.out.println("Do you want to enter a text to count the emoticons ?");
        System.out.println("1. YES (CONTINUE)");
        System.out.println("2. NO (CLOSE)");
        Scanner sc = new Scanner(System.in);
        System.out.println(">>> ");
        int m = sc.nextInt();

        switch (m) {
          case 1 ->
            stringFormatter(stringReceive());

          case 2 -> {
            System.out.println("CLOSING PROGRAM");
            isRunning = false;
          }
        }


      }
    } catch (InputMismatchException e) {
      System.out.println("Invalid Input");
      System.out.println("Restarting...");
      stringReciver();
    }
  }

    public String stringReceive () {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your message: ");
      String m = sc.nextLine();
      while (m.isEmpty()) {
        System.out.println("Please enter a valid message: ");
        m = sc.nextLine();
      }
      return m;
    }

    public void stringFormatter (String texto){


      Pattern emotes = Pattern.compile(":-\\)|:-\\(");
      Matcher matcher = emotes.matcher(texto);

      int funEmote = 0;
      int upsetEmote = 0;

      while (matcher.find()) {
        if (matcher.group().equals(":-)")) {
          funEmote++;
        } else if (matcher.group().equals(":-(")) {
          upsetEmote++;
        }
      }

      if (funEmote == upsetEmote) {
        this.exit = "Neutral";
      } else if (funEmote > upsetEmote) {
        this.exit = "Fun";
      } else if (funEmote < upsetEmote) {
        this.exit = "Upset";
      }

      System.out.println(toString());
    }




  @Override
  public String toString() {
    return this.exit;
  }

  public String getExit() {
    return exit;
  }

  public void setExit(String exit) {
    this.exit = exit;
  }

}
