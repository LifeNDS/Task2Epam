package com.task2.transformation;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Highlight implements Transformation {
	static final Logger LOG = Logger.getLogger(Highlight.class);

	public String[] addElemnt(Scanner scanner, String regul) {

		StringBuilder str = new StringBuilder();
		while (scanner.hasNext()) {

			str.append(scanner.next() + " ");
		}
		str.toString().split(regul);

		LOG.info(str.toString().split(regul));
		return str.toString().split(regul);
	}

}
