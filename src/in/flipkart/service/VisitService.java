package in.flipkart.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import in.flipkart.entity.Advertisement;
import in.flipkart.entity.User;

public class VisitService {

	private AdvertisementService advertisementService = new AdvertisementService();
	
	private BiddingTypeService biddingTypeService = new BiddingTypeService();
	
	public String visit1(User user){
		List<Advertisement> matchingAdvertisements = advertisementService.getAdvertisementsByTargetAgeAndGender(user.getAge(), user.getGender() );
		if(matchingAdvertisements.size() == 0){
			return null;
		}
		Collections.sort(matchingAdvertisements, new Comparator<Advertisement>() {

			@Override
			public int compare(Advertisement advertisement1, Advertisement advertisement2) {
				return advertisement2.getBid().compareTo(advertisement1.getBid());
			}
		});
		Advertisement advertisement = matchingAdvertisements.get(0);
		advertisementService.chargeMoneyForVisit(advertisement, advertisement.getBid() );
		return advertisement.getMessage();
	}
	
	public String visit2(User user){
		List<Advertisement> matchingAdvertisements = advertisementService.getAdvertisementsByTargetAgeAndGender(user.getAge(), user.getGender() );
		if(matchingAdvertisements.size() == 0){
			return null;
		}
		if(matchingAdvertisements.size() == 1){
			return visit1(user);
		}
		Collections.sort(matchingAdvertisements, new Comparator<Advertisement>() {

			@Override
			public int compare(Advertisement advertisement1, Advertisement advertisement2) {
				return advertisement2.getBid().compareTo(advertisement1.getBid());
			}
		});
		Advertisement advertisement1 = matchingAdvertisements.get(0);
		Advertisement advertisement2 = matchingAdvertisements.get(1);
		advertisementService.chargeMoneyForVisit(advertisement1, advertisement2.getBid() );
		return advertisement1.getMessage();
	}
	
	public void visit(User user){
		String message =  biddingTypeService.geBiddingType().getType().getMessage(user);
		if(message == null){
			System.out.println("No Advertisement for "+user.getName());
		}else{
			System.out.println("Showing Advertisement for "+user.getName()+" "+message);
		}
	}
}
