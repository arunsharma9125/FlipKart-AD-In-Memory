 package in.flipkart.entity;

import in.flipkart.entity.User.Gender;

public class Advertisement {

	private Integer id;
	
	private Integer targetAgeStart;
	
	private Integer tagetAgeEnd;
	
	private Gender targetGender;
	
	private Integer advertiserId;
	
	private String message;
	
	private Integer bid;
	
	private Integer amount;
	
	public Advertisement(){}
	
	public Advertisement(Integer targetAgeStart, Integer tagetAgeEnd, Gender targetGender, Integer advertiserId,
			String message, Integer bid, Integer amount) {
		super();
		this.targetAgeStart = targetAgeStart;
		this.tagetAgeEnd = tagetAgeEnd;
		this.targetGender = targetGender;
		this.advertiserId = advertiserId;
		this.message = message;
		this.bid = bid;
		this.amount = amount;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTargetAgeStart() {
		return targetAgeStart;
	}

	public void setTargetAgeStart(Integer targetAgeStart) {
		this.targetAgeStart = targetAgeStart;
	}

	public Integer getTagetAgeEnd() {
		return tagetAgeEnd;
	}

	public void setTagetAgeEnd(Integer tagetAgeEnd) {
		this.tagetAgeEnd = tagetAgeEnd;
	}

	public Gender getTargetGender() {
		return targetGender;
	}

	public void setTargetGender(Gender targetGender) {
		this.targetGender = targetGender;
	}

	public Integer getAdvertiserId() {
		return advertiserId;
	}

	public void setAdvertiserId(Integer advertiserId) {
		this.advertiserId = advertiserId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Advertisement [targetAgeStart=" + targetAgeStart + ", tagetAgeEnd=" + tagetAgeEnd + ", targetGender="
				+ targetGender + ", amount=" + amount + "]";
	}
	
	
	
	
}
