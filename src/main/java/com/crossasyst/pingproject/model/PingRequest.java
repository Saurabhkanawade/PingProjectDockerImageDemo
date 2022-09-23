package com.crossasyst.pingproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PingRequest {

    private String firstName;
    private String lastName;
}
