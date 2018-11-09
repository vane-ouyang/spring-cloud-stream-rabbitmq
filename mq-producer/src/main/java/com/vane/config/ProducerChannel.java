package com.vane.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @Author Vane
 * @Date 2018年11月02日
 */
public interface ProducerChannel {

    String PRODUCER_CHANNEL = "PRODUCER_CHANNEL";

    @Output(ProducerChannel.PRODUCER_CHANNEL)
    MessageChannel producerChannel();
}
