package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 1
		byte baito;
		short syoto;
		int intt;
		long nagai;
		float tannsei;
		double bai;
		char mozi;
		String moziretu;
		boolean buriann;


		// 2
		baito = 0;
		syoto = 0;
		intt = 0;
		nagai =0;
		tannsei = 0.0f;
		bai = 0.0;
		mozi = '\u0000';
		moziretu = "null";
		buriann = false;

		//3
		baito = 10;
		syoto =100;
		intt = 1000;
		nagai =10000;
		tannsei = 9.5f;
		bai = 10.5;
		mozi = 'a';
		moziretu = "ハロー";
		buriann = true;
		
		//4
		System.out.println(baito+syoto+intt+nagai);
		double sum = (baito + bai);
		int res = (int) sum;
		System.out.println(res);
		System.out.println(mozi+" "+moziretu+" "+buriann);
		System.out.println((int) (baito+syoto+intt+nagai+sum));
		System.out.println(baito*syoto*intt*nagai);
		System.out.println(bai/syoto);
		System.out.println(baito-syoto);
		
		//5
		String num="20";
		int num2 = Integer.parseInt(num);
		int num1=23;
		System.out.println("ハローJAVA"+(num2+num1));
		
		//6
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		
		//7
		double heightBmi = height/100;
		System.out.println("BMIは"+(double)Math.round(weight/(heightBmi*heightBmi))+"です");
		
		//8
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		
		heightBmi = height/100;
		bai = (weight/(heightBmi*heightBmi));
		double parm = bai;
		double expo=1;
	    double base=10;
	    double result=Math.pow(base,expo);
	    System.out.println("BMIは"+Math.round(parm*result)/result+"です");
		
		//9
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		age = age+age;
		height = height+height;
		weight = weight+weight;
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		
		heightBmi = height/100;
		bai = (weight/(heightBmi*heightBmi));
		double parma = bai;
		double expoa=1;
	    double basea=10;
	    double resulta=Math.pow(basea,expoa);
	    System.out.println("BMIは"+Math.round(parma*result)/resulta+"です");
		
		//10
	    boolean isOverage;
	    age = 24;
        isOverage = (age >= 25);
        System.out.println(isOverage);
        
        //11
        age = 24;
		height = 168.5;
		weight = 64.2;
		
		String age2 = String.valueOf(age);
		String height2 = String.valueOf(height);
		String weight2 = String.valueOf(weight);
		System.out.println(age2+height2+weight2);
		 
		//12
	    double db = Double.parseDouble(height2);
	    int height3 = (int)db;
		int age3 = Integer.parseInt(age2);
	    System.out.println(age3);
		System.out.println(height3);
		
		//13
		boolean isOverage1;
        isOverage1 = (age3 == 25 || height3 >= 160);
        System.out.println(isOverage1);
        
	 }}
	

