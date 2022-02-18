import java.util.Scanner;

class SmartCard
{
	int empid;
	public void MarkAttendance(Employee e)
	{
		empid = e.getEmpId();
		System.out.println("Employee" + empid + "is marked Present");
	}
	public int getEmpId(Employee e)
	{
		return e.empid;
	}
}

class Employee
{
	int empid;
	Employee()
	{
		System.out.println(" Enter Employee id");
		Scanner sc = new Scanner(System.in);
		this.empid = sc.nextInt();
	}
	int getEmpId()
	{
		return empid;
	}
	public void Login(SmartCard sc)
	{
		int eid = sc.getEmpId(this);
		System.out.println(" Login Successful for Employee " + eid);
	}
}

public class AssociationDemo
{
	public static void main(String args[])
	{
		System.out.println("ASSOCIATION BETWEEN EMPLOYEE AND SMARTCARD");
		Employee e = new Employee();
		System.out.println("NEW EMPLOYEE IS CREATED");
		SmartCard scd = new SmartCard();
		scd.MarkAttendance(e);
		e.Login(scd);
	}
}