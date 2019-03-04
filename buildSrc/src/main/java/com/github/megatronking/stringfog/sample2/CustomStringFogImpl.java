package com.github.megatronking.stringfog.sample2;

import com.github.megatronking.stringfog.IStringFog;

/**
 * 自定义算法实现，此文件存储目录路径须和其包名一致
 *
 * @author Sundy
 * @since 2019/3/4 23:41
 */
public class CustomStringFogImpl implements IStringFog {

    @Override
    public String encrypt(String data, String key) {
        // 自己实现加密算法，这里举例将key添加到所有String数据前面
        return key + data;
    }

    @Override
    public String decrypt(String data, String key) {
        // 自己实现解密算法，这里举例将String数据前面的key移除
        return data.replace(key, "");
    }

    @Override
    public boolean overflow(String data, String key) {
        return false;
    }

}
