package com.rhkr8521.mapping.api.member.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AppleLoginDTO {
    private String id;
    private String token;
    private String email;
    private String username;
    private String refreshToken;
}
