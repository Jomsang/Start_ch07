package ch11.exam1;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		//super(); //���� �θ�Ŭ������ ���� ������ ���� ����
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {	//�߿� ��.
		if(obj instanceof Member) {	//�Ű������� ������ ��ü�� Member�� ������� ��ü�̰ų� Member�� �ڽ� ��ü�� ��������
			Member m = (Member) obj;	//���� ��ü�� �ʵ� �� �޼ҵ带 ����Ϸ��� ��������ȯ�� ������� ����� ���� ��.
			if(id.equals(m.id) && name.equals(m.name)) {	//��ȯ �� 2���� ��ü�� id�� name ���ؼ� ������ true ��ȯ
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
}
