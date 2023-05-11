package question_two;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReciver {

  // Created the variable that will show the output of the result in accordance
  // with the message that the user types
  private String exit;

  public void stringReciver() {

    // Start the scanner and ask the user for a message
    // after that I validate the input to not be an empty string
    // being empty it asks again to type until it has content
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your mensage: ");
    String m = sc.nextLine();
    while (m.isEmpty()) {
      System.out.println("Please enter a valid message: ");
      m = sc.nextLine();
    }
    sc.close();
    // create a pattern object that takes the :-) and :-(
    // also creates a Matcher from the pattern and takes the string that the user
    // enters as input
    // the matcher function is used to look for where the given objects appear
    Pattern emotes = Pattern.compile(":-\\)|:-\\(");
    Matcher matcher = emotes.matcher(m);

    // setto ints to represent the amount of each of the emotes
    // starting with 0
    // no while it activates the search for characters and if inside the string as
    // it is traversed each time the patterns are identified
    // it adds +1 to fun emote for each :-) and +1 to upset emote for each :-(
    int funEmote = 0;
    int upsetEmote = 0;

    while (matcher.find()) {
      if (matcher.group().equals(":-)")) {
        funEmote++;
      } else if (matcher.group().equals(":-(")) {
        upsetEmote++;
      }
    }

    // a sequence of ifs to define if the variable exit will be according to this:
    // neutral: if the number of “:-)” is equal to “:-(“
    // fun: if the number of “:-)” is greater than that of “:-(“
    // upset: if the number of “:-(” is greater than that of “:-)”

    if (funEmote == upsetEmote) {
      this.exit = "Neutral";
    } else if (funEmote > upsetEmote) {
      this.exit = "Fun";
    } else if (funEmote < upsetEmote) {
      this.exit = "Upset";
    }

    // prints the tostring that prints the result stored in the exit
    System.out.println(toString());

  }

  @Override
  public String toString() {
    return this.exit;
  }

  /**
   * @return String return the exit
   */
  public String getExit() {
    return exit;
  }

  /**
   * @param exit the exit to set
   */
  public void setExit(String exit) {
    this.exit = exit;
  }

}