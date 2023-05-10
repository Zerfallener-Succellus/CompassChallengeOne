package question_one;

public class Main {

  // main creates a new register by the constructor and executes the functions of registering new employees and after that executes the one of showing
  public static void main(String[] args) {
    EmployerRegister register = new EmployerRegister();
    register.employerRegister();
    register.showEmployersData();

  }

}