package kadai_024;

import java.util.HashMap;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		
		
		HashMap<String, String> jankenMap = new HashMap<>();
		jankenMap.put("r", "グー");
		jankenMap.put("s", "チョキ");
		jankenMap.put("p", "パー");
		
		jyanken.playGame(jankenMap);
	}

}
