package org.scoula.controller;


import lombok.extern.log4j.Log4j2;
import org.scoula.security.account.domain.CustomUser;
import org.scoula.security.account.domain.MemberVO;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.security.Principal;

@Controller
@RequestMapping("/security")
@Log4j2
public class SecurityController {

    @GetMapping("/all")
    public void all() {
        log.info("/security/all");
    }

    @GetMapping("/member")
    public void doMember(Principal principal) {
        log.info("username = " + principal.getName());
    }

//    @GetMapping("/member")
//    public void doMember(Authentication authentication) {
//        UserDetails userDetails = (UserDetails)authentication.getPrincipal();
//
//        log.info("username = " + userDetails.getUsername());
//    }

//    @GetMapping("/admin")
//    public void admin() {
//        log.info("/security/admin");
//    }


    @GetMapping("/admin")
    public void doAdmin(@AuthenticationPrincipal CustomUser customUser) {
        MemberVO member = customUser.getMember();
        log.info("username = " + member);
    }
    @GetMapping("/login")
    public void login() {
        log.info("/security/login");
    }

    @GetMapping("/logout")
    public void logout() {
        log.info("/security/logout");
    }
}
