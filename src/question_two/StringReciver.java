package question_two;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReciver {
  private String exit;

    public void stringReciver(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your mensage: ");
      String m = sc.nextLine();
      while (m.isEmpty()) {
        System.out.println("Please enter a valid message: ");
        m = sc.nextLine();
    }
      sc.close();

      Pattern emotes = Pattern.compile(":-\\)|:-\\(");
      Matcher matcher = emotes.matcher(m);

      int funEmote = 0;
      int upsetEmote = 0;

      while(matcher.find()){
        if (matcher.group().equals(":-)")){
          funEmote++;
        }else if(matcher.group().equals(":-(")){
          upsetEmote++;
        }
      }

      if(funEmote == upsetEmote){
        this.exit = "Neutral";
      }else if(funEmote > upsetEmote){
        this.exit = "Fun";
      }else if(funEmote < upsetEmote){
        this.exit = "Upset";
      }
  
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