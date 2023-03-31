package misc;


public class main_misc {
	//private static long[][] cache = new long[999][999];//
    private static int[] cache = new int[999]; 
	
	public static void main(String[] args) {
		
		//
		int[]v = {7,14};
	    System.out.println(canSum(300,v));
		
	}
	private static int canSum(int t,int []v){
		//-1 is false and 1 is true
		if(t == 0) {
			return 1;
		}
		if(cache[t] != 0) {
			//check if this path is "bad"
			return -1;
		}
		for(int i = 0;i < v.length;i++) {
			//test every iteration
			if(t-v[i] >= 0 && canSum(t-v[i],v) == 1) {
				cache[t] = 1;
				return 1;
			}
		}
		//if you have tested everything then its false
		cache[t] = -1;//My program just have to remember if this path is "bad";
		return -1;
	
		
	}
	
	}


	

	
	

