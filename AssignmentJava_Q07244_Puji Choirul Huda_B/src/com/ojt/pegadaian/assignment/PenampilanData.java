package com.ojt.pegadaian.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class PenampilanData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pilihan = 0;
		
		Karyawan[] arrayKaryawan = new Karyawan[5];
		
		arrayKaryawan[0] = new Karyawan("PEG01", "Yohana", "Jakarta", "12345");
		arrayKaryawan[1] = new Karyawan("PEG02", "Yohane", "Palembang", "23456");
		arrayKaryawan[2] = new Karyawan("PEG03", "Yohani", "Medan", "34567");
		arrayKaryawan[3] = new Karyawan("PEG04", "Yohano", "Surabaya", "45678");
		arrayKaryawan[4] = new Karyawan("PEG05", "Yohano", "Malang", "56789");
		
		JadwalTraining[] arrayJadwalTraining = new JadwalTraining[5];
		
		arrayJadwalTraining[0] = new JadwalTraining("Algoritma", "31-Oct-19", "711", "3");
		arrayJadwalTraining[1] = new JadwalTraining("Spring Boot", "12-Nov-19", "724", "2");
		arrayJadwalTraining[2] = new JadwalTraining("Android", "23-Nov-19", "728", "2");
		arrayJadwalTraining[3] = new JadwalTraining("Python", "11-Nov-19", "706", "4");
		arrayJadwalTraining[4] = new JadwalTraining("Ajax", "13-Nov-19", "711", "1");
		
		ArrayList<Nilai> arrayNilai = new ArrayList<>();
		
		arrayNilai.add(new Nilai(arrayKaryawan[0], arrayJadwalTraining[0], 86));
		arrayNilai.add(new Nilai(arrayKaryawan[0], arrayJadwalTraining[1], 88));
		arrayNilai.add(new Nilai(arrayKaryawan[0], arrayJadwalTraining[2], 89));
		arrayNilai.add(new Nilai(arrayKaryawan[0], arrayJadwalTraining[3], 90));
		arrayNilai.add(new Nilai(arrayKaryawan[1], arrayJadwalTraining[1], 78));
		arrayNilai.add(new Nilai(arrayKaryawan[1], arrayJadwalTraining[2], 89));
		arrayNilai.add(new Nilai(arrayKaryawan[1], arrayJadwalTraining[3], 77));
		arrayNilai.add(new Nilai(arrayKaryawan[2], arrayJadwalTraining[2], 88));
		arrayNilai.add(new Nilai(arrayKaryawan[2], arrayJadwalTraining[3], 89));
		arrayNilai.add(new Nilai(arrayKaryawan[2], arrayJadwalTraining[4], 90));
		arrayNilai.add(new Nilai(arrayKaryawan[3], arrayJadwalTraining[1], 89));
		arrayNilai.add(new Nilai(arrayKaryawan[3], arrayJadwalTraining[2], 77));
		arrayNilai.add(new Nilai(arrayKaryawan[3], arrayJadwalTraining[3], 88));
		arrayNilai.add(new Nilai(arrayKaryawan[3], arrayJadwalTraining[4], 88));
		arrayNilai.add(new Nilai(arrayKaryawan[4], arrayJadwalTraining[0], 89));
		arrayNilai.add(new Nilai(arrayKaryawan[4], arrayJadwalTraining[1], 90));
		arrayNilai.add(new Nilai(arrayKaryawan[4], arrayJadwalTraining[2], 100));
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("+--------------------------+");
		System.out.println("|           MENU           |");
		System.out.println("+--------------------------+");
		System.out.println("|1. List Karyawan          |");
		System.out.println("|2. List Jadwal Training   |");
		System.out.println("|3. List Nilai             |");
		System.out.println("|4. Exit                   |");
		System.out.println("+--------------------------+");
		while (true) {
			try {
				
					System.out.print("Masukkan Menu Pilihan : ");
					pilihan = input.nextInt();
					System.out.println("");
					if (pilihan==1) {
						System.out.format("%-9s | %-8s | %-10s | %-5s", "Materi", "Tanggal", "Lokasi", "Session");
						System.out.println("\n---------------------------------------------");
						for (int i = 0; i < arrayKaryawan.length; i++) {
							System.out.format("%-9s | %-8s | %-10s | %-5s", arrayKaryawan[i].getKodeKaryawan(),
									arrayKaryawan[i].getNama(), 
									arrayKaryawan[i].getAlamat(),
									arrayKaryawan[i].getPhone());
							System.out.println("");
							}
					} else if (pilihan==2) {
						System.out.format("%-12s | %-10s | %-8s | %-5s", "Materi", "Tanggal", "Lokasi", "Session");
						System.out.println("\n------------------------------------------------");
						for (int i = 0; i < arrayJadwalTraining.length; i++) {
							System.out.format("%-12s | %-10s | %-8s | %-5s", arrayJadwalTraining[i].getMateri(),
									arrayJadwalTraining[i].getTanggal(), 
									arrayJadwalTraining[i].getLokasi(),
									arrayJadwalTraining[i].getSession());
							System.out.println("");
						}
					} else if (pilihan==3) {
						System.out.format("%-18s | %-18s | %-6s", "Nomor Karyawan", "Materi", "Nilai");
						System.out.println("\n-------------------------------------------------");
						for (Nilai dumperNilai : arrayNilai) 
							dumperNilai.printAll();
					} else if (pilihan==4) {
						System.out.println("Shutted down.");
						System.exit(1);
					} else {
						System.out.println("Bukan input yang valid");
					}
					System.out.println("");
				
			} catch (Exception e) {
				System.out.println("Bukan input yang valid");
				input.next();
				continue;
			}
			
		}
		
		
		
	}

}
