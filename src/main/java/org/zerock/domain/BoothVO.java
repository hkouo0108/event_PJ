package org.zerock.domain;

import lombok.Data;

@Data
public class BoothVO {

	
	private int booth_num;
	private int fk_event_num;
	private String booth_location;
	private String coordinate;
	private String contents;
	private boolean booth_check;
	
}
