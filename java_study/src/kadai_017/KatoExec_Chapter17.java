package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		Kato_Chapter17 taro = new KatoTaro_Chapter17();
		Kato_Chapter17 ichiro = new KatoIchiro_Chapter17();
		Kato_Chapter17 hanako = new KatoHanako_Chapter17();
		
        taro.execIntroduce();
        System.out.println();  
        ichiro.execIntroduce();
        System.out.println();
        hanako.execIntroduce();
	}

}
