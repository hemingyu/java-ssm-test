package com.hmy.test.dpap.service.system;

import com.hmy.test.dpap.model.system.SystemDepartmentPo;

/**
 * 类功能说明：部门信息接口<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广州市领课科技有限公司 <br/>
 * 作者：roncoo-lrx <br/>
 * 创建时间：2016年11月4日 上午11:39:27 <br/>
 * 版本：V1.0 <br/>
 */
public interface SystemDepartmentService {

	/**
	 * 函数功能说明 ：保存部门信息 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数：@param po <br/>
	 * return：void <br/>
	 */
	void insert(SystemDepartmentPo po);

	/**
	 * 函数功能说明 ： 查看部门信息<br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数：@param id
	 * 参数：@return <br/>
	 * return：SystemDepartmentPo <br/>
	 */
	SystemDepartmentPo selectByPrimaryKey(String id);

	/**
	 * 函数功能说明 ： 更新部门信息<br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数：@param po <br/>
	 * return：void <br/>
	 */
	void updateByPrimaryKeySelective(SystemDepartmentPo po);

	/**
	 * 函数功能说明 ：删除部门信息 <br/>
	 * 修改者名字： <br/>
	 * 修改日期： <br/>
	 * 修改内容：<br/>
	 * 作者：roncoo-lrx <br/>
	 * 参数：@param id <br/>
	 * return：void <br/>
	 */
	void deleteByPrimaryKey(String id);

}
