package newYear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class License {
	public static String licenseKeyFormatting(String S, int K) {
		String tem = "";
		String res = "";
		String[] aStrings = S.split("-");
		for (int i = 0; i < aStrings.length; i++) {
			tem += aStrings[i];
		}
		int num = 0;
		for (int i = tem.length() - 1; i >= 0; i--) {
			if (num % K == 0 && num != 0) {
				res = '-' + res;
			}
			res = Character.toUpperCase(tem.charAt(i)) + res;
			num++;
		}
		return res;

	}

	public static void main(String args[]) {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// try {
		// String str = br.readLine();
		// System.out.println(License.licenseKeyFormatting(str, K));
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		String S = "2-4A0r7-4k";
		int K = 3;
		System.out.println(License.licenseKeyFormatting(S, K));
	}
}