package com.mattvalli.reservations.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mattvalli.reservations.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}