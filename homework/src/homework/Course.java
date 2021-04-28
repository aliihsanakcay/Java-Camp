package homework;

public class Course {
	private int id;
	private int categoryId;
	private String name;
	private String description;

	public Course() {
	}

	public Course(int id, int categoryId, String name, String description) {
		this.description = description;
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	int getCategoryId() {
		return categoryId;
	}

	void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
