package bean;

public class KhachHangbeab {
	
	private String makh;
	private String hoten;
     private String diachi;
     private String matkhau;
     
     public KhachHangbeab() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getMakh() {
		return makh;
	}
	public void setMakh(String makh) {
		this.makh = makh;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	
     public KhachHangbeab(String makh, String hoten, String diachi, String matkhau) {
		super();
		this.makh = makh;
		this.hoten = hoten;
		this.diachi = diachi;
		this.matkhau = matkhau;
	}
	
     
     
     
}
