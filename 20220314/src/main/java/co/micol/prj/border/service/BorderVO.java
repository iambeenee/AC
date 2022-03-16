package co.micol.prj.border.service;
import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BorderVO {
	private int borderId;
	private String borderWriter;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date borderDate;
	private String borderTitle;
	private String borderContents;
	private int borderHit;
}
