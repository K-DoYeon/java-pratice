package ch02;

public class String02 {

	public static void main(String[] args) {
		
		String str1 = "" +
				"{\n \t \"id\" : \"winter\" , \n" + 
				"\t \"name\" : \"눈송이\" \n" +
				"}";
		System.out.println(str1);
		
		//자바 13부터 텍스트블록 문법이 제공됨 """ ㄹㄴㄹㅇㅁㄷㅎㅎㅇ """
		//자바 14부터 텍스트 블록 안에 \를 쓰면 줄바꿈이 되지 않는다.
		String str2 = """
				{
					"id" : "winter", \
					"name" : "눈송이"
					}
				""";
		
		System.out.println(str2);

	}

}
