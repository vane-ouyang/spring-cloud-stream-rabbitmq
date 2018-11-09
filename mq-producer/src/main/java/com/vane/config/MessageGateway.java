package com.vane.config;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

/**
 * Created by ZHANGWEI5095@QQ.COM on 14:11 2017/7/19.
 */
@MessagingGateway
public interface MessageGateway {

   @Gateway(requestChannel = ProducerChannel.PRODUCER_CHANNEL, replyChannel = ProducerChannel.PRODUCER_CHANNEL)
    void sendLogging(String message);
}