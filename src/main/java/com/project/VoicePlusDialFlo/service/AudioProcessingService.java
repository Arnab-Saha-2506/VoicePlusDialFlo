package com.project.VoicePlusDialFlo.service;

import com.project.VoicePlusDialFlo.domain.AnalysisResponse;
import com.project.VoicePlusDialFlo.dto.AudioUploadRequestDTO;

public interface AudioProcessingService {
    AnalysisResponse processAudio(AudioUploadRequestDTO request);
}
