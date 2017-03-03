package com.hmy.test.dpap;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.hmy.test.dpap.model.system.SystemDepartmentPo;
import com.hmy.test.dpap.service.system.SystemDepartmentService;

@RunWith(SpringJUnit4ClassRunner.class)//使测试运行于spring的测试环境
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml"})//指定加载spring的配置文件
public class TestMyBatis {

	private static final Logger logger = Logger.getLogger(TestMyBatis.class);
	
	private SystemDepartmentService systemDepartmentService;

	public SystemDepartmentService getSystemDepartmentService() {
		return systemDepartmentService;
	}

	@Autowired
	public void setSystemDepartmentService(SystemDepartmentService systemDepartmentService) {
		this.systemDepartmentService = systemDepartmentService;
	}
	
	/**
	 * 函数功能说明 ：保存部门信息 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数： <br/>
	 * return：void <br/>
	 */
	@Test
	public void insert(){
		SystemDepartmentPo po = new SystemDepartmentPo();
		po.setId("1");
		po.setDeptName("技术部");
		po.setSort(1);
		po.setStatus("0");
		po.setCreater("admin");
		po.setCreateTime(new Date());
		systemDepartmentService.insert(po);
	}
	
	/**
	 * 函数功能说明 ：查看部门信息 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数： <br/>
	 * return：void <br/>
	 */
	@Test
	public void select(){
		SystemDepartmentPo po = systemDepartmentService.selectByPrimaryKey("1");
		logger.info(JSON.toJSONStringWithDateFormat(po, "yyyy-MM-dd HH:mm:ss"));
	}
	
	/**
	 * 函数功能说明 ：更新部门信息 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数： <br/>
	 * return：void <br/>
	 */
	@Test
	public void update(){
		SystemDepartmentPo po = new SystemDepartmentPo();
		po.setId("1");
		po.setDeptName("信息部");
		po.setSort(2);
		po.setStatus("1");
		systemDepartmentService.updateByPrimaryKeySelective(po);
	}
	
	/**
	 * 函数功能说明 ：删除部门信息 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数： <br/>
	 * return：void <br/>
	 */
	@Test
	public void delete(){
		systemDepartmentService.deleteByPrimaryKey("1");
	}
	
}
