package tokenContract;

import java.security.PublicKey;

import address.Address;

public class TokenContract {

	// Atributos
	
	private String name = null;
	private String symbol = null;
	private double totalSupply = 0d;
	private PublicKey ownerPK = null;
	
	
	// Constructor
	
	public TokenContract(Address rick) {
		
		this.ownerPK = rick.getPK();
		
	}
	
	
	// Getters
	
	public String getName() {
		
		return this.name;
		
	}
	
	
	public String getSymbol() {
		
		return this.symbol;
		
	}
	
	
	public double getTotalSupply() {
		
		return this.totalSupply;
		
	}
	
	
	public PublicKey getOwnerPK() {
		
		return this.ownerPK;
		
	}
	
	
	// Setters
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	
	public void setSymbol(String symbol) {
		
		this.symbol = symbol;
		
	}
	
	
	public void setTotalSupply(double supply) {
		
		this.totalSupply = supply;
		
	}


	@Override
	public String toString() {
		
		return "\n" + "name = " + this.getName() + "\n" + "symbol = " + this.getSymbol() + "\n" + "totalSupply = " + this.getTotalSupply() + "\n" + "owner PK = " + this.getOwnerPK().hashCode();
		
	}
	
	
	
}
