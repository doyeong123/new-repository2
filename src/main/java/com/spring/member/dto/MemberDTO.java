package com.spring.member.dto;

import com.spring.member.entity.MemberEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor //파라미터가 없는 기본 생성자를 생성해주고,
@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자를 만들어줍니다.
//@RequiredArgsConstructor 어노테이션은 final이나
//@NonNull인 필드 값만 파라미터로 받는 생성자를 만들어줍니다.
@ToString //toString() 을 자동으로 생성해주는 어노테이션
//toString(): Class의 변수를 String으로
// 출력해주는 메소드이다 .
public class MemberDTO {

    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setMemberEmail(memberEntity.getMemberEmail());
        memberDTO.setMemberPassword(memberEntity.getMemberPassword());
        memberDTO.setMemberName(memberEntity.getMemberName());
        return memberDTO;
    }
}
