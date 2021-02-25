package ch11.exam1;

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
		if(obj instanceof Member) {	//매개변수로 들어오는 객체가 Member로 만들어진 객체이거나 Member의 자식 객체가 들어오면은
			Member m = (Member) obj;	//들어온 객체의 필드 및 메소드를 사용하려면 강제형변환을 시켜줘야 사용이 가능 함.
			if(id.equals(m.id) && name.equals(m.name)) {	//변환 후 2개의 객체의 id와 name 비교해서 같으면 true 반환
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
}
