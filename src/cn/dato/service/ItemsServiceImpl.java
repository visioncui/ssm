package cn.dato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dato.dao.ItemsMapper;
import cn.dato.pojo.DatoVo;
import cn.dato.pojo.Items;
import cn.dato.pojo.ItemsExample;
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;
   
	@Override
	public List<Items> list() throws Exception {
		// TODO Auto-generated method stub
		ItemsExample itemsExample = new ItemsExample();
		List<Items> list = itemsMapper.selectByExampleWithBLOBs(itemsExample);
		
		return list;
	}

	@Override
	public Items findItemsById(Integer id) {
		// TODO Auto-generated method stub
		
		Items item =  itemsMapper.selectByPrimaryKey(id);
		return item;
	}

	@Override
	public void update(Items item) {
		// TODO Auto-generated method stub
		
		/*Items temp =  itemsMapper.selectByPrimaryKey(item.getId());
		ItemsExample example = new  ItemsExample();
		if(item.getName()==""){
			item.setName(temp.getName());
		}
		
		if(item.getCreatetime()==null){
			item.setCreatetime(temp.getCreatetime());
		}
		
		if(item.getDetail()==null){
			item.setDetail(temp.getDetail());
		} 
		
		if(item.getPic()==null){
			item.setPic(temp.getPic());
		} 
		
		if(item.getPrice()==null){
			item.setPrice(temp.getPrice());
		} 
		*/
		itemsMapper.updateByPrimaryKeyWithBLOBs(item);

	}

	@Override
	public void delete(DatoVo datoVo) {
	System.out.println(datoVo.getIds());	
	/*	Integer[] ids = datoVo.getIds();
		itemsMapper.deleteByPrimaryKey(ids);*/

		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAll(DatoVo datoVo) {
		System.out.println(datoVo.getListItems());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Items items) {
		itemsMapper.insert(items);		
	}
}
