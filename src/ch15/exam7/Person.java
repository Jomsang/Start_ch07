package ch15.exam7;

public class Person implements Comparable {	//��Ʈ���� ���� ��ü���� ���ϰ� ������ �����ϰ� ������ �ؾ� ��.
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) { //�翬�� Person�� ���´ٴ� ����
		Person temp = (Person) o;
		if(age < temp.age) {
			return -1;
		}
		else if(age == temp.age) {
			return 0;
		}
		else {
			return 1;				//���ڰ� �߿��Ѱ� �ƴ϶� ��ȣ�� �߿�!
		}
		
	}
}
