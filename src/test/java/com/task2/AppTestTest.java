package com.task2;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.task2.algorithm.ManachersAlgorithm;
import com.task2.element.LetterText;
import com.task2.element.Paragraph;
import com.task2.reader.Reader;

public class AppTestTest {
	@Test(expectedExceptions = NullPointerException.class)
	public void testReader() throws FileNotFoundException {
		String fileName = null;
		Reader result = new Reader(fileName);

	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testReader2() throws FileNotFoundException {
		String fileName = "";
		Reader result = new Reader(fileName);

//		String expectedResult = "Argument fileName can not be null.";
		Assert.assertEquals(new IllegalArgumentException("Name of file can not be empty."),
				new IllegalArgumentException("Name of file can not be empty."));

	}

	@Test(expectedExceptions = FileNotFoundException.class)
	public void testReader3() throws FileNotFoundException {
		String fileName = "f1.txt";
		Reader result = new Reader(fileName);
	}

	@Test

	public void testLetterText() throws FileNotFoundException {
		String fileName = "file1.txt";
		Reader rf = new Reader(fileName);
		LetterText textFormat = new LetterText();
		String ss = textFormat.getLetterText(rf.getScanner());

		String result = ManachersAlgorithm.findLongestPalindrome(ss);

		String pr = "asdfghjklkjhgfdsa";

		Assert.assertEquals(pr, result);
	}

	@Test

	public void testLetterText2() throws FileNotFoundException {
		String fileName = "file2.txt";
		Reader rf = new Reader(fileName);
		LetterText textFormat = new LetterText();
		String ss = textFormat.getLetterText(rf.getScanner());

		String result = ManachersAlgorithm.findLongestPalindrome(ss);

		String pr = "divid";

		Assert.assertEquals(pr, result);
	}

	@Test
	public void testWriter() throws IOException {
		String s = "file2.txt";
		Reader rf = new Reader(s);

		Paragraph par = new Paragraph();
		par.getParagraphsText(rf.getScanner());
		System.out.println(par.toString());
		par.writeParagraph();
	}

}
