package stringConcept;

public class StringManupulation {
	
	public static void main(String[] args) {
		//String creation
		//String Literal
		String s="Selenium";
		//Using new keyword
		String s1=new String("Geekforgeeks");
		
		//length
		int len=s.length();
		System.out.println(len);
		//char At()
		System.out.println(s.charAt(3));
		//subString()
		System.out.println(s.substring(3));
		System.out.println(s.substring(1, 3));
		System.out.println(s.subSequence(2, 3));
		System.out.println(s.concat(s1));
		String s2="Learn Share Share";
	    System.out.println(s2.indexOf("Share"));
	    System.out.println(s2.indexOf("Share", 6));
	    String s3="  Trim";
	    System.out.println(s3.trim());
	    System.out.println(s.replace("1", "Java"));
	   System.out.println(s.replace("Java", "ava"));
	   System.out.println(s1.replace("e", "Java"));
	   //StringBuilder
	   String s4="Maneesh Kumar Mishra";
	   StringBuilder sb=new StringBuilder(s4);
	   System.out.println(sb.reverse());
	   
	   StringBuilder sb1=new StringBuilder("Selenium");
	   System.out.println(sb1.reverse());
	   String s5="231245545";
	  String s6= s5.replace("\\BNK", "");
	   System.out.println(s6);
	}

}
