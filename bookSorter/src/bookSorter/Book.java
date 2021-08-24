package bookSorter;

import java.text.Collator;
import java.util.Locale;

public class Book implements Comparable<Book> {
	private String bookName;
	private int numberOfPage;
	private String authorName;
	private int publishingYear;
	
	public Book(String bookName, int numberOfPage, String authorName, int publishingYear) {
		super();
		this.bookName = bookName;
		this.numberOfPage = numberOfPage;
		this.authorName = authorName;
		this.publishingYear = publishingYear;
	}
	
	@Override
	public int compareTo(Book o) {
		Collator collator = Collator.getInstance(new Locale("tr", "TR"));
		return collator.compare(this.getBookName(), o.getBookName());
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getNumberOfPage() {
		return numberOfPage;
	}

	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

}
