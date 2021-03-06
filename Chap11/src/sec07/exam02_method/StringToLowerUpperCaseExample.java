package sec07.exam02_method;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.equals(str2));
		System.out.println("");

		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println("");

		String upperStr1 = str1.toUpperCase();
		String upperStr2 = str2.toUpperCase();
		System.out.println(upperStr1.equals(upperStr2));
		System.out.println(upperStr1);
		System.out.println(upperStr2);
		System.out.println("");
		
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
