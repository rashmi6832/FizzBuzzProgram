package com.bnpp.kata;

public class FizzBuzz {
	
	public String parseNumber(Integer number){
		String result = null;
	
		if(number<3 ||( number%3 != 0 && number%5 != 0 )){
			result=String.valueOf(number); 
		}else if(number%3 == 0 && number%5 == 0){
			result="FizzBuzz";
		}else if(number%3 == 0){
			result="Fizz";
		}else if(number%5 == 0){
			result="Buzz";
		}
		return result;
	}

}
