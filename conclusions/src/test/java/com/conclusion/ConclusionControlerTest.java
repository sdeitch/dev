package com.conclusion;

import com.conclusion.hello.Greeting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Shimon on 4/13/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest
public class ConclusionControlerTest {

    RestTemplate template = new TestRestTemplate();

    @Test
    public void testGreetingControler() {
        ResponseEntity<Greeting> greeting = template.getForEntity("http://localhost:8085/greeting", Greeting.class);
        assert(greeting.getBody() != null);
    }
}
