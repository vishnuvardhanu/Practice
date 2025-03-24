import java.util.*;
public class StringPractice {
	public static int cnVowels(String s)
	{
		s=s.toLowerCase();
		int cn=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
				cn++;
		}
		return cn;
	}
	public static int wordCount(String s)
	{
		s=s.trim();
		String[] arr = s.split(" ");
		int cn=0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i].length()!=0)
				cn++;
		}
		return cn;
		
		
		// return s.split(" ").length; it will work if words have single space between them
	}
	public static int wc(String s)
	{
		int cn=0;
		s=s.trim();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch==' '&& s.charAt(i+1)!=' ')
				cn++; 
		}
		return cn+1;
	}
	public static String reverse(String s)
	{
		String st = "";
		for(char ch:s.toCharArray())
		{
			st=ch+st;
		}
		return st;
	}
	public static String reverseWord(String s)
	{
		String arr[] = s.split(" ");
		String rev="";
		for(int i=0;i<arr.length;i++)
		{
			rev+=reverse(arr[i])+" ";
		}
		return rev.trim();
	}
	public static void sbuf()
	{
		/* 
		 * append(String s)	Appends the given string to the existing sequence.
			insert(int offset, String s)	Inserts the given string at the specified index.
			replace(int start, int end, String s)	Replaces characters between start and end indices with the given string.
			delete(int start, int end)	Deletes characters between start and end indices.
			reverse()	Reverses the characters in the sequence.
			capacity()	Returns the current capacity of the buffer.
			ensureCapacity(int minCapacity)	Increases the buffer capacity if needed.
			charAt(int index)	Returns the character at the specified index.
			setCharAt(int index, char ch)	Replaces the character at the specified index.
			substring(int start)	Returns a substring from the given start index.
			substring(int start, int end)	Returns a substring from the given start to end index.
		 * */
	}
	
	public static void sbil()
	{
		
	}
	
	public static String Capitalize(String s)
	{
		String arr[] = s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
//			String cap = arr[i].substring(0,1);
//			String sub = arr[i].substring(1);
//			arr[i]=cap.toUpperCase()+sub;
			arr[i]=arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
		}
		return Arrays.toString(arr);
	}
	
	public static String charCount2(String s)
	{
		int arr[] = new int[26];
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			arr[ch-'a']++;
		}
		String res="";
		String prev="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			int cn = arr[ch-'a'];
			if(prev.isEmpty() || !prev.equals(ch+""))
			{
				res+=(""+ch+cn);
			}
			prev=ch+"";
		}
		return res;
	}
	
	public static String charCount(String s)
	{
		HashMap<Character,Integer> hs = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			hs.put(ch, hs.getOrDefault(ch, 0)+1);
		}
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(hs.containsKey(ch))
			{
				res=res+(""+ch+hs.get(ch));
				hs.remove(ch);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();
		System.out.println(charCount2(s));
		sc.close();
	}
}
