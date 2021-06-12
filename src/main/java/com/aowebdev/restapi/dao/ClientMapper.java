package com.aowebdev.restapi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aowebdev.restapi.domain.Client;

@Mapper
public interface ClientMapper {

    /**
     * find all the Clients.
     */
    List<Client> findAll();
}
