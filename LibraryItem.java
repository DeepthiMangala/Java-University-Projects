abstract class LibraryItem{
	private String itemId;
	private String title;
	
	public LibraryItem(String itemId, String title){
		this.itemId = itemId;
		this.title = title;
		
	}
	public String getItemId(){
		return itemId;
	}
	public String getTitle(){
		return title;
	}
	public void setItemId(String itemId){
		this.itemId = itemId;
	}
	public void setTitle(String title){
		this.title = title;
	}
	
	public void displayDetails(){
		System.out.println("Item Id: "+itemId);
		System.out.println("Title: "+title);
		
	}
	abstract void calculateFee();
}