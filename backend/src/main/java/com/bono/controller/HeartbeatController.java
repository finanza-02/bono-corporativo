package com.bono.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bono.model.Heartbeat;
import com.bono.service.HeartbeatService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class HeartbeatController {

	@Autowired
	HeartbeatService heartbeatService;

	@GetMapping("/heartbeat")
	public ResponseEntity<List<Heartbeat>> getAll() {

		List<Heartbeat> heartbeats = heartbeatService.getAll();

		if (heartbeats.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(heartbeats);
		}

	}
}
