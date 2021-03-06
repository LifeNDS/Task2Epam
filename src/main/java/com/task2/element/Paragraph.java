package com.task2.element;

import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.task2.transformation.Highlight;
import com.task2.writer.Writer;

public class Paragraph {
	static final Logger LOG = Logger.getLogger(Paragraph.class);
	private static final String PARAGRAPH_SPLIT_REGEX = "   ";
	String[] paragraphsText;

	public String[] getParagraphsText(Scanner rf) {

		Highlight blabla = new Highlight();

		paragraphsText = blabla.addElemnt(rf, PARAGRAPH_SPLIT_REGEX);

		LOG.info(paragraphsText);
		return paragraphsText;
	}

	public void writeParagraph() throws IOException {
		Writer bla = new Writer(paragraphsText);

	}

	@Override
	public String toString() {

		StringBuilder str = new StringBuilder();

		for (String paragraph : paragraphsText) {
			if (!paragraph.isEmpty()) {
				str.append("PARAGRAPH" + "[" + paragraph.trim() + "]");
			}
		}

		return str.toString();
	}

	@Override
	public boolean equals(Object obj) {

		Paragraph other = (Paragraph) obj;

		return true;

	}

}
