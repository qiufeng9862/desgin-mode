package cn.com.mfish.decorator.coffee;

import java.math.BigDecimal;

/**
 * @author ：qiufeng
 * @description：拿铁
 * @date ：2022/4/5 20:58
 */
public class Latte extends Coffee {
    /**
     * 制作一个普通拿铁
     */
    public Latte(){
        description = "拿铁";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(10);
    }
}
