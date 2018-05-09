package cn.dato.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.dato.pojo.DatoVo;
import cn.dato.pojo.Items;
import cn.dato.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {
     @Autowired  //@Resouse("name")
     private ItemsService itmesService;
     @RequestMapping("/list")
     public ModelAndView itemsList()throws Exception{
    	 List<Items> list = itmesService.list();
    	 
    	 ModelAndView modelandview = new ModelAndView();
    	 modelandview.addObject("itemList",list);
    	 modelandview.setViewName("itemList");
		return modelandview;
     }
     @RequestMapping("/itemEdit")
     public String itemEdit(HttpServletRequest request,HttpServletResponse response,Model model) throws Exception{
		
    	 Items item = itmesService.findItemsById(Integer.parseInt(request.getParameter("id")));
    /*	 ModelAndView modelandview = new ModelAndView();
    	 modelandview.addObject("item",item);
    	 modelandview.setViewName("editItem");
    	 return modelandview;   */	
    	 model.addAttribute("item", item);
    	 return "editItem";
     }
     
     @RequestMapping("/updateitem")
    // public String update(Items items) throws Exception{
     //public String update(Integer id, String name, Float price, String detail) throws Exception{
     public String update(MultipartFile pictureFile,Items items) throws Exception{
    	/* Items items = new Items();
 		 items.setId(id);
 		 items.setName(name);
 		 items.setPrice(price);
 		 items.setDetail(detail);
 		 items.setCreatetime(new Date());
		 itmesService.update(items);*/
    	 //1.��ȡͼƬ��������
    	 String fileStr = pictureFile.getOriginalFilename();
    	 //2.ʹ��������ɵ��ַ���+ԭͼƬ��չ������µ�ͼƬ���ƣ���ֹͼƬ������
    	 String newfileName = UUID.randomUUID().toString() + fileStr.substring(fileStr.lastIndexOf(".")); 
    	 //3.��ͼƬ���浽Ӳ��
    	 pictureFile.transferTo(new File("D:\\pic\\"+newfileName));
    	 //4.��ͼƬ���Ʊ��浽���ݿ�
    	 items.setPic(newfileName);
    	 
    	 itmesService.update(items);
    	 return "success";   	 
     }
     
     @RequestMapping("/del")
     public String delete(DatoVo datoVo){
		return "success";
     }
     
     @RequestMapping("/updAll")
     public String updAll(DatoVo datoVo){
		return "success";
     }
     
     @RequestMapping("/sendJson")
     @ResponseBody //ֱ�Ӹ�ҳ�淵�ؽ������
     public Items json(@RequestBody Items item) throws Exception{
		return item;
     } 
     
}
