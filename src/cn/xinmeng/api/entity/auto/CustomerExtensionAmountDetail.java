package cn.xinmeng.api.entity.auto;
import cn.xinmeng.common.entity.IEntity;

/**
 * 描述：推广资金账户金额流水表
 * @author jiangyong.tan
 * @date 2017-03-09 12:20:26
 */
public class CustomerExtensionAmountDetail implements IEntity{

    private static final long serialVersionUID = 928568957310718485L;

    private Integer id; //主键
    private String orderId; //此次消费可能关联的订单编号
    private Integer customerId; //客户编号
    private String customerName; //客户名称
    private Integer paymentType; //收支类型1：收入，2：支出
    private Integer consumType; //1=推广奖励，2=购物奖励
    private Double oldMoney; //上次结余
    private Double amount; //消费金额，不区别正负，消费100，该值就是100
    private Double nowMoney; //本次结余
    private String remark; //备注
    private java.util.Date createTime; //创建时间
    private String createUser; //创建者

	
	// set get
	
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return this.id;
    }
	
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    public String getOrderId() {
        return this.orderId;
    }
	
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    
    public Integer getCustomerId() {
        return this.customerId;
    }
	
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getCustomerName() {
        return this.customerName;
    }
	
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }
    
    public Integer getPaymentType() {
        return this.paymentType;
    }
	
    public void setConsumType(Integer consumType) {
        this.consumType = consumType;
    }
    
    public Integer getConsumType() {
        return this.consumType;
    }
	
    public void setOldMoney(Double oldMoney) {
        this.oldMoney = oldMoney;
    }
    
    public Double getOldMoney() {
        return this.oldMoney;
    }
	
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    public Double getAmount() {
        return this.amount;
    }
	
    public void setNowMoney(Double nowMoney) {
        this.nowMoney = nowMoney;
    }
    
    public Double getNowMoney() {
        return this.nowMoney;
    }
	
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public String getRemark() {
        return this.remark;
    }
	
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
    
    public java.util.Date getCreateTime() {
        return this.createTime;
    }
	
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    
    public String getCreateUser() {
        return this.createUser;
    }
}