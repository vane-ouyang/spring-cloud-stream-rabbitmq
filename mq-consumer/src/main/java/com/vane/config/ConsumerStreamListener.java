package com.vane.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @Author Vane
 * @Date 2018年11月02日
 */
@EnableBinding({ConsumerChannel.class})
public class ConsumerStreamListener {

    @StreamListener(ConsumerChannel.CONSUMER_CHANNEL)
    public void processLoggingAccessInfo(Message<String> message)
            throws InterruptedException, IOException {
        String payload = message.getPayload();
        System.out.println(payload);

    }
}
