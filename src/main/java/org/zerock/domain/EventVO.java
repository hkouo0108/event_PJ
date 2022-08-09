package org.zerock.domain;

import lombok.Data;

@Data
public class EventVO {
	
	private int event_num;
	private String fk_member_id;
	private String event_name;
	private String event_image_url;
	private String start_date;
	private String end_end;
	private String booth_image_url;
	
}
