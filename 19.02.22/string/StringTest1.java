package string;

public class StringTest1 {

	public static void main(String[] args) {
		
//		남궁성 자바의 정석 468~471page 를 참고하시오
		
//		1번째
		
		String s = new String("Hello");
		
		System.out.println("1번째");
		System.out.println(s);
		System.out.println();
		
//		2번째
		char[] c = {'H','e','l','l','o'};

		String s2 = new String(c);
		
		System.out.println("2번째");
		System.out.println(s2);
		System.out.println();
		
//		3번째
		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb);
		
		System.out.println("3번째");
		System.out.println(s3);
		System.out.println();
		
//		4번째
		String s4 = "Hello";
		String n = "0123456";
		
		char c2 = s4.charAt(1);
		char c3 = n.charAt(1);
		
		System.out.println("4번째");
		System.out.println("1번째 : " + c2 + "\n2번째 : " + c3);
		System.out.println();
		
//		5번째
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		
		System.out.println("5번째");
		System.out.println("1번째 : " + i + "\n2번째 : " + i2 + "\n3번째 : " + i3);
		System.out.println();
		
//		6번째
		String s5 ="Hello";
		String s6 = s5.concat(" World");
		
		System.out.println("6번째");
		System.out.println(s6);
		System.out.println();
		
//		7번째
		String s7 = "abcedfg";
		boolean b = s7.contains("ac");
		
		System.out.println("7번째");
		System.out.println(b);
		System.out.println();
		
//		8번째
		String file = "Hello.txt";
		boolean b2 = file.endsWith("txt");
		
		System.out.println("8번째");
		System.out.println(b2);
		System.out.println();
		
//		9번째
		String s8 = "Hello";
		boolean b3 = s8.equals("Hello");
		boolean b4 = s8.equals("hello");
		
		System.out.println("9번째");
		System.out.println("1번째 : " + b3 + "\n2번째 : " + b4);
		System.out.println();
		
//		10번째
		String s9 = "Hello";
		boolean b5 = s9.equalsIgnoreCase("Hello");
		boolean b6 = s9.equalsIgnoreCase("hello");
		
		System.out.println("10번째");
		System.out.println("1번째 : " + b5 + "\n2번째 : " + b6);
		System.out.println();
		
//		11번째	
		String s10 = "Hello";
		int idx1 = s10.indexOf('o');
		int idx2 = s10.indexOf('k');
		
		System.out.println("11번째");
		System.out.println("1번째 : " + idx1 + "\n2번째 : " + idx2);
		System.out.println();
		
//		12번째
		String s11 = "Hello";
		int idx3 = s11.indexOf('e', 0);
		int idx4 = s11.indexOf('e', 2);
		
		System.out.println("12번째");
		System.out.println("1번째 : " + idx3 + "\n2번째 : " + idx4);
		System.out.println();
		
//		13번째
		String s12 = "ABCDEFG";
		int idx5 = s12.indexOf("CD");
		
		System.out.println("13번째");
		System.out.println("1번째 : " + idx5);
		System.out.println();
		
//		14번째		
		String s13 = new String("abc");
		String s14 = new String("abc");
		boolean b7 = (s13 == s14);
		boolean b8 = s13.equals(s14);
		boolean b9 = ( s13.intern() == s14.intern() );
		
		System.out.println("14번째");
		System.out.println("1번째 : " + b7 + "\n2번째 : " + b8 + "\n3번째 : " + b9);
		System.out.println();
		
//		15번째
		String s15 = "java.lang.Object";
		int idx6 = s15.lastIndexOf('.');
		int idx7 = s15.indexOf('.');
		
		System.out.println("15번째");
		System.out.println("1번째 : " + idx6 + "\n2번째 : " + idx7);
		System.out.println();
		
//		16번째
		String s16 = "java.lang.java";
		int idx8 = s16.lastIndexOf("java");
		int idx9 = s16.indexOf("java");
		
		System.out.println("16번째");
		System.out.println("1번째 : " + idx8 + "\n2번째 : " + idx9);
		System.out.println();
		
//		17번째
		String s17 = "Heloo";
		int length = s17.length();
		
		System.out.println("17번째");
		System.out.println(length);
		System.out.println();
		
//		18번째
		String s18 = "Heloo";
		String s19 = s18.replace('H', 'C');
		
		System.out.println("18번째");
		System.out.println(s19);
		System.out.println();
		
//		19번째
		String s20 = "Heloollo";
		String s21 = s20.replace("ll", "LL");
		
		System.out.println("19번째");
		System.out.println(s21);
		System.out.println();
		
//		20번째
		String ab = "AABBAABB";
		String r = ab.replaceAll("BB", "bb");
		
		System.out.println("20번째");
		System.out.println(r);
		System.out.println();
		
//		21번째
		String ab2 = "AABBAABB";
		String r2 = ab2.replaceFirst("BB", "bb");
		
		System.out.println("21번재");
		System.out.println(r2);
		System.out.println();
		
//		22번째
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		
		System.out.println("22번째");
		System.out.println("1번째 : " + arr[0] + "\n2번째 : " + arr[1] + "\n3번째 : " + arr[2]);
		System.out.println();
		
//		23번째
		String animals2 = "dog,cat,bear";
		String[] arr2 = animals2.split(",",2);
		
		System.out.println("23번째");
		System.out.println("1번째 : " + arr2[0] + "\n2번째 : " + arr2[1]);
		System.out.println();
		
//		24번째
		String s22 = "java.lang.Object";
		boolean b10 = s22.startsWith("java");
		boolean b11 = s22.startsWith("lang");
		
		System.out.println("24번째");
		System.out.println("1번째 : " + b10 + "\n2번째 : " + b11);
		System.out.println();
		
//		25번째
		String s23 = "java.lang.Object"; 
		String c4 = s23.substring(10); 
		String p = s23.substring(5,9);  //5를 포함 9를 포함하지 않아서 4개의 길이만 나옴
		
		System.out.println("25번째");
		System.out.println("1번째 : " + c4 + "\n2번째 : " + p);
		System.out.println();
		
//		26번째 
		String s24 = "Hello";
		String s25 = s24.toLowerCase();
		
		System.out.println("26번째");
		System.out.println(s25);
		System.out.println();
		
//		27번째
		String s26 = "Hello";
		String s27 = s26.toString();
		
		System.out.println("27번째");
		System.out.println(s27);
		System.out.println();
		
//		28번째
		String s28 = "Hello";
		String s29 = s28.toUpperCase();
		
		System.out.println("28번째");
		System.out.println(s29);
		System.out.println();
		
//		29번째
		String s30 = "   Hello World   ";
		String s31 = s30.trim();
		
		System.out.println("29번째");
		System.out.println(s31);
		System.out.println();
		
//		30번째
		String b12 = String.valueOf(true);
	    String c5 = String.valueOf('a');
	    String l = String.valueOf(100L);
	    String f = String.valueOf(10f);
	    String d = String.valueOf(10.0);
	    java.util.Date dd = new java.util.Date();
	    String date = String.valueOf(dd);
	    
	    System.out.println("30번째");
	    System.out.println("1번째 : " + b12 + "\n2번째 : " + c5 + "\n3번째 : " + l);
	    System.out.println("4번째 : " + f + "\n5번째 : " + d + "\n6번째 : " + date);
	   
	}
				
}
