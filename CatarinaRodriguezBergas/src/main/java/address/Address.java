package address;

import java.security.PrivateKey;
import java.security.PublicKey;

import genSig.GenSig;

public class Address {

	
	// Atributos
	
	private PublicKey PK = null;
	private PrivateKey SK = null;
	private double balance = 0d;
	
	
	// Constructor
	
	public Address() {}
	
	
	// Getters
	
	public PublicKey getPK() {
		
		return this.PK;
		
	}
	
	
	public PrivateKey getSK() {
		
		return this.SK;
		
	}
	
	
	public double getBalance() {
		
		return this.balance;
		
	}
	
	
	// Setters
	
	public void setPK(PublicKey PK) {
		
		this.PK = PK;
		
	}
	
	
	public void setSK(PrivateKey SK) {
		
		this.SK = SK;
		
	}
	
	
	public void setBalance(double balance) {
		
		this.balance = balance;
		
	}
	
	// Métodos
	
	public void generateKeyPair() {
		
		this.setPK(GenSig.generateKeyPair().getPublic());
		this.setSK(GenSig.generateKeyPair().getPrivate());
		
	}


	@Override
	public String toString() {
		
		return "\n" + "PK = " + this.getPK().hashCode() + "\n" + "Balance = " + this.getBalance() + " EZI";
		
	}
	
	
	
	
	
}
