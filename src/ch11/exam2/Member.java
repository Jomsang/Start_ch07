package ch11.exam2;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		//super(); //현재 부모클래스가 없기 때문에 생략 가능
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {	//중요 함.
		if(obj instanceof Member) {//매개변수로 들어오는 객체가 Member로 만들어진 객체가 들어오면은
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
