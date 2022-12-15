package basic.dev;

import java.util.Iterator;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.1
		System.out.println("Nhập họ tên : ");
		String hoVaTen = sc.nextLine();
		System.out.println("Nhập Năm sinh :");
		int namSinh = sc.nextInt();
		System.out.println("Họ và tên : " + hoVaTen);
		int tuoi = 2022 - namSinh;
		System.out.println("Tuổi: " + tuoi);
		// 2.1
		System.out.println("Nhập điểm toán :");
		float diemToan = sc.nextFloat();
		System.out.println("Nhập điểm lý :");
		float diemLy = sc.nextFloat();
		System.out.println("Nhập điểm văn :");
		float diemVan = sc.nextFloat();
		float diemTrungBinh = (diemToan + diemLy + diemVan) / 3;
		System.out.println("Điểm trung bình là : " + diemTrungBinh);
		// 3.1
		System.out.println("Nhập chiều dài: ");
		int chieuDai = sc.nextInt();
		System.out.println("Nhập chiều rộng: ");
		int chieuRong = sc.nextInt();

		int tinhDienTich = chieuDai * chieuRong;
		int tinhChuVi = (chieuDai + chieuRong) * 2;
		System.out.println("Diện tích hình chữ nhật : " + tinhDienTich);
		System.out.println("Chu vi hình chữ nhật : " + tinhChuVi);
		// 4.1
		System.out.println("Nhập số thực 1: ");
		float soThuc1 = sc.nextFloat();
		System.out.println("Nhập số thực 2: ");
		float soThuc2 = sc.nextFloat();

		float tong = soThuc1 + soThuc2;
		float hieu = soThuc1 - soThuc2;
		float tich = soThuc1 * soThuc2;
		float thuong = soThuc1 / soThuc2;

		System.out.println("Tổng = " + tong);
		System.out.println("Hiệu = " + hieu);
		System.out.println("Tích = " + tich);
		System.out.println("Thương = " + thuong);
		// 5.1
		System.out.println("Nhập số nguyên a");
		int a = sc.nextInt();
		System.out.println("Nhập số nguyên b");
		int b = sc.nextInt();
		System.out.println("Nhập số nguyên c");
		int c = sc.nextInt();

		// 6.1
		if (a >= b && a >= c) {
			System.out.println("Số lớn nhất: " + a);
		} else if (b >= c && b >= a) {
			System.out.println("Số lớn nhất: " + b);
		} else {
			System.out.println("Số lớn nhất:" + c);
		}
		if (a <= b && a <= c) {
			System.out.println("Số nhỏ nhất: " + a);
		} else if (b <= c && b <= a) {
			System.out.println("Số nhỏ nhất: " + b);
		} else {
			System.out.println("Số nhỏ nhất:" + c);
		}
		// 6.1
		if (a % b == 0) {
			System.out.println("A chia hết cho B");
		} else {
			System.out.println("A không chia hết cho B");
		}
		// 2.1.a(câu 3)
		System.out.println("Nhập vào 1 số nguyên n :");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.printf("%d là số chẵn", n);
		} else {
			System.out.printf("%d là số lẻ", n);
		}
		int tong1DenN = 0;
		for (int i = 0; i <= n; i++) {
			tong1DenN += i;
		}
		System.out.println("\nTổng 1 đến n :" + tong1DenN);
		// 2.2.a
		if (n % 5 == 0) {
			System.out.printf("%d chia hết cho 5 ", n);
		} else {
			System.out.printf("%d không chia hết cho 5", n);
		}
		// 2.2.b
		float s = 0;
		for (int i = 1; i <= n; i++) {
			s += 1.0 / i;
		}
		System.out.println("\nTổng cua S :" + s);
		// 4.2(5.2)
		int p = 1;
		for (int i = 1; i <= n; i++) {
			p *= i;
		}
		System.out.println("Tổng P :" + p);

		// 6.2
		int month;
		do {
			System.out.println("Nhập 1 tháng trong năm");
			month = sc.nextInt();
		} while (month >= 0 && month > 12);
		switch (month) {
		case 1:
			System.out.println("Đây là tháng một");
			break;
		case 2:
			System.out.println("Đây là tháng hai");
			break;
		case 3:
			System.out.println("Đây là tháng ba");
			break;
		case 4:
			System.out.println("Đây là tháng bốn");
			break;
		case 5:
			System.out.println("Đây là tháng năm");
			break;
		case 6:
			System.out.println("Đây là tháng sau");
			break;
		case 7:
			System.out.println("Đây là tháng bảy");
			break;
		case 8:
			System.out.println("Đây là tháng tám");
			break;
		case 9:
			System.out.println("Đây là tháng chính");
			break;
		case 10:
			System.out.println("Đây là tháng mười");
			break;
		case 11:
			System.out.println("Đây là tháng mười một");
			break;
		case 12:
			System.out.println("Đây là tháng mười hai");
			break;
		}
		//1.3
		System.out.println("Nhập số nguyên 1 :");
		int soNguyen1 = sc.nextInt();
		System.out.println("Nhập số nguyên 2 :");
		int soNguyen2 = sc.nextInt();
		
		tinhTong(soNguyen1,soNguyen2);
		tinhHieu(soNguyen1,soNguyen2);
        System.out.println("Nhập số n nguyên dương ");
        int nn = sc.nextInt();
        //3.2
		tinhGiaiThuaT(nn);
		//3.3
		tongChanBeHonN(n);
		//3.4
		tinhLeBeHonN(n);
		//3.5
		System.out.println("Nhập cạnh a");
		int canhA = sc.nextInt();
		System.out.println("Nhập cạnh b");
		int canhB = sc.nextInt();
		dienTichChuNhat(canhA,canhB);
	}

	private static void dienTichChuNhat(int canhA, int canhB) {
		int dienTich = canhA * canhB;
		System.out.println("Diện tích hình chữ nhật :" + dienTich);
	}

	private static void tinhLeBeHonN(int n) {
		int tong = 0;
		for (int i = 1; i <= n; i+= 2) {
			tong += i;
		}
		System.out.println("Tổng lẻ bé hơn hoặc bằng n : " + tong);
	}

	private static void tongChanBeHonN(int n) {
		int tong = 0;
		for (int i = 2; i <= n; i+= 2) {
			tong += i;
		}
		System.out.println("Tổng chẵn bé hơn hoặc bằng n :" + tong);
	}

	private static void tinhGiaiThuaT(int nn) {
		int T = 1;
		for (int i = 1; i <= nn; i++) {
			T *= i;
		}
		System.out.println("Tổng T :" + T);
	}

	private static void tinhHieu(int soNguyen1, int soNguyen2) {
		int hieu = soNguyen1 - soNguyen2;
		System.out.println("Hiệu :" + hieu);
	}

	private static void tinhTong(int soNguyen1,int soNguyen2) {
		int tong = soNguyen1 + soNguyen2;
		System.out.println("Tổng : "+ tong);
	}
}
