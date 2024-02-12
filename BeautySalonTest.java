//Karim Walid Fathy
//ID:120210220
//Section 3

import java.util.Date;

public class BeautySalonTest {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Karim");
        Customer customer2 = new Customer("Walid");
        Customer customer3 = new Customer("Sameh");
        Customer customer4 = new Customer("Ahmed");

        customer1.setMemberType("Premium");
        customer2.setMemberType("Gold");
	// customer3 remains a non-member
        customer4.setMemberType("Silver");

        Visit visit1 = new Visit(customer1, new Date());
        Visit visit2 = new Visit(customer2, new Date());
        Visit visit3 = new Visit(customer3, new Date());
        Visit visit4 = new Visit(customer4, new Date());

        visit1.setSurviceExpense(100);
        visit1.setProductExpense(50);

        visit2.setSurviceExpense(80);
        visit2.setProductExpense(60);

        visit3.setSurviceExpense(120);
        visit3.setProductExpense(70);

        visit4.setSurviceExpense(90);
        visit4.setProductExpense(40);

        System.out.println(visit1.toString());
        System.out.println("Total Expense: $" + visit1.getTotalExpense());

        System.out.println(visit2.toString());
        System.out.println("Total Expense: $" + visit2.getTotalExpense());

        System.out.println(visit3.toString());
        System.out.println("Total Expense: $" + visit3.getTotalExpense());

        System.out.println(visit4.toString());
        System.out.println("Total Expense: $" + visit4.getTotalExpense());
    }
    
}
