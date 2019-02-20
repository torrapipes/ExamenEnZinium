package tokenContract;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

import address.Address;

public class TokenContract {

	// Atributos
	
	private String name = null;
	private String symbol = null;
	private double totalSupply = 0d;
	private PublicKey ownerPK = null;
	private Map<PublicKey, Double> balances = new HashMap<PublicKey, Double>();
	
	
	// Constructor
	
	public TokenContract(Address rick) {
		
		this.ownerPK = rick.getPK();

	}
	
	
	// Getters
	
	public String getName() {
		
		return this.name;
		
	}
	
	
	public PublicKey getOwnerPK() {
		
		return this.ownerPK;
		
	}
	
	
	public Map<PublicKey, Double> getBalances() {
		
		return this.balances;
		
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

	
	// Métodos
	
	public double totalSupply() {
		
		return this.totalSupply;
		
	}
	
	
	public String symbol() {
		
		return this.symbol;
		
	}
	
	
	public void addOwner(PublicKey PK, double balance) {
		
		if(this.getBalances().containsKey(PK)) {
			
			System.out.println("Esta clave pública ya existe, introduzca otra clave pública");
			
		}
		else {
			
			this.balances.put(PK, balance);
			
		}
		
	}

	
	public int numOwners() {
		
		int total = 0;
		
		for(PublicKey key : this.getBalances().keySet()) {
			
			total += 1;
			
		}
		
		return total;
		
	}

	
	public double balanceOf(PublicKey PK) {
		
		if(this.getBalances().containsKey(PK)) {
			
			return this.getBalances().get(PK);
		
		}
		else {
			
			return 0.0;
			
		}
		
	}
	
	
	
	@Override
	public String toString() {
		
		return "\n" + "name = " + this.getName() + "\n" + "symbol = " + this.symbol() + "\n" + "totalSupply = " + this.totalSupply() + "\n" + "owner PK = " + this.getOwnerPK().hashCode();
		
	}
	
	
	
}
