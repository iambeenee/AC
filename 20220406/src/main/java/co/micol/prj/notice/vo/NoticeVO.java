package co.micol.prj.notice.vo;


import co.micol.prj.comm.PageVO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class NoticeVO extends PageVO{
	private int id;
	private String title;
	private String content;
	private String wdate;
	private int hit;
	private String filename;
	private String uuidfile;
}
