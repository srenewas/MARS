package schedule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Demo {

    private static final Logger logger = LogManager.getLogger(Demo.class);

    @Scheduled(fixedRate = 1000) // every 10 sec
    public void refreshData() {
        logger.info("Backend data updated at: " + LocalDateTime.now());
    }
}