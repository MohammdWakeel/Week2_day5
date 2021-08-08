package aug5;

//import eg2.Bus;

public class Restraunt {
	private int s_no;
	private String p_Name;
	private double price;
	private int quantity;
	public Restraunt() {
		
	}
	public Restraunt(int s_no, String p_Name, int quantity, double price) {
		super();
		this.s_no = s_no;
		this.p_Name = p_Name;
		this.price = price;
		this.quantity = quantity;
	}
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public String getP_Name() {
		return p_Name;
	}
	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Restraunt [s_no=" + s_no + ", p_Name=" + p_Name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	/*@Override
	public int compareTo(Restraunt o) {
		Integer i1=this.id;
		Integer i2=o.id;
		return i1.compareTo(i2);
	}*/
	
	
	

}
