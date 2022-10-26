public class RomanToInt {

	public static void main(String[] args) {
		String s = "MMCDXXV";
		System.out.println(romanToInt1(s));
	}
	
	public static int romanToInt(String s)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
       int sum = 0;
       int length = s.length();

       for(int i = 0; i < s.length() - 1; i++)
       {
           if(map.get(s.charAt(i+1)) > map.get(s.charAt(i)))
           {
           	sum += map.get(s.charAt(i+1)) - map.get(s.charAt(i)); 
           	i++;
           }
           else
           {
           	sum += map.get(s.charAt(i));
           }
           
       }
       if(length > 1)
       {
           sum = map.get(s.charAt(length-2)) >= map.get(s.charAt(length-1))? sum + map.get(s.charAt(length-1)) : sum;
       }
       else
       {
           sum = map.get(s.charAt(length-1));
       }
		return sum;
	}
}
