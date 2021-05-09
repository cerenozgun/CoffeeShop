package interfaceAbstractDemo;

public class CustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Veri tabanýna kaydedildi : "  +customer.getFirstName());
		
	}
}


