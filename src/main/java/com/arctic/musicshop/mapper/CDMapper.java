package com.arctic.musicshop.mapper;

import com.arctic.musicshop.pojo.CD;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CDMapper {
    List<CD> getCD();
    CD getCDByAlbum(String album);
}
