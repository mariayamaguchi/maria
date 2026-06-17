package question29.main;

import java.util.Scanner;

import question29.ken.Ken;

public class Main {

	public static void main(String[] args) {

		Ken[] ken = {
				new Ken("北海道", "札幌市", 83424),
				new Ken("青森県", "青森市", 9646),
				new Ken("岩手県", "盛岡市", 15275),
				new Ken("宮城県", "仙台市", 7282),
				new Ken("秋田県", "秋田市", 11638),
				new Ken("山形県", "山形市", 9323),
				new Ken("福島県", "福島市", 13784),
				new Ken("茨城県", "水戸市", 6097),
				new Ken("栃木県", "宇都宮市", 6408),
				new Ken("群馬県", "前橋市", 6362),
				new Ken("埼玉県", "さいたま市", 3798)
		};

		Scanner scanner = new Scanner(System.in);

		System.out.println("番号を入力してください（例:8,5,9）");
		String input = scanner.nextLine();

		System.out.println("昇順なら 昇、降順なら 降 を入力してください");
		String sort = scanner.nextLine();

		String[] numbers = input.split(",");

		Ken[] selected = new Ken[numbers.length];

		// 選択された都道府県を配列に格納
		for (int i = 0; i < numbers.length; i++) {
			int index = Integer.parseInt(numbers[i]);
			selected[i] = ken[index];
		}

		// ソート
		for (int i = 0; i < selected.length - 1; i++) {
			for (int j = i + 1; j < selected.length; j++) {

				if (sort.equals("昇")) {

					if (selected[i].getArea() > selected[j].getArea()) {
						Ken temp = selected[i];
						selected[i] = selected[j];
						selected[j] = temp;
					}

				} else if (sort.equals("降")) {

					if (selected[i].getArea() < selected[j].getArea()) {
						Ken temp = selected[i];
						selected[i] = selected[j];
						selected[j] = temp;
					}

				}
			}
		}

		// 出力
		for (int i = 0; i < selected.length; i++) {

			System.out.println();
			System.out.println("都道府県名：" + selected[i].getPrefecture());
			System.out.println("県庁所在地：" + selected[i].getCity());
			System.out.println("面積：" + selected[i].getArea() + "km2");
		}

		scanner.close();
	}
}

//	0, "北海道:札幌市:83424"
//1, "青森県:青森市:9646"
//2, "岩手県:盛岡市:15275"
//3, "宮城県:仙台市:7282"
//4, "秋田県:秋田市:11638"
//5, "山形県:山形市:9323"
//6, "福島県:福島市:13784"
//7, "茨城県:水戸市:6097"
//8, "栃木県:宇都宮市:6408"
//9, "群馬県:前橋市:6362"
//10, "埼玉県:さいたま市:3798"
//	
//	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
//	都道府県がソートされてコンソールに出力されるように作ってください
//	※Packageを2つ作ってください
//	※複数選択できるようにしてください
//	
//	例:
//	8,5,9,.....
//	と入力された場合（昇順）
//	
//	都道府県名：山形県
//県庁所在地：山形市
//面積：9323.0km2
//	
//	都道府県名：栃木県
//県庁所在地：宇都宮市
//面積：6408.0km2
//
//	都道府県名：群馬県
//県庁所在地：前橋市
//面積：6362.0km2
