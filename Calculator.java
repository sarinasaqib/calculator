package com.bham.pij.assignments.calculator;
// Sarina Saqib 2249047

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.*;


public class Calculator {

	private float result;
	private float memvalue;
	private ArrayList<Float> history = new ArrayList<Float>(); 
	private ArrayList<Float> brackets = new ArrayList<Float>();
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to calculate?");
		String expression = input.nextLine();

		
		Calculator Calculation = new Calculator();

//		if (Calculation.validation(expression)) {
			
		Calculation.result = Calculation.evaluate(expression);
		System.out.println(Calculation.getCurrentValue());
		
		if (expression.equals("m")) {
			System.out.println(Calculation.getMemoryValue(expression));
		}
		
//		} else 
//			System.out.println ("invalid input");
		

	}
	
//exercise one: public calculator,public float evaluate and public float get current value

	public Calculator() {
		result = 0;
		memvalue = 0;
		ArrayList<Float> history = new ArrayList<Float>(10); 
	}

	
	
	public float evaluate (String expression) {
		
		
		String[] tokens = expression.split(" ");
		float a = (Float.parseFloat(tokens[0]));
		float b = (Float.parseFloat(tokens[2]));
//		float c = (Float.parseFloat(tokens[4]));

		if (expression.contains("/ 0")){
			return Float.MIN_VALUE;
		}
		
		if (expression.length() < 5){
			return Float.MIN_VALUE;
		}
		
		
		if (expression.length()<=6) {
			if (expression.contains("+")) {
				return a + b ; //number plus number
			}else if (expression.contains("-")) {
				return a - b; //number minus number
			}else if (expression.contains("/")) {
				return a / b; //number divide number
			}else if (expression.contains("*")) {
				return a * b; //the number times the number
			} }
		
		
		String[] tokens2 = expression.split(" ");
		float d = (Float.parseFloat(tokens2[0]));
		float e = (Float.parseFloat(tokens2[2]));
		float f = (Float.parseFloat(tokens2[4]));
		
		
		if (expression.length()>6) {
			if (expression.contains ("+") && expression.contains("+")) {
				return d + e + f;
			}else if (expression.contains ("+") && expression.contains("-")) {
				return d + e - f;
			}else if (expression.contains ("+") && expression.contains("*")) {
				return d + e * f;
			}else if (expression.contains ("+") && expression.contains("/")) {
				return d + e / f;
			}else if (expression.contains ("-") && expression.contains("+")) {
				return d - e + f;
			}else if (expression.contains ("-") && expression.contains("-")) {
				return d - e - f;
			}else if (expression.contains ("-") && expression.contains("*")) {
				return d - e * f;
			}else if (expression.contains ("-") && expression.contains("/")) {
				return d - e / f;
			}else if (expression.contains ("*") && expression.contains("+")) {
				return d * e + f;
			}else if (expression.contains ("*") && expression.contains("-")) {
				return d * e - f;
			}else if (expression.contains ("*") && expression.contains("*")) {
				return d * e * f;
			}else if (expression.contains ("*") && expression.contains("/")) {
				return d * e / f;
			}else if (expression.contains ("/") && expression.contains("+")) {
				return d / e + f;
			}else if (expression.contains ("/") && expression.contains("-")) {
				return d / e - f;
			}else if (expression.contains ("/") && expression.contains("*")) {
				return d / e * f;
			}else if (expression.contains ("/") && expression.contains("/")) {
				return d / e / f;
		} return result;
		}
		return result;

	}
			

	
	public float getCurrentValue() {

		return result;
	} 

	public float getMemoryValue(String expression) {
		
		return memvalue;
	}
	
	public void setMemoryValue(float memval) {
		memvalue = memval;
	}
	
	
	public void clearMemory() {
		
		setMemoryValue(0);
	}
	
	public float getHistoryValue(int index) {
		
		float historyVal = history.get(index);
		
		return historyVal;
		
	}
		
	}

