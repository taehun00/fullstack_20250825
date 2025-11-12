package com.thejoa703.service;

import java.util.List;

import com.thejoa703.dto.Sboard1Dto;

public interface Sboard1Service {
	public int insert(Sboard1Dto dto);//기능
	public List<Sboard1Dto> selectAll();//전체
	public Sboard1Dto select(int id);//상세	( 조회수올리기 + 해당글가져오기 )
	public int update(Sboard1Dto dto);//기능
	public int delete(Sboard1Dto dto);//기능
	public Sboard1Dto selectUpdateForm(int id);
	public int updateHit(int id);
}
