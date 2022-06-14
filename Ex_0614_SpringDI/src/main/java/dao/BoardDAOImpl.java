package dao;

import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements BoardDAO{

	@Override
	public int insert(Object ob) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Object> selectList() {
		//DB에서 정보를 갖고왔다고 가정
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("딸기");
		list.add("배");
		list.add("포도");
		list.add("복숭아");
		return null;
	}

	@Override
	public int update(Object ob) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int idx) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
