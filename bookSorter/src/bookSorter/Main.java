package bookSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Book> bookSet = new TreeSet<>();

		bookSet.add(new Book("Acýmak", 160, "Reþat Nuri Güntekin", 1928));
		bookSet.add(new Book("Çalýkuþu", 544, "Reþat Nuri Güntekin", 1922));
		bookSet.add(new Book("Aþk-ý Memnu", 514, "Halid Ziya Uþaklýgil", 1899));
		bookSet.add(new Book("Araba Sevdasý", 272, "Recaizade Mahmud Ekrem", 1898));
		bookSet.add(new Book("Kürk Mantolu Madonna", 160, "Sabahattin Ali", 1943));
		bookSet.add(new Book("Dokuzuncu Hariciye Koðuþu", 112, "Peyami Safa", 1930));
		bookSet.add(new Book("Kuyucaklý Yusuf", 221, "Sabahattin Ali", 1937));
		bookSet.add(new Book("Sinekli Bakkal", 424, "Halide Edip Adývar", 1935));
		bookSet.add(new Book("Eylül", 275, "Mehmet Rauf", 1900));
		bookSet.add(new Book("Yaban", 215, "Yakup Kadri Karaosmanoðlu", 1932));
		
		System.out.println("\n********** Book Treeset sort by name of book was listed. **********\n");
		
		for (Book book : bookSet) {
			System.out.println(book.getBookName() + " " + book.getNumberOfPage());
		}
		
		Comparator<Book> numberOfPageCompare = new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return (o1.getNumberOfPage() - o2.getNumberOfPage());
			}
		};

		//sorted by number of page of book
		List<Book> bookList = new ArrayList<>(bookSet);
		Collections.sort(bookList, numberOfPageCompare);

		System.out.println("\n********** Book HashSet listed sorted by number of page of book. **********\n");
		
		for (Book book : bookList) {
			System.out.println(book.getBookName() + " " + book.getNumberOfPage());
		}
	}

}
