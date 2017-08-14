package tk.ainiyue.danyuan.application.dbm.column.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.ainiyue.danyuan.application.dbm.column.service.SysColumnService;
import tk.ainiyue.danyuan.application.dbm.table.controller.SysTableController;
import tk.ainiyue.danyuan.application.dbm.table.po.SysTableInfo;

/**
 * 文件名 ： SysColumnController.java
 * 包 名 ： tk.ainiyue.danyuan.application.dbm.column.controller
 * 描 述 ： TODO(用一句话描述该文件做什么)
 * 机能名称：
 * 技能ID ：
 * 作 者 ： wang
 * 时 间 ： 2017年8月3日 下午3:51:35
 * 版 本 ： V1.0
 */
@RestController
@RequestMapping("/sysColumnInfo")
public class SysColumnController {
	//
	private static final Logger	logger = LoggerFactory.getLogger(SysColumnController.class);
	
	//
	@Autowired
	private SysColumnService	sysColumnService;

	/**
	 * 方法名： findAll
	 * 功 能： TODO(这里用一句话描述这个方法的作用)
	 * 参 数： @return
	 * 返 回： List<SysSeedInfo>
	 * 作 者 ： Tenghui.Wang
	 * @throws
	 */
	@RequestMapping("/findAll")
	public List<SysTableInfo> findAll(@RequestBody String tableUuid) {
		logger.info("findAll", SysTableController.class);
		return sysColumnService.findAllByTableUuid(tableUuid);
	}
	
}
