package com.project.VoicePlusDialFlo.domain;

import java.time.Instant;

public record AnalysisResponse(
        String contactId,
        GenderPrediction gender,
        AgePrediction ageBracket,
        Long processingMs,
        String audioQuality,
        Instant processedAt
) {}
