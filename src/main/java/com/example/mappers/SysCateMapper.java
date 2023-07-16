package com.example.mappers;

import com.example.models.SysCate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysCateMapper {
    List<SysCate> getAllSysCates();

    SysCate getSysCateById(@Param("sysCateId") long sysCateId);

    // Other methods...
}