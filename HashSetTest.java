import java.util.*;
class HashSet
{
	public static void main(String args[])
	{
		HashSet<String> h = new HashSet<>();
		h.add("India is great");
		h.add("Jai Shri Krishna");
		System.out.println(h);
		System.out.println("HashSet contains India is great or not" + h.conatains("India is great "));
		Iterator<String> i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
		