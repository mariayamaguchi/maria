package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		  // 人数入力
        System.out.print("生徒の人数を入力してください（2以上）：");
        int n = scanner.nextInt();

        // 配列
        int[][] scores = new int[n][4]; // 英語, 数学, 理科, 社会
        String[] subjects = {"英語", "数学", "理科", "社会"};

        // ===== 入力 =====
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print((i + 1) + "人目の「" + subjects[j] + "」の点数を入力してください：");
                scores[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        // ===== 各生徒の平均 =====
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += scores[i][j];
            }
            double avg = sum / 4;
            System.out.println((i + 1) + "人目の平均点は" + avg + "点です。");
        }

        System.out.println();

        // ===== 各教科の平均 =====
        for (int j = 0; j < 4; j++) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += scores[i][j];
            }
            double avg = sum / n;
            System.out.println(subjects[j] + "の平均点は" + avg + "点です。");
        }

        // ===== 全体平均 =====
        double total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                total += scores[i][j];
            }
        }

        double overallAvg = total / (n * 4);
        System.out.println("全体の平均点は" + overallAvg + "点です。");

scanner.close();
     }
	}

