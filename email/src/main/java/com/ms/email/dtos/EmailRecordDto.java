package com.ms.email.dtos;

import java.util.UUID;

public record EmailRecordDto(UUID userId,
                             String name,
                             String emailTo,
                             String subject,
                             String text) {
}
