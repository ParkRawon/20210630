package co.yedam.interfaces;

public class MysqlDao implements Dao {
	//Mysql DBMS를 사용한 CRUD작업
	@Override
	public void insert() {
		System.out.println("MysqlDB 입력처리");

	}

	@Override
	public void update() {
		System.out.println("MysqlDB 수정처리");

	}

	@Override
	public void delete() {
		System.out.println("MysqlDB 삭제처리");

	}

}