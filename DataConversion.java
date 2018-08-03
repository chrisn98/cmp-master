package Chp2_5;

public class DataConversion {
	/* Notes: 
	 * Each data value is associated with a particular data type in Java
	 * There are two main types of conversions in Java
	 *		Widening conversions and Narrowing conversions 
	 *
	 *Widening conversions are considered safe because they go one data type to another
	 *		to another that uses greater amount of space. No data is lost 
	 *When converting from an int or a long to float, or from a long to a double
	 *	some least significant digits may be lost
	 *Follow the IEEE 754 floating point standard 
	 *
	 *Narrowing conversions are not recommended because your more likely to lose information 
	 *They go from one prim dat type to another that uses a lesser amount of space 
	 *Data can be compromised 
	 *
	 *An exception to narrowing conversions is when converting a bye or short to a char 
	 *Boolean values are not specified in widening or narrowing conversions b/c
	 *		they are conditional statements of type true and false 
	 *
	 *There are three main types of conversion techniques 
	 *	Assignment Conversion
	 *	Promotion
	 *	Casting
	 *
	 *--> Assignment conversion occurs when one value of one type is assigned to 
	 *	  a variable of another type 
	 *	  Only widening conversions may be performed with assignment conversion 
	 *
	 *--> Promotion occurs automatically when certain operators need to modify their operands
	 * 
	 *--> Casting is the most general form of conversion Is it specified by a type name in ()
	 *	  Casting works when a value needs to be treated as another value temporarily 
	 */
}
