package homework;

public class CourseManager {

	public void Add(Course course) {
		System.out.println("Kurslar listesine \"" + course.getName() + "\" kursu eklendi.");
	}

	public void Delete(Course course) {
		System.out.println("Kurslar listesinden \"" + course.getName() + "\" kursu silindi.");
	}

	public void Update(Course course) {
		System.out.println("Kurslar listesindeki \"" + course.getName() + "\" kursu g�ncellendi.");
	}

	public void GetAll() {
		System.out.println("Kurslar listelendi.");
	}
}
