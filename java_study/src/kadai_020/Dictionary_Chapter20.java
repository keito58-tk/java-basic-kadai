package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	private HashMap<String, String> fruits;

	
	public Dictionary_Chapter20() {
		// インスタンス作成時に辞書を初期化
        fruits = new HashMap<>();
	
	fruits.put("apple", "りんご");
	fruits.put("peach", "桃");
	fruits.put("banana", "バナナ");
	fruits.put("lemon", "レモン");
    fruits.put("pear", "梨");
    fruits.put("kiwi", "キウィ");
    fruits.put("strawberry", "いちご");
    fruits.put("grape", "ぶどう");
    fruits.put("muscat", "マスカット");
    fruits.put("cherry", "さくらんぼ");
	}
	
	//英単語を検索して意味を返すメソッド
	public void searchWord(String[] words) {

		for( String word : words) {
			
		if (fruits.containsKey(word)) {
			System.out.println(word + "の意味は" + fruits.get(word));
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
		
	}	

}
