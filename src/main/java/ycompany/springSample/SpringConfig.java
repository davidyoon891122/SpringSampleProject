package ycompany.springSample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ycompany.springSample.repository.MemberRepository;
import ycompany.springSample.repository.MemoryMemberRepository;
import ycompany.springSample.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
