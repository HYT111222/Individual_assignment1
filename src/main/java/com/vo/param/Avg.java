package com.vo.param;

import com.vo.param.parcelReturn;
import lombok.Getter;
import lombok.Setter;

/**
 * @Auther HYT
 * @Date 2023/4/22
 * @Desc
 */
@Setter
@Getter
public class Avg {
    private int id;
    private boolean status;//表示是否空闲
    private parcelReturn[] parcelList;
    private int[][] route;

    public Avg(int id){
        this.id = id;
        this.status = true;
    }
}