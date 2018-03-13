import java.util.GregorianCalendar;

public class Invoice {
	private int id;
	private String description;
	private String date;
	private double total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Invoice(int id) {
		super();
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Invoice(int id, String description, double total) {
		super();
		this.id = id;
		this.description = description;
		
		this.total = total;
	}
	

}
