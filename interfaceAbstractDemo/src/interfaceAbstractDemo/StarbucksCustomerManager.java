package interfaceAbstractDemo;

public class StarbucksCustomerManager extends CustomerManager{
	
  
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager() {
	this.customerCheckService= customerCheckService;
	}
	
	@Override	
 
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerfon(customer)) {
			super.save(customer);
		}else {
			System.out.println("Doðrulama Baþarýsýz");
		}
	}
  
}
