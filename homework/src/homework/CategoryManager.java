package homework;

public class CategoryManager {

	public void Add(Category category) {
		System.out.println("Kategoriler listesine \"" + category.getName() + "\" kategorisi eklendi.");
	}

	public void Delete(Category category) {
		System.out.println("Kategoriler listesinden \"" + category.getName() + "\" kategorisi silindi.");
	}

	public void Update(Category category) {
		System.out.println("Kategoriler listesindeki \"" + category.getName() + "\" kategorisi güncellendi.");
	}

	public void GetAll() {
		System.out.println("Kategoriler listelendi.");
	}
}
