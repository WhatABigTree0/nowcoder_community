package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitivrTests {
    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter(){
        String text = "赌赌博博 --->赌***博";
        text = sensitiveFilter.filter(text);
        System.out.println(text);


        text = "这里可以嫖娼赌博，可以嫖娼，可以吸毒，可以开票，哈哈哈";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }


}
