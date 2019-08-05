package ObjectCreationTasks;

public class StudentInfo {

	public static void main(String[] args) {
		Student s1= new Student();
		s1.name = "Cholpon";
		s1.email = "chichikaboom@gmail.com";
		s1.age = 22;
		s1.read();//1
		
		//we need to create a book to use it later
		Book b = new Book();//it is an object and has nothing
		b.title = "future of SDET";
		b.author = "chikita tores";
		b.pages = 121;
		int h = 2;
		s1.read(h);
		s1.read(b);
	//	s1.read(b);//second method we need to pass smth inside,
		// here b ==> is a full book,it has title,author, pages
	}

}
