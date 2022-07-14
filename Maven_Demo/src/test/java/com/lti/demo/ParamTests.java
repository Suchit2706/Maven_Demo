package com.lti.demo;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParamTests {

	@Disabled
	@ParameterizedTest
	@ValueSource(ints = {8, 10, 20, 6, 100})
	public void testArrays(int args) {
		System.out.println("args: "+ args);
		Assertions.assertTrue(args%2==0);
	}
	
	@ParameterizedTest(name="#{index} = {0}")
	@DisplayName("Should pass all non-null arguments to method")
	@ValueSource(strings= {"Hello", "HelloMessage"})
	public void testParams(String msg) {
		String searchKey="Hello";
		Assertions.assertTrue(msg.contains(searchKey));
	}
	
	@RepeatedTest(3)
	public void shouldRepeat() {
		int x=10, y=30;
		assertEquals(300, x*y);
	}
	@Test
	public void testLambda()
	{
		Integer[] intAry= {2,3,7,5,10};
		
		List<Integer> numbers= Arrays.asList(intAry);
		
		Assertions.assertAll(
				() -> assertEquals(2,numbers.get(0)) ,				
				() -> assertEquals(3,numbers.get(1)) ,
				() -> assertEquals(7,numbers.get(2)) ,
				() -> assertEquals(5,numbers.get(3)) ,
				() -> assertEquals(10,numbers.get(4)) 				
				);	
	}
	@Test
	public void testException() {
		Assertions.assertThrows(NumberFormatException.class, ()->{
			Integer.parseInt("One");
		});
	}

}
