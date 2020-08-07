package com.example.firefight.controller;

import com.example.firefight.domain.entity.FireVO;
import com.example.firefight.domain.entity.RoomVO;
import com.example.firefight.service.FireService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/view")
@RequiredArgsConstructor
public class FireAPIController {

    private final FireService fireService;

    @PostMapping(value = "/fire")
    public RoomVO fireCheck(@RequestBody FireVO fireVo){
        return fireService.fireCheck(fireVo);
    }
}