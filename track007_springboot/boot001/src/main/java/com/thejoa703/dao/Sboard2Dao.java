package com.thejoa703.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.thejoa703.dto.Sboard2Dto;

@Mapper
public interface Sboard2Dao {

	public int insert(Sboard2Dto dto);
	
	public int update(Sboard2Dto dto);
	
	public int updateHit(int id);
	
	public int delete(Sboard2Dto dto);
	
	public List<Sboard2Dto> selectAll();
	
	public Sboard2Dto select(int id);
	
	public List<Sboard2Dto> select10(HashMap<String, Integer> para);
		
	
	public int selectTotalCnt();
	
	public List<Sboard2Dto> selectSearch(HashMap<String, Object> para);

	public int selectSearchTotalCnt(String search);
	
}
