import java.util.Scanner;

public class MovieDriver_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("Goodbye");
		sc.close();
	}
	
}