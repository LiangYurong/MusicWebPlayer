package com;
import com.entity.Song;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class TestApp {

    @Autowired
    private Song song;


}
