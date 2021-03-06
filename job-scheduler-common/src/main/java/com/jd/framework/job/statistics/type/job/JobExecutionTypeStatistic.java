/*   
 * Copyright (c) 2010-2020 Founder Ltd. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * Founder. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Founder.   
 *   
 */
package com.jd.framework.job.statistics.type.job;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 
 * 作业类型统计概览
 * 
 * @author Rong Hu
 * @version 1.0, 2017-4-15
 */
@Getter
@AllArgsConstructor
public class JobExecutionTypeStatistic {

	private int transientJobCount;

	private int daemonJobCount;

}
