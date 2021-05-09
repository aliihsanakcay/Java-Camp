package homework3.dataAccess.concretes;

import homework3.dataAccess.abstracts.CampaignDao;
import homework3.entities.concretes.Campaign;

public class InMemoryCampaignDao implements CampaignDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi " + campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi " + campaign.getCampaignName());
	}

}
