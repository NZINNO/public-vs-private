public class Bank{
  //Attributes
  private double checking;
  private double saving;

  // Default Constructor
  public Bank(){
    checking = 0;
    saving = 0;
  }

  public double getChecking(){
    return checking;
  }

  public double getSaving(){
    return saving;
  }

  public void depositSavings(double savings){
    if(saving>= 0){
        savings += deposit;
  }


}
}
