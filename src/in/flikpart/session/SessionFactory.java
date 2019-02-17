package in.flikpart.session;

import java.util.HashMap;
import java.util.Map;

import in.flipkart.entity.Advertisement;
import in.flipkart.entity.Advertiser;
import in.flipkart.entity.BiddingType;
import in.flipkart.entity.User;

public class SessionFactory {

	private Map<Integer, User> userMap = new HashMap<Integer, User>();
	
	private Map<Integer, Advertisement> advertisementMap = new HashMap<Integer, Advertisement>();
	
	private Map<Integer, Advertiser> advertiserMap = new HashMap<Integer, Advertiser>();
	
	private BiddingType currentBiddingType = null;
	
	private static SessionFactory obj;
	
	
	private SessionFactory(){}
	
	
	public static SessionFactory getInstance(){
		if(obj == null){
			obj = new SessionFactory();
		}
		return obj;
	}
	
	public void saveOrUpdate(Object obj){
		if(obj instanceof User){
			User user = (User)obj;
			if(user.getId() == null){
				int id = userMap.size()+1;
				user.setId(id);
			}
			userMap.put(user.getId(), user);
		}else if(obj instanceof Advertisement){
			Advertisement advertisement = (Advertisement)obj;
			if(advertisement.getId() == null){
				int id = advertisementMap.size() + 1;
				advertisement.setId(id);
			}
			advertisementMap.put(advertisement.getId(), advertisement);
		}else if(obj instanceof Advertiser){
			Advertiser advertiser = (Advertiser)obj;
			if(advertiser.getId() == null){
				int id = advertiserMap.size() + 1;
				advertiser.setId(id);
			}
			advertiserMap.put(advertiser.getId(), advertiser);
		}else if(obj instanceof BiddingType){
			setCurrentBiddingType((BiddingType) obj);
		}else{
			throw new RuntimeException("Not Supported object");
		}
	}
	
	public Map<Integer, User> getUserMap() {
		return userMap;
	}


	public void setUserMap(Map<Integer, User> userMap) {
		this.userMap = userMap;
	}


	public Map<Integer, Advertisement> getAdvertisementMap() {
		return advertisementMap;
	}


	public void setAdvertisementMap(Map<Integer, Advertisement> advertisementMap) {
		this.advertisementMap = advertisementMap;
	}


	public Map<Integer, Advertiser> getAdvertiserMap() {
		return advertiserMap;
	}


	public void setAdvertiserMap(Map<Integer, Advertiser> advertiserMap) {
		this.advertiserMap = advertiserMap;
	}


	public BiddingType getCurrentBiddingType() {
		return currentBiddingType;
	}


	public void setCurrentBiddingType(BiddingType currentBiddingType) {
		this.currentBiddingType = currentBiddingType;
	}	
	
	
}
