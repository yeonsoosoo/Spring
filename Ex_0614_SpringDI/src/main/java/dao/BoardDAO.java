package dao;

import java.util.List;

public interface BoardDAO {
	//DAO(Data Access Object) 기본적으로 CRUD기능을 갖고 있다.
	//나중에 사용할 추상메서드를 준비해보자
	int insert(Object ob); //create
	List<Object> selectList(); //read
	int update( Object ob); //update
	int delete( int idx); //delete
}
