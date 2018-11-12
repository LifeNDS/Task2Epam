package com.task2.reader;

import java.io.IOException;

import com.task2.element.Paragraph;

public class Main {

	public static void main(String[] args) throws IOException {
		String s = "file2.txt";
		Reader rf = new Reader(s);

		/*
		 * LetterText textFormat = new LetterText(); String dff =
		 * textFormat.getLetterText(rf.getScanner()); System.out.println(dff);
		 * 
		 * String result = ManachersAlgorithm.findLongestPalindrome(dff);
		 * System.out.println(result);
		 */

		Paragraph par = new Paragraph();
		par.getParagraphsText(rf.getScanner());
		System.out.println(par.toString());
		par.writeParagraph();
		// Writer wr = new Writer("wrwergwergwerg");
		/*
		 * Sentence sen = new Sentence(); sen.getSentence(rf.getScanner());
		 * System.out.println(sen.toString());
		 */

		/*
		 * Word word = new Word(); word.getWord(rf.getScanner());
		 * System.out.println(word.toString());
		 */

		/*
		 * Punctuation punctuation = new Punctuation();
		 * punctuation.getPunctuation(rf.getScanner());
		 * System.out.println(punctuation.toString());
		 */
	}

}
