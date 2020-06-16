package bean;

public class Member {
	private String id;
	private String name;
	private String age;
    private String sex;
    private String address;
    private String bid;

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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAddress() {
        return address;
    }
    public void getAddress(String address) {
        this.address = address;
    }
    public String getBid() {
        return biod;
    }
    public void getBid(String bid) {
        this.bid = bid;
    }

	public Member(String id, String name, String age, String sex, String address, String bid) {
		this.id = id;
		this.name = name;
		this.age = age;
        this.sex = sex;
        this.address = address;
        this.bid = bid;
	}

}