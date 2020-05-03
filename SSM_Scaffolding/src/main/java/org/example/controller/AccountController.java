package org.example.controller;

import org.example.domain.Account;
import org.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletResponse;
import java.util.List;

/*
* 账户web
* */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public  String findAll(Model model, ServletResponse response){
        System.out.println("表现层：查询所有账户...");
        //调用service的方法
        List<Account> list= accountService.findAll();
        model.addAttribute("list", list);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        return "list";
    }

    @RequestMapping("/save")
    public  String save(Account account, ServletResponse response){

        //调用service的方法
        List<Account> list= accountService.findAll();
        accountService.saveAccount(account);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        return "list";
    }
}
