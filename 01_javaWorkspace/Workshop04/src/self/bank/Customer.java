package self.bank;

public class Customer {
	//추가..
	public static final String DEFAULT_NAME = "Encore";
	//public static final Address DEFAULT_ADDR = "서울시";
	private String name;
	private int ssn; //고객의 주민번호	
	private Address address;
	
	private Account account;
	/*
	 * this 키워드
	 * ::
	 * 1.필드의 이름과 로컬 변수의 이름이 같을 때 구분하기 위해서 필드 앞에 붙인다.
	 * 2.생성자 앞의 this ---this(null, ssn, null);
	 *   같은 클래스에서 또다른 생성자를 호춯
	 */

	public Customer(int ssn) {
	
		this(DEFAULT_NAME, ssn, null);
	}

	public Customer(String name, int ssn, Address address) {
		
		this(name, ssn, address, null);
	}

	public Customer(String name, int ssn, Address address, Account account) {
		
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public String getInfo() {
		return name+","+address;
	}	
}
