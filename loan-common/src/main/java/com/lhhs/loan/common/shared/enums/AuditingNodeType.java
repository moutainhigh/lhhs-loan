package com.lhhs.loan.common.shared.enums;

public enum AuditingNodeType {

	/**订单审核节点**/
	CP("cp",0,"初评"),
	XH("xh",1,"下户"),
	MS("ms",2,"面审"),
	
	ZS("zs",3,"终审"),
	FKSQ("fksq",4,"放款申请"),
	FKSH("fksh",5,"放款审核"),
	
	QYGZ("qygz",6,"签约公正"),
	QZDY("qzdy",7,"权证抵押"),
	FKQR("fkqr",8,"放款确认"),
	
	ZXFK("zxfk",9,"执行放款"),
	YCD("ycd",10,"已撤单"),
	YJD("yjd",11,"已拒贷"),
	FKCG("fkcg",12,"放款成功");
	
	private String name;
	private Integer index;
	private String desc;
	
	private AuditingNodeType(String name, Integer index, String desc) {
		this.name = name;
		this.index = index;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
