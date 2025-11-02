package com.gusto.dto;

import lombok.Data;

import java.math.BigDecimal;


public record ProductRequest(String Id, String name, String description, BigDecimal price) {

}
