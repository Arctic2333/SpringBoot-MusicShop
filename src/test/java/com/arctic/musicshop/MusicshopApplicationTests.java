package com.arctic.musicshop;

import com.arctic.musicshop.mapper.UserMapper;
import com.arctic.musicshop.service.CDService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class MusicshopApplicationTests {

    @Autowired
    CDService cdService;

    @Test
    void contextLoads() {
        System.out.println(cdService.getCDByAlbum("Blueming"));
    }

}
