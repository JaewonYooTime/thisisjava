package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		int var1 = 100;
		byte var2 = (byte) var1;
		System.out.println(var2);
		
		long var3 = 100;
		int var4 = (int) var3;
		System.out.println(var4);
		
		long var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6);
		
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8);
	}

}
