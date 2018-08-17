package com.nissan.calculator.a;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		calc n=new calc();
		assertEquals(10,n.add(5, 5));
	}

	@org.junit.Test
	public void test1() {
		calc n=new calc();
		assertEquals(0,n.sub(5, 5));
	}

}
