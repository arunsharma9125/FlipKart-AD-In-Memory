package in.flipkart.service;

import in.flipkart.dao.AdvertiserDao;
import in.flipkart.entity.Advertiser;

public class AdvertiserService {
	private AdvertiserDao advertiserDao = new AdvertiserDao();

	public void saveOrUpdate(Advertiser advertiser) {
		advertiserDao.saveOrUpdate(advertiser);
	}

	public Advertiser createAdvertiser(String name) {
		Advertiser advertiser = new Advertiser(name);
		advertiserDao.saveOrUpdate(advertiser);
		return advertiser;
	}
}
