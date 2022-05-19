package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
@Slf4j
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String url = "client_id=WA-0011&isCookie=true&page_location=https://obank.kbstar.com/quics?page=C055068&_ga=2.60978852.965342561.1652860908-1008050518.1645684137&QSL=F&page_referrer=https://www.kbstar.com/&session_id=|1652866372467&session_start=1652866372467&language=ko&country=KR&page_title=예금 ( 개인뱅킹 | 조회 | 계좌조회 | 국민은행 계좌조회 | 예금 )&screen_resolution=1920X1080&_m_uid=6fb7a961-8a4c-3536-aa5b-fddefc725204&user_attribute={}&event_type=page_view&event_category=&event_label=&search_term=&_oaid=&event_attribute={}";
		String url2 = "client_id=WA-0011&isCookie=true&page_location=https://obank.kbstar.com/quics?page=C055068&_ga=2.60978852.965342561.1652860908-1008050;518.1645684137&QSL=F&page_referrer=";
		String url3 = "client_id=WA-0011&isCookie=true&page_location=https://obank.kbstar.com/quics?page=C055068&_ga=2.60978852.965342561.1652;860908-1008050";
		String url4 = "860908-1008050;518.1645684137&QSL=F&page_referrer=";

		//Pattern pattern = Pattern.compile("(^|(?![0-9a-zA-Z\\-]).)(01\\d{1}|02|0505|0502|0506|0\\d{1,2})-(\\d{3,4})-(\\d{4})(?![0-9a-zA-Z\\-])");
		Pattern pattern = Pattern.compile("(^|(?![0-9a-zA-Z\\-]).)\\d{2}([0][1-9]|[1][0-2])([0][1-9]|[1-2]\\d|[3][0-1])-[1-4]\\d{6}(?![0-9a-zA-Z\\-])");

		Matcher matcher = pattern.matcher(url);

		log.info("find : {} : {}", matcher.find(), matcher.toMatchResult());

		Matcher matcher2 = pattern.matcher(url2);
		log.info("find : {} : {}", matcher2.find(), matcher2.toMatchResult());

		Matcher matcher3 = pattern.matcher(url3);
		log.info("find : {} : {}", matcher3.find(), matcher3.toMatchResult());

		Matcher matcher4 = pattern.matcher(url4);
		log.info("find : {} : {}", matcher4.find(), matcher4.toMatchResult());
	}
}
