package cn.dato.service;

import java.util.List;

import cn.dato.pojo.DatoVo;
import cn.dato.pojo.Items;


public interface ItemsService {
   
	public List<Items> list() throws Exception;
	public Items findItemsById(Integer id);
	public void update(Items item);
	public void delete(DatoVo datoVo);
	public void updateAll(DatoVo datoVo);
	public void insert(Items items);
}
