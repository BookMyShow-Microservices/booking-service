package com.project.microservices.bookingservice.services;

import java.util.List;

import com.bookmyshow.common.library.model.*;

public interface BookingService {

	public BookingSummaryResponse generateBookingSummary(BookingSummaryRequest bookingSummaryRequest);
	
	public ShowDetails fetchShowDetailsFromSearchService(Integer showId);
	
	public  String updateSeatStatus(List<Integer> seatUniqueId,Integer status,Integer showId);

	public Integer createBooking(BookingDetails bookingTableRequest);
}
