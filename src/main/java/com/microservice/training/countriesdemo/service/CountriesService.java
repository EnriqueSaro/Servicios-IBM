package com.microservice.training.countriesdemo.service;

import com.microservice.training.countriesdemo.errorhandling.InvalidContinentException;
import com.microservice.training.countriesdemo.model.Continent;
import com.microservice.training.countriesdemo.model.Country;
import com.microservice.training.countriesdemo.model.entity.CountryEntity;
import com.microservice.training.countriesdemo.repository.api.CountryJpaRepository;
import com.microservice.training.countriesdemo.repository.api.ICountriesRepository;
import com.microservice.training.countriesdemo.service.api.ICountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountriesService implements ICountriesService {

  @Autowired
  CountryJpaRepository countriesRepository;
  
 

@Override
public List<CountryEntity> findCountriesByContinentName(String continentName) {
	
	List<CountryEntity> paises =  countriesRepository.findAllByContinent(continentName);
    
	  return paises;
}

@Override
public List<CountryEntity> findCountriesByContinentId(Integer continentId) {
    
	  return null;
}

@Override
public CountryEntity create(CountryEntity country) {
	
	country = countriesRepository.save(country);
	return country;
}

@Override
public CountryEntity findCountryByContinentNameAndCountryId(String continentName, Integer continentId) {
	

	return countriesRepository.findCountryByContinentAndCountryId(continentName, continentId);
}


  

 }


