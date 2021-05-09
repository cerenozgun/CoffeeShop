package interfaceAbstractDemo;

public class Main {

	public static void main(String[] args) {

 CustomerManager customerManager = new NeroCustomerManager();
 customerManager.save(new Customer(1,"Ceren ", "Özgün "
		 ,"1999","16584752348"));
 System.out.println();
	}



}
