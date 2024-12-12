package test.java.es.upm.grise.prof.curso2024.control1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.es.upm.grise.prof.curso2024.control1.Account;
import main.java.es.upm.grise.prof.curso2024.control1.Customer;

public class CustomerTest {
	
	private final String accountNo1 = "123";
	private final String accountNo2 = "456";
	private final String accountNo3 = "789";
	private final float balance1 = 12.0f;
	private final float balance2 = 22.0f;
	private final float balance3 = 12.0f;

	@Test
    public void getAccountWithHighestBalanceThrowsException(){
		Customer c = new Customer();
        assertThrows(NoAccountsException.class, c.getAccountWithHighestBalance());
   }
	
	
	@Test
    public void getAccountWithHighestBalanceReturns456(){
		//Sin usar mockito segun la consigna
		Account ac1 = new Account(accountNo1, balance1);
		Account ac2 = new Account(accountNo2, balance2);
		Account ac3 = new Account(accountNo3, balance3);
		List<Account> accountList = new ArrayList();
		Customer c = new Customer();
		
		//newly defined setter for customer accounts
		c.setAccounts(accountList);
		
        assertEquals(accountNo2, c.getAccountWithHighestBalance());
   }
    
	@Test
    public void getAccountWithHighestBalanceReturns456Mockito(){
		//Define entity mock
		Customer customer = mock(Customer.class);
		//define mocking behaviour for method
		when(customer.getAccountWithHighestBalance()).thenReturn(accountNo2);
		
		//validates that the method return value equals the mocked value
        assertEquals(customer.getAccountWithHighestBalance(), accountNo2);
    }
}
