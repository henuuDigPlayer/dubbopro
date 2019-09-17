package co.lindj.dubbo.controller;


import co.lindj.dubbo.api.UserService;
import co.lindj.dubbo.config.ProducerConfigure;
import com.zjdex.framework.util.data.JsonUtil;
import lombok.extern.log4j.Log4j2;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author lindj
 * @date 2018/5/4 17:02
 * @description 用户模块
 */
@Log4j2
@RestController
@RequestMapping("/api/user")
public class UserController{

    @Autowired
    private UserService userService;
//    @Autowired
//    private DefaultMQProducer defaultMQProducer;
    @Autowired
    private TransactionMQProducer transactionMQProducer;

    /**
     * 获取用户数量
     *
     * @return Object
     */
    @GetMapping(value = "/list", name = "获取用户数量")
    public Object getList() {

        return this.userService.getList();
    }


   /* @GetMapping(value = "/send")
    public Object sendMessagetest() throws Exception {
        Message message = new Message("TopicTest", "Tag1", "12345", "rocketmq测试成功".getBytes());
        defaultMQProducer.send(message, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                log.info("lindj,send success");
                log.info("{}", JsonUtil.objectToJson(sendResult));
            }

            @Override
            public void onException(Throwable throwable) {
                log.error("send fail. {}", throwable);
            }
        });
        return "lindj";
    }*/

    @GetMapping(value = "/send")
    public Object sendMessagetest() throws Exception {
        Message message = new Message("TopicTest", "Tag1", "12345", "rocketmq测试成功".getBytes());
        transactionMQProducer.sendMessageInTransaction(message, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                log.info("lindj,send success");
                log.info("{}", JsonUtil.objectToJson(sendResult));
            }

            @Override
            public void onException(Throwable throwable) {
                log.error("send fail. {}", throwable);
            }
        });
        return "lindj";
    }

}
