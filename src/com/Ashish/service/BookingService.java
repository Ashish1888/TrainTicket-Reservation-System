package com.Ashish.service;

import java.util.List;

import com.Ashish.beans.HistoryBean;
import com.Ashish.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
