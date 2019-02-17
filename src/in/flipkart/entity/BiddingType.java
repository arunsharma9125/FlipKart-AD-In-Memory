package in.flipkart.entity;

import in.flipkart.service.VisitService;

public class BiddingType {

	public enum BIDDING_TYPE{
		THE_ADVERTISER_PAYS_THE_QUOTED_BID{
			@Override
			public String getDescription(){
				return "THE ADVERTISER PAYS THE QUOTED BID";
			}
			
			@Override
			public String getMessage(User user){
				VisitService visitService = new VisitService();
				return visitService.visit1(user);
			}
		},
		THE_HIGHEST_BID_WINS_BUT_THE_ADVERTISER_IS_CHARGED_THE_PRICE_OF_THE_SECOND_HIGHEST_BID{
			@Override
			public String getDescription(){
				return "THE HIGHEST BID WINS BUT THE ADVERTISER IS CHARGED THE PRICE OF THE SECOND HIGHEST BID";
			}
			
			@Override
			public String getMessage(User user){
				VisitService visitService = new VisitService();
				return visitService.visit2(user);
			}
		};
		
		public String getDescription(){
			return null;
		}
		
		public String getMessage(User user){
			return null;
		}
	};
	
	private Integer id;
	
	private BIDDING_TYPE type;
	
	

	public Integer getId() {
		return id;
	}

	public BiddingType(BIDDING_TYPE type) {
		super();
		this.type = type;
	}
	
	public BiddingType(){}

	public void setId(Integer id) {
		this.id = id;
	}

	public BIDDING_TYPE getType() {
		return type;
	}

	public void setType(BIDDING_TYPE type) {
		this.type = type;
	}
	
	
}
