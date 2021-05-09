package interfaceAbstractDemo;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerfon(Customer customer) {
		
		return true;
	}
}
