package com.project.VoicePlusDialFlo.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AudioUploadRequestDTO {

    @NotBlank(message = "Contact Id is required")
    private String contactId;

    @NotNull(message = "Audio file is required")
    private MultipartFile audioFile;
}
