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
		 ad.generateKeyPair();
		 TokenContract tk = new TokenContract(ad);
		 
		 assertNotNull(tk);
		 
	 }
	 
	 
	 @Test
	 public void getNameTest() {
		 
		 Address ad = new Address();
		 ad.generateKeyPair();
		 TokenContract tk = new TokenContract(ad);
		 
		 String name = "Mr Potato";
		 
		 tk.setName(name);
		 
		 assertEquals(name, tk.getName());
		 
	 }
	 
	 @Test
	 public void symbolTest() {
		 
		 Address ad = new Address();
		 ad.generateKeyPair();
		 TokenContract tk = new TokenContract(ad);
		 
		 String symbol = "Pot";
		 
		 tk.setSymbol(symbol);
		 
		 assertEquals(symbol, tk.symbol());
		 
	 }
	 
	 
	 @Test
	 public void TotalSupplyTest() {
		 
		 Address ad = new Address();
		 ad.generateKeyPair();
		 TokenContract tk = new TokenContract(ad);
		 
		 double sup = 22.2;
		 
		 tk.setTotalSupply(sup);
		 
		 assertEquals(sup, tk.totalSupply(), 0.0);
		 
	 }
	 
	 
	 @Test
	 public void getOwnerPKTest() {
		 
		 Address ad = new Address();
		 ad.generateKeyPair();
		 TokenContract tk = new TokenContract(ad);
		 
		 assertEquals(ad.getPK(), tk.getOwnerPK());
		 
	 }
	 
	/* @Test
	 public void getBalancesTest() {
		 
		 Address ad = new Address();
		 TokenContract tk = new TokenContract(ad); 
	 }*/
	 
	 
	 @Test
	 public void addOwnerTest() {
		 
		 Address ad = new Address();
		 ad.generateKeyPair();
		 TokenContract tk = new TokenContract(ad);
		 
		 double balance = 20.0;
		 tk.addOwner(ad.getPK(), balance);
		 
		 assertEquals(balance, tk.getBalances().get(ad.getPK()), 0.0);
		 
	 }
		
	 @Test
	 public void numOwnersTest() {
		 
		 
		 Address ad = new Address();
		 Address ad1 = new Address();
		 
		 ad.generateKeyPair();
		 ad1.generateKeyPair();
		 
		 TokenContract tk = new TokenContract(ad);
		 TokenContract tk1 = new TokenContract(ad1);

		 double balance = 20.0;
		 
		 tk.addOwner(ad.getPK(), balance);
		 tk.addOwner(ad1.getPK(), balance);
		 
		 assertEquals(2, tk.numOwners());
		 
		 
	 }
	 
	 @Test
	 public void balanceOfTest() {
		 
		 Address ad = new Address();
		 ad.generateKeyPair();
		 Address address = new Address();
		 address.generateKeyPair();
		 
		 TokenContract tk = new TokenContract(ad);
		 
		 double balance = 20.0;
		 tk.addOwner(ad.getPK(), balance);
		 
		 assertEquals(balance,tk.balanceOf(ad.getPK()), 0.0);
		 assertEquals(0.0, tk.balanceOf(address.getPK()), 0.0);
		 
	 }
	 
	 
	 @Test
	 public void transferTest() {
		 
		 Address direccionO = new Address();
		 direccionO.generateKeyPair();
		 Address direccionD = new Address();
		 direccionD.generateKeyPair();
		 TokenContract contract = new TokenContract(direccionO);
		 
		 contract.addOwner(direccionO.getPK(), 10);
		 
		 double tokens = 5;
		 
		 contract.transfer(direccionD.getPK(), tokens);
		 
		 assertEquals(tokens, contract.getBalances().get(contract.getOwnerPK()) , 0.0);
		 
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
