public class Ex1_02 {
	public static void main(String[] args) {

         int sum =0;
		for(int i = 1; i<=10; i++) {
			if( i%2 == 0) {
				sum+=i;
			}
		}//for()
		System.out.println( " 2의 배수 총합 = " + sum );
	}//main
}
