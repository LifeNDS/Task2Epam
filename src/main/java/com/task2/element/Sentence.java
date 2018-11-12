package com.task2.element;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.task2.transformation.Highlight;

public class Sentence {
	static final Logger LOG = Logger.getLogger(Sentence.class);
	private static final String SENTENCE_SPLIT_REGEX = "[?!.]";
	String[] sentences;

	public String[] getSentence(Scanner rf) {
		Highlight blabla = new Highlight();

		sentences = blabla.addElemnt(rf, SENTENCE_SPLIT_REGEX);
		LOG.info(sentences);
		return sentences;
	}

	@Override
	public String toString() {

		StringBuilder str = new StringBuilder();

		for (String sentence : sentences) {
			if (!sentence.isEmpty()) {
				str.append("[" + sentence.trim() + "]");
			}
		}

		return str.toString();

	}

}
