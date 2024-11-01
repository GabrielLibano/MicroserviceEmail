package com.gabriellibano.email.mapper;

import com.gabriellibano.email.dtos.EmailRequestCreateDto;
import com.gabriellibano.email.models.Email;
import com.gabriellibano.email.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailMapper {
    @Autowired
    private ModelMapper modelMapper;

    public Email toModel(EmailRequestCreateDto dto) {
        return modelMapper.map(dto, Email.class);
    }
}
