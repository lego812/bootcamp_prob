package org.scoula.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/security")
@Log4j2
public class SecurityController {

    @GetMapping("/all")
    public void all() {
        log.info("/security/all");
    }

    @GetMapping("/member")
    public void member() {
        log.info("/security/member");

    }

    @GetMapping("/admin")
    public void admin() {
        log.info("/security/admin");
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
