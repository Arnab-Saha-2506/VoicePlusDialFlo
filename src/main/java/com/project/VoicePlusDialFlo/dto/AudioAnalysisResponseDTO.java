package com.project.VoicePlusDialFlo.dto;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AudioAnalysisResponseDTO {

    private String prediction;
    private GenderResult gender;
    private AgeBracketResult age_bracket;
    private Long processing_ms;
    private String audio_quality;
    private Instant processed_id;
    private String error;
}
