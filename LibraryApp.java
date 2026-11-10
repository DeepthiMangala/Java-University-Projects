import java.util.*;
public class LibraryApp{
	public static void main(String[] args){
		Scanner dd = new Scanner(System.in);
		
		ArrayList<LibraryItem> items = new ArrayList<>();
		
		boolean running = true;
		
		while(running){
			System.out.println();
			System.out.println("1. Add Book");
			System.out.println("2. Add DVD");
			System.out.println("3. Display All Items");
			System.out.println("4. Search Item");
			System.out.println("5. Remove Item");
			System.out.println("6. Calculate Fee");
			System.out.println("7. Exit");
			
			System.out.print("Enter choice: ");
			int choice = dd.nextInt();
			dd.nextLine();
			
			switch(choice){
				case 1:
					System.out.print("Enter Item ID: ");
					String bookId = dd.nextLine();
					
					System.out.print("Enter Title: ");
					String bookTitle = dd.nextLine();
					
					System.out.print("Enter Author: ");
					String author = dd.nextLine();
					
					Book b = new Book(bookId, bookTitle, author);
					
					items.add(b);
					System.out.println();
					System.out.println("Item added successfully");
					break;
				case 2:
					System.out.print("Enter Item ID: ");
					String dvdId = dd.nextLine();
					
					System.out.print("Enter Title: ");
					String dvdTitle = dd.nextLine();
					
					System.out.print("Enter Duration: ");
					int duration = dd.nextInt();
					
					DVD d = new DVD(dvdId, dvdTitle, duration);
					
					items.add(d);
					System.out.println();
					System.out.println("DVD added successfully");
					break;
					
				case 3:
					if(items.isEmpty()){
						System.out.println("No items available");
							
					}else{
						for(LibraryItem item: items){
							item.displayDetails();
							System.out.println();
						}
					}
					break;	
				
				case 4:
					System.out.print("Enter Item ID: ");
					String searchId = dd.nextLine();
					
					boolean sfound = false;
					
					for(int i = 0; i<items.size(); i++){
						if(items.get(i).getItemId().equals(searchId)){
							System.out.println("Item Found! ");
							items.get(i).displayDetails();
							sfound = true;
							break;
						}
					}
					if(!sfound){
						System.out.println("Item Not Found!");
					}
					break;
					
				case 5:
					System.out.print("Enter Item ID to remove: ");
					String removeId = dd.nextLine();
					
					boolean rfound = false;
					
					for(int i = 0; i<items.size(); i++){
						if(items.get(i).getItemId().equals(removeId)){
							items.remove(i);
							System.out.println("Item Removed Successfullly");
							rfound = true;
							break;
						}
						
					}
					if(!rfound){
						System.out.println("Item Not Found! ");
						
					}
					break;
					
				case 6:
					System.out.print("Enter Item Id to Calculate Fee: ");
					String calId = dd.nextLine();
					
					boolean cfound = false;
					
					for(LibraryItem item : items){
						if(item.getItemId().equals(calId)){
							item.calculateFee();
							cfound = true;
							break;
							
						}
					}
					if(!cfound){
						System.out.println("Entered Id is not valid");
						
					}
					break;
					
				case 7:
					System.out.println("Exiting......");
					return;
					
				default:
					System.out.println("Inavalid Choice....");
					break;
					
			}
		}
	}
}