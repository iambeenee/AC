package co.micol.prj.border.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.border.service.BorderMapper;
import co.micol.prj.border.service.BorderService;
import co.micol.prj.border.service.BorderVO;
import co.micol.prj.comm.DataSource;

public class BorderServiceImpl implements BorderService {
	private SqlSession sqlsession = DataSource.getInstance().openSession(true);
	private BorderMapper map = sqlsession.getMapper(BorderMapper.class);

	@Override
	public List<BorderVO> borderSelectList() {

		return map.borderSelectList();
	}

	@Override
	public BorderVO borderselect(BorderVO vo) {

		return map.borderselect(vo);
	}

	@Override
	public int borderInsert(BorderVO vo) {

		return map.borderInsert(vo);
	}

	@Override
	public int borderUpdate(BorderVO vo) {

		return map.borderUpdate(vo);
	}

	@Override
	public int borderDelete(BorderVO vo) {

		return map.borderDelete(vo);
	}

	@Override
	public List<BorderVO> borderSelectSearchList(String key, String val) {

		return map.borderSelectSearchList(key, val);
	}

	@Override
	public int borderUpdateHit(int id) {
		
		return map.borderUpdateHit(id);
	}

	@Override
	public List<BorderVO> borderSortList(String key) {
		
		return map.borderSortList(key);
	}

}