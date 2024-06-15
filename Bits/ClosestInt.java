
public class ClosestInt {
	
	static final int NUM_UNSIGN_BITS= 64;

	public static void main(String[] args) {
		long ans= closestIntSameBitCount(4);
		System.out.println(ans);
	}

	private static long closestIntSameBitCount(long x) {
		for(int i=0; i<NUM_UNSIGN_BITS-1; ++i) {
			if((((x>>>i)&1)!= ((x>>>(i+1))&1))){
				x ^=(1L<<i)|(1L<<(i+1));
				return x;
			}
		}
		throw new IllegalArgumentException("All the bits are 0 or 1");
	}

}
