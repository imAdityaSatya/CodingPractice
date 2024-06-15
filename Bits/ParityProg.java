
public class ParityProg {
	
	public static short parity(long x) {         
		short res=0;
		while(x!=0) {
			res ^= (x&1);
			x >>>= 1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		long x = 211;
		System.out.println(parity(x));
	
	}
}