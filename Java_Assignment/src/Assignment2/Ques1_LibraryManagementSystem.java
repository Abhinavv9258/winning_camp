package Assignment2;

import java.util.LinkedList;
import java.util.Scanner;

class Books{
	String BookName;
	int BookID;
	int AuthorID;
	String Publisher;
	boolean isAvailable;
}
class BookStore {
	LinkedList<Books> BookDetails=new LinkedList<Books>();

	public void addBook(String BookName, int BookID, int AuthorID, String Publisher) {
		Books temp = new Books();
		temp.BookName = BookName;
		temp.BookID = BookID;
		temp.AuthorID = AuthorID;
		temp.Publisher = Publisher;
		temp.isAvailable = true;
		this.BookDetails.add(temp);
	}

	public void BorrowOut(int BookID) {
		boolean flag = false;

		for (Books BookData : BookDetails) {
			if (BookData.BookID == BookID) {
				if (BookData.isAvailable) {
					System.out.println("Book is Available...");
					System.out.println("And Book is Rented Successfully...");
					BookData.isAvailable = false;
				}else{
					System.out.println("Book is Rented...");
				}
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Book is Not Present in Inventory !");
		}
	}

	public void BorrowIn(int BookID) {
		boolean flag = false;

		for (Books BookData : BookDetails) {
			if (BookData.BookID == BookID) {
				if (!BookData.isAvailable) {
					System.out.println("Book is Returned..."); BookData.isAvailable = true;
				} else {
					System.out.println("Book is not Rented...");
				}
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Book is Not Present in Inventory !");
		}
	}

	public void Inventory() {
		System.out.println("\nAll Library Books Record");
		for (Books BookData : BookDetails) {
			System.out.printf("%6s%8s%12s%14s%15s%15s","Sr.No.","BookName","BookID","AuthorID","Publisher","isAvailable");
			System.out.printf("%6s%8s%12s%14s%15s%15s",BookData,BookData.BookName,BookData.BookID,BookData.AuthorID,BookData.Publisher,BookData.isAvailable);
		}
	}
}

public class Ques1_LibraryManagementSystem {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		BookStore BS = new BookStore();
		while(flag){
			System.out.println("\n20BCS9258 Abhinav Verma\n");
			System.out.print("-------Library Management-------");
			System.out.println("\nPress 1 : To Add Book\nPress 2 : To Borrow Book\n" +
					"Press 3 : To Return Book\nPress 4 : To List Inventory\n" +
					"Press 5 : Exit");
			System.out.println("\nEnter Your Choice : ");
			char ch=sc.next().charAt(0);
			sc.nextLine();
			String title;
			switch (ch) {
				case '1':
					System.out.print("Enter the Book Title : ");
					String BookName = sc.next();
					System.out.print("Enter the Book ID : ");
					int BookID=sc.nextInt();
					System.out.print("Enter the Author ID : ");
					int AuthorID = sc.nextInt();
					System.out.print("Enter the Publisher Name : ");
					String Publisher = sc.next();
					BS.addBook(BookName, BookID, AuthorID, Publisher);
					break;
				case '2':
					System.out.print("Enter the Book ID to CheckIN : ");
					int BookIDBorrowOut=sc.nextInt();
					BS.BorrowOut(BookIDBorrowOut);
					break;
				case '3':
					System.out.print("Enter the Book ID to CheckIN : ");
					int BookIDBorrowIn = sc.nextInt();
					BS.BorrowIn(BookIDBorrowIn);
					break;
				case '4':
					BS.Inventory();
					break;
				case '5':
					System.out.println("Exiting From Inventory !!!");
					flag=false;
					sc.close();
					break;
				default:
					break;
			}
		}
	}
}
