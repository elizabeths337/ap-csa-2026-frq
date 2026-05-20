public class Bottle {
  private double mL;
  private double curr;

  public Bottle (double amount) {
    mL = amount;    
  }
  
  public double updateAmount(double less) {
    curr -= less;
    if (curr >= (mL * 0.25) {
        curr = mL;
    }
    return curr;
  }  
}
