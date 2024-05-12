package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	
    public KatoTaro_Chapter17() {
        setGivenName();
    }
	
	//名を表すフィールドの値をセット
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
	
	//抽象メソッドに具体的な処理を記述
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}

}
