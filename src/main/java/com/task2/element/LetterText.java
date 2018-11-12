package com.task2.element;

import java.util.Scanner;

public class LetterText {

	private String letterText;

	public String getLetterText(Scanner rf) {
		StringBuilder str = new StringBuilder();
		while (rf.hasNext()) {

			str.append(rf.next());
		}
		letterText = str.toString().toLowerCase().replaceAll("[^a-z,а-я]", "");
		return letterText;
	}

}
