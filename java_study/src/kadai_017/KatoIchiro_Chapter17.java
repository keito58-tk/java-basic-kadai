package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17{
	
    public KatoIchiro_Chapter17() {
        setGivenName();
    }
	
	//名を表すフィールドの値をセット
	public void setGivenName() {
		this.givenName = "一郎";
	}
	
	
	public static void main(String[] args) {
		//KatoIchiro_Chapter17クラスのオブジェクトを作る
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		ichiro.eachIntroduce();
	}
	
	//抽象メソッドに具体的な処理を記述
	void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}

}
