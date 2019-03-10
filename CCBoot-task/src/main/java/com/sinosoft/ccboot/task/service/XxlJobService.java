package com.sinosoft.ccboot.task.service;


import com.sinosoft.ccboot.task.core.model.XxlJobInfo;
import com.xxl.job.core.biz.model.ReturnT;

import java.util.Date;
import java.util.Map;

/**
 * core templates.job action for xxl.job
 * 
 * @author xuxueli 2016-5-28 15:30:33
 */
public interface XxlJobService {

	/**
	 * page list
	 *
	 * @param start
	 * @param length
	 * @param jobGroup
	 * @param jobDesc
	 * @param executorHandler
	 * @param filterTime
	 * @return
	 */
	public Map<String, Object> pageList(int start, int length, int jobGroup, String jobDesc, String executorHandler, String filterTime);

	/**
	 * add templates.job
	 *
	 * @param jobInfo
	 * @return
	 */
	public ReturnT<String> add(XxlJobInfo jobInfo);

	/**
	 * update templates.job
	 *
	 * @param jobInfo
	 * @return
	 */
	public ReturnT<String> update(XxlJobInfo jobInfo);

	/**
	 * remove templates.job
	 *
	 * @param id
	 * @return
	 */
	public ReturnT<String> remove(int id);

	/**
	 * pause templates.job
	 *
	 * @param id
	 * @return
	 */
	public ReturnT<String> pause(int id);

	/**
	 * resume templates.job
	 *
	 * @param id
	 * @return
	 */
	public ReturnT<String> resume(int id);

	/**
	 * trigger templates.job
	 *
	 * @param id
	 * @return
	 */
	public ReturnT<String> triggerJob(int id);

	/**
	 * dashboard info
	 *
	 * @return
	 */
	public Map<String,Object> dashboardInfo();

	/**
	 * chart info
	 *
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public ReturnT<Map<String,Object>> chartInfo(Date startDate, Date endDate);

}
