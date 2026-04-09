package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		//6 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
	     String[] items = input.split("、\s*"); // カンマ区切り
	        Random rand = new Random();

	        for (int i = 0; i < items.length; i++) {

	            String item = items[i];
	            int stock;

	            switch (item) {
	                case "パソコン":
	                case "冷蔵庫":
	                case "扇風機":
	                case "洗濯機":
	                case "加湿器":
	                    stock = rand.nextInt(11); // 0〜10
	                    System.out.println(item + "の残り台数は" + stock + "台です");
	                    break;

	                case "テレビ":
	                case "ディスプレイ":
	                    stock = rand.nextInt(11) + 1; // 1〜11
	                    System.out.println(item + "の残り台数は" + stock + "台です");
	                    break;

	                default:
	                    System.out.println("『" + item + "』は指定の商品ではありません");
	                    break;
	            }
	        }
	        scanner.close();
    }

	}


