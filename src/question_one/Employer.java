package question_one;

import java.text.DecimalFormat;

// The Employer class generates the data for the employee constructor to work
// initially setting the necessary variables and setting them in the setters

public class Employer {
  private String name;
  private double salary;
  private double liquidSalary;
  private double bonusAndDiscount;
  private String textIsBonusOrDiscount;
  private String salaryFormated;
  private String liquidSalaryFormated;

  // this decimal format is used to format the double values for the common monei
  // structure
  DecimalFormat df = new DecimalFormat("#,##0.00");

  /**
   * Employee's constructor, it receives name and salary and returns the other
   * variables
   * such as, net salary, bonus or discount, and whether it will be a bonus or
   * discount
   * 
   * @param name
   * @param salary
   */
  public Employer(String name, double salary) {

    this.name = name;
    this.salary = salary;
    setSalaryFormated(salaryFormated);
    setLiquidSalary(salary);
    setBonusAndDiscount(salary);
    setTextIsBonusOrDiscount(textIsBonusOrDiscount);
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

  /**
   * @return double return the salary
   */
  public double getSalary() {
    return salary;
  }

  /**
   * @param salary the salary to set
   */
  public void setSalary(double salary) {
    this.salary = salary;
  }

  /**
   * @return double return the liquidSalary
   */
  public double getLiquidSalary() {
    return liquidSalary;
  }

  /**
   * The bonus percentages are added or the discount subtracted according to
   * the rules:
   * if salary <= 1000 {salary += 20%}
   * if salary > 1000 and < 2000 {salary += 10%}
   * if salary >= 2000 {salary -= 10%}
   * 
   * @param liquidSalary the liquidSalary to set
   */
  public void setLiquidSalary(double liquidSalary) {
    // Liquid Salary
    if (this.salary <= 1000) {
      this.liquidSalary = this.salary + (this.salary * 0.2);
    } else if (this.salary > 1000 && this.salary < 2000) {
      this.liquidSalary = this.salary + (this.salary * 0.1);
    } else if (this.salary >= 2000) {
      this.liquidSalary = this.salary - (this.salary * 0.1);
    }
  }

  /**
   * @return double return the bonusAndDiscount
   */
  public double getBonusAndDiscount() {
    return bonusAndDiscount;
  }

  /**
   * 
   * The bonus is defined by the rules:
   * if salary <= 1000 bonus = 20%
   * if salary > 1000 and < 2000 bonus = 10%
   * if salary >= 2000 bonus = -10%
   * 
   * @param bonusAndDiscount the bonusAndDiscount to set
   */
  public void setBonusAndDiscount(double bonusAndDiscount) {
    // Bonus And Discount
    if (this.salary <= 1000) {
      this.bonusAndDiscount = this.salary * 0.2;
    } else if (this.salary > 1000 && this.salary < 2000) {
      this.bonusAndDiscount = this.salary * 0.1;
    } else if (this.salary >= 2000) {
      this.bonusAndDiscount = this.salary * 0.1;
    }
  }

  /**
   * @return String return the textIsBonusOrDiscount
   */
  public String getTextIsBonusOrDiscount() {
    return textIsBonusOrDiscount;
  }

  /**
   * It is analyzed whether it will be a bonus or discount based on the rules:
   * if salary <= 1000 = bonus
   * if salary > 1000 and < 2000 = bonus
   * if salary >= 2000 bonus = discounto
   * 
   * @param textIsBonusOrDiscount the textIsBonusOrDiscount to set
   */
  public void setTextIsBonusOrDiscount(String textIsBonusOrDiscount) {
    // Bonus And Discount
    if (this.salary <= 1000) {
      this.textIsBonusOrDiscount = "Bonus: +R$";
    } else if (this.salary > 1000 && this.salary < 2000) {
      this.textIsBonusOrDiscount = "Bonus: +R$";
    } else if (this.salary >= 2000) {
      this.textIsBonusOrDiscount = "Discount: -R$";
    }
  }

  /**
   * @return String return the salaryFormated
   */
  public String getSalaryFormated() {
    return salaryFormated;
  }

  /**
   * @param salaryFormated the salaryFormated to set
   */
  public void setSalaryFormated(String salaryFormated) {
    this.salaryFormated = salaryFormated;
  }

  /**
   * @return String return the liquidSalaryFormated
   */
  public String getLiquidSalaryFormated() {
    return liquidSalaryFormated;
  }

  /**
   * @param liquidSalaryFormated the liquidSalaryFormated to set
   */
  public void setLiquidSalaryFormated(String liquidSalaryFormated) {
    this.liquidSalaryFormated = df.format(Double.toString(this.liquidSalary));
  }

  // Here a toString method is created to pass the Employee's information, since
  // formatted with the decimalformat called at the beginning of the code
  // the info is displayed in this format:
  // Employer: ABCD
  // Salary: BRL 1,200.00
  // Bonus: BRL 120.00
  // Liquid salary: BRL 1,320.00

  @Override
  public String toString() {
    return "\n" + "Employer: " + name + "\n" + "Salary: R$" + df.format(salary) + "\n" + this.textIsBonusOrDiscount
        + df.format(this.bonusAndDiscount) + "\n"
        + "Liquid Salary: R$" + df.format(this.liquidSalary);
  }
}