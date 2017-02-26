package pl.edu.agh.mwo.java.crawler;

import org.jsoup.nodes.Document;

public class TextExtractor {

	protected String[] textEx(Document doc) {
		String text = doc.body().text();
	
		String[] sentences = text.split("\\.");
		return sentences;
	}

}
