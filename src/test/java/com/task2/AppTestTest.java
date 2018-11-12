package com.task2;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.task2.algorithm.ManachersAlgorithm;
import com.task2.element.LetterText;
import com.task2.element.Paragraph;
import com.task2.reader.Reader;

public class AppTestTest {
//	@Test
	public void testReader() {
		String fileName = null;
		Reader result = new Reader(fileName);

//		String expectedResult = "Argument fileName can not be null.";
		Assert.assertEquals("Argument fileName can not be null.", result);

	}

//	@Test
	public void testReader2() {
		String fileName = "";
		Reader result = new Reader(fileName);

//		String expectedResult = "Argument fileName can not be null.";
		Assert.assertEquals(new IllegalArgumentException("Name of file can not be empty."), result);

	}

//	@Test
	public void testReader3() throws NullPointerException {
		String fileName = "f1.txt";
		Reader result = new Reader(fileName);
		System.out.println(result);
//		String expectedResult = "Argument fileName can not be null.";
		Assert.assertEquals(new FileNotFoundException(), result);

	}

//	@Test

	public void testLetterText() {
		String fileName = "file1.txt";
		Reader rf = new Reader(fileName);
		LetterText textFormat = new LetterText();
		String ss = textFormat.getLetterText(rf.getScanner());
		System.out.println(ss);
		String result = ManachersAlgorithm.findLongestPalindrome(ss);
		System.out.println(result);
		String pr = "asdfghjklkjhgfdsa";

		Assert.assertEquals(pr, result);
	}

//	@Test

	public void testLetterText2() {
		String fileName = "file2.txt";
		Reader rf = new Reader(fileName);
		LetterText textFormat = new LetterText();
		String ss = textFormat.getLetterText(rf.getScanner());
		System.out.println(ss);
		String result = ManachersAlgorithm.findLongestPalindrome(ss);
		System.out.println(result);
		String pr = "omemo";

		Assert.assertEquals(pr, result);
	}

	@Test
	public void testParagraph() {
		String s = "file2.txt";
		Reader rf = new Reader(s);

		Paragraph par = new Paragraph();
		String[] result = par.getParagraphsText(rf.getScanner());
		String[] st = { "",
				"The String class represents character strings. All string literals in Java programs, such as \"abc\", are implemented as instances of this class. Strings are constant; their values cannot be changed after they are created.",
				"The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class." };

		Assert.assertEquals(st, result);

	}

}
