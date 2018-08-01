
public class Worker extends Human implements Comparable<Worker>{
	public Integer wage;
	public int hoursWorked = 0;

	public Worker(String firstName, String lastName, int wage) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.wage = wage;
	}
	
	public String calculateHourlyWage(){
		int wageRate = this.hoursWorked * this.wage;
		return String.format("Hourly wage: %d", wageRate);
	}
	
	@Override
	public int compareTo(Worker otherWorker) {
		// TODO Auto-generated method stub
		return this.wage.compareTo(otherWorker.wage);
	}
	
	@Override
	public String toString() {
		return String.format("Worker ID: %s, Wage: %d", this.hashCode() ,this.wage);
	}
}
