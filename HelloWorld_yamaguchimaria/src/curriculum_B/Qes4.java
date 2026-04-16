package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//4 for文を使用して下記の通りに出力してください
		for (int i = 1; i <= 9; i++) { // 段（縦）
			for (int j = 1; j <= 9; j++) { // 掛ける数（横）
				System.out.printf("%02d * %02d = %02d", i, j, i * j);// フォーマットを揃えて表示

				if (j != 9) {
					System.out.print(" || ");
				}
			}
			System.out.println(); // 改行
		}

	}
}
