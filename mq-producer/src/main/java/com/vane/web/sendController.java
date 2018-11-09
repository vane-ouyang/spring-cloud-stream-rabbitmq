package com.vane.web;

import com.vane.service.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Vane
 * @Date 2018年11月02日
 */
@RestController
public class sendController {

    @Autowired
    private SendMessage sendMessage;
    @GetMapping("/send")
    public void send(String m) {
        sendMessage.sendMessage(m);
    }
}
