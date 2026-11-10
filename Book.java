public class Book extends LibraryItem implements Borrowable{
	private String author;
	
	
	public Book(String itemId, String title, String author){
		super(itemId, title);
		this.author = author;
		
	}
	public String getAuthor(){
		return author;
	}
	@Override
	public void calculateFee(){
		int fee = 50;
		System.out.println("Book fee: "+ fee);
		
	}
	@Override
	public void borrow(){
		System.out.println("Book borrowed");
		
	}
	@Override
	public void returnItem(){
		System.out.println("Book returned");
		
	}
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Author: "+author);
	}
}