package kadai_024;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter24 {

		//自分のじゃんけんの手を入力する
		public String getMyChoice() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String myChoice = scanner.next();
			
			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				System.out.println(myChoice);
			} else {
				System.out.println("無効な選択です。r、s、またはpを入力してください");
				scanner.close();
			}
			return myChoice;
		}
		
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		Random random = new Random();
		String[] choices = {"r", "s", "p"};
		int randomNumber = (int) Math.floor(random.nextDouble() * 3);
		return choices[randomNumber];
	}
	
	//じゃんけんを行う
	public void playGame(HashMap<String, String> jankenMap) {
		String myChoice = getMyChoice();
		String opponentChoice = getRandom();
		
		System.out.println("自分の手は" + jankenMap.get(myChoice) + "," + "対戦相手の手は" + jankenMap.get(opponentChoice));
		
		if (myChoice.equals(opponentChoice)) {
			System.out.println("あいこです");
		} else if ( (myChoice.equals("r") && opponentChoice.equals("s") ) ||
				    (myChoice.equals("s") && opponentChoice.equals("p") ) ||
				    (myChoice.equals("p") && opponentChoice.equals("r") ) ){
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	
	}
}
