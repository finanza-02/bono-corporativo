package com.bono.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bono.model.Heartbeat;
import com.bono.repository.HeartbeatRepository;
import com.bono.service.HeartbeatService;

@Service
public class HeartbeatServiceImpl implements HeartbeatService {

	@Autowired
	HeartbeatRepository heartbeatRepository;

	@Override
	public List<Heartbeat> getAll() {

		return heartbeatRepository.findAll();
	}

}
