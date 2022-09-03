package cn.saberking.jvav.apm.common.enums;

import org.springframework.lang.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * 请求方式
 *
 * @author apm
 */
public enum HttpMethod {
    /**
     * GET请求方式
     */
    GET,
    /**
     * HEAD请求方式
     */
    HEAD,
    /**
     * POST请求方式
     */
    POST,
    /**
     * PUT请求方式
     */
    PUT,
    /**
     * PATCH请求方式
     */
    PATCH,
    /**
     * DELETE请求方式
     */
    DELETE,
    /**
     * OPTIONS请求方式
     */
    OPTIONS,
    /**
     * TRACE请求方式
     */
    TRACE;

    private static final Map<String, HttpMethod> MAPPINGS = new HashMap<>(16);

    static {
        for (HttpMethod httpMethod : values()) {
            MAPPINGS.put(httpMethod.name(), httpMethod);
        }
    }

    @Nullable
    public static HttpMethod resolve(@Nullable String method) {
        return (method != null ? MAPPINGS.get(method) : null);
    }

    public boolean matches(String method) {
        return (this == resolve(method));
    }
}
