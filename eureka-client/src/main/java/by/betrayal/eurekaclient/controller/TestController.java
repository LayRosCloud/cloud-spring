package by.betrayal.eurekaclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/tests")
@Slf4j
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String uniqueValue;

    @GetMapping
    public String get() {
        log.info("Start get request!");

        var message = uniqueValue;

        log.info(String.format("End get request with result %s!", message));

        return message;
    }
}
