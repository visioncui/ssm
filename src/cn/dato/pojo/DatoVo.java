package cn.dato.pojo;

import java.util.Arrays;
import java.util.List;

public class DatoVo {
     Integer[] ids ;
     List<Items> listItems;

	public List<Items> getListItems() {
		return listItems;
	}

	public void setListItems(List<Items> listItems) {
		this.listItems = listItems;
	}
    
	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	@Override
	public String toString() {
		return "DatoVo [listItems=" + listItems + "]";
	}
     
     
}
