// Library management system using oops concept
package Assignment2;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

class Books{String BookName; int BookID; int AuthorID; String Publisher; boolean isAvailable;}
class Student{int StudentID; String StudentName; String Course;}
class BookStore {
	int StudentID; String StudentName; String Course;String BookName; int BookID; int AuthorID; String Publisher;boolean isAvailable;
	LinkedList<Books> BookDetails=new LinkedList<>();
	LinkedList<Student> Student_Details=new LinkedList<>();

	LinkedList<BookStore> StoreDetails=new LinkedList<>();

	public void addBook(String BookName, int BookID, int AuthorID, String Publisher) {
		Books temp = new Books();
		temp.BookName = BookName;
		temp.BookID = BookID;
		temp.AuthorID = AuthorID;
		temp.Publisher = Publisher;
		temp.isAvailable = true;
		this.BookDetails.add(temp);
	}
	public void addStudent(int StudentID, String StudentName, String Course) {
		Student temp = new Student();
		temp.StudentID = StudentID;
		temp.StudentName = StudentName;
		temp.Course = Course;
		this.Student_Details.add(temp);
	}
	public void BorrowOut(int BookID, String StudentName) {
		boolean flag = false;
		for (Books BookData : BookDetails) {
			if (BookData.BookID == BookID) {
				if (BookData.isAvailable) {
					System.out.println("Book is Available...");
					for(Student StudentData : Student_Details){
						if(Objects.equals(StudentData.StudentName, StudentName)){
							BookStore BookStoreD = new BookStore();
							BookStoreD.StudentID=StudentData.StudentID;
							BookStoreD.StudentName=StudentData.StudentName;
							BookStoreD.Course=StudentData.Course;
							BookStoreD.BookName=BookData.BookName;
							BookStoreD.BookID=BookData.BookID;
							BookStoreD.AuthorID=BookData.AuthorID;
							BookStoreD.Publisher=BookData.Publisher;
							BookStoreD.isAvailable=BookData.isAvailable;
							this.StoreDetails.add(BookStoreD);
						}
					}
					System.out.println("And Book is Rented Successfully...");
					BookData.isAvailable = false;
				}else{
					System.out.println("Book is already Rented...");
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
					System.out.println("Book is Returned...");
					BookData.isAvailable = true;
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
	public void BooksDetails() {
		System.out.println("\nAll Library Books Record: ");
		System.out.printf("%6s%8s%12s%14s%15s%15s","Sr.No.","BookName","BookID","AuthorID","Publisher","isAvailable");
		System.out.println();
		for (Books BookData : BookDetails) {
			System.out.printf("%6s%8s%12s%14s%15s%15s",BookData,BookData.BookName,BookData.BookID,BookData.AuthorID,BookData.Publisher,BookData.isAvailable);
			System.out.println();
		}
	}
	public void StudentDetails() {
		System.out.println("\nAll Student Detail Record: ");
		System.out.printf("%6s%12s%18s%14s","Sr.No.","StudentID","StudentName","Course");
		System.out.println();
		for (Student StudentData : Student_Details) {
			System.out.printf("%6s%12s%18s%14s",StudentData,StudentData.StudentID,StudentData.StudentName,StudentData.Course);
			System.out.println();
		}
	}

	public void Inventory() {
		System.out.println("\nInventory Record: ");
		System.out.printf("%6s%12s%18s%14s%8s%12s%14s%15s%15s","Sr.No.","StudentID","StudentName","Course","BookName","BookID","AuthorID","Publisher","isAvailable");
		System.out.println();
		for (BookStore BookStoreDetails : StoreDetails) {
			System.out.printf("%6s%12s%18s%14s%8s%12s%14s%15s%15s",BookStoreDetails,BookStoreDetails.StudentID,BookStoreDetails.StudentName,BookStoreDetails.Course,BookStoreDetails.BookName,BookStoreDetails.BookID,BookStoreDetails.AuthorID,BookStoreDetails.Publisher,BookStoreDetails.isAvailable);
			System.out.println();

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
			System.out.println("""
					Press 1 : To Add Book
					Press 2 : To Add Student
					Press 3 : To Borrow Book
					Press 4 : To Return Book
					Press 5 : To View Book Details
					Press 6 : To View Student Details
					Press 7 : To View Inventory
					Press 8 : Exit""");
			System.out.println("\nEnter Your Choice : ");
			char ch=sc.next().charAt(0);
			sc.nextLine();
			switch (ch) {
				case '1' -> {
					System.out.print("Enter the Book Title : ");
					String BookName = sc.next();
					System.out.print("Enter the Book ID : ");
					int BookID = sc.nextInt();
					System.out.print("Enter the Author ID : ");
					int AuthorID = sc.nextInt();
					System.out.print("Enter the Publisher Name : ");
					String Publisher = sc.next();
					BS.addBook(BookName, BookID, AuthorID, Publisher);
				}
				case '2' -> {
					System.out.print("Enter Student's ID : ");
					int StudentID = sc.nextInt();
					System.out.print("Enter Student's Name : ");
					String StudentName = sc.next();
					System.out.print("Enter Course : ");
					String Course = sc.next();
					BS.addStudent(StudentID, StudentName, Course);
				}
				case '3' -> {
					System.out.print("Enter the Book ID to CheckIN : ");
					int BookIDBorrowOut = sc.nextInt();
					System.out.print("Enter name of student: ");
					String BorrowStudentName = sc.next();
					BS.BorrowOut(BookIDBorrowOut, BorrowStudentName);
				}
				case '4' -> {
					System.out.print("Enter the Book ID to CheckIN : ");
					int BookIDBorrowIn = sc.nextInt();
					BS.BorrowIn(BookIDBorrowIn);
				}
				case '5' -> BS.BooksDetails();
				case '6' -> BS.StudentDetails();
				case '7' -> BS.Inventory();
				case '8' -> {
					System.out.println("Exiting From Inventory !!!");
					flag = false;
					sc.close();
				}
				default -> {
				}
			}
		}
	}
}
