package bo;

import java.util.ArrayList;

import bean.KhachHangbeab;
import bean.sachbean;
import dao.KhachHangdao;

public class KhachHangbo {
	KhachHangdao khdao = new KhachHangdao();
	public ArrayList<KhachHangbeab> getkh(){
		return khdao.getkhachhang();		
	}
	
	public boolean checkdn(String makh,String mk){
		 ArrayList<KhachHangbeab> ds= getkh();
		   ArrayList<KhachHangbeab> tam= new ArrayList<KhachHangbeab>();
		   for(KhachHangbeab s: ds)
			   if(s.getMakh().equals(makh) && s.getMatkhau().equals(mk) ) {
				   return true;  
			   }
		     return false;
				  
			}
	
	public ArrayList<KhachHangbeab> getKhachHang() {
		return khdao.getkhachhang();
	}
	public KhachHangbeab ktdn(String makh, String matkhau) {
		ArrayList<KhachHangbeab> ds = getKhachHang();		
		for (KhachHangbeab kh : ds) {
			if(kh.getMakh().equals(makh) && kh.getMatkhau().equals(matkhau))
				return kh;			
		}
		return null;
	}

}
