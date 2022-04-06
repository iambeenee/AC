package co.micol.prj.notice.service;

import java.util.List;

import co.micol.prj.notice.vo.NoticeVO;

public interface NoticeService {
	
	List<NoticeVO> selectNoticeList(NoticeVO vo);
	
	NoticeVO selectNotice(NoticeVO vo);
	
	int insertNotice(NoticeVO vo);
	
	int deleteNotice(NoticeVO vo);
	
	int updateNotice(NoticeVO vo);
}
