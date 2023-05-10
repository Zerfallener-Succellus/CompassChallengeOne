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
  private String bonusFormated;

  DecimalFormat df = new DecimalFormat("#,##0.00");
  
  /**
   * @param name
   * @param salary
   */
  public Employer(String name, double salary){

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
     * @param liquidSalary the liquidSalary to set
     */
    public void setLiquidSalary(double liquidSalary) {
        //Liquid Salary
    if(this.salary <= 1000){
      this.liquidSalary = this.salary + (this.salary * 0.2);
    }else if(this.salary > 1000 && this.salary < 2000){
       this.liquidSalary = this.salary + (this.salary * 0.1);
    }else if(this.salary >= 2000){
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
     * @param bonusAndDiscount the bonusAndDiscount to set
     */
    public void setBonusAndDiscount(double bonusAndDiscount) {
        //Bonus And Discount
    if(this.salary <= 1000){
      this.bonusAndDiscount = this.salary * 0.2;
    }else if(this.salary > 1000 && this.salary < 2000){
       this.bonusAndDiscount = this.salary * 0.1;
    }else if(this.salary >= 2000){
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
     * @param textIsBonusOrDiscount the textIsBonusOrDiscount to set
     */
    public void setTextIsBonusOrDiscount(String textIsBonusOrDiscount) {
            //Bonus And Discount
    if(this.salary <= 1000){
      this.textIsBonusOrDiscount = "Bonus: +R$"; 
    }else if(this.salary > 1000 && this.salary < 2000){
      this.textIsBonusOrDiscount = "Bonus: +R$";
    }else if(this.salary >= 2000){
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

    /**
     * @return String return the bonusFormated
     */
    public String getBonusFormated() {
        return bonusFormated;
    }

    /**
     * @param bonusFormated the bonusFormated to set
     */
    public void setBonusFormated(String bonusFormated) {
        this.bonusFormated = bonusFormated;
    }


    @Override
    public String toString() {
        return "\n" + "Employer: " + name + "\n" + "Salary: R$" + df.format(salary) + "\n" + this.textIsBonusOrDiscount + df.format(this.bonusAndDiscount) + "\n"
        + "Liquid Salary: R$" + df.format(this.liquidSalary);
    }
}