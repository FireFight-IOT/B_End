package com.example.firefight.service;

import com.example.firefight.domain.entity.FireVO;
import com.example.firefight.domain.entity.RoomVO;

public interface FireService {
    RoomVO fireCheck(FireVO fireVo);
}
