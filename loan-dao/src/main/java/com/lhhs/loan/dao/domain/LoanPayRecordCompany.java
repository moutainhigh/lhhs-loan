package com.lhhs.loan.dao.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.lhhs.loan.common.shared.page.BaseObject;

public class LoanPayRecordCompany extends BaseObject{
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 2617653059359003674L;

	private String id;

    private Long planId;

    private String orderNo;

    private String customerId;

    private String customerName;

    private String accountId;

    private String transMainId;

    private String repaymentMethod;

    private BigDecimal repaymentTotal;

    private BigDecimal repaymentCapital;

    private Date repaymentCapitalTime;

    private BigDecimal repaymentInterest;

    private Date repaymentInterestTime;

    private Integer overdueDays;

    private Short period;
    private BigDecimal overdueInterestTotal;
    private BigDecimal overdueCapital;
    private BigDecimal overdueInterest;

    private BigDecimal paidFees;

    private BigDecimal seviceFee;

    private BigDecimal advanceTotal;

    private BigDecimal advanceCapital;

    private BigDecimal advanceInterest;

    private Date repaymentActualTime;

    private Date repaymentedTime;

    private Date capitalTime;

    private Date interestTime;

    private String transType;
    
    /**本金利息总额**/
    private BigDecimal paidTotal;

    private BigDecimal paidCapital;

    private BigDecimal paidInterest;

    private BigDecimal paidOverdue;

    private BigDecimal paidCompensate;

    private String accountManager;

    private String department;

    private String companyId;

    private String unionId;

    private String interestStart;

    private String interestEnd;

    private String status;

    private String createUser;

    private Date createTime;

    private String lastUser;

    private Date lastModifyTime;

    private String field1;

    private String field2;

    private String field3;

    private String field4;

    private String field5;
    //冗余字段
    private String borrower;
    
    private Short periodTotal;
    //是否全部还款标志(0:当前还款，1:全部还款)
    private String payFlag;
    //判断是还本
    private String isCapita;
    //判断是还息
    private String isInterest;
    
    private BigDecimal totalAmount;
    //违约天数
    private Integer compensateDays;
    //实际使用天数
    private Integer useDays;
    
    private String periodTotalAll;
    
    /**
     * 交易备注
     */
    private String transRemark;
    
    public String getPeriodTotalAll() {
		return periodTotalAll;
	}

	public void setPeriodTotalAll(String periodTotalAll) {
		this.periodTotalAll = periodTotalAll;
	}

	public Integer getCompensateDays() {
		return compensateDays;
	}

	public void setCompensateDays(Integer compensateDays) {
		this.compensateDays = compensateDays;
	}

	public Integer getUseDays() {
		return useDays;
	}

