package curriculum_B;

import java.util.Random;
import java.util.Scanner;
public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//1
		//ユーザー名を入力できるようにしてください
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		
		//ユーザー名の文字数が10文字より大きい場合「10文字以内にしてください」と出力してください
		if (username.length() > 10) {
        System.out.println("「名前を10文字以内にしてください」");
		}
		//ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		else if (username == null || username.isEmpty()) {
            System.out.println("「名前を入力してください」");
		} 
		//2 ユーザーが半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		 else if (!username.matches("^[a-zA-Z0-9]+$")) {
	            System.out.println("半角英数字のみで名前を入力してください");
	        }
        //ユーザー名が正常な値だった場合「ユーザー名「入力したユーザー名」を登録しました」と出力してください
	     else {
            System.out.println("ユーザー名「" + username + "」を登録しました");
        	
         //3名前を入力してくださいの入力方法が分からない　宣言するにも入力された宣言方法が不明
            int count = 0;          // じゃんけん回数
            boolean win = false;    // 勝ったかどうか

            Random random = new Random();
            // ===== じゃんけんループ（勝つまで） =====
            while (!win) {
                count++;

                System.out.print("じゃんけんの手を入力してください（0:グー 1:チョキ 2:パー）：");
                int myHand = scanner.nextInt();
                int enemyHand = random.nextInt(3);

                // 手を文字列に変換
                String[] hands = { "グー", "チョキ", "パー" };

                System.out.println(username + "の手は「" + hands[myHand] + "」");
                System.out.println("相手の手は「" + hands[enemyHand] + "」");

                // ===== 勝敗判定 =====
                if (myHand == enemyHand) {
                    System.out.println("DRAW あいこ もう一回しましょう！");

                } else if (
                    (myHand == 0 && enemyHand == 1) ||
                    (myHand == 1 && enemyHand == 2) ||
                    (myHand == 2 && enemyHand == 0)
                ) {
                    // 勝ち
                    System.out.println("やるやん。");
                    System.out.println("次は俺にリベンジさせて");
                    win = true;

                } else {
                    // 負け
                    System.out.println("俺の勝ち！");

                    if (enemyHand == 0) {
                        System.out.println("負けは次につながるチャンスです！");
                        System.out.println("ネバーギブアップ！");
                    } else if (enemyHand == 2) {
                        System.out.println("なんで負けたか、明日までに考えといてください。");
                        System.out.println("そしたら何か見えてくるはずです");
                    }
                }

                System.out.println();
            }

            // ===== 回数表示 =====
            System.out.println("勝つまでにかかった合計回数は" + count + "回です");  
            
         }
		scanner.close();
		     }
}
