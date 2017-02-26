package pl.edu.agh.mwo.java.crawler;

import java.io.IOException;
import java.net.MalformedURLException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class Crawler {

	protected String urlToProcess;
	protected TextExtractor tx;
	
	public Crawler(String initUrl) throws MalformedURLException
	{
		urlToProcess = initUrl;
	}

	
	public void run () throws IOException
	{

		Document doc = null;
		doc = Jsoup.connect(urlToProcess).get();

		
		String[] sentences = tx.textEx(doc);
		
		char charToFind = 'S';
		for(int i = 0 ; i < sentences.length ; i++)
		{	
			String sentence = sentences[i];
			//if(sentence.contains("po")) System.out.println(sentences[i]);
			if(sentence.charAt(i) ==  charToFind){
				System.out.println(sentences[i]);
			}
			
			 

		}	

		
	}
}
