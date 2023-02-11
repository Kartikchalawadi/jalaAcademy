package com.jala;

public class ClassAndObjectAndMethod 
{

	int x; int y;
	
	public  ClassAndObjectAndMethod(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	 
	public void addition(int x,int y) {
		System.out.println(x+y);
		
	}
	
	
	public static void main(String[] args) 
	{
		
		
		ClassAndObjectAndMethod a=new ClassAndObjectAndMethod(12,13);
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(a.x+a.y);
		a.addition(20, 30);
		
	}

}


/*class syntax
 * 
 * class class name
 * {
 * data type v1;
 * data type v2;
 *     .
 *     .
 * data type vn;
 * }
 * 
 * syntax of object
 * class name object=new class name;
 */
 class ClassObjectMethod{
	 int age;
	 int per;
	 String collage;
		 
 }
 
 /* AM returnType methodName(){
  *    //logic
  * }
  * 
  * public void addition(int x,  int y){
  * 
  *    int addition=x+y;
  * }
  * 
  */
 
 
 
 
 
 