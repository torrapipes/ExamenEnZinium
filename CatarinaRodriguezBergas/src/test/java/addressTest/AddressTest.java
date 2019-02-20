package addressTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

import org.junit.Test;

import address.Address;
import genSig.GenSig;

public class AddressTest {

	
	@Test
	public void constructorTest() {
		
		Address ad = new Address();
		
		assertNotNull(ad);
		
	}
	
	
	@Test
	public void getPKTest() {
		
		Address ad = new Address();
		
		PublicKey Pkey = GenSig.generateKeyPair().getPublic();
		
		ad.setPK(Pkey);
		
		assertNotNull(ad.getPK());
		
	}
	
	
	@Test
	public void getSKTest() {
		
		Address ad = new Address();
		
		PrivateKey Skey = GenSig.generateKeyPair().getPrivate();
		
		ad.setSK(Skey);
		
		assertNotNull(ad.getSK());
		
	}
	
	
	@Test
	public void getBalanceTest() {
		
		Address ad = new Address();
		
		double balance = 7.7;
		
		ad.setBalance(balance);
		
		assertEquals(balance, ad.getBalance(), 0.0);
		
	}
	
	
	@Test
    public void generateKeyPairTest() {
		
        Address address = new Address();
        assertNotNull(address);
        address.generateKeyPair();
        assertNotNull(address.getPK());
        assertNotNull(address.getSK());
        
    }


}
