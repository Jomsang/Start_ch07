package ch15.exam4;

public class User {
	private String id;
	private String name;
	
	public User(String id,String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		
		return id.hashCode();//문자열이 똑같으면 똑같은 해쉬코드를 리턴해줌
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User temp = (User) obj;
			if(id.equals(temp.id)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}
}
