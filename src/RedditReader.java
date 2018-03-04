import java.io.*;
public class RedditReader {

	String fileToAnalyze=null;
	
	RedditReader() {
		System.out.println("Default Constructor");
		fileToAnalyze="";
	}
	
	boolean detectRussia(String linetoAnalyze) {
		String lineToAnalyzeLowerCase=linetoAnalyze.toLowerCase();
		if (lineToAnalyzeLowerCase.contains("russia")) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	void FileReader(String fileToRead) {
		int count=0;
		System.out.println("Ready to read!"+fileToRead);
		try {
			FileReader myFileReader= new FileReader(fileToRead);
			System.out.println("I was able to open your file");
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			System.out.println("Ready to start buffering!");
			String line=null;
			
			while ((line=myBufferReader.readLine())!=null) {
			
				if (detectRussia(line)==true) {
					System.out.println("line:"+line);
				count=count+1;
			}
		}
		System.out.println("Russia was stated " + count + " times in the Reddit posts");
	}
		catch(Exception ex){
			System.out.println("I don't think I was able to find your file");
		}
	
	}

}