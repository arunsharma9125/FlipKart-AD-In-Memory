package in.flipkart.dao;

import in.flikpart.session.SessionFactory;
import in.flipkart.entity.Advertiser;

public class AdvertiserDao {

	public void saveOrUpdate(Advertiser advertiser){
		SessionFactory.getInstance().saveOrUpdate(advertiser);
	}
}
