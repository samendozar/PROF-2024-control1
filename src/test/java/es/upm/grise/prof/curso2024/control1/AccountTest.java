package test.java.es.upm.grise.prof.curso2024.control1;

import main.java.es.upm.grise.prof.curso2024.control1.Account;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AccountTest {
	
	private Account account;
	private final float accountBalance = 20.0f;

    @BeforeEach
    public void builder(){
        account = mock(Account.class);
    }
    
	@Test
    public void getCurrentBalanceMock(){
		//define mocking behaviour for method
		when(account.getCurrentBalance()).thenReturn(accountBalance);
		
		//validates that the method return value equals the mocked value
        assertEquals(account.getCurrentBalance(), accountBalance);
    }
	
}
