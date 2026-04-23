package puestion1_19;

public class Dog {
	public static final char[] Dog = null;

	// Q1：フィールドに動物の名前の変数を定義してください。
	String animal;

	// Q2：フィールドに動物の数の変数を定義してください。
	int animalCount;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	 public Dog() {
	        this.animal = "犬";
	    }
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	 public Dog(int count) {
	        this.animalCount = count;
	    }

	    public static void main(String[] args) {

	        
	        Dog dog1 = new Dog();
	        System.out.println(dog1.animal);

	       
	        Dog dog2 = new Dog(3);
	        System.out.println(dog2.animalCount);
	    }
	}
