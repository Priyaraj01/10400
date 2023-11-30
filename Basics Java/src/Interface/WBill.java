package Interface;

public class WBill implements Bill{
	private int nooflitre;
	private int cosperlitre;
	public WBill()
	{

	}
	public WBill(int nooflitre, int cosperlitre) {
		super();
		this.nooflitre = nooflitre;
		this.cosperlitre = cosperlitre;
	}
	public int getNooflitre() {
		return nooflitre;
	}
	public void setNooflitre(int nooflitre) {
		this.nooflitre = nooflitre;
	}
	public int getCosperlitre() {
		return cosperlitre;
	}
	public void setCosperlitre(int cosperlitre) {
		this.cosperlitre = cosperlitre;
	}
	@Override
	public double calculateBill() {
		
		return nooflitre*cosperlitre;
	}
	@Override
	public void display() {
		 System.out.println("The Water Bill =:"+calculateBill());
	}
	@Override
	public String toString() {
		return "WBill [nooflitre=" + nooflitre + ", cosperlitre=" + cosperlitre + "]";
	}
	
}
