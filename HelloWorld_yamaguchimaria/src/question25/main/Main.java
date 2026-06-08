package question25.main;

import java.util.Scanner;

import question25.clas.Hero;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("名前を入力してください：");
		String name = scanner.nextLine();

		Hero hero = new Hero(name);

		System.out.println();
        System.out.println("こんにちは 「" + hero.getName() + "」さん");
        System.out.println("ステータス");

		hero.showStatus();

		System.out.println();
		System.out.println("さあ冒険に出かけよう！");

		scanner.close();
	}

}

//名前を入力したら下記がコンソールに出力されるように作ってください
//条件：数値は毎回変わるように作ってください
//サブクラスを使用してください
//スーパークラスを使用してください
//getterとsetterを使用してください
//packageを2つ作ってメインと処理を分けてください
//命名する場合は規則にのっとってください
//コンストラクタを使用してください

//こんにちは 「 名前 」 さん
//ステータス
//HP：849
//：862
//攻撃力：375
//素早さ：937
//防御力：24

//さあ冒険に出かけよう！
