package ObjectCreationTasks;

public class Book {
	public Book() {
		System.out.println("Constructor is here");
	}

	String title, author;
	int pages;

	public void setValues(String authorVal, String titleValue, int pageValue) {
		this.author = authorVal;
		this.title = titleValue;
		this.pages = pageValue;

	}
}
