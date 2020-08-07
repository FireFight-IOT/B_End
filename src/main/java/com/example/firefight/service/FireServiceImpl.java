package com.example.firefight.service;

import com.example.firefight.domain.entity.FireVO;
import com.example.firefight.domain.entity.RoomVO;
import org.springframework.stereotype.Service;

@Service
public class FireServiceImpl implements FireService{

    @Override
    public RoomVO fireCheck( FireVO fireVo) {

        RoomVO roomVo = new RoomVO();

        if(fireVo.getFloor() == 1){
            roomVo.setLeft(true);
            roomVo.setRight(true);
            roomVo.setOne(true);
            roomVo.setTwo(true);
            roomVo.setThree(true);
        } else {
            roomVo.setLeft(false);
            roomVo.setRight(false);
            roomVo.setOne(false);
            roomVo.setTwo(false);
            roomVo.setThree(false);
        }

        return roomVo;
    }
}
