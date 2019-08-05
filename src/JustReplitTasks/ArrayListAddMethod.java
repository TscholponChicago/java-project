package JustReplitTasks;

import java.util.ArrayList;

import array.Names;

public class ArrayListAddMethod {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		
	
		names.add("Hello");
		names.add("Tom");
		names.add("Rose");
		System.out.println(names);
		
		//ArrayList <Integer>nums = new ArrayList<>();
		ArrayList<String>words = new ArrayList<>();
		words.add("tree");
		words.add("table");
		words.add("pen");
		words.add("water");
		words.set(0, "git");
		words.set(2, "book");
		
		System.out.println(words);
		ArrayList<Integer>numb=new ArrayList<>();
		numb.add(34);
		numb.add(22);
		numb.add(88);
		System.out.println(numb);
		numb.set(2, 44);
		System.out.println(numb);
		ArrayList<String> ss =new ArrayList<>();
		ss.add("kate");
		ss.add("James");
		ss.add("Tom");
		System.out.println(ss);
		ss.get(2);
		System.out.println(ss.get(2));
		
		ArrayList<Integer>num1=new ArrayList<>();
		num1.add(34);
		num1.add(55);
		num1.add(67);
		num1.add(78);
		num1.add(34);
		num1.add(79);
		int sum=0;
		for(int i=0; i <num1.size();i++) {
			sum+=num1.get(i);
			
		}
		System.out.println(sum);
		
		ArrayList<Integer>num2=new ArrayList<>();
		num2.add(34);
		num2.add(55);
		num2.add(67);
		num2.add(78);
		num2.add(88);
		num2.add(79);
		num2.add(56);
		num2.remove(1);
		System.out.println(num2);
		num2.remove(3);
		System.out.println(num2);
		num2.remove(0);
	System.out.println(num2);
		
		//System.out.println(num2.remove(3));
		num2.add(2,66);
		num2.add(1,85);
		num2.add(4,61);
		System.out.println(num2);
		
		ArrayList<String> str =new ArrayList<>();
		str.add("Kate");
		str.add("John");
		str.add("Tima");
		str.add("Dima");
		//System.out.println(str);
		str.get(2);
		System.out.println(str);
		System.out.println("________________________");
		ArrayList<String> nn=new ArrayList<>();
		nn.add("book");
		nn.add("flower");
		nn.add("door");
		nn.add("igloo");
		for(int i=0; i < nn.size();i++) {
			nn.get(i);
			nn.get(1);
		}
		System.out.println(nn);
		System.out.println(nn.get(1));
		
		
		
	}
	
	
	
	
	

}
