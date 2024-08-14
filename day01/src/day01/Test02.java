package day01;

public class Test02 {
	public static void main(String[] args) {
		// escape 문자 \n newline 새로운 줄로 이동 \t tab탭 크기만큼 이동
		// \" -> "출력함 \\-> \출력함
	System.out.println( "안\n녕\n하" );
	System.out.println( "1\t1234567\t12345678\t" );
	System.out.println( "이름\t나이" );
	System.out.println( "홍길동\t20살" );
	
	System.out.println( "\" \\" );
	// ""한쌍 "를 문자로 쓰고 싶을땐 \붙이기
	// \또한 문자로 쓰고 싶을때 앞에 \붙이기
	// 띄어쓰기가 있는 경우 ""안에 쓰기
	
	System.out.println( "==============" );
	System.out.println( 100 + 100 );
	System.out.println( "100 + 100" );
	System.out.println( "백" + 1234 );
	// 문자가 하나라도 섞여있으면 +는 붙여주는 역활
	System.out.println( "백" + (100 + 100) );
	// 먼저 연산해야 하는 경우 ()
	
	System.out.println("===========================================");
	System.out.println("이름\t나이\t전화번호\t\t회비");
	System.out.println("===========================================");
	System.out.println("홍길동\t\"15\"\t3672-1234\t\\20000");
	System.out.println("홍길동\t\"15\"\t3672-1234\t\\30000");
	System.out.println("고길동\t\"15\"\t3672-1234\t\\50000");
	System.out.println("-------------------------------------------");
	System.out.println("총합");
	System.out.println("-------------------------------------------");
	
	
	
	}
}
