package com.controller;

import com.service.UserService;
import com.vo.R;
import com.vo.param.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.PublicKey;


@RestController
@RequestMapping("/user")
//@CrossOrigin
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @Autowired
    private HttpServletRequest request;


    // 登陆--post保存
    @PostMapping("login")
    public R login(@RequestBody LoginParam loginParam) {
        return userService.login(loginParam);
    }

    // 注册--post保存
    @PostMapping("register")
    public R register(@RequestBody RegisterParam registerParam) {
        return userService.register(registerParam);
    }


    // 获取主页信息--get
//    @GetMapping("information")
//    public R getInformation(@RequestParam(value="token") String token) { return userService.getInformation(token); }
//    @PostMapping("changePassword")
//    public R changePassword(@RequestBody ChangeParam changeParam){
//        return userService.changePassword(changeParam);
//    }
//    @PostMapping("changeInfo")
//    public R changeInformation(@RequestBody ChangeInfoParam changeinfoParam)
//    {
//       return  userService.changeInformation(changeinfoParam);
//    }
}
