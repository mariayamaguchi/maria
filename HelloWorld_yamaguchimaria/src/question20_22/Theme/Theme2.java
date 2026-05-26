package question20_22.Theme;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Theme2 {

    // フィールド
    private String country;
    private String food;
    private String category;

    // コンストラクタ（this使用）
    public Theme2(String country, String food, String category) {
        this.country = country;
        this.food = food;
        this.category = category;
    }

    // 出力処理
    public void printMessage() {

        System.out.println("こんにちは！ここは" + this.country + "です！");
        System.out.println("この" + this.food + "はうまい");
        System.out.println(this.food + "は" + this.category + "です");

        // 現在日時
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        System.out.println("今の現在日時は" + now.format(formatter) + "です");
    }
}
	
	//下記がコンソールに出力されるように作成してください
	
	
	//こんにちは！ここは日本です！
//	この寿司はうまい
//	寿司は和食です
//	今の現在日時は2023/03/09 10:23:39です
//
//【条件】
//	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
//	・適切なファイルにフィールドで変数を必要な数作ってください。
//	・thisを使って作成してください。
//	・日時は今日の日付を取得してください。
//	
//*/
