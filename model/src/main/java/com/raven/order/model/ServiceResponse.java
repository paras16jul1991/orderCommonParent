package com.raven.order.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceResponse {
	String responseFrom;
	Status status;
	String reason;
	OrderDetail orderDetail;
}
