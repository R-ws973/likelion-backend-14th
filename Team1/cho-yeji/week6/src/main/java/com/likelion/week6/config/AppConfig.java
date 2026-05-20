package com.likelion.week6.config;

import com.likelion.week6.repository.MemberRepository;
import com.likelion.week6.repository.MemoryMemberRepository;
import com.likelion.week6.service.MemberService;
import org.springframework.context.annotation.Bean;

// @Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
}
