package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	
    public KatoTaro_Chapter17() {
        setGivenName();
    }
	
	//名を表すフィールドの値をセット
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
	public static void main(String[] args) {
		//KatoTaro_Chapter17クラスのオブジェクトを作る
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		taro.eachIntroduce();
	}
	
	//抽象メソッドに具体的な処理を記述
	void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}

}
