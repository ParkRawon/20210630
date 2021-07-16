package co.friend.view;

import java.util.List;

import co.friend.access.FriendAccess;
import co.friend.access.FriendList;
import co.friend.common.ScannerUtil;
import co.friend.model.Friend;

// ȭ�鿡 ���������ְ� ������� �Է¿� ���� ó���������.
public class FriendCliApp {

	FriendAccess service = new FriendList();

	public void start() {
		//  .�Է� 2.���� 3.���� 4.����Ʈ 5.�̸���ȸ 6.��ȭ��ȣ��ȸ 9.����
		int menu = 0;
		do {
			menuTitle();
			menu = ScannerUtil.readInt("����>");

			switch (menu) {
			case 1: // �Է�
				insert(); break;
			case 2: // ����
				update(); break;
			case 3: // ����
				delete(); break;
			case 4: // ����Ʈ
				list(); break;
			case 5: // �̸���ȸ
				searchName(); break;
			case 6: // ��ȭ��ȸ
				searchTel(); 
			}
		} while(menu != 9);

	}
		
	public void searchTel() {
		String tel = ScannerUtil.readString("��ȣ�Է�>>");
		service.findTel(tel);

	}

	public void searchName() {
		String name = ScannerUtil.readString("�̸��Է�>>>");
		service.selectOne(name);
		
	}

	public void list() {
		List<Friend> friendList = service.selectAll();
		for(Friend friend : friendList) {
			if(friend != null) {
				System.out.println(friend.toString());
							
			}
		}

	}

	public void delete() {//�̸��Է�
		String name = ScannerUtil.readString("�̸��Է�>>");
		service.delete(name);

	}

	public void update() {
		//�̸��Է�>
		//����ó�Է�>
		String name = ScannerUtil.readString("�̸��Է�>");
		String tel = ScannerUtil.readString("����ó�Է�>");
		Friend friend = new Friend("", name, tel);
		service.update(friend);

	}

	public void insert() {
		Friend friend = ScannerUtil.readFriend();
		service.insert(friend);
	}

	public void menuTitle() {
		System.out.println("====ģ������====");
		System.out.println("| 1. ģ���߰�   |");
		System.out.println("| 2. ģ������   |");
		System.out.println("| 3. ģ������   |");
		System.out.println("| 4. ��ü��ȸ   |");
		System.out.println("| 5. �̸���ȸ   |");
		System.out.println("| 6. ��ȭ��ȸ   |");
		System.out.println("| 9. ����      |");

	}


}

