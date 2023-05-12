package question_one;

import java.text.DecimalFormat;

public class Employer {
  private String name;
  private double salary;
  private double liquidSalary;
  private double bonusAndDiscount;
  private String textIsBonusOrDiscount;
  private String salaryFormated;
  private String liquidSalaryFormated;

  DecimalFormat df = new DecimalFormat("#,##0.00");

  public Employer(String name, double salary) {
    this.name = name;
    this.salary = salary;
    setSalaryFormated(salaryFormated);
    setLiquidSalary(salary);
    setBonusAndDiscount(salary);
    setTextIsBonusOrDiscount(textIsBonusOrDiscount);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getLiquidSalary() {
    return liquidSalary;
  }

  public void setLiquidSalary(double liquidSalary) {
    if (this.salary <= 1000) {
      this.liquidSalary = this.salary + (this.salary * 0.2);
    } else if (this.salary > 1000 && this.salary < 2000) {
      this.liquidSalary = this.salary + (this.salary * 0.1);
    } else if (this.salary >= 2000) {
      this.liquidSalary = this.salary - (this.salary * 0.1);
    }
  }

  public double getBonusAndDiscount() {
    return bonusAndDiscount;
  }

  public void setBonusAndDiscount(double bonusAndDiscount) {
    if (this.salary <= 1000) {
      this.bonusAndDiscount = this.salary * 0.2;
    } else if (this.salary > 1000 && this.salary < 2000) {
      this.bonusAndDiscount = this.salary * 0.1;
    } else if (this.salary >= 2000) {
      this.bonusAndDiscount = this.salary * 0.1;
    }
  }

  public String getTextIsBonusOrDiscount() {
    return textIsBonusOrDiscount;
  }

  public void setTextIsBonusOrDiscount(String textIsBonusOrDiscount) {
    if (this.salary <= 1000) {
      this.textIsBonusOrDiscount = "Bonus: +R$";
    } else if (this.salary > 1000 && this.salary < 2000) {
      this.textIsBonusOrDiscount = "Bonus: +R$";
    } else if (this.salary >= 2000) {
      this.textIsBonusOrDiscount = "Discount: -R$";
    }
  }

  public String getSalaryFormated() {
    return salaryFormated;
  }

  public void setSalaryFormated(String salaryFormated) {
    this.salaryFormated = salaryFormated;
  }

  public String getLiquidSalaryFormated() {
    return liquidSalaryFormated;
  }

  public void setLiquidSalaryFormated(String liquidSalaryFormated) {
    this.liquidSalaryFormated = df.format(Double.toString(this.liquidSalary));
  }

  @Override
  public String toString() {
    return "\n" + "Employer: " + name + "\n" + "Salary: R$" + df.format(salary) + "\n" + this.textIsBonusOrDiscount
        + df.format(this.bonusAndDiscount) + "\n"
        + "Liquid Salary: R$" + df.format(this.liquidSalary);
  }
}