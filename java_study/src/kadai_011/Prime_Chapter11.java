package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[] primeJudge = new boolean[101];
		for (int i = 2; i < primeJudge.length; i++) {
			primeJudge [i] = true;
			
		}
		
		for (int i = 2; i < primeJudge.length; i++) {
			if (primeJudge[i]) {
				for (int j = i * 2; j < primeJudge.length; j += i) {
					primeJudge[j] = false;
				}
			}
		}
		
		for (int i = 2; i < primeJudge.length; i++) {
			if (primeJudge [i]) {
				System.out.println(i);
			}
		}
	}

}
