package com.ojt.pegadaian.assignment;

public class Nilai {

	private int nilai;
	private Karyawan kodeKaryawan;
	private JadwalTraining materi;
	
	public Nilai(Karyawan kodeKaryawan, JadwalTraining materi, int nilai) {
		super();
		this.nilai = nilai;
		this.kodeKaryawan = kodeKaryawan;
		this.materi = materi;
	}

	public Karyawan getKodeKaryawan() {
		return kodeKaryawan;
	}

	public JadwalTraining getMateri() {
		return materi;
	}

	public int getNilai() {
		return nilai;
	}
	
	public void printAll() {
		System.out.format("%-18s | %-18s | %-6d", kodeKaryawan.getKodeKaryawan(), materi.getMateri(), nilai);
		System.out.println("");
	}
	
	
	
}
