package kadai_017;

public abstract class Kato_Chapter17 {
	//姓フィールド
	public String familyName = "加藤";
	
	//名フィールド
	public String givenName;// 子クラスで初期化される
	
	//住所フィールド
	public String address = "東京都中野区〇×";
	
	//共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	//個別の紹介を出力する(抽象メソッド)
	abstract void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}



}
