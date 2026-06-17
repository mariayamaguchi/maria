package question27;

import java.util.Scanner;
public class Main {
	
 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("コンソールに文字を入力してください");

	        String input = scanner.nextLine();

	        // 動物ごとに分割
	        String[] animals = input.split(",");

	        for (String animal : animals) {

	            // 名前:体長:速度 に分割
	            String[] data = animal.split(":");

	            String name = data[0];
	            String length = data[1];
	            String speed = data[2];

	            String scientificName;

	            switch (name) {
	            case "ライオン":
	                scientificName = "パンテラ レオ";
	                break;

	            case "ゾウ":
	                scientificName = "ロキソドンタ・サイクロティス";
	                break;

	            case "パンダ":
	                scientificName = "アイルロポダ・メラノレウカ";
	                break;

	            case "チンパンジー":
	                scientificName = "パン・トゥログロディテス";
	                break;

	            case "シマウマ":
	                scientificName = "チャップマンシマウマ";
	                break;

	            default:
	                scientificName = "不明";
	                break;
	            }

	            System.out.println("動物名：" + name);
	            System.out.println("体長：" + length + "m");
	            System.out.println("速度：" + speed + "km/h");
	            System.out.println("学名：" + scientificName);
	            System.out.println();
	        }

	        scanner.close();
	    }
	}

/*
	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
	コンソール出力結果
	
	コンソールに文字を入力してください
	動物名：ライオン
体長：2.1m
速度：80km/h
学名：パンテラ レオ

動物名：ゾウ
体長：3.2m
速度：40km/h
学名：ロキソドンタ・サイクロティス

動物名：パンダ
体長：1.9m
速度：30km/h
学名：アイルロポダ・メラノレウカ

動物名：チンパンジー
体長：0.94m
速度：25km/h
学名：パン・トゥログロディテス

動物名：シマウマ
体長：2.4m
速度：65km/h
学名：チャップマンシマウマ

動物名：インコ
体長：0.1m
速度：50km/h
学名：不明
*/
