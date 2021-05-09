//Java program to search for files in home.

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class SearchingFile {
	
	public void findFiles(String path, String fileName) {
		//retrieve the fileName in the path
		File directory = new File(path);
		File files[] = directory.listFiles();
		
		if(files != null && files.length > 0) {
			for(File file : files) {
				if(file.isDirectory()) {
					//recursively search for the files
					findFiles(file.getAbsolutePath(), fileName);
				}
				else {
//					String eachFile = file.getAbsolutePath();
					if(file.getName().endsWith("."+fileName)) {
						System.out.println(file.getAbsolutePath() + " " + file.getName());
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		//BufferedReader to take input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SearchingFile fileSearch = new SearchingFile();
		System.out.println("Type \"exit\" to stop giving input for Searching Files.");
		//Input fileName
		while(true) {
			String inputFile = br.readLine();
			if(inputFile == "exit") {
				break;
			}
			fileSearch.findFiles("/home",inputFile);
		}		
	}
}
