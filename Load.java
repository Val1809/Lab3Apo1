public class Load {

	private int KG_LOAD_DANGEROUS = 390000;
	private int KG_LOAD_PERISHABLE = 250000;
	private int KG_LOAD_NOTPERISHABLE2 = 80000;
	private int numerOfBox;
	private double weight;
	private String typeBox;
	private int price;

	/**
	 * 
	 * @param numerOfBox
	 * @param weight
	 * @param typeBox
	 * @param price
	 */
	public Load(int numerOfBox, double weight, String typeBox, int price) {
		// TODO - implement Load.Load
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numerOfBox
	 */
	public void setNumberOfBox(int numerOfBox) {
		// TODO - implement Load.setNumberOfBox
		throw new UnsupportedOperationException();
	}

	public int getNumberOfBox() {
		// TODO - implement Load.getNumberOfBox
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return this.weight;
	}

	/**
	 * 
	 * @param typeBox
	 */
	public void setTypeBox(int typeBox) {
		// TODO - implement Load.setTypeBox
		throw new UnsupportedOperationException();
	}

	public int getTypeBox() {
		// TODO - implement Load.getTypeBox
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

}