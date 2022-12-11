package com.hk.design.pattern.responsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : HK意境
 * @ClassName : Request
 * @date : 2022/12/11 23:02
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Setter
@Getter
public class Request {

    private Handler.Level level;


    public Handler.Level getHandlerLevel() {
        return this.getLevel();
    }

}
