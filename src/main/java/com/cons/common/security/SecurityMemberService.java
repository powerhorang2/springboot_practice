package com.cons.common.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class SecurityMemberService implements UserDetailsService {

    private SecurityRepository securityRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<SecurityMemberEntity> securityMemberEntiryOptional = securityRepository.findByEmail(username);
        SecurityMemberEntity securityMemberEntiry = securityMemberEntiryOptional.orElse(null);


        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(securityMemberEntiry.getRoleKey()));


//        return new SecurityCustomDTO(securityMemberEntiry, securityMemberEntiry.getName(),
//                securityMemberEntiry.getUpwd(), authorities);

        if ("admin@test.com".equals(username)) {
            authorities.add(new SimpleGrantedAuthority(Role.ADMIN.getKey()));
        } else {
            authorities.add(new SimpleGrantedAuthority(Role.MEMBER.getKey()));
        }
        log.info("username : " + username);
        return new User(securityMemberEntiry.getEmail(), securityMemberEntiry.getUpwd(), authorities);
    }

    public SecurityMemberEntity signupMember(SecurityMemberDTO securityMemberVO) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        securityMemberVO.setUpwd(bCryptPasswordEncoder.encode(securityMemberVO.getUpwd()));

        return securityRepository.save(securityMemberVO.toEntity());
    }
}
