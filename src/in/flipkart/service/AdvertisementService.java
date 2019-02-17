package in.flipkart.service;

import java.util.List;

import in.flipkart.dao.AdvertisementDao;
import in.flipkart.entity.Advertisement;
import in.flipkart.entity.User.Gender;

public class AdvertisementService {

	private AdvertisementDao advertisementDao = new AdvertisementDao();

	public void saveOrUpdate(Advertisement advertisement) {
		advertisementDao.saveOrUpdate(advertisement);
	}
	
	public Advertisement createAdvertisement(Integer targetAgeStart, Integer tagetAgeEnd, Gender targetGender, Integer advertiserId,
			String message, Integer bid, Integer amount) {
		Advertisement advertisement = new Advertisement(targetAgeStart, tagetAgeEnd, targetGender, advertiserId, message, bid, amount);
		advertisementDao.saveOrUpdate(advertisement);
		return advertisement;
	}
	
	public List<Advertisement> getAdvertisementsByTargetAgeAndGender(Integer targetAge, Gender gender){
		return advertisementDao.getAdvertisementsByTargetAgeAndGender(targetAge, gender);
	}
	
	public void chargeMoneyForVisit(Advertisement advertisement, Integer charge){
		advertisementDao.chargeMoneyForVisit(advertisement, charge);;
	}

}
