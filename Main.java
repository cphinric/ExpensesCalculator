import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.text.DecimalFormat;


public class Main{
	static double savings = .20;
	static double nessesities = .50;
	static double discretionary = .30;

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		LocalDate currentDate = LocalDate.now();
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		double savingsTotal = 200.45;

		System.out.println("\n" +
		                   "|----------------------------------------------------------------------------------|\n" +
						   "  ____            _            _      _____      _            _       _             \n" +
						   " |  _ \\          | |          | |    / ____|    | |          | |     | |            \n" +
						   " | |_) |_   _  __| | __ _  ___| |_  | |     __ _| | ___ _   _| | __ _| |_ ___  _ __ \n" +
						   " |  _ <| | | |/ _` |/ _` |/ _ \\ __| | |    / _` | |/ __| | | | |/ _` | __/ _ \\| '__|\n" +
						   " | |_) | |_| | (_| | (_| |  __/ |_  | |___| (_| | | (__| |_| | | (_| | || (_) | |   \n" +
						   " |____/ \\__,_|\\__,_|\\__, |\\___|\\__|  \\_____\\__,_|_|\\___|\\__,_|_|\\__,_|\\__\\___/|_|   \n" +
						   "                     __/ |                                                          \n" +
						   "                    |___/                                                           \n" +
						   "|----------------------------------------------------------------------------------|\n");

		ArrayList<String> expenses = new ArrayList<>();

		expenses.add("Netflix");
		expenses.add("Hulu");
		expenses.add("Disney+");

	    System.out.println(currentDate + "\n");
		System.out.println("CURRENT MONTLY EXPENSES: " + expenses);
		System.out.println("SAVINGS: " + savingsTotal);
		
		System.out.print("CURRENT INCOME: $");
		double income = scanner.nextDouble();
		double storeSavings = (income * savings);

		double dailyBudget = (income / 14) * .8;
		double weeklyBudget = (income / 2) * .8;
		String roundedBudget = decimalFormat.format(dailyBudget);
		String roundedWeek = decimalFormat.format(weeklyBudget);

		System.out.println("\n");
		System.out.println("RESULTS:\n");
		System.out.println("DAILY BUDGET: $" + roundedBudget);
		System.out.println("WEEKLY BUDGET: $" + roundedWeek);
		System.out.println("ADD TO SAVINGS: $" + storeSavings);
		System.out.println("NEW SAVINGS AMOUNT: $" + (storeSavings + savingsTotal));
	}
}