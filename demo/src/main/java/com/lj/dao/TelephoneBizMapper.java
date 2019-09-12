package com.lj.dao;

import com.lj.pojo.TelephoneBiz;

public interface TelephoneBizMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TelephoneBiz record);

    int insertSelective(TelephoneBiz record);

    TelephoneBiz selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TelephoneBiz record);

    int updateByPrimaryKey(TelephoneBiz record);
}