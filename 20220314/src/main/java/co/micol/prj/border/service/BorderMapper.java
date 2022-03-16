package co.micol.prj.border.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BorderMapper {
	List<BorderVO> borderSelectList();

	BorderVO borderselect(BorderVO vo);

	int borderInsert(BorderVO vo);

	int borderUpdate(BorderVO vo);

	int borderDelete(BorderVO vo);

	int borderUpdateHit(int id);

	List<BorderVO> borderSelectSearchList(@Param("key") String key, @Param("val") String val); // 매개변수가 2개이상일 경우 @param을
																								// 써야함

	List<BorderVO> borderSortList(String key);
}
