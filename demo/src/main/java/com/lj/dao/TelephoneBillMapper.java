package com.lj.dao;

import com.lj.pojo.TelephoneBill;

public interface TelephoneBillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TelephoneBill record);

    int insertSelective(TelephoneBill record);

    TelephoneBill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TelephoneBill record);

    int updateByPrimaryKey(TelephoneBill record);
}