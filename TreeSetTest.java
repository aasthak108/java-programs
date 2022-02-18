import java.util.*;
class TreeSetTest
{
	public static void main(String args[])
	{
		TreeSet<String> ts= new TreeSet<>();
		ts.add("A");
		ts.add("B");
		ts.add("D");
		ts.add("C");
		System.out.println("Tree set" + ts);
		System.out.println("TreeSet conatins A or not" + ts.contains("A"));
	}
}