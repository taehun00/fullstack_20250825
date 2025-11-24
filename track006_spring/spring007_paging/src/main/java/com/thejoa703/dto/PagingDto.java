package com.thejoa703.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PagingDto {
	private int listtotal;		// 전체글
	private int onepagelist;	// 한페이지에 보여줄 게시물의 수
	private int pagetotal;		// 총페이지 256/10 = 25 	25페이지 + 6글 = 26개
	private int bottomlist;		// 하단의 페이지 나누기	이전	11 12 13 ... 몇개?
	private int pstartno;		// 페이지 시작번호 - 스타트번호
	
	private int current;		// 현재 페이지번호
	private int start; 			// 시작 페이지번호
	private int end;   			// 끝 페이지번호
	
	public PagingDto(int listtotal, int pstartno) {
		super();
		this.listtotal = listtotal;
		this.onepagelist = 10;
		if( listtotal <= 0 ) { listtotal = 1; }
		this.pagetotal = (int)Math.ceil(listtotal/(double)onepagelist);
		this.bottomlist = 10;
		this.pstartno = (pstartno - 1)*onepagelist + 1; // (1)1,10    (2)11,20    (3)21,30
		this.current = pstartno;	// 1	2	3	4	5
		this.start = ((current-1)/bottomlist)*bottomlist + 1;
		this.end = start + bottomlist - 1;
		if(end > pagetotal) { end=pagetotal; } //256 = 26
	}
	
}
