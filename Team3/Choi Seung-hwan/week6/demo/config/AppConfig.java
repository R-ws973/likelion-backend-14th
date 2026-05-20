package com.example.demo.config;

import com.example.demo.service.MemberService;
import com.example.demo.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;

public class AppConfig {
  //@Configuration
  public static class MemberRepositoryConfig {
    @Bean
    public MemoryMemberRepository memoryMemberRepository() {
      return new MemoryMemberRepository();
    }
    @Bean
    public MemberService memberService() {
      return new MemberService();
    }
  }
}
