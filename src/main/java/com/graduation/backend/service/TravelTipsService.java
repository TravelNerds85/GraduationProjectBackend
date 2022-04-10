package com.graduation.backend.service;

import com.graduation.backend.dto.TravelTipsDto;
import com.graduation.backend.model.TravelTips;

import java.util.List;

public interface TravelTipsService {
    List<TravelTipsDto> getTravelTips();
    TravelTips createTravelTips(TravelTipsDto travelTipsDto);
}