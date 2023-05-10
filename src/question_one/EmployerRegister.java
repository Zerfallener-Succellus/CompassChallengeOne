package question_one;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployerRegister {

  private ArrayList<Employer> employers;

  public EmployerRegister() {
    employers = new ArrayList<>();
  }

  public void employerRegister() {
    Scanner rd = new Scanner(System.in);

    try {
      System.out.println("How many employees do you want to register? : ");
      int n = rd.nextInt();

      if (n < 0) {
        throw new IllegalArgumentException("The number of employees cannot be negative.");
      }

      for (int i = 0; i < n; i++) {
        System.out.println("Employer #" + (i + 1));
        System.out.println("Employer Name : ");
        String name = rd.next();
        if (name.isEmpty()) {
          throw new IllegalArgumentException("Employer name cannot be empty.");
        } else if (name.matches(".*\\d+.*") || name.matches(".*[!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?].*")) {
          throw new IllegalArgumentException(
              "Employer name can't have invalid caracters as: 'numbers and especial caracters'.");
        }

        System.out.println("Employer Salary : ");
        double salary = rd.nextDouble();
        if (salary < 0) {
          throw new IllegalArgumentException("Employer salary can't be a negative value.");
        }

        Employer employer = new Employer(name, salary);
        employers.add(employer);
      }

    } catch (InputMismatchException e) {
      System.out.println("Invalid Input");
      System.out.println("Restarting...");
      employerRegister();
    } catch (IllegalArgumentException er) {
      System.out.println(er.getMessage());
      System.out.println("Restarting...");
      employerRegister();
    } finally {
      rd.close();
    }
  }

  public void showEmployersData() {
    System.out.println("");
    System.out.println("Employers: ");
    for (Employer employer : employers) {
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
