package graphQL.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

@Table
@Entity
public class Book {

	@Id
	private String isbn;
	private String title;
	private String publisher;
	private String[] authors;
	private String publishedDate;
		
	/**
	 * 
	 */
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param isbn
	 * @param title
	 * @param publisher
	 * @param authors
	 * @param publishedDate
	 */
	public Book(String isbn, String title, String publisher, String[] authors,
			String publishedDate) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
		this.authors = authors;
		this.publishedDate = publishedDate;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the authors
	 */
	public String[] getAuthors() {
		return authors;
	}

	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	/**
	 * @return the publishedDate
	 */
	public String getPublishedDate() {
		return publishedDate;
	}

	/**
	 * @param publishedDate the publishedDate to set
	 */
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

}
