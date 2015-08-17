/*
Name:  Jeilymar Brady
Assignment:   5
Title: SpaceNeedle
Course: CSCE144 
Section: 1 - Hauser
Lab Section: 2 - Hauser
Semester: Spring 2014 
Instructor: Hauser
Date: 13 March 2014
Sources consulted:   
Known Bugs: none
Program Description: ASCII image of the Seattle Space Needle
Creativity: scaling and indentation
Instructions: javac SpaceNeedle.java then java SpaceNeedle then follow on-screen instructions
*/

import java.util.Scanner;

public class SpaceNeedleScaling
{
   public static void main(String[] args) 
   {
   	   Scanner keyboard = new Scanner(System.in);
   	
   	   //declare and initialize variables
   	   int indent = 1, scale =  4;
   	   
   	   //prompt user for indentation and scaling
   	   System.out.println("Specify indentation amount") ;
   	   indent = keyboard.nextInt() ;
   	   System.out.println("Specify scaling factor") ;
   	   scale = keyboard.nextInt() ;
   	   
   	   //Draw the Space Needle 
   	   drawNeedle(indent, scale) ;
   	   drawTop(indent, scale) ;
   	   drawBar(indent, scale) ;
   	   drawBottom(indent, scale) ;
   	   drawNeedle(indent, scale) ;
   	   drawColumn(indent, scale) ;
   	   drawTop(indent, scale) ;
   	   drawBar(indent, scale) ;
   	}
   
   	
   	public static void drawNeedle(int indentation, int scaling) {
		for ( int i = 0; i < scaling; i++) { 
			for( int k = 0; k < indentation; k++ ) {
				System.out.print("	") ;
			}
			for ( int j = 0; j < (scaling * 3); j++) { 
				System.out.print(" ") ;
			}
			System.out.print("||") ;
			System.out.println() ;
		}	
	}
	
	
	public static void drawTop(int indentation, int scaling) {
		int spaceCount = ( scaling * 3 - 3 );
		int colonCount = 0;
		for ( int i = 0; i < scaling; i++) { 
			for( int k = 0; k < indentation; k++ ) {
				System.out.print("	") ;
			}
			for ( int j = 0; j < spaceCount; j++) {
				System.out.print(" ") ;
			}
			System.out.print("__/") ;
			for ( int j = 0; j < colonCount; j++) {
				System.out.print(":") ;
			}
				System.out.print("||") ;
			for ( int j = 0; j < colonCount; j++) {
				System.out.print(":") ;
			}
			System.out.print("\\__") ;
			System.out.println() ;
			spaceCount = spaceCount - 3 ;
			colonCount = colonCount + 3 ;
		
		}
	}
	
	
	public static void drawBar(int indentation, int scaling) {
		for( int k = 0; k < indentation; k++ ) {
			System.out.print("	") ;
		}
		System.out.print("|") ;
		for ( int i = 0; i < scaling * 6; i++) { 
			System.out.print("\"") ;
		}
		System.out.print("|") ;
		System.out.println() ;
	}
	
	
	public static void drawBottom(int indentation, int scaling) {
		int spaceCount = 0 ;
		int capCount = ( scaling * 3 - 1 ) ;
		for ( int i = 0; i < scaling; i++) { 
			for( int k = 0; k < indentation; k++ ) {
				System.out.print("	") ;
			}
			for ( int j = 0; j < spaceCount; j++) {
				System.out.print(" ") ;
			}
			System.out.print("\\_") ;
			for ( int j = 0; j < capCount; j++) {
				System.out.print("/\\") ;
			}
			System.out.print("_/") ;
			System.out.println() ;
			spaceCount = spaceCount + 2 ;
			capCount = capCount - 2;
		}
	}
	
	
	public static void drawColumn(int indentation, int scaling) {
		for ( int i = 0; i < scaling * scaling; i++) { 
			for( int k = 0; k < indentation; k++ ) {
				System.out.print("	") ;
			}
			for ( int j = 0; j < (scaling * 3 - 3); j++) {
				System.out.print(" ") ;
			}
			System.out.print("|%%||%%|") ;
			System.out.println() ;
		}
	
	}
}




