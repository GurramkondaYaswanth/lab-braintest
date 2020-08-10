package service;

public class PersonalityCalculator{

	public String  findYourBrainType(String options) {
		
		int[] array = findAnswers(options);
		int A = 0;
		int B = 0;
		int X = 0;
		String result = "";
		for(int i=0; i<20; i++) {
		if(i == 0 || i == 1 || i == 2 || i == 4 || i == 7 || i == 9 || i == 10 || i == 11 || i == 13 || i == 17 || i == 19) {
			A +=array[i];
		}
		else  {
			B +=array[i];
		}
		}
		X = 66 -A + B;
		
		if(X >19 && X < 56) {
			result = "leftbrained";
		}
		else if(X >=56 && X <= 64) {
			result = "noclearpreference";
		}
		else if(X >=65 && X <= 100) {
			result = "rightbrained";
		}
		return result;
	}
	
	public int[]  findAnswers(String options) {
		String[] str = options.split(",");
		int[] array = new int[str.length];
		for(int i=0;i<array.length;i++) {
			array[i] = Integer.parseInt(str[i]);
		}
		return array;
		
	}
}