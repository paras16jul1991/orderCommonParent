package com.raven.logging.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.raven.order.model.Order;

@Repository
public interface AuditLogRepository extends MongoRepository<Order, String> {
}