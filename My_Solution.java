package misc;


public class main_misc {
	//private static long[][] cache = new long[999][999];//
    private static int[] cache = new int[999]; 
	
	public static void main(String[] args) {
		//
	int[]v = {7,14};
    System.out.println(canSum(300,v));
		
	
		
	}
	/*
	 * Solution based on the fact that every integer can be formed by : t = k*n + r
	 */
	private static int has_one(int[]v) {
		for(int i = 0;i < v.length;i++) {
			if(v[i] == 1) {
				return 1;
			}
		}
		return 0;
	}
	private static int div(int t,int k) {
		if(t % k == 0) {
			return 1;
		}
		else return 0;
	}
	private static int exists_div(int t,int[]v) {
		for(int i = 0;i < v.length;i++) {
			if(div(t,v[i]) == 1) {
				return 1;
			}
		}
		return 0;
	}
	private static int canSum(int t,int[]v) {
		//
		if(t < 0) {
			//avoid stack overflow
			return -1;
		}
		if(exists_div(t,v) == 1) {
			//if there is a multiple of t in v
			return 1;
		}
		if(cache[t] != 0){
			//i want my program to remember that this path do not lead to a solution
			return cache[t];//i expect return -1 here
		}
		for(int i = 0;i < v.length;i++) {
			int k = canSum(t-v[i],v);
			if(k == 1) {
				//true
				return 1;
			}
			cache[t] = k;
		}
		//false
		return -1;
	}
	
	}


	

	
	

