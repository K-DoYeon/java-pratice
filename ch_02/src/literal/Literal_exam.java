package literal;

public class Literal_exam {

	public static void main(String[] args) {
		char var = 'A';
		System.out.println(var);
		char var1 = '가';
		System.out.println(var1);
		
		System.out.println('\t' + "들여쓰기");
		System.out.println("대한" + '\\' + "민국");
		
		  /*
		  자바에서 텍스트는 작은 따옴표로 묶은 하나의 문자 리터럴로 간주한다. 'A','가'
		  문자는 '' 문자열은 ""
		  문자 리터럴을 저장할 수 없는 타입은 char이다.
		  문자리터럴 중에 이스케이프 문자(역슬레쉬(\)가 붙은 문자)는 특수용도로 사용된다. : '\t' 수평탭, '\n'줄바꿈, '\r'리턴 '\'', '\ u16진수'16진수에 해당하는 유니코드
		  
		  정수형
		  최상위 부호 비트가 1이면 음수 0이면 양수
		  1byte = 8bit 2의 8승인데 첫번째는 부호여서 2의7승~2의7승-1(-128~127)
		  char,short = 2byte  char = 16bit 0~2의16승-1 , short = -2의 15승 ~ 2의 15승 -1
		  int (기본형) = 4byte = 32bit -2의 31승 ~ 2의 31승 -1
		  long = 8byte = 64bit -2의 63승 ~ 2의 63승 -1
		  
		  실수형
		  float = 4byte 1bit부호+8bit지수+23bit가수 -> float var = 3.14f (실수 기본형이 double이기 때문에 float타입에 대입하고 싶다면 리터럴 뒤에 f,F를 붙인다.)
		  double(기본형) = 8byte 1bit부호+11bit지수+52bit가수
		  
		  논리형
		  Boolean = true,false
		  
		  문자열 
		  String(참조타입) -> ""
		  char -> '' char va1 = "가" x , char var1 = '가' o string va1 = "가" o
		  
		  ex) byte a =127; a++; -> -128 / byte b = -128; b--; -> 127
		  
		  char : 한 문자를 unicode로 저장
		  1. 세계 각국의 문자를 2yte(0~65535)로 매칭한 국제 표준 규격
		  2. 0 ~ 127 : 아스키문자(특수기호, 숫자, 영어)
		   	 44032 ~ 55203 : 한글
		  문자 != 문자열
		  문자 = char 문자열 = string ex) char name ='홍'; string names = "홍길동";
		  
		  char emp =''; //error
		  char emp = ' '; //가능
		  string empt = ""; //가능
		  */
		
	}

}
