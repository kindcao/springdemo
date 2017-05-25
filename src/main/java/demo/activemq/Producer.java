package demo.activemq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import javax.jms.Topic;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by kind on 2017/5/24.
 */
@Component
@EnableScheduling
public class Producer {

    private static Logger log = LoggerFactory.getLogger(Producer.class);

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;

    @Value("${spring.jms.pub-sub-domain}")
    private boolean isPubSub;

    /**
     * 每5S执行一次
     */
    @Scheduled(fixedRate = 5000, initialDelay = 3000)
    public void send() {
        if (!isPubSub) {
            //发送队列消息
            String txt_queue = "P2P Msg - " + ThreadLocalRandom.current().nextLong(Integer.MAX_VALUE);
            this.jmsMessagingTemplate.convertAndSend(this.queue, txt_queue);
            log.info(">>> [sample.queue]：" + txt_queue);
        } else {
            //发送订阅消息
            String txt_topic = "Topic Msg - " + ThreadLocalRandom.current().nextLong(Integer.MAX_VALUE);
            this.jmsMessagingTemplate.convertAndSend(this.topic, txt_topic);
            log.info(">>> [sample.topic]：" + txt_topic);
        }
    }

    @JmsListener(destination = "sample.queue.out")
    public void receiveOutQueue(String text) {
        log.info("<<< [sample.queue.out]：" + text);
    }
}
