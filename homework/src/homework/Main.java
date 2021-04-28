package homework;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Sistem");

		Category[] categories = { category1, category2 };

		CategoryManager categoryManager = new CategoryManager();
		categoryManager.Add(category1);
		categoryManager.Add(category2);

		Course course1 = new Course(1, 1, "JAVA + REACT Kampý", "Bu bir java dili öðrenme kampýdýr.");
		Course course2 = new Course(2, 1, "C# + ANGULAR Kampý", "Bu bir C# dili öðrenme kampýdýr.");
		Course course3 = new Course(3, 2, "Bilgi Güvenliði", "Bu bir Bilgi Güvenliði kampýdýr.");

		Course[] courses = { course1, course2, course3 };

		CourseManager courseManager = new CourseManager();
		courseManager.Add(course1);
		courseManager.Add(course2);
		courseManager.Add(course3);

		System.out.println("\nKurslar => ");
		for (Course course : courses) {
			System.out.println("Kursun adý => " + course.getName() + "\tKursun Kategori id si => " + course.getCategoryId()
					+ "\tKursun Açýklamasý => " + course.getDescription());
		}
		courseManager.GetAll();

		System.out.println("\nKategoriler => ");
		for (Category category : categories) {
			System.out.println("Kategorinin id si => " + category.getId() + "\tKategorinin adý => " + category.getName());
		}
		categoryManager.GetAll();

	}

}
