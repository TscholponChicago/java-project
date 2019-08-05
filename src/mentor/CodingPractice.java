package mentor;

import selfStudy.Strin;


import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class CodingPractice {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter sent");
		String sent = scan.nextLine();
		sent = sent.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(sent);
	}

		}



