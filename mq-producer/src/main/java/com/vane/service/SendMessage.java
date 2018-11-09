package com.vane.service;

import com.vane.config.MessageGateway;
import com.vane.config.ProducerChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Service;

/**
 * @Author Vane
 * @Date 2018年11月02日
 */
@EnableBinding({ProducerChannel.class})
public class SendMessage {

    @Autowired
    private MessageGateway channel;

    public void sendMessage(String m) {
        channel.sendLogging(m);
    }
}
