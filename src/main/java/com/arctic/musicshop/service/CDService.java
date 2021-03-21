package com.arctic.musicshop.service;

import com.arctic.musicshop.mapper.CDMapper;
import com.arctic.musicshop.pojo.CD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CDService {
    @Autowired
    private CDMapper cdMapper;

    public List<CD> getCD() {
        return cdMapper.getCD();
    }

    public CD getCDByAlbum(String album){return cdMapper.getCDByAlbum(album);}
}
