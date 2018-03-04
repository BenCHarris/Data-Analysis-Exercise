import java.io.*;
public class TesterReddit {

public static void main(String [] args) {
	
	RedditReader myreader=new RedditReader();
	boolean outcome=myreader.detectRussia("Russia didn't influence shit in the election");
	myreader.FileReader("redditPost.txt");
}
}
