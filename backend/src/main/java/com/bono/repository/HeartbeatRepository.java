package com.bono.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bono.model.Heartbeat;

public interface HeartbeatRepository extends JpaRepository<Heartbeat, Long> {
}
