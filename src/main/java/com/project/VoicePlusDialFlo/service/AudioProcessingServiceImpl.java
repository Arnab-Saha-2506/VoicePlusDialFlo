package com.project.VoicePlusDialFlo.service;

import com.project.VoicePlusDialFlo.domain.AgePrediction;
import com.project.VoicePlusDialFlo.domain.AnalysisResponse;
import com.project.VoicePlusDialFlo.domain.GenderPrediction;
import com.project.VoicePlusDialFlo.dto.AudioAnalysisResponseDTO;
import com.project.VoicePlusDialFlo.dto.AudioUploadRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class AudioProcessingServiceImpl implements AudioProcessingService{

    @Override
    public AnalysisResponse processAudio(AudioUploadRequestDTO request){

        return new AnalysisResponse(
                request.getContactId(),
                new GenderPrediction("male", 0.87),
                new AgePrediction("31-45",0.63),
                142L,
                "good",
                Instant.now()
        );
    }
}
