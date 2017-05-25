package demo.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * Created by kind on 2017/5/24.
 */
@Configuration
@EnableJms
public class ActiveMQCfg {

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("sample.queue");
    }

    @Bean
    public Queue queueOut() {
        return new ActiveMQQueue("sample.queue.out");
    }

    @Bean
    public Topic topic() {
        return new ActiveMQTopic("sample.topic");
    }
    //    @Bean
    //    public ActiveMQConnectionFactory activeMQConnectionFactory() {
    //        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(
    //                ActiveMQConnectionFactory.DEFAULT_USER, ActiveMQConnectionFactory.DEFAULT_PASSWORD,
    //                //     "tcp://192.168.10.10:61616");
    //                ActiveMQConnectionFactory.DEFAULT_BROKER_URL);
    //        return activeMQConnectionFactory;
    //    }
}
