package demo.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by kind on 2017/5/24.
 */
@Component
public class Customer {

    private static Logger log = LoggerFactory.getLogger(Customer.class);
    //    @JmsListener(destination = "sample.queue")
    //    public void receiveQueue(String text) {
    //        log.info("<<< [sample.queue]：" + text);
    //    }

    @JmsListener(destination = "sample.queue")
    @SendTo("sample.queue.out")
    public String receiveQueue2(String text) {
        String txt_queue = text + " - " + ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
        log.info("<<< [sample.queue ->>> sample.queue.out] " + txt_queue);
        return txt_queue;
    }

    @JmsListener(destination = "sample.topic")
    public void receiveSub1(String text) {
        log.info("<<< [sample.topic] - custome1：" + text);
    }

    @JmsListener(destination = "sample.topic")
    public void receiveSub2(String text) {
        log.info("<<< [sample.topic] - custome2：" + text);
    }
}
