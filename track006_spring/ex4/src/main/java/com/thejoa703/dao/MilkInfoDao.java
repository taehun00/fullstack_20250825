package com.thejoa703.dao;

import java.util.List;

import com.thejoa703.dto.MilkInfoDto;

@MilkDao
public interface MilkInfoDao {
	public int insert(MilkInfoDto dto);
	public List<MilkInfoDto> selectAll();
	public MilkInfoDto select(int mno);
	public int update(MilkInfoDto dto);
	public int delete(int mno);
	
}
