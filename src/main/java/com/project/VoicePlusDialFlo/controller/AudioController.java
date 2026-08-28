package com.project.VoicePlusDialFlo.controller;

import com.project.VoicePlusDialFlo.domain.AnalysisResponse;
import com.project.VoicePlusDialFlo.dto.AudioAnalysisResponseDTO;
import com.project.VoicePlusDialFlo.dto.AudioUploadRequestDTO;
import com.project.VoicePlusDialFlo.service.AudioProcessingService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AudioController {
    private final AudioProcessingService audioProcessingService;

    @PostMapping(value = "/analyze", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<AudioAnalysisResponseDTO> analyzeAudio(
            @RequestParam("contact_id") @NotBlank String contactId,
            @RequestParam("audio") @NotNull MultipartFile audioFile
            ){

        AudioUploadRequestDTO requestDTO = new AudioUploadRequestDTO(contactId, audioFile);
        AnalysisResponse response = audioProcessingService.processAudio(requestDTO);
        return ResponseEntity.ok().body(toDto(response));
    }
}
