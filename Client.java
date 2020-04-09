public class Client {

	private String nameClient;
	private int commercialReg;
	private String date;
	private String typeClient;
	private double numberKilos;
	private int totalValue;

	/**
	 * 
	 * @param nameClient
	 * @param commercialReg
	 * @param date
	 * @param typeClient
	 * @param numberKilos
	 * @param totalValue
	 */
	public Client(String nameClient, int commercialReg, String date, String typeClient, double numberKilos, int totalValue) {
		// TODO - implement Client.Client
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nameClient
	 */
	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getNameClient() {
		return this.nameClient;
	}

	/**
	 * 
	 * @param commercialReg
	 */
	public void setCommercialReg(int commercialReg) {
		this.commercialReg = commercialReg;
	}

	public int getCommercialReg() {
		return this.commercialReg;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param typeClient
	 */
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}

	public String getTypeClient() {
		return this.typeClient;
	}

	/**
	 * 
	 * @param numberKilos
	 */
	public void setNumberKilos(double numberKilos) {
		this.numberKilos = numberKilos;
	}

	public double getNumberKilos() {
		return this.numberKilos;
	}

	/**
	 * 
	 * @param totalValue
	 */
	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}

	public int getTotalValue() {
		return this.totalValue;
	}

}