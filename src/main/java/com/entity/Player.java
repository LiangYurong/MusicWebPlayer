package com.entity;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.valueextraction.UnwrapByDefault;
import java.io.PipedReader;

@Entity
@Table(name = "t_player")
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    /**
     *  0  全部循环
     *  1  单曲循环
     *  2  随机播放
     */
    private Integer playStatus;
}
