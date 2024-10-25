package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author miaodong
 * @email sunlightcs@gmail.com
 * @date 2024-10-26 02:08:15
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
