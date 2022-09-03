package cn.saberking.jvav.apm.mall.enumeration;

/**
 * @author apm
 */

public enum ProductCategory {
    /**
     * 普通商品
     */
    GENERAL_PRODUCT("普通商品"),
    /**
     * 闲置商品
     */
    IDLE_PRODUCT("闲置商品"),
    ;
    private final String name;

    ProductCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
