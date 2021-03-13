package ys.database.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;

/**
 * @author  yangsong
 * @since on 2021.01.09
 */

@RestController
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping(value="/ys")
    public String getInedx2() {
        stringRedisTemplate.opsForValue().set("yangsong","hello");
        String value  = stringRedisTemplate.opsForValue().get("yangsong");

        return value;


    }
}

