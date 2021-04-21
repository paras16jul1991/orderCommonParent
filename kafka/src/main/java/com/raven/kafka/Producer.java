package com.raven.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Producer<K, V> {

	private static final Logger logger = LoggerFactory.getLogger(Producer.class);

	private KafkaTemplate<String, String> kafkaTemplate;
	private String topic;

	public Producer(String topic, KafkaTemplate<String, String> template) {
		this.kafkaTemplate = template;
		this.topic = topic;
	}

	public void sendMessage(V message) {
		logger.info(String.format("#### -> Producing message -> %s", message));
		try {
			this.kafkaTemplate.send(topic, new ObjectMapper().writeValueAsString(message));
		} catch (JsonProcessingException e) {
			logger.error("Not able to send message to Broker", e);
		}
	}
}