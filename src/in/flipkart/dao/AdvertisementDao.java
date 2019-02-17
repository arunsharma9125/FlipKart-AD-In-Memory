package in.flipkart.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import in.flikpart.session.SessionFactory;
import in.flipkart.entity.Advertisement;
import in.flipkart.entity.User.Gender;

public class AdvertisementDao {
	public void saveOrUpdate(Advertisement advertisement){
		SessionFactory.getInstance().saveOrUpdate(advertisement);
	}
	
	public List<Advertisement> getAdvertisementsByTargetAgeAndGender(Integer targetAge, Gender gender){
		Map<Integer, Advertisement> map = SessionFactory.getInstance().getAdvertisementMap();
		List<Advertisement> matchingAdvertisementList = new ArrayList<Advertisement>();
		for(Integer advertisementId: map.keySet() ){
			Advertisement advertisement = map.get(advertisementId);
			if(advertisement.getTargetAgeStart() <= targetAge && 
					advertisement.getTagetAgeEnd()  >= targetAge && 
					advertisement.getTargetGender().equals(gender) ){
				if(advertisement.getAmount() >= advertisement.getBid() ){
					matchingAdvertisementList.add(advertisement);
				}
			}
		}
		return matchingAdvertisementList;
	}
	
	public void chargeMoneyForVisit(Advertisement advertisement, Integer charge){
		System.out.println("Charging "+charge+" for advertisement "+advertisement.getAdvertiserId());
		Integer currentAmount = advertisement.getAmount();
		currentAmount = currentAmount - charge;
		advertisement.setAmount(currentAmount);
		saveOrUpdate(advertisement);
	}
}
