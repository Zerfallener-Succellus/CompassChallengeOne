package question_one;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployerRegister {
  
  private ArrayList<Employer> employers;

  public EmployerRegister(){
    employers = new ArrayList<>();
  }

  public void employerRegister() {
    Scanner rd = new Scanner(System.in);
  
    System.out.println("How many employees do you want to register? : ");
    int n = rd.nextInt();
  
    for(int i = 0; i < n; i++){
      System.out.println("Employer #"+ (i + 1));
      System.out.println("Employer Name : ");
      String name = rd.next();
      System.out.println("Employer Salary : ");
      double salary = rd.nextDouble();
  
      Employer employer = new Employer(name, salary);
      employers.add(employer);
    }
    rd.close();
  }

  public void showEmployersData(){
    System.out.println("");
    System.out.println("Employers: ");
    for (Employer employer : employers){
      System.out.println(employer);
    }
  }





    /**
     * @return ArrayList<Employer> return the employers
     */
    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    /**
     * @param employers the employers to set
     */
    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }

}

