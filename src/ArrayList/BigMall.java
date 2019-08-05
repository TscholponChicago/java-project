package ArrayList;

import selfStudy.Grosery;

public class BigMall {

	public static void main(String[] args) {
		MyStore store=new MyStore("Friends and Co","233 River rd");//object 
		Grosery pen = new Grosery("Pen",12.55,"Igloo");
		store.addItems(pen);
		Grosery book = new Grosery("Winnie Pooh",14.66,"Pearson");
		store.addItems(book);
		
		Grosery notebook = new Grosery("Big Notebook",14.55,"China");
		store.addItems(notebook);
        		
	}

}
