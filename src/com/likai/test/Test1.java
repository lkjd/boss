package com.likai.test;

import java.util.MissingFormatArgumentException;

public class Test1 {
	public static void main(String[] args) throws Exception {
		Integer b = 3 ;
		   String a  ="0"+b/60;
		   Integer c = b%60;
		   if(c==0){
			   a=a+"00";
		   }else{
			   if(c<10){
				  a=a+"0"+c.toString();
			   }else{
				  a=a+""+c.toString();
			   }
		   }
          
    System.out.println(a);

}
	public Test1() {
	}
}
