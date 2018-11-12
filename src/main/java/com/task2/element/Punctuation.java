package com.task2.element;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.task2.transformation.Highlight;

public class Punctuation {
	static final Logger LOG = Logger.getLogger(Punctuation.class);
	private static final String PUNCTUATION_SPLIT_REGEX = "[^.,!?;:]";
	String[] punctuation;

	public String[] getPunctuation(Scanner rf) {

		Highlight blabla = new Highlight();

		punctuation = blabla.addElemnt(rf, PUNCTUATION_SPLIT_REGEX);
		LOG.info(punctuation);
		return punctuation;
	}

	@Override
	public String toString() {

		StringBuilder str = new StringBuilder();

		for (String p : punctuation) {
			if (!p.isEmpty()) {
				str.append("[" + p.trim() + "]");
			}
		}
		return str.toString();
	}
}
