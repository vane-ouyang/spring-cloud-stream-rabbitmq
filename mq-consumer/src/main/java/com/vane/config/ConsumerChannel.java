package com.vane.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * @Author Vane
 * @Date 2018年11月02日
 */
public interface ConsumerChannel {
    public static final String CONSUMER_CHANNEL = "CONSUMER_CHANNEL";

    @Input(ConsumerChannel.CONSUMER_CHANNEL)
    MessageChannel consumerChannel();
}
