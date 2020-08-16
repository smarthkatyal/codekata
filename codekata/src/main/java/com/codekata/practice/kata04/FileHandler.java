package com.codekata.practice.kata04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public interface FileHandler<T> {

	List<T> getFileData();

	default String[] readFile(String fileName) {
		ClassLoader classLoader = Kata04Main.class.getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		try {
			return Files.readAllLines(file.toPath()).toArray(new String[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	boolean shouldSkipLine(String line);


}
