package com.wombats.jwt.controller.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class User {

    public String usr;
    public String pwd;
    public String token;

}
