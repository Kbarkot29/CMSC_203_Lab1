import java.util.Scanner;

public class MovieDriver_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		String continueGame; 
		

		do {
			Movie movie = new Movie();
			System.out.println("Enter the title of a movie: ");
			String title = sc.nextLine();
			movie.setTitle(title);
			
			System.out.println("Enter the movie's rating: ");
			String rating = sc.nextLine();
			movie.setRating(rating);
			
			System.out.println("Enter number of tickets sold at the theater: ");
			int soldTickets = sc.nextInt();
			movie.setSoldTickets(soldTickets);
			sc.nextLine();
			
			System.out.println(movie.toString());
			System.out.println("Do you wish to continue(y/n): ");
			continueGame = sc.nextLine().toLowerCase();
		}while(continueGame.equals("y"));
		
		System.out.println("Goodbye");
		sc.close();
	}

}
