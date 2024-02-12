//Karim Walid Fathy
//ID:120210220
//Section 3

import java.util.Date;
public class Visit {
   private Customer customer;
   private Date date;
   private double surviceExpense;
   private double productExpense;
   
   public Visit(Customer customer,Date date){
       this.customer=customer;
       this.date=date;
      }

    public double getSurviceExpense() {
        return surviceExpense;
    }

    public void setSurviceExpense(double surviceExpense) {
        this.surviceExpense = surviceExpense;
    }

    public double getProductExpense() { 
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
   
    public double getTotalExpense(){
        double surviceDiscount= DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount= DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double totalServiceExpense=surviceExpense *(1-surviceDiscount);
        double totalProductExpense=productExpense *(1-productDiscount);
        double TotalExpense = totalServiceExpense + totalProductExpense;
        return TotalExpense;
        
        
        
    }

    @Override
    public String toString() {
        return "Visit{" + "customer=" + customer + ", date=" + date + ", surviceExpense=" + surviceExpense + ", productExpense=" + productExpense + '}';
    }
    
    
}
