package de.st48.termomap.conf;

public class ConfigDIR {
	private static String FileSeparator = (String) System.getProperty("file.separator");

	public static String CurrentDir() {
		String path = System.getProperty("java.class.path");
		return path.substring(0, path.lastIndexOf(FileSeparator) + 1);
	}

	public static String PictDir() {
		String pfad = "src"+FileSeparator+"de"+FileSeparator+"st48"+FileSeparator+"termomap"+FileSeparator+"pict"+FileSeparator;
		return CurrentDir() + pfad;
	}
}
