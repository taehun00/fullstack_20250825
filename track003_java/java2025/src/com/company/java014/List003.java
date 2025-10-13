package com.company.java014;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List003 {
	public static void main(String[] args) {
		
		List<IceCreamDTO> icecream = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String name;
		int price;
		
		int num = -1;
		while(num!=0) {
			System.out.print("❄️🍦 Welcome to the Magical IceCream Land 🍦❄️" + "\n✨ 오늘도 달콤한 하루가 시작됩니다! ✨ "
					+ "\n🛎️ 손님~ 어떤 아이스크림을 원하시나요?  "
					+ "\n--------------------------------------------------"
					+ "\n📋 메뉴판 " + "\n🍧 IceCream Menu 🍧  "
					+ "\n1️ 아이스크림 추가" + "\n2️ 아이스크림 목록 보기"
					+ "\n3️ 아이스크림 제거" + "\n4️ 아이스크림 존재 확인"
					+ "\n5️ 총 아이스크림 개수" + "\n0️ 종료" + "\n👉 선택: ");
			num = sc.nextInt();
			
			if (num == 1) {
				System.out.print("아이스크림 이름: ");
				name = sc.next();
				System.out.print("아이스크림 가격: ");
				price = sc.nextInt();
				
				icecream.add( new IceCreamDTO(price, name));
			}
			if (num == 2) {
				System.out.println("현재 아이스크림 목록:");
				if(icecream.size() == 0) {
					System.out.print("아직 등록된 아이스크림이 없습니다.");
				}
				else {
					for (IceCreamDTO item : icecream) {
			            System.out.println("- " + item.getName() + " (" + item.getPrice() + "원)");
			        }
				}
			}
			if (num == 3) {
				System.out.print("제거할 아이스크림 이름:");
				name = sc.next();
				int find = -1;
				for(int i = 0; i<icecream.size(); i++) {
					if(icecream.get(i).getName().equals(name)) {
						find = 0;
						icecream.remove(i);
						System.out.println("제거 완료!");
						break;
					}
				}
				
				if (find == -1) {
					System.out.println("해당 아이스크림이 존재하지 않습니다.");
				}
			}
			if (num == 4) {
				System.out.print("확인할 아이스크림 이름:");
				name = sc.next();
				int find = -1;
				for(int i = 0; i<icecream.size(); i++) {
					if(icecream.get(i).getName().equals(name)) {
						System.out.println("존재합니다!");
						find = 0;
						break;
					}
				}
				
				if (find == -1) {
					System.out.println("존재하지 않습니다.");
				}
			}
			if (num == 5) {
				System.out.println("총 아이스크림 개수:" + icecream.size());
			}
		}
	}

}
// add, get, size, remove, contains
class IceCreamDTO{
	int price;
	String name;
	public IceCreamDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IceCreamDTO(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	@Override
	public String toString() {
		return "IceCreamDTO [price=" + price + ", name=" + name + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}