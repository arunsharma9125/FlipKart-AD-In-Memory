package in.flipkart.entity;

public class User {

	public enum Gender {
		M, F;
	};

	private Integer id;

	private String name;

	private Gender gender;

	private Integer age;
	
	public User(){}

	public User(String name, Gender gender, Integer age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
