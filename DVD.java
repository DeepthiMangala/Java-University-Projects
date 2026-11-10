public class DVD extends LibraryItem implements Borrowable{
	private int duration;
	
	public DVD(String itemId, String title, int duration){
		super(itemId, title);
		this.duration = duration;
		
	}
	public int getDuration(){
		return duration;
	}
	@Override
	public void calculateFee(){
		int fee = duration * 20;
		System.out.println("DVD fee: "+ fee);
		
	}
	@Override
	public void borrow(){
		System.out.println("DVD borrowed");
		
	}
	@Override
	public void returnItem(){
		System.out.println("DVD returned");
		
	}
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Duration: "+duration);
	}
}