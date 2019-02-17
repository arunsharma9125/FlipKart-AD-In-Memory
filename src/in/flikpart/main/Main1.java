package in.flikpart.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import in.flikpart.session.SessionFactory;
import in.flipkart.entity.Advertisement;
import in.flipkart.entity.User;
import in.flipkart.service.BiddingTypeService;

public class Main1 {

	private BiddingTypeService biddingTypeService = new BiddingTypeService();

	public static void main(String[] args) {
		FlipkartTestingProgram testProgram = new FlipkartTestingProgram();
		testProgram.run();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
			Map<Integer, User> userMap = SessionFactory.getInstance().getUserMap();

			Map<Integer, Advertisement> advertisementMap = SessionFactory.getInstance().getAdvertisementMap();
			for (int i = 1; i <= userMap.size(); i++) {
				User user = userMap.get(i);
				int x = user.getAge();
				for (int j = 1; j <= advertisementMap.size(); j++) {
					if (x >= advertisementMap.get(j).getTargetAgeStart()
							&& x <= advertisementMap.get(j).getTagetAgeEnd()) {
						System.out.println("AD :" + advertisementMap.get(j).getMessage());
						int amount = advertisementMap.get(j).getAmount();
						int bid = advertisementMap.get(j).getBid();
						amount -= bid;
						advertisementMap.get(j).setAmount(amount);
						System.out.println("Balance amount is" + advertisementMap.get(j).getAmount());
					}
				}
			}

		} else if (n == 2) {
			Map<Integer, User> userMap = SessionFactory.getInstance().getUserMap();

			Map<Integer, Advertisement> advertisementMap = SessionFactory.getInstance().getAdvertisementMap();

			for (int i = 1; i <= userMap.size(); i++) {
				User user = userMap.get(i);
				int x = user.getAge();
				for (int j = 1; j <= advertisementMap.size(); j++) {
					if (x >= advertisementMap.get(j).getTargetAgeStart()
							&& x <= advertisementMap.get(j).getTagetAgeEnd()) {
						System.out.println("AD :" + advertisementMap.get(j).getMessage());
						int amount = advertisementMap.get(j).getAmount();
						int bid = bidAmount(x);
						
						amount -= bid;
						advertisementMap.get(j).setAmount(amount);
						System.out.println("Balance amount is" + advertisementMap.get(j).getAmount());
					}
				}
			}

		}
		sc.close();

	}

	public static int bidAmount(int a) {
		int bidAmt = 0;
		Map<Integer, Advertisement> advertisementMap1 = SessionFactory.getInstance().getAdvertisementMap();
		int[] bidAmtArray= new int[advertisementMap1.size()]; 
		int j=0;
		for (int i = 1; i <= advertisementMap1.size(); i++) {
			if (a >= advertisementMap1.get(i).getTargetAgeStart() && a <= advertisementMap1.get(i).getTagetAgeEnd()) {
					bidAmtArray[j++]=advertisementMap1.get(i).getBid();
			}
		}
		Arrays.sort(bidAmtArray);
		return bidAmtArray[bidAmtArray.length -2];
	}
}
