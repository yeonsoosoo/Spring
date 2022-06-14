package service;

import java.util.List;

import dao.BoardDAOImpl;

public class BoardServiceImpl implements BoardService {

	BoardDAOImpl dao;
	
	public BoardServiceImpl(BoardDAOImpl dao) {
		//외부에서 들어온 dao를 생성자 인젝션을 통해 받아줄 예정이다.
		this.dao = dao;
	}
	
	@Override
	public List selectList() {
		//과일목록이 들어있던 리스트를 반환해준다.
		return dao.selectList();
	}
	

}
