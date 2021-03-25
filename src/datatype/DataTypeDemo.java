package datatype;

public class DataTypeDemo {
public static void main(String[] args) {
	// i have a number 15 = 
	//  my name is vaibhav

	// 8 data type (generic) , custom 
	
	// numerical - floating (.) , non-float

	// byte - 1 byte - 8bits , 2 power 8 = 256
	// 256/2 =     127 and -128 ,  ( +127 to -128 ) 	
	// short - 2byte - 16 bits , 2 power 16 = 65
	// int - 4 byte - 32 bits, 2 power 32
	// long - 8 byte - 64 bits , 2 power 64 
	
	// casting 
	// numerical data type gives you cyclic nature
	byte b2 = (byte)(300);
	System.out.println(b2);
	
	int i = 0X20; 
	System.out.println(i);
	// When we put 0 before any int = it become octal
	// When we put 0X before any int = it become hexa-decimal
	
	long j = 23_76_32_86_83_26_37_28l;
	System.out.println(j);
	// floating
	// float - 4 byte
	// double - 8 byte
	
	
	float fl = 90.8f;
	double d1 = 123.0d;
	
	// char  - ascii 1 byte, unicode - 2byte
	char c = 'j';
	// ASCII
	int k = c;
	// boolean - 1 bit (true/false)
	System.out.println(k);
	// all char is int
	
	
	int m = 1000; // 4 byte 
	char v = (char)m; // 1 byte
	System.out.println(v);
	
	
	// datatype , who values are keyword
	// we can have only 2 values = true/false
	boolean bool = true;
	bool = false;
	
	
}
}
