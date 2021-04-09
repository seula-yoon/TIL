package com.encore.array.test;

import com.encore.array.Account;

public class AccountArrayTest1 {

	public static void main(String[] args) {
		// 1. Account Type의 배열을 생성...사이즈는 3

		Account[] acc = new Account[3];
		for (int i = 0; i < acc.length; i++) 
			System.out.println(acc[i]);
		

		// 2. 각각의 칸에 신한, 국민, 우리은행 통장을 생성

		acc[0] = new Account(1000.0, "신한 은행");
		acc[1] = new Account(30000.0, "국민 은행");
		acc[2] = new Account(40000.0, "우리 은행");

		// 3. for문을 사용해서 각각의 Account정보를 콘솔한다.
		for (int i = 0; i < acc.length; i++) {
			System.out.println(acc[i]); //주소값
			System.out.println(acc[i].getDetail());//각각 객체에 대한 정보 출력
		}

	}

}
