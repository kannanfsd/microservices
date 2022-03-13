package com.nglabs.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nglabs.microservices.model.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	public CurrencyExchange findByFromAndTo(String from, String to);
}
