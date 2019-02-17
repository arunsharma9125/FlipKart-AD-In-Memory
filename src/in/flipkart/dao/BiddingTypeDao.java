package in.flipkart.dao;

import in.flikpart.session.SessionFactory;
import in.flipkart.entity.BiddingType;
import in.flipkart.entity.BiddingType.BIDDING_TYPE;

public class BiddingTypeDao {
	public void saveOrUpdate(BiddingType biddingType){
		SessionFactory.getInstance().saveOrUpdate(biddingType);
	}
	
	public BiddingType getBiddingType(){
		BiddingType biddingType = SessionFactory.getInstance().getCurrentBiddingType();
		return biddingType;
	}
	
	public BiddingType setBiddingType(BIDDING_TYPE biddingType){
		BiddingType biddingTypeObj = getBiddingType();
		if(biddingTypeObj == null){
			biddingTypeObj = new BiddingType(biddingType);
			saveOrUpdate(biddingTypeObj);
			return biddingTypeObj;
		}else{
			biddingTypeObj.setType(biddingType);
			return biddingTypeObj;
		}
	}
}
