package question_one;

public class Employer {
  private String name;
  private double salary;
  private double liquidSalary;
  private double bonusAndDiscount;
  private String textIsBonusOrDiscount;

  
  
  /**
   * @param name
   * @param salary
   */
  public Employer(String name, double salary){

    this.name = name;
    this.salary = salary;
    setLiquidSalary(salary);
    setBonusAndDiscount(salary);
    setTextIsBonusOrDiscount(textIsBonusOrDiscount);
  }
    

  
    public static void main(String[] args) {
      Employer empregado = new Employer("Davi", 1200);

      System.out.println(empregado.name);
      System.out.println(empregado.salary);
      System.out.println(empregado.bonusAndDiscount);
      System.out.println(empregado.liquidSalary);
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
    }else{
      this.liquidSalary = this.salary;
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
      this.bonusAndDiscount = this.salary * 0.1 * -1;
    }else{
      this.bonusAndDiscount = this.salary;
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
      this.setTextIsBonusOrDiscount("Bonus :"); 
    }else if(this.salary > 1000 && this.salary < 2000){
      this.setTextIsBonusOrDiscount("Bonus :");
    }else if(this.salary >= 2000){
      this.setTextIsBonusOrDiscount("Discount :");
    }else{
      this.setTextIsBonusOrDiscount("Bonus :");
    }
    }
}