package co.friend.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.friend.model.Friend;

//FriendAccess(�������̽�) �����ϴ� ��ü.
//���Ͽ� ����.
public class FriendList implements FriendAccess {

	String path = "c:/tmp/friendList.txt";
	List<Friend> friends;

	public void open() {
		File file = new File(path);

		if (!file.exists()) {// path�� �ش������� ������ ���丮/���� ����.
			File dir = new File("c:/tmp/");
			dir.mkdirs(); // c:/tmp ���丮 ����.
			try {
				file.createNewFile(); // ������ ����.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			Scanner scn = new Scanner(file);
			while (true) {

				if (!scn.hasNext()) {
					break;
				}
				String readStr = scn.next();
				String[] arr = readStr.split(",");

				Friend friend = new Friend(arr[0], arr[1], arr[2]);

				// �迭�� ������� �ѰǾ� ����.
//				for (int i = 0; i < friends.size(); i++) {
//					if (friends[i] == null) {
//						friends[i] = friend;
//						break;
//					}
//				}
				friends.add(friend);
			}
			scn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void save() {
		BufferedWriter br = null;
		try {
			br = new BufferedWriter(new FileWriter(path));
			for (int i = 0; i < friends.size(); i++) {
//				if (friends[i] != null) {
					br.write(String.format("%s,%s,%s\n", friends.get(i).getGubun(), friends.get(i).getName(),
							friends.get(i).getTel()));
				}
//			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public FriendList() {
		friends = new ArrayList<Friend>();
		open();
	}

	@Override
	public void insert(Friend friend) {
		for (int i = 0; i < friends.size(); i++) {
//			if (friends[i] == null) {
				 friends.add(friend);
				break;
//			}
		}
		save();

	}

	@Override
	public void update(Friend friend) {
		for (int i = 0; i < friends.size(); i++) {
//			if (friends[i] != null) { // �迭�� ����߿��� ���� �ִ� ��Ҹ� �����ͼ�
				if (friends.get(i).getName().equals(friend.getName())) { // �̸����� ���ϰڴ�
					friends.get(i).setTel(friend.getTel());
					break;

				}
//			}
		}
		save();
	}

	@Override
	public void delete(String name) {
		for (int i = 0; i < friends.size(); i++) {
//			if (friends[i] != null) {
				if (friends.get(i).getName().equals(name)) {
                   friends.remove(i); 
					System.out.println("����ó�� �����Ǿ����ϴ�.");
//					friends[i] = null; // ������ null
					
					break;
				}
//			}
		}

	}

	@Override
	public List<Friend> selectAll() {
		return friends;
	}

	@Override
	public Friend selectOne(String name) {
		boolean exist = false;
		for (int i = 0; i < friends.size(); i++) {
//			if (friends[i] != null) {
				if (friends.get(i).getName().equals(name)) {
					System.out.println(friends.get(i).toString());
					exist = true;
				}
//			}
		}
		return null;
	}

	@Override
	public Friend findTel(String tel) {
		boolean exist = false;
		for (int i = 0; i < friends.size(); i++) {
//			if (friends[i] != null) {
				if (friends.get(i).getTel().equals(tel)) {
					System.out.println(friends.get(i).toString());
					exist = true;
				}
//			}
		}
		return null;

	}

}
