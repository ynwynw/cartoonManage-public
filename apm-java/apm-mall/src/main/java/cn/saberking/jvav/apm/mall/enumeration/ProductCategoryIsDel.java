package cn.saberking.jvav.apm.mall.enumeration;

/**
 * @author apm
 */

public enum ProductCategoryIsDel {
    /**
     * 商品已经被删除
     */
    YES("商品已经被删除", 1),
    /**
     * 商品未被删除
     */
    NO("商品未被删除", 0),
    ;
    private final String name;
    private final Integer code;

    ProductCategoryIsDel(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public Integer getCode() {
        return code;
    }

}
