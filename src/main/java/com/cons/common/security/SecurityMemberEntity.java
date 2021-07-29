package com.cons.common.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity(name = "member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SecurityMemberEntity extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = true, length = 300)
    private String upwd;

    @Enumerated(EnumType.STRING)
    @Column
    private Role role;


    @Builder
    public SecurityMemberEntity(Long id, String email, String name, String upwd, Role role) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.upwd = upwd;
        this.role = role;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }

    public SecurityMemberEntity update(String name, String email) {
        this.name = name;
        this.email = email;
        return this;
    }
}