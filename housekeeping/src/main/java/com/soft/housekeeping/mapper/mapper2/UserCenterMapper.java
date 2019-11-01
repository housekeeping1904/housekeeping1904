package com.soft.housekeeping.mapper.mapper2;



import com.soft.housekeeping.entity.entity2.*;
import org.apache.ibatis.annotations.Param;

import java.util.*;


public interface UserCenterMapper
{
	//查询个人中心的菜单信息
	public List<PersonCenterMenu> getMenuInfor(Integer peopleid);

	//查询用户信息，可以和登入合并
	public FrontUser getUserInfor(Integer id);

	//修改用户信息
	public int changeUserInfor(FrontUser frontUser);

	//修改用户的地址状态
	public int changeAddressState(@Param("state")int state,
	                              @Param("addressid")int addressid);
	//修改用户地址信息
	public int changeAddressInfor(FrontAdress frontAdress);

	//增加用户地址
	public int addUserAdress(HashMap map);

	//删除用户地址
	public int delAddress(int addressid);
	//获取用户积分信息
	public List getSignInfor(Integer userid);

	//用户签到，发布需求，增加积分的记录
	public int frontSign(FrontScoreRecord scoreRecord);

	//增加用户积分
	public int addFrontSorce(@Param("uid") int uid ,@Param("score") int score);

	//获取订单信息
	public List<FrontOrder> getOrderInfor(HashMap map);

	//获取订单的总条数
	public int getOrderCount(HashMap map);

	//插入评论
	public int addComment(HashMap map);

	//修改订单的状态字段
	public int setOrderState(@Param("pid")int pid,@Param("oid")int oid);

	//修改评论表的内容字段
	public int changeComment(@Param("comment")String comment,@Param("cid")int cid);

	//获取用户的资金记录
	public List getfundInfor(@Param("uid") int uid,
	                         @Param("offset") int offset,
	                         @Param("limit") int limit);
	//获取资金记录的总数
	public int getfundCount(int uid);

	//修改用户余额
	public int topUp(@Param("uid")int uid,@Param("money")String money);

	//扣费
	public int downUp(@Param("uid")int uid,@Param("money")String money);

	//插入个人资金记录表
	public int addFundRecord(@Param("map")Map<String, Object> map);

	//插入公司资金记录表
	public int insertFund(Map<String, Object> map);

	//获取优惠券信息
	public List getCouponInfor(int uid);

	//获取用户的收藏信息
	public List getCollectInfor(int uid);

	//获取省的信息
	public List getProvince();

	//获取市的信息
	public List getCity(int pid);

	//创建优惠券
	public int creatCoupon(Coupon coupon);

	//创建优惠券和用户的关系
	public int sendCoupon(@Param("map")Map<String, Object> map);
}
