package cn.saberking.jvav.apm.mall.enumeration;

/**
 * @author saber-kings
 */
public enum ProductCategoryIsShow {
    /**
     * 推荐商品
     */
    YES("推荐商品", 1),
    /**
     * 非推荐删除
     */
    NO("非推荐删除", 0),
    ;
    private final String name;
    private final Integer code;

    ProductCategoryIsShow(String name, Integer code) {
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
