class SingleTon{ //싱글톤 객체 생성법 => 단 하나의 객체만 생성한다. 
	private static SingleTon singleTon = new SingleTon();
	
	private SingleTon() {} // 생성자를 외부클래스에서 접근 못하게 한다.
	
	public static SingleTon getInstance(){
    return singleTon;
 }

}
//final 정의 인스턴스 변수는 상수다. 

public class ConsTest17 {
	public static void main(String[] args) {

//    SingleTon obj1 = new SingleTon();
	  SingleTon obj01 = SingleTon.getInstance();//싱글톤 객체 반환
	  SingleTon obj02 = SingleTon.getInstance();//같은 주소를 공유해서 사용한다 
	  
	  if(obj01==obj02) { // 객체 주소값 비교 
		  System.out.println("같은 객체주소이다.");
	  }else {
		  System.out.println("다른 객체 주소 ");
	  }
	  
	}
}
