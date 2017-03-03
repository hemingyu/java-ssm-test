package com.hmy.test.dpap.controller.system;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hmy.test.dpap.service.system.SystemDepartmentService;
import com.hmy.test.dpap.model.system.SystemDepartmentPo;


/**
 * 类功能说明：部门信息管理<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广州市领课科技有限公司 <br/>
 * 作者：roncoo-lrx <br/>
 * 创建时间：2016年11月5日 下午8:19:47 <br/>
 * 版本：V1.0 <br/>
 */
@Controller
@RequestMapping("/system/department")
public class SystemDepartmentController {

	private static final Logger logger = Logger.getLogger(SystemDepartmentController.class);
	
	/**
	 * 注入部门信息接口
	 */
	private SystemDepartmentService systemDepartmentService;

	public SystemDepartmentService getSystemDepartmentService() {
		return systemDepartmentService;
	}

	@Autowired
	public void setSystemDepartmentService(SystemDepartmentService systemDepartmentService) {
		this.systemDepartmentService = systemDepartmentService;
	}
	
	/**
	 * 函数功能说明 ： RESTful风格的url传参方式<br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数：@param request
	 * 参数：@param id
	 * 参数：@return <br/>
	 * return：String <br/>
	 */
	@RequestMapping("/view/{id}")
	public String RESTful(HttpServletRequest request, @PathVariable String id){
		SystemDepartmentPo po = systemDepartmentService.selectByPrimaryKey(id);
		request.setAttribute("bean", po);
		return "system/department/view";
	}
	
	/**
	 * 函数功能说明 ： 删除部门信息<br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数：@param id
	 * 参数：@return <br/>
	 * return：String <br/>
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam String id){
		systemDepartmentService.deleteByPrimaryKey(id);
		return "redirect:/system/department/view?id="+id;
	}
	
	/**
	 * 函数功能说明 ：修改部门信息 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数：@param po
	 * 参数：@return <br/>
	 * return：String <br/>
	 */
	@RequestMapping("/update")
	public String update(SystemDepartmentPo po){
		po.setEditTime(new Date());
		systemDepartmentService.updateByPrimaryKeySelective(po);
		return "redirect:/system/department/view?id="+po.getId();
	}
	
	/**
	 * 函数功能说明 ：进入修改部门信息页面 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数：@param request
	 * 参数：@param id
	 * 参数：@return <br/>
	 * return：String <br/>
	 */
	@RequestMapping("/edit")
	public String edit(HttpServletRequest request,@RequestParam String id){
		SystemDepartmentPo po = systemDepartmentService.selectByPrimaryKey(id);
		request.setAttribute("bean", po);
		return "system/department/edit";
	}
	
	/**
	 * 函数功能说明 ： 保存部门信息<br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数：@param po
	 * 参数：@return <br/>
	 * return：String <br/>
	 */
	@RequestMapping("/save")
	public String save(SystemDepartmentPo po){
		po.setCreateTime(new Date());
		systemDepartmentService.insert(po);
		return "redirect:/system/department/view?id="+po.getId();
	}
	
	/**
	 * 函数功能说明 ：查看部门信息 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数：@param request
	 * 参数：@param id
	 * 参数：@return <br/>
	 * return：String <br/>
	 */
	@RequestMapping("/view")
	public String view(HttpServletRequest request,@RequestParam String id){
		SystemDepartmentPo po = systemDepartmentService.selectByPrimaryKey(id);
		request.setAttribute("bean", po);
		return "system/department/view";
	}
}
