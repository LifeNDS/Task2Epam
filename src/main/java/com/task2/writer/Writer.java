package com.task2.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	public Writer(String[] str) throws IOException {

		File file = new File("f.txt");

		file.createNewFile();

		FileWriter writer = new FileWriter(file);
		for (String p : str) {
			writer.write(p);
		}

		writer.flush();
		writer.close();
	}

}
