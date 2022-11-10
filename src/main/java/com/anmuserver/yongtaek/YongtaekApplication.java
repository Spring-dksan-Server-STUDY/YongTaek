package com.anmuserver.yongtaek;

//import com.anmuserver.yongtaek.week3.login.KakaoLogin;
//import com.anmuserver.yongtaek.week3.login.NaverLogin;
//import com.anmuserver.yongtaek.week3.login.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.anmuserver.yongtaek.week1.User;
import com.anmuserver.yongtaek.week1.UserServiceImpl;
import com.anmuserver.yongtaek.week1.Server;
import com.anmuserver.yongtaek.week1.PrintObject;
import com.anmuserver.yongtaek.assingment1.TteokbokkiServiceImpl;

@SpringBootApplication
public class YongtaekApplication {

	public static void main(String[] args) {
		SpringApplication.run(YongtaekApplication.class, args);
		System.out.println("test");
//		//User class
//		User user = new User(1,"이용택","서버");
//		user.introduce();
//
//		user.setName("이용택2");
//		user.setPart("웹");
//
//		String name = user.getName();
//		System.out.println("name = "+ name);
//		user.introduce();
//
//		//interface
//		UserServiceImpl userService = new UserServiceImpl();
//
//		String club = userService.CLUB;
//		System.out.println(club);
//
//		userService.introduce("이용택", 25, "ESFP");
//		userService.getInfo(31, "server");
//		userService.getSOPT();
//
//		// extends
//		Server server = new Server("이용택", "스프링 안무솹다");
//		String serverName = server.getName();
//		String serverStudy = server.getStudy();
//		System.out.println("name = " + serverName + " study = " + serverStudy);
//
//		//generic
//		PrintObject<Integer> object1 = new PrintObject<>(31);
//		PrintObject<String> object2 = new PrintObject<>("server");
//		object1.printData();
//		object2.printData();
//
//		//assignment
//		TteokbokkiServiceImpl tteokbokkiService = new TteokbokkiServiceImpl();
//		String brandName = tteokbokkiService.NAME;
//		System.out.println(brandName);
//
//		tteokbokkiService.introduce("엽떡","착한맛");
//		tteokbokkiService.getSideMenuInfo("주먹밥");
//		tteokbokkiService.introduceYupdduck();
//
//		//
////		UserService userService = new UserService(new KakaoLogin());
////		userService.login();
////		UserService userService2 = new UserService(new NaverLogin());
////		userService2.login();
//		System.out.println("test");
	}

}
