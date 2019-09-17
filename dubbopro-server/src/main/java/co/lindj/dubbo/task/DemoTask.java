package co.lindj.dubbo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * @author lindj
 * @date 2018/5/16 17:06
 * @description 定时任务 cron 含义： 秒 分 时 日 月 年
 */
@Component
public class DemoTask {

    private static final Logger logger = LoggerFactory.getLogger(DemoTask.class);

    /**
     * 每天 凌晨2 点执行
     *
     */
    //@Scheduled(cron = "0 0 2 * * ?")
    public void execute() {
    }

}
