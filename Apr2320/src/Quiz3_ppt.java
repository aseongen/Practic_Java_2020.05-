
public class Quiz3_ppt {
	public static void main(String[] args) {
//잘못된 문장을 고쳐서 에러가 발생하지 않도록 수정하시오 
		
		byte var1 =127;
		short var2 =128;
		int var3 = 128;
		long var4 = 128L;
		
		var4 = var1;
		System.out.println(var1+ "," + var2);
	    var1 = (byte)var3;
	    System.out.println(var1 + "," + var3);
		
	    float var5 = 123456.789123f;
	    double var6 = 123456.789123;
	    
	    var5 = (float)var6;
	    System.out.println(var5+ ","+var6);
	    var6 = var5;
	    System.out.println(var5 + "," + var6);
	}
}
