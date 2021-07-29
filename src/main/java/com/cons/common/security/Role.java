package com.cons.common.security;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {
    ADMIN("ROLE_ADMIN", "어드민"),
    MEMBER("ROLE_MEMBER", "사용자");

    private String key;
    private String title;
}