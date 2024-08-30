package com.example.rp_chain.RpChain.Model;

import lombok.Data;

import java.util.Map;

@Data
public class Request {
    String path;
    Map<String, String> headers;
    String body;
}
