package com.task2.element;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.task2.transformation.Highlight;

public class Word {
	static final Logger LOG = Logger.getLogger(Word.class);
	private static final String WORD_SPLIT_REGEX = "\\s+\\s*";
	String[] word;

	public String[] getWord(Scanner rf) {

		Highlight blabla = new Highlight();

		word = blabla.addElemnt(rf, WORD_SPLIT_REGEX);
		LOG.info(word);
		return word;
	}

	@Override
	public String toString() {

		StringBuilder str = new StringBuilder();

		for (String w : word) {
			if (!w.isEmpty()) {
				str.append("[" + w.trim() + "]");
			}
		}
		return str.toString();
	}
}
