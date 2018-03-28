package org.springframework.amqp.tutorials.rabbitmqamqptutorials.bus.tut2.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.tutorials.rabbitmqamqptutorials.bus.tut2.receiver.Tut2Receiver;
import org.springframework.amqp.tutorials.rabbitmqamqptutorials.bus.tut2.sender.Tut2Sender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * <p> Date             :2018/3/27 </p>
 * <p> Module           : </p>
 * <p> Description      : </p>
 * <p> Remark           : </p>
 *
 * @author yangdejun
 * @version 1.0
 * <p>--------------------------------------------------------------</p>
 * <p>修改历史</p>
 * <p>    序号    日期    修改人    修改原因    </p>
 * <p>    1                                     </p>
 */
@Profile({"tut2", "work-queues"})
@Configuration
public class Tut2Config {
    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Profile("receiver")
    private static class ReceiverConfig {
        @Bean
        public Tut2Receiver receiver1() {
            return new Tut2Receiver(1);
        }

        @Bean
        public Tut2Receiver receiver2() {
            return new Tut2Receiver(2);
        }
    }

    @Profile("sender")
    @Bean
    public Tut2Sender sender() {
        return new Tut2Sender();
    }
}
