package com.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="t_song")
public class Song {

    @Id
    @GeneratedValue
    private Long id;

    //歌曲名称
    private String name;

    //播放状态
    private boolean status;

    //实体类会封装成时间“hh-MM-ss”的 Date类型。
    @Temporal(TemporalType.TIME)
    private Date time;

    //歌手名称
    private String singer;

    //歌曲在本地的连接
    private String link;

    //喜欢该歌曲的人数
    private Integer enjoy;

}
