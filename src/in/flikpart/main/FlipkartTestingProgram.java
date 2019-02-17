package in.flikpart.main;

import in.flipkart.entity.Advertisement;
import in.flipkart.entity.Advertiser;
import in.flipkart.entity.BiddingType.BIDDING_TYPE;
import in.flipkart.entity.User;
import in.flipkart.entity.User.Gender;
import in.flipkart.service.AdvertisementService;
import in.flipkart.service.AdvertiserService;
import in.flipkart.service.BiddingTypeService;
import in.flipkart.service.UserService;
import in.flipkart.service.VisitService;

public class FlipkartTestingProgram {

	private UserService userService = new UserService();
	private AdvertiserService advertiserService = new AdvertiserService();
	private AdvertisementService advertisementService = new AdvertisementService();
	private BiddingTypeService biddingTypeService = new BiddingTypeService();
	private VisitService visitService = new VisitService();

	public void run() {

		User arun = userService.createUser("Arun", Gender.M, 28);
		User seena = userService.createUser("Seena", Gender.M, 28);
		User adya = userService.createUser("Adya", Gender.F, 1);

		Advertiser samsung = advertiserService.createAdvertiser("Samsung");
		Advertiser nike = advertiserService.createAdvertiser("Nike");

		Advertisement advertisement1 = advertisementService.createAdvertisement(20, 30, Gender.M, nike.getId(),
				"This is Nike For Men", 100, 200);
		Advertisement advertisement2 = advertisementService.createAdvertisement(20, 30, Gender.M, samsung.getId(),
				"Hi This is Samsung", 200, 350);
		Advertisement advertisement3 = advertisementService.createAdvertisement(0, 20, Gender.F, nike.getId(),
				"Hi This is Nike For Women and Girls", 150, 5000);
		
		biddingTypeService.setBiddingType(BIDDING_TYPE.THE_ADVERTISER_PAYS_THE_QUOTED_BID);
		
		visitService.visit(arun);
		visitService.visit(seena);
		visitService.visit(adya);

		biddingTypeService.setBiddingType(BIDDING_TYPE.THE_HIGHEST_BID_WINS_BUT_THE_ADVERTISER_IS_CHARGED_THE_PRICE_OF_THE_SECOND_HIGHEST_BID);
		
		visitService.visit(arun);
		visitService.visit(seena);
		visitService.visit(adya);
	}
}
