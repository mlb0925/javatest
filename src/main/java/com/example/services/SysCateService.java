package com.example.services;

import com.example.models.SysCate;
import com.example.mappers.SysCateMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysCateService {
    private final SysCateMapper sysCateMapper;

    public SysCateService(SysCateMapper sysCateMapper) {
        this.sysCateMapper = sysCateMapper;
    }

    public List<SysCate> getAllSysCates() {
        return sysCateMapper.getAllSysCates();
    }

    public SysCate getSysCateById(long sysCateId) {
        return sysCateMapper.getSysCateById(sysCateId);
    }

    // Other methods...
}
