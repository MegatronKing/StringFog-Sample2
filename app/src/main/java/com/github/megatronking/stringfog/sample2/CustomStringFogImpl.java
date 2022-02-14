package com.github.megatronking.stringfog.sample2;

import com.github.megatronking.stringfog.IStringFog;

import java.nio.charset.StandardCharsets;

/**
 * 自定义算法实现，此文件存储目录路径须和其包名一致
 *
 * @author Sundy
 * @since 2019/3/4 23:41
 */
public class CustomStringFogImpl implements IStringFog {

    @Override
    public byte[] encrypt(String data, byte[] key) {
        byte[] origin = data.getBytes(StandardCharsets.UTF_8);
        // 自定义加密，这里直接返回原字符串
        return origin;
    }

    @Override
    public String decrypt(byte[] data, byte[] key) {
        // 自定义解密
        return new String(data, StandardCharsets.UTF_8);
    }

    @Override
    public boolean shouldFog(String data) {
        // 控制指定字符串是否加密
        // 建议过滤掉不重要或者过长的字符串
        return true;
    }

}
