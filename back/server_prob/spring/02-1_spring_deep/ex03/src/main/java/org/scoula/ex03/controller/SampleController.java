package org.scoula.ex03.controller;


import lombok.extern.log4j.Log4j2;
import org.scoula.ex03.DTO.SampleDTO;
import org.scoula.ex03.DTO.TodoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

@Controller
@RequestMapping("/sample")
@Log4j2
public class SampleController {

    @RequestMapping("")
    public void basic(){
        log.info("basic............");
    }

    @RequestMapping(value="/basic", method={RequestMethod.GET,RequestMethod.POST})
    public void basicGet(){
        log.info("basicGet...........");
    }

//    @GetMapping
    @RequestMapping(value="/basicOnlyGet", method={RequestMethod.GET})
    public void basicGet2(){
        log.info("basic get only get............");
    }

    @GetMapping("/ex01")
    public String ex01(SampleDTO sampleDTO) {
        log.info(sampleDTO);
        return "/sample/ex01";
    }

    @GetMapping("/ex02")
    public String ex02(@ModelAttribute("name") String name, @ModelAttribute("age") int age) {
        log.info(name);
        log.info(age);
        return"/sample/ex02";
    }

//    @GetMapping("/ex02List")
//    public String ex02List(@RequestParam("ids") ArrayList<String> ids){
//        ids.forEach(log::info);
//        return "/sample/ex02List";
//    }

    @GetMapping("/ex02List")
    public String ex02List(@RequestParam("ids") String[] ids) {
        log.info("ids as Array:");
        for (String id : ids) {
            log.info(id);
        }

        return "/sample/ex02List";
    }

    @GetMapping("/ex03")
    public String ex03(TodoDTO todoDTO){

        log.info(todoDTO.getTitle());
        log.info(todoDTO.getDueDate());
        return "/sample/ex03";
    }

    @GetMapping("/ex04")
    public void ex04(SampleDTO sampleDTO, @ModelAttribute("page") int page){
        log.info("name : "+sampleDTO.getName());
        log.info("age : "+sampleDTO.getAge());
        log.info("page : "+page);
    }

    @GetMapping("/ex05")
    public void ex05() {
        log.info("/ex05........");
    }

    @GetMapping("/ex06")
    public String ex06(RedirectAttributes ra) {
        log.info("ex06..........");
        ra.addAttribute("name","AAA");
        ra.addAttribute("age","10");
        return "redirect:/sample/ex06-2";
    }

    @GetMapping("/ex06-2")
    public void ex062(SampleDTO sampleDTO) {
        log.info("name : "+sampleDTO.getName());
        log.info("age : "+sampleDTO.getAge());
    }

}
