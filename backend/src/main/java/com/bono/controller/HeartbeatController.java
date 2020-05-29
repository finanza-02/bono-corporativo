package com.bono.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartbeatController {

	@GetMapping("/heartbeat")
	public ResponseEntity<?> getHeartbeat() {
		return ResponseEntity.ok("PUM PUM!");
	}

}
