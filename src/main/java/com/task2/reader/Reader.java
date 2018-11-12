package com.task2.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Reader {
	static final Logger LOG = Logger.getLogger(Reader.class);
	private String fileName;
	private Scanner scanner;

	public Reader(String fileName) throws FileNotFoundException {

		if (fileName == null) {
			LOG.error("Argument fileName can not be null");
			throw new NullPointerException("Argument fileName can not be null.");
		}
		if (fileName.isEmpty()) {
			LOG.error("Name of file can not be empty");
			throw new IllegalArgumentException("Name of file can not be empty.");
		}
		this.fileName = fileName;
		System.out.println(fileName);
		try {
			FileReader fr = new FileReader(fileName);

			scanner = new Scanner(fr);
			LOG.info(scanner);
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();

		}

	}

	public Scanner getScanner() {
		return scanner;
	}

}
