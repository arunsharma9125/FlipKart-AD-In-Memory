package in.flipkart.service;

import in.flipkart.dao.BiddingTypeDao;
import in.flipkart.entity.BiddingType;
import in.flipkart.entity.BiddingType.BIDDING_TYPE;

public class BiddingTypeService {
	private BiddingTypeDao biddingTypeDao = new BiddingTypeDao();

	public void saveOrUpdate(BiddingType biddingType) {
		biddingTypeDao.saveOrUpdate(biddingType);
	}
	
	public BiddingType setBiddingType(BIDDING_TYPE biddingType){
		return biddingTypeDao.setBiddingType(biddingType);			
	}
	
	public BiddingType geBiddingType(){
		return biddingTypeDao.getBiddingType();
	}
	
}
