package curriculum1_18;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void ptintMessage(String text, int number) {

		System.out.printf("%-12s %d%n", text, number);

	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void printSquaer(int num) {
		int result = num * num;
		System.out.println(result);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	public static void printSquare(double a, double b) {
		System.out.println(a + b);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] createRandomArray(int count) {

		int[] arr = new int[count];

		for (int i = 0; i < count; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			System.out.println(arr[i]);
		}

		return arr;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double printAverage(int[] arr) {

		int sum = 0;

		for (int num : arr) {
			sum += num;
		}

		double avg = (double) sum / arr.length;

		System.out.println(avg);

		return avg;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean checkAverage(double avg) {

		if (avg >= 50) {
			System.out.println(true);
			return true;
		} else {
			System.out.println(false);
			return false;
		}
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		ptintMessage("Hello JavaSE", 11);
		printSquaer(5);
		int[] numbers = { 1, 2, 3, 4, 5 };
		printArray(numbers);
		printSquare(2.5, 3.5);
		int[] randomNumbers = createRandomArray(5);
		double average = printAverage(randomNumbers);
		checkAverage(average);
	}

}
