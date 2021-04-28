package homework;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Sistem");

		Category[] categories = { category1, category2 };

		CategoryManager categoryManager = new CategoryManager();
		categoryManager.Add(category1);
		categoryManager.Add(category2);

		Course course1 = new Course(1, 1, "JAVA + REACT Kamp�", "Bu bir java dili ��renme kamp�d�r.");
		Course course2 = new Course(2, 1, "C# + ANGULAR Kamp�", "Bu bir C# dili ��renme kamp�d�r.");
		Course course3 = new Course(3, 2, "Bilgi G�venli�i", "Bu bir Bilgi G�venli�i kamp�d�r.");

		Course[] courses = { course1, course2, course3 };

		CourseManager courseManager = new CourseManager();
		courseManager.Add(course1);
		courseManager.Add(course2);
		courseManager.Add(course3);

		System.out.println("\nKurslar => ");
		for (Course course : courses) {
			System.out.println("Kursun ad� => " + course.getName() + "\tKursun Kategori id si => " + course.getCategoryId()
					+ "\tKursun A��klamas� => " + course.getDescription());
		}
		courseManager.GetAll();

		System.out.println("\nKategoriler => ");
		for (Category category : categories) {
			System.out.println("Kategorinin id si => " + category.getId() + "\tKategorinin ad� => " + category.getName());
		}
		categoryManager.GetAll();

	}

}
