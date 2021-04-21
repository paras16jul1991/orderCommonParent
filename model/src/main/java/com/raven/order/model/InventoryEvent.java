package com.raven.order.model;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class InventoryEvent {

	private Date date;
	private Status status;
	private String reason;
}
