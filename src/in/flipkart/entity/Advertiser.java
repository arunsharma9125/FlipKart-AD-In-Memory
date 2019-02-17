package in.flipkart.entity;

public class Advertiser {

	private Integer id;

	private String name;

	public Advertiser() {
	}

	public Advertiser(String name) {
		super();

		this.name = name;
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

}
