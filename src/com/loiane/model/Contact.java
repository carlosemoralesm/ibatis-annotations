package com.loiane.model;

/**
 * Contact POJO
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public class Contact {

	private int id;
	private String name;
	private String phone;
	private String email;
	
	public Contact(int id, String name, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public Contact() {}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Id = ").append(id).append(" - ");
		sb.append("Name = ").append(name).append(" - ");
		sb.append("Phone = ").append(phone).append(" - ");
		sb.append("Email = ").append(email);
		return sb.toString();
	}
	
	public boolean equals(Object obj) {  
		Contact contact = (Contact) obj;
		if (this.id != contact.id){
			return false;
		}
		if (!this.name.equals(contact.getName())){
			return false;
		}
		if (!this.phone.equals(contact.getPhone())){
			return false;
		}
		if (!this.email.equals(contact.getEmail())){
			return false;
		}
		return true;
	}
}
