package jpabook.jpashop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 이승환
 * @since 2020-08-24
 */
@Controller
@Slf4j
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

}
