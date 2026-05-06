package com.backend14.demo.config;

import com.backend14.demo.package2.MemberService;
import com.backend14.demo.package2.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AppConfig {
    @Bean
    public MemoryMemberRepository MemoryMemberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public MemberService memberService(MemoryMemberRepository memoryMemberRepository) {
        return new MemberService(memoryMemberRepository);
    }
}
