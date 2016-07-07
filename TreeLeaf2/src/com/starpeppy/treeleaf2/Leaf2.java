package com.starpeppy.treeleaf2;

import com.starpeppy.treeleaf2.Pattern2;

public class Leaf2 extends Pattern2{
//change
	public Leaf2(){
		
	}
	
	public static void main(String args[]){
		Leaf2 leaf = new Leaf2();
		System.out.println("You have a tree leaf!");
		leaf.labelGreen();
		leaf.makeSpiky2();
	}
	
	public void labelGreen(){
		System.out.println("Your tree leaf is green!");
	}
	
	
	
}
