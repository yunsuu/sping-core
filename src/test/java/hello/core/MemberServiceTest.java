package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.service.MemberService;
import hello.core.service.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    @Test
    public void join(){
//        given
        Member member = new Member(1L, "A", Grade.VIP);

//        when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

//        then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
