package com.bridgelabs.lc;
public class LineComparision {
public static void main(String[] args){
	float x1=1,y1=2,x2=2,y2=4;
	float p1=4,q1=5,p2=7,q2=8;
	float length1=(float)Math.sqrt(Math.pow((x1-x2),2)+ Math.pow((y2-y1),2));
	float length2=(float)Math.sqrt(Math.pow((p1-p2),2)+ Math.pow((q2-q1),2));
	System.out.println(length1 +" "+length2);
	if(length1==length2) {
	System.out.println("both are equal");
}
	else{
		System.out.println("both are not equal");
	}
}
}

