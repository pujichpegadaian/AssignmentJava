package com.ojt.pegadaian.assignment;

public class Karyawan {
	
	private String kodeKaryawan;
	private String nama;
	private String alamat;
	private String phone;
	
	public Karyawan(String kodeKaryawan, String nama, String alamat, String phone) {
		super();
		this.kodeKaryawan = kodeKaryawan;
		this.nama = nama;
		this.alamat = alamat;
		this.phone = phone;
	}
	public String getKodeKaryawan() {
		return kodeKaryawan;
	}
	public String getNama() {
		return nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public String getPhone() {
		return phone;
	}
	
	
	
	
	
}
