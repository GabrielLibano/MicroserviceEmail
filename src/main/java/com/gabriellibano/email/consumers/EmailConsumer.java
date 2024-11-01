package com.gabriellibano.email.consumers;

import com.gabriellibano.email.dtos.EmailRequestCreateDto;
import com.gabriellibano.email.mapper.EmailMapper;
import com.gabriellibano.email.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailConsumer {
    private final EmailMapper emailMapper;

    final EmailService emailService;

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailRequestCreateDto emailRequestCreateDto) {
        var model = emailMapper.toModel(emailRequestCreateDto);
        emailService.send(model);
    }

}
