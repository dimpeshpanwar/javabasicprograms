public class ObjectToStringExample2{  
public static void main(String args[]){  
String s="hello";  
StringBuilder sb=new StringBuilder(s);  
sb.reverse();  
String rev=sb.toString();//converting StringBuilder to String  
System.out.println("String is: "+s);  
System.out.println("Reverse String is: "+rev);  
}}  
