package homework3.business.concretes;

import homework3.business.abstracts.CampaignService;
import homework3.dataAccess.abstracts.CampaignDao;
import homework3.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	private CampaignDao campaignDao;
	
	public CampaignManager(CampaignDao campaignDao) {
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		campaignDao.add(campaign);
	}

	@Override
	public void update(Campaign campaign) {
		campaignDao.update(campaign);
	}

	@Override
	public void delete(Campaign campaign) {
		campaignDao.delete(campaign);
	}

}
