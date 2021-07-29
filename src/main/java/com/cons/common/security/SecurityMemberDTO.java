package com.cons.common.security;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SecurityMemberDTO {

    private Long id;
    private String name;
    private String email;
    private String upwd;
    private Role role;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public SecurityMemberEntity toEntity() {
        return SecurityMemberEntity.builder()
                .id(this.id)
                .name(this.name)
                .email(this.email)
                .upwd(this.upwd)
                .role(Role.MEMBER)
                .build();
    }

    @Builder
    public SecurityMemberDTO(Long id, String name, String email, String upwd, Role role, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.upwd = upwd;
        this.role = role;
    }
}
