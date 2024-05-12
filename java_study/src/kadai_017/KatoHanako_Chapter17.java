package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17{
	
    public KatoHanako_Chapter17() {
        setGivenName();
    }
	
	//名を表すフィールドの値をセット
	public void setGivenName() {
		this.givenName = "花子";
	}
	
	public static void main(String[] args) {
		//KatoTaro_Chapter17クラスのオブジェクトを作る
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		hanako.eachIntroduce();
	}
	
	//抽象メソッドに具体的な処理を記述
	void eachIntroduce() {
		System.out.println("趣味は読書です");
	}


}
