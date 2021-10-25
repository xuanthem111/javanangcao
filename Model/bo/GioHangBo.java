package bo;

import java.util.ArrayList;

import bean.GioHangBean;

public class GioHangBo {
	public static ArrayList<GioHangBean> ds = new ArrayList<GioHangBean>();

	public void Them(String masach, String tensach, String tacgia, Long soluongmua, Long gia) {
    	for(GioHangBean g: ds)
    		if(g.getMaSach().equals(masach)) {
    			g.setSlMua(g.getSlMua()+soluongmua);
    			return ;
    		}
    	ds.add(new GioHangBean(masach, tensach, tacgia, soluongmua, gia));
    }
		public void Xoa(String masach) {
			for (GioHangBean gh : ds) {
				if (gh.getMaSach().equals(masach)) {
					ds.remove(gh);
					break;
				}
			}
		}
		public long TongTien() {
			long tongtien = 0;
			for (GioHangBean gh: ds) {
				tongtien += gh.getGia()*gh.getSlMua();
			}
			return tongtien;
		}
	
		public void XoaAll() {
			ds.removeAll(ds);
		}
}
