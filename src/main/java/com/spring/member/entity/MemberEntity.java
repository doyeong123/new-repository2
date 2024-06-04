package com.spring.member.entity;

import com.spring.member.dto.MemberDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "member_table") // ???
public class MemberEntity {

    @Id // pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(unique = true)
    private String memberEmail;

    @Column
    private String memberPassword;

    @Column
    private String memberName;

     public static MemberEntity toMemberEntity(MemberDTO memberDTO) {
         MemberEntity memberEntity = new MemberEntity();
         memberEntity.setMemberEmail(memberDTO.getMemberEmail());
         memberEntity.setMemberPassword(memberDTO.getMemberPassword());
         memberEntity.setMemberName(memberDTO.getMemberName());
         return memberEntity;
     }

     //update Post부분에서 sessionId도 같이 이동하기 떄문에 따로 다시 Entity를 설정해준다.
    public static MemberEntity toUpdateMemberEntity(MemberDTO memberDTO) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(memberDTO.getId());
        memberEntity.setMemberEmail(memberDTO.getMemberEmail());
        memberEntity.setMemberPassword(memberDTO.getMemberPassword());
        memberEntity.setMemberName(memberDTO.getMemberName());
        return memberEntity;
    }

}
