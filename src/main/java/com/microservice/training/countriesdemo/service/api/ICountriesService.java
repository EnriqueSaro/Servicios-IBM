package com.microservice.training.countriesdemo.service.api;

import com.microservice.training.countriesdemo.model.entity.CountryEntity;

import java.util.List;

public interface ICountriesService {

  List<CountryEntity> findCountriesByContinentName(String continentName);
  
  List<CountryEntity> findCountriesByContinentId(Integer continentId);
  
  CountryEntity create(CountryEntity country);
  
  CountryEntity findCountryByContinentNameAndCountryId(String continentName,Integer continentId);
}
