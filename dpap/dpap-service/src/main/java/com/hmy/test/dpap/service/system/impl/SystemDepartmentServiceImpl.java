package com.hmy.test.dpap.service.system.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmy.test.dpap.dao.system.SystemDepartmentPoMapper;
import com.hmy.test.dpap.model.system.SystemDepartmentPo;
import com.hmy.test.dpap.service.system.SystemDepartmentService;


/**
 * 类功能说明：部门信息接口实现类<br/>
 * 类修改者：<br/>
 * 修改日期：<br/>
 * 修改说明：<br/>
 * 公司名称：广州市领课科技有限公司 <br/>
 * 作者：roncoo-lrx <br/>
 * 创建时间：2016年11月4日 上午11:40:32 <br/>
 * 版本：V1.0 <br/>
 */
@Service("systemDepartmentService")
public class SystemDepartmentServiceImpl implements SystemDepartmentService {

	private SystemDepartmentPoMapper systemDepartmentPoMapper;
	
	public SystemDepartmentPoMapper getSystemDepartmentPoMapper() {
		return systemDepartmentPoMapper;
	}

	@Autowired
	public void setSystemDepartmentPoMapper(SystemDepartmentPoMapper systemDepartmentPoMapper) {
		this.systemDepartmentPoMapper = systemDepartmentPoMapper;
	}


	/**
	 * 描述: 保存部门信息 <br/>
	 * @see com.education.ssm.service.system.SystemDepartmentService#insert(com.education.ssm.model.system.SystemDepartmentPo) <br/>
	 */
	@Override
	public void insert(SystemDepartmentPo po) {
		systemDepartmentPoMapper.insert(po);
	}

	/**
	 * 描述: 查看部门信息 <br/>
	 * @see com.education.ssm.service.system.SystemDepartmentService#selectByPrimaryKey(java.lang.id) <br/>
	 */
	@Override
	public SystemDepartmentPo selectByPrimaryKey(String id) {
		return systemDepartmentPoMapper.selectByPrimaryKey(id);
	}

	/**
	 * 描述: 更新部门信息 <br/>
	 * @see com.education.ssm.service.system.SystemDepartmentService#updateByPrimaryKeySelective(com.education.ssm.model.system.SystemDepartmentPo) <br/>
	 */
	@Override
	public void updateByPrimaryKeySelective(SystemDepartmentPo po) {
		systemDepartmentPoMapper.updateByPrimaryKeySelective(po);
	}

	/**
	 * 描述: 删除部门信息 <br/>
	 * @see com.education.ssm.service.system.SystemDepartmentService#deleteByPrimaryKey(java.lang.String) <br/>
	 */
	@Override
	public void deleteByPrimaryKey(String id) {
		systemDepartmentPoMapper.deleteByPrimaryKey(id);
	}

}
