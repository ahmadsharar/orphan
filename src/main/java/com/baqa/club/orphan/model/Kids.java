/**
 * 
 */
package com.baqa.club.orphan.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * @author aabusharar
 *
 */
@Entity
@Table(name = "kids")
public class Kids implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="national_id")
	private Integer id;
	
	@Column(name="kid_name" , nullable = false)
	private String name;
	
	@Column(name="gender" , nullable = false)
	private Integer gender;
	
	@Column(name="kid_address" , nullable = false)
	private String address;
	
	@Column(name="status" , nullable = false)
	private Integer status;
	
	@Column(name="kid_date_birth" , nullable = false)
	private Calendar dateBirth;
	
	@Column(name="kid_group_num" , nullable = true)
	private Integer groupNumber;
	
	@Column(name="kid_phone_number" , nullable = true)
	private String phoneNumber;
	
    @Lob
	@Column(name="kid_image" , nullable = true)
	private Byte[] image;

	public Kids() {
		super();
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(Integer groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}
	
	public Calendar getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Calendar dateBirth) {
		this.dateBirth = dateBirth;
	}
	
	public String getKidGender() {
		
		if(this.gender == 1) {
			return "ذكر";
		}
		
		return "انثى";
	}
	
	public String getKidStatus() {
		if(this.status ==1) {
			return "يتيم";
		}
		
		return "حالة إجتماعية";
	}









}
