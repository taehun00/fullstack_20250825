package com.thejoa703.util;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UtilPaging {
	private  int  listtotal;    //#1) 전체글 139
	private  int  onepagelist;  //#2) 한페이지에 보여줄 게시물의 수 10
	private  int  pagetotal;    //#3) 총페이지수 139/10    13페이지 + 9개글 = 20개
	private  int  bottomlist;   //#4) 하단에 페이지 수 		이전 11 12 13 14 15 다음
	private  int  pstartno;     //#5) 페이지 시작번호 (1) 1,10  (2) 11,20
	private  int current;       //#6) 하단에 페이지수 이전 11 12 13 14 15 다음 
	private  int start;         //#7) 
	private  int end;			//#8)
	   
	public UtilPaging(int listtotal, int pageNo) {
		this(listtotal, pageNo, 10, 10);
	}
	
	public UtilPaging(int listtotal, int pageNo, int onepagelist, int bottomlist) {
		this.listtotal = (listtotal<=0)? 1: listtotal;
		this.onepagelist = onepagelist;
		this.pagetotal = (int)Math.ceil(this.listtotal / (double)onepagelist);
		this.bottomlist = bottomlist;
		this.current = pageNo;
		this.start = ((current-1)/bottomlist)*bottomlist + 1;
		this.end = start + bottomlist - 1;
		if(end > pagetotal) {
			end = pagetotal;
		}
		
		this.pstartno = (pageNo - 1) * onepagelist + 1;
	} 
	
	
	   
}
