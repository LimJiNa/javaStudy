package sec07.exam02_method;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "È«±æµ¿/ÀÌ¼öÈ«/¹Ú¿¬¼ö";

		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		System.out.println(countTokens);
		System.out.println("");

		for (int i = 0; i < countTokens; i++) {
			System.out.println(st.nextToken());
		}
		System.out.println("");
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
