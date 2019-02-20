package tokenContractTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import address.Address;
import tokenContract.TokenContract;

public class TokenContractTest {

	 @Test
	 public void constructortest() {
		 
		 Address ad = new Address();
		 TokenContract tk = new TokenContract(ad);
		 
		 assertNotNull(tk);
		 
	 }
	 
	 
	 @Test
	 public void getNameTest() {
		 
		 Address ad = new Address();
		 TokenContract tk = new TokenContract(ad);
		 
		 String name = "Mr Potato";
		 
		 tk.setName(name);
		 
		 assertEquals(name, tk.getName());
		 
	 }
	 
	 @Test
	 public void getSymbolTest() {
		 
		 Address ad = new Address();
		 TokenContract tk = new TokenContract(ad);
		 
		 String symbol = "Pot";
		 
		 tk.setSymbol(symbol);
		 
		 assertEquals(symbol, tk.getSymbol());
		 
	 }
	 
	 
	 @Test
	 public void TotalSupplyTest() {
		 
		 Address ad = new Address();
		 TokenContract tk = new TokenContract(ad);
		 
		 double sup = 22.2;
		 
		 tk.setTotalSupply(sup);
		 
		 assertEquals(sup, tk.totalSupply(), 0.0);
		 
	 }
	 
	 
	 @Test
	 public void getOwnerPKTest() {
		 
		 Address ad = new Address();
		 TokenContract tk = new TokenContract(ad);
		 
		 assertEquals(ad.getPK(), tk.getOwnerPK());
		 
	 }
	 
	 
	 @Test
	 public void addOwnerTest() {
		 
		 Address ad = new Address();
		 TokenContract tk = new TokenContract(ad);
		 
		 double balance = 20.0;
		 tk.addOwner(ad.getPK(), balance);
		 
		 assertEquals(balance, tk.getBalances().get(ad.getPK()), 0.0);
		 
	 }
		
	/* @Test
	    public void payable_test() {

	        Address rick = new Address();
	        rick.generateKeyPair();
	        TokenContract ricknillos = new TokenContract(rick);
	        ricknillos.addOwner(rick.getPK(), 100d);
	        Address morty = new Address();
	        morty.generateKeyPair();

	        morty.addEZI(20d);

	        // verifico la transferencia de entradas
	        ricknillos.payable(morty.getPK(), morty.getBalance());
	        assertEquals(4d, ricknillos.balanceOf(morty.getPK()), 0d);   

	        // verifico la trasnferencia de EZI
	        assertEquals(20d, ricknillos.owner().getBalance(), 0d);
	    }*/
	 
}
