package com.ojt.pegadaian.assignment;

public class JadwalTraining {
	
	private String materi;
	private String tanggal;
	private String lokasi;
	private String session;
	
	public JadwalTraining(String materi, String tanggal, String lokasi, String session) {
		super();
		this.materi = materi;
		this.tanggal = tanggal;
		this.lokasi = lokasi;
		this.session = session;
	}

	public String getMateri() {
		return materi;
	}
	public String getTanggal() {
		return tanggal;
	}
	public String getLokasi() {
		return lokasi;
	}
	public String getSession() {
		return session;
	}
	
	public void printAll(int i) {
//		System.out.format("%-18s%-18s%-6d", kodeKaryawan, materi, nilai);
	}
	
	
}
