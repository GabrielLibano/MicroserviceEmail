package com.gabriellibano.email.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class EmailRequestCreateDto {
    private UUID userId;
    private String emailTo;
    private String subject;
    private String text;
}
