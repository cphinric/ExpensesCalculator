import java.util.ArrayList;

class Calculator extends Expenses{
	static ArrayList<Expenses> expenses;

	public Calculator(String Name, int Month, int Day, int Year)
	{
		super(Name, Month, Day, Year);
		expenses = new ArrayList<Expenses>();
	}

	public void addExpenses(String Name, int Month, int Day, int Year)
	{
		
	}
}
