package interfaceAbstractDemo;

public class CustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Veri tabanưna kaydedildi : "  +customer.getFirstName());
		
	}
}


