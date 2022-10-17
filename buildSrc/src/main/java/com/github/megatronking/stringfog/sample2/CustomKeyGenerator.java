package com.github.megatronking.stringfog.sample2;

import com.github.megatronking.stringfog.IKeyGenerator;

import java.nio.charset.StandardCharsets;

public class CustomKeyGenerator implements IKeyGenerator {

    @Override
    public byte[] generate(String value) {
        // value是待加密字符串，这里返回加密的密钥。
        // 示例表示使用"Hello World"作为密钥，这里可以根据不同的字符串使用不同的密钥。
        return "Hello World".getBytes(StandardCharsets.UTF_8);
    }

}
