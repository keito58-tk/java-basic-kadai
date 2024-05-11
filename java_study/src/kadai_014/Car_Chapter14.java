package kadai_014;

public class Car_Chapter14 {
	// フィールド　（内部データ）
	private int gear = 1; // 初期ギアは1	
	private int speed = 10; // 	初期速度は時速10km
	// コンストラクタ　（初期化処理）
	public Car_Chapter14 ( int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
		
		System.out.println("【ギアデータ生成】" + this.gear);
		System.out.println("【ギアの速度データ生成】" + this.speed);
	}
	
	public Car_Chapter14() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
    // ギアの値により速度を変えるメソッド
	public void gearChange(int afterGear) {
        // ギアの変更前の状態を表示
		System.out.println("ギア" + this.gear+ "から" + afterGear + "に切り替えました");
		
		this.gear = afterGear;
		switch (gear) {
		case 1:
			this.speed = 10;
			break;
		case 2:
			this.speed = 20;
			break;
		case 3:
			this.speed = 30;
			break;
		case 4:
			this.speed = 40;
			break;
		case 5:
			this.speed = 50;
			break;

		default:
			this.speed = 10;
		}
		
		run(); // 速度表示のためにrunメソッドを呼び出す
	}
	
	
    // 現在の速度を表示するメソッド
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
	
}
