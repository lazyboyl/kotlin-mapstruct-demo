package com.kotlin.mapstruct.demo.mapper


import com.kotlin.mapstruct.demo.dto.FlightDto
import com.kotlin.mapstruct.demo.entity.Flight
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper(componentModel = "spring")
interface FlightConverter {

    /**
     * 功能描述： 实现实体的转换
     */
    @Mappings(Mapping(target = "flightNewName", source = "flightName"), Mapping(target = "flightId", source = "flightId"))
    fun convertToDto(flight: Flight) : FlightDto

    /**
     * 功能描述： 实现集合的转换
     */
    fun convertToDtos(flights: List<Flight>) : List<FlightDto>
}