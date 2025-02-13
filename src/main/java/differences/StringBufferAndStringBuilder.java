package differences;

public class StringBufferAndStringBuilder {
	
	/**
	 * **********************StringBuffer*********************
	 * Every methods in SB are synchronized 
	 * 
	 * At a time only one thread allowed to operate a stringbuffer object , hence String buffer object is thread safe
	 * 
	 * it increase waiting time of threads and performance is slow there
	 * 
	 * introduced in 1.0 version 
	 * 
	 * 
	 * *****************StringBuilder******************************
	 * 
	 * No methods are synchronized in SB 
	 * 
	 * at a time multiple thread allowed to operate a string builder object , hence string builder object are not thread safe
	 * 
	 * that why is performance wise fast there
	 * 
	 * introduced in 1.5 version 
	 * 
	 * 
	 * 
	 * *****************When Go For String , String Builder & String Buffer ****************************
	 * 
	 * If the content has fixed would not change frequently then go for the String 
	 * 
	 * If the content is not fixed and keep changing and thread safety is not required then go for the String builder 
	 * 
	 * If the content is not fixed and keep changing the thread safety is  required then go for the string buffer 
	 */

}
