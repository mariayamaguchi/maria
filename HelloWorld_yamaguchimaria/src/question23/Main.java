package question23;

public class Main {
	public static void main(String[] args) {

		Theme2 animal = new Theme2();

		// 値を入れる
		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);

		// 取得して表示
		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getLength() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}
}