	public void setUseDays(Integer useDays) {
		this.useDays = useDays;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	private String productType;
    private String productName;
    private String provienceName;
    private String cityName;
    public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getProvienceName() {
		return provienceName;
	}

	public void setProvienceName(String provienceName) {
		this.provienceName = provienceName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	private BigDecimal interestSpread = new BigDecimal(0.00);
    //实际还款时间
    private Date actualTransTime;
    public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public Short getPeriodTotal() {
		return periodTotal;
	}

	public void setPeriodTotal(Short periodTotal) {
		this.periodTotal = periodTotal;
	}

	public String getPayFlag() {
		return payFlag;
	}

	public void setPayFlag(String payFlag) {
		this.payFlag = payFlag;
	}

	public String getIsCapita() {
		return isCapita;
	}

	public void setIsCapita(String isCapita) {
		this.isCapita = isCapita;
	}

	public String getIsInterest() {
		return isInterest;
	}

	public void setIsInterest(String isInterest) {
		this.isInterest = isInterest;
	}

	/**付款总额=本金+利息+逾期罚息+违约金**/
    private BigDecimal paidAllTotal;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getTransMainId() {
        return transMainId;
    }

    public void setTransMainId(String transMainId) {
        this.transMainId = transMainId == null ? null : transMainId.trim();
    }

    public String getRepaymentMethod() {
        return repaymentMethod;
    }

    public void setRepaymentMethod(String repaymentMethod) {
        this.repaymentMethod = repaymentMethod == null ? null : repaymentMethod.trim();
    }

    public BigDecimal getRepaymentTotal() {
        return repaymentTotal;
    }

    public void setRepaymentTotal(BigDecimal repaymentTotal) {
        this.repaymentTotal = repaymentTotal;
    }

    public BigDecimal getRepaymentCapital() {
        return repaymentCapital;
    }

    public void setRepaymentCapital(BigDecimal repaymentCapital) {
        this.repaymentCapital = repaymentCapital;
    }

    public Date getRepaymentCapitalTime() {
        return repaymentCapitalTime;
    }

    public void setRepaymentCapitalTime(Date repaymentCapitalTime) {
        this.repaymentCapitalTime = repaymentCapitalTime;
    }

    public BigDecimal getRepaymentInterest() {
        return repaymentInterest;
    }

    public void setRepaymentInterest(BigDecimal repaymentInterest) {
        this.repaymentInterest = repaymentInterest;
    }

    public Date getRepaymentInterestTime() {
        return repaymentInterestTime;
    }

    public void setRepaymentInterestTime(Date repaymentInterestTime) {
        this.repaymentInterestTime = repaymentInterestTime;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Short getPeriod() {
        return period;
    }

    public void setPeriod(Short period) {
        this.period = period;
    }

    public BigDecimal getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(BigDecimal overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public BigDecimal getPaidFees() {
        return paidFees;
    }

    public void setPaidFees(BigDecimal paidFees) {
        this.paidFees = paidFees;
    }

    public BigDecimal getSeviceFee() {
        return seviceFee;
    }

    public void setSeviceFee(BigDecimal seviceFee) {
        this.seviceFee = seviceFee;
    }

    public BigDecimal getAdvanceTotal() {
        return advanceTotal;
    }

    public void setAdvanceTotal(BigDecimal advanceTotal) {
        this.advanceTotal = advanceTotal;
    }

    public BigDecimal getAdvanceCapital() {
        return advanceCapital;
    }

    public void setAdvanceCapital(BigDecimal advanceCapital) {
        this.advanceCapital = advanceCapital;
    }

    public BigDecimal getAdvanceInterest() {
        return advanceInterest;
    }

    public void setAdvanceInterest(BigDecimal advanceInterest) {
        this.advanceInterest = advanceInterest;
    }

    public Date getRepaymentActualTime() {
        return repaymentActualTime;
    }

    public void setRepaymentActualTime(Date repaymentActualTime) {
        this.repaymentActualTime = repaymentActualTime;
    }

    public Date getRepaymentedTime() {
        return repaymentedTime;
    }

    public void setRepaymentedTime(Date repaymentedTime) {
        this.repaymentedTime = repaymentedTime;
    }

    public Date getCapitalTime() {
        return capitalTime;
    }

    public void setCapitalTime(Date capitalTime) {
        this.capitalTime = capitalTime;
    }

    public Date getInterestTime() {
        return interestTime;
    }

    public void setInterestTime(Date interestTime) {
        this.interestTime = interestTime;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public BigDecimal getPaidTotal() {
        return paidTotal;
    }

    public void setPaidTotal(BigDecimal paidTotal) {
        this.paidTotal = paidTotal;
    }

    public BigDecimal getPaidCapital() {
        return paidCapital;
    }

    public void setPaidCapital(BigDecimal paidCapital) {
        this.paidCapital = paidCapital;
    }

    public BigDecimal getPaidInterest() {
        return paidInterest;
    }

    public void setPaidInterest(BigDecimal paidInterest) {
        this.paidInterest = paidInterest;
    }

    public BigDecimal getPaidOverdue() {
        return paidOverdue;
    }

    public void setPaidOverdue(BigDecimal paidOverdue) {
        this.paidOverdue = paidOverdue;
    }

    public BigDecimal getPaidCompensate() {
        return paidCompensate;
    }

    public void setPaidCompensate(BigDecimal paidCompensate) {
        this.paidCompensate = paidCompensate;
    }

    public String getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager == null ? null : accountManager.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public String getInterestStart() {
        return interestStart;
    }

    public void setInterestStart(String interestStart) {
        this.interestStart = interestStart == null ? null : interestStart.trim();
    }

    public String getInterestEnd() {
        return interestEnd;
    }

    public void setInterestEnd(String interestEnd) {
        this.interestEnd = interestEnd == null ? null : interestEnd.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastUser() {
        return lastUser;
    }

    public void setLastUser(String lastUser) {
        this.lastUser = lastUser == null ? null : lastUser.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4 == null ? null : field4.trim();
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5 == null ? null : field5.trim();
    }

	public BigDecimal getInterestSpread() {
		return interestSpread;
	}

	public void setInterestSpread(BigDecimal interestSpread) {
		this.interestSpread = interestSpread;
	}

	public Date getActualTransTime() {
		return actualTransTime;
	}

	public void setActualTransTime(Date actualTransTime) {
		this.actualTransTime = actualTransTime;
	}

	public BigDecimal getOverdueInterestTotal() {
		return overdueInterestTotal;
	}

	public void setOverdueInterestTotal(BigDecimal overdueInterestTotal) {
		this.overdueInterestTotal = overdueInterestTotal;
	}

	public BigDecimal getOverdueCapital() {
		return overdueCapital;
	}

	public void setOverdueCapital(BigDecimal overdueCapital) {
		this.overdueCapital = overdueCapital;
	}

	public BigDecimal getPaidAllTotal() {
		return paidAllTotal;
	}

	public void setPaidAllTotal(BigDecimal paidAllTotal) {
		this.paidAllTotal = paidAllTotal;
	}

	public String getTransRemark() {
		return transRemark;
	}

	public void setTransRemark(String transRemark) {
		this.transRemark = transRemark;
	}
    
}