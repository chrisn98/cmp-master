package Chp3_7;

public class EnumeratedTypes{
		enum type1 {data1, data2}
		public static void main (String args[]){
			type1 t2, t3;
			t2 = type1.data1;
			t3 = type1.data2;
			System.out.println("Name of ordinal 0 : " + t2.name());
			System.out.println("Name of ordinal 1 : " + t3.name());
		}
	}