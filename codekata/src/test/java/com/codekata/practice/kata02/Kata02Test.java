package com.codekata.practice.kata02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codekata.practice.kata02.Kata02;

class Kata02Test {

	@Test
	void chopTest() {
		Kata02 subject = new Kata02();
		assertEquals(-1, subject.chop(3,new int[0]));
		assertEquals(-1, subject.chop(3,new int[]{1}));
		assertEquals(0,  subject.chop(1,new int[]{1}));
		assertEquals(0,  subject.chop(1,new int[]{1, 3, 5}));
		assertEquals(1,  subject.chop(3,new int[]{1, 3, 5}));
		assertEquals(2,  subject.chop(5,new int[]{1, 3, 5}));
		assertEquals(-1, subject.chop(0,new int[]{1, 3, 5}));
		assertEquals(-1, subject.chop(2,new int[]{1, 3, 5}));
		assertEquals(-1, subject.chop(4,new int[]{1, 3, 5}));
		assertEquals(-1, subject.chop(6,new int[]{1, 3, 5}));
		assertEquals(0,  subject.chop(1,new int[]{1, 3, 5, 7}));
		assertEquals(1,  subject.chop(3,new int[]{1, 3, 5, 7}));
		assertEquals(2,  subject.chop(5,new int[]{1, 3, 5, 7}));
		assertEquals(3,  subject.chop(7,new int[]{1, 3, 5, 7}));
		assertEquals(-1, subject.chop(0,new int[]{1, 3, 5, 7}));
		assertEquals(-1, subject.chop(2,new int[]{1, 3, 5, 7}));
		assertEquals(-1, subject.chop(4,new int[]{1, 3, 5, 7}));
		assertEquals(-1, subject.chop(6,new int[]{1, 3, 5, 7}));
		assertEquals(-1, subject.chop(8,new int[]{1, 3, 5, 7}));
	}
}