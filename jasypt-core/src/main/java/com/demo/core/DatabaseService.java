package com.demo.core;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {
    private final JdbcTemplate jdbcTemplate;

    public DatabaseService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String checkConnection() {
        try {
            jdbcTemplate.execute("SELECT 1");
            return "SUCCESS: Connected with decrypted password.";
        } catch (Exception e) {
            return "FAILURE: " + e.getMessage();
        }
    }
}