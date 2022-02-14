package com.github.megatronking.stringfog.sample2;

import com.github.megatronking.stringfog.IKeyGenerator;

import java.nio.charset.StandardCharsets;

public class CustomKeyGenerator implements IKeyGenerator {

    @Override
    public byte[] generate(String s) {
        return "Hello World".getBytes(StandardCharsets.UTF_8);
    }

}
