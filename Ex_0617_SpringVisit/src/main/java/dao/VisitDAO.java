package dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.VisitVO;

public class VisitDAO {
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	//방명록 전체 조회
	public List<VisitVO> selectList() {
		List<VisitVO> list = sqlSession.selectList("v.visit_list");
		
		return list;
	}
	
	//방명록 새글 작성
	public int insert(VisitVO vo) {
		int res = sqlSession.insert("v.visit_insert", vo);
		
		return res;
	}
	
	//글 삭제
	public int delete(HashMap<String, Object> map) {
		int res = sqlSession.delete("v.visit_delete", map);
		
		return res;
	}
	
	//게시글 수정을 위한 한개 조회
	public VisitVO selectOne(int idx) {
		VisitVO vo = sqlSession.selectOne("v.visit_one", idx);
		
		return vo;
	}
	
	//게시글 수정
	public int update(VisitVO vo) {
		int res = sqlSession.update("v.visit_update",vo);
		
		return res;
				
	}
}
