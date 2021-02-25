package ch11.exam2;

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
		if(obj instanceof Member) {//�Ű������� ������ ��ü�� Member�� ������� ��ü�� ��������
			Member m = (Member) obj;
			if(id.equals(m.id) && name.equals(m.name)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	@Override
	public String toString() {
		
		return id + ": " + name;
	}
}
