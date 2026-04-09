package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//5 20まで
	       for (int i = 1; i <= 9; i++) {        // 段（縦）
		   for (int j = 1; j <= 20; j++) {    // 掛ける数（横）
		   System.out.printf("%03d * %03d = %03d", i, j, i * j);// フォーマットを揃えて表示

		        if (j != 20) {
		                System.out.print(" || ");
		                }}
		            System.out.println();
	}

}}
