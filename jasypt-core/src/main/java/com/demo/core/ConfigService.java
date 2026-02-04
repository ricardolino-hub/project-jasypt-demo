package com.demo.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {
	@Value("${INTERNAL_APP_KEY:NOT_FOUND}")
	private String internalKey;

    public String getInternalKey() {
        return internalKey;
    }
}