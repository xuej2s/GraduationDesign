package sdu.lpy.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdu.lpy.dao.ActivityManageMapper;
import sdu.lpy.dao.CardFeeMapper;
import sdu.lpy.dao.CardMapper;
import sdu.lpy.dao.VipMapper;
import sdu.lpy.entity.ActivityManage;
import sdu.lpy.entity.Card;
import sdu.lpy.entity.CardFee;
import sdu.lpy.entity.Vip;
import sdu.lpy.service.AdminActivityService;
import sdu.lpy.service.VipConfigService;
import sdu.lpy.util.WebUtil;

@Service("vipConfigService")
public class VipConfigServiceImpl implements VipConfigService {

	@Autowired
	private VipMapper vipMapper;

	@Autowired
	private CardMapper cardMapper;

	@Autowired
	private CardFeeMapper cardFeeMapper;

	@Autowired
	private ActivityManageMapper activityManageMapper;

	public Vip getVip(String vipId) {
		// TODO Auto-generated method stub
		return vipMapper.selectByPrimaryKey(vipId);
	}

	public int updatePw(String oldPw, String newPw, String vipId) {
		// TODO Auto-generated method stub
		Vip vip = vipMapper.selectByPrimaryKey(vipId);
		int a = 0;
		if (oldPw.equals(vip.getVipPassword())) {
			a = vipMapper.updatePw(vipId, newPw);
		}
		return a;
	}

	public List<Vip> getAllVips() {
		// TODO Auto-generated method stub

		return vipMapper.getAllVips();
	}

	public int insertSelective(Vip vip) {
		// TODO Auto-generated method stub
		String vipId = vip.getVipId();
		String cardType = vip.getCardType();
		Date date = new Date();

		Card card = cardMapper.selectByPrimaryKey(cardType);
		double profit1 = card.getCardCost();

		List<ActivityManage> activityManages = activityManageMapper.selectByDate(date);
		double discount = 1;
		// 判断是否有活动优惠
		if (activityManages.size() > 0) {

			for (int i = 0; i < activityManages.size(); i++) {
				String actObj = activityManages.get(i).getActivityObj();
				String actCardType = activityManages.get(i).getCardType();
				if (actObj == "0" || actObj == "1") {
					if (actCardType == "0" || actCardType == cardType) {
						discount = activityManages.get(i).getDiscount();
						break;
					} else {
						activityManages.remove(i);
					}
				} else {
					activityManages.remove(i);
				}
			}
		}
		int days = card.getCardTime();
		Date endDate = WebUtil.getEndTime(date, days);
		
		// 完善vip信息
		vip.setVipCard(vipId);
		vip.setEndTime(endDate);
		vip.setVipPassword(vipId);

		// 办卡收益对象
		CardFee cardFee = new CardFee();
		cardFee.setVipId(vipId);
		cardFee.setCardType(cardType);
		cardFee.setStartTime(date);
		cardFee.setCardFee(profit1 * discount);

		int a = vipMapper.insertSelective(vip);
		int b = cardFeeMapper.insertSelective(cardFee);
		return a+b;
	}

	public int deleteByPrimaryKey(String vipId) {
		// TODO Auto-generated method stub
		return vipMapper.deleteByPrimaryKey(vipId);
	}

}
