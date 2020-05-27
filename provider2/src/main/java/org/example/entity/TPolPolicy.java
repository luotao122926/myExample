package org.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;


@Data
@NoArgsConstructor

public class TPolPolicy {
    /**
    * 政策ID
    */
    private BigDecimal policyId;

    /**
    * 政策编号
    */
    private String policyNumber;

    /**
    * 外部文件号
    */
    private String policyDocNumber;

    /**
    * 政策名称
    */
    private String policyName;

    /**
    * 说明
    */
    private String comments;

    /**
    * 预计返利单编码
    */
    private String policyOrderNumber;

    /**
    * 状态(1、已部分返利，2、已作废，3、已驳回，4、已返利，5、已录入，6、已审核，7、已关闭，8、已送审，9、已确认)
    */
    private String status;

    /**
    * 政策制定日期
    */
    private Date policyDate;

    /**
    * 营销中心ID
    */
    private BigDecimal salesCenterId;

    /**
    * 营销中心编码
    */
    private String salesCenterCode;

    /**
    * 营销中心名称
    */
    private String salesCenterName;

    /**
    * 起始日期
    */
    private Date beginDate;

    /**
    * 终止日期
    */
    private Date endDate;

    /**
    * 确认日期
    */
    private Date affirmDate;

    /**
    * 确认人
    */
    private String affirmBy;

    /**
    * 关闭日期
    */
    private Date closeDate;

    /**
    * 关闭人
    */
    private String closedBy;

    /**
    * 作废日期
    */
    private Date discardDate;

    /**
    * 作废人
    */
    private String discardBy;

    /**
    * 作废人姓名
    */
    private String discardByName;

    /**
    * 营销大类
    */
    private String salesMainType;

    /**
    * 客户ID
    */
    private BigDecimal customerId;

    /**
    * 客户编码
    */
    private String customerCode;

    /**
    * 客户名称
    */
    private String customerName;

    /**
    * 账户ID
    */
    private BigDecimal accountId;

    /**
    * 账户编码
    */
    private String accountCode;

    /**
    * 支付来源
    */
    private String discountPayDept;

    /**
    * 折让方式
    */
    private String discountMethod;

    /**
    * 折让项目
    */
    private String discountItem;

    /**
    * 兑现标准区分台阶
    */
    private String stdStepFlag;

    /**
    * 政策统计方式
    */
    private String calMethod;

    /**
    * 商品返利基准ID
    */
    private BigDecimal mtlTypeBaseStdId;

    /**
    * 申请金额
    */
    private BigDecimal docLandAmount;

    /**
    * 生成报表日期
    */
    private Date reportDate;

    /**
    * 报表状态
    */
    private String reportStatus;

    /**
    * 报表出错信息
    */
    private String reportErrMsg;

    /**
    * 主体ID
    */
    private BigDecimal entityId;

    /**
    * 算法说明
    */
    private String algorithmComment;

    /**
    * 邮件发送频率
    */
    private String mailRate;

    /**
    * 品牌名称
    */
    private String brandName;

    /**
    * 品牌代码
    */
    private String brandCode;

    /**
    * 品牌ID
    */
    private BigDecimal brandId;

    /**
    * 占用金额
    */
    private BigDecimal occupiedAmount;

    /**
    * 申请部门编码
    */
    private String requisDeptCode;

    /**
    * 申请部门名称
    */
    private String requisDeptName;

    /**
    * 政策类型ID
    */
    private BigDecimal policyTypeId;

    /**
    * 作废原因
    */
    private String discardReason;

    /**
    * 可使用金额
    */
    private BigDecimal effectiveAmount;

    /**
    * 应计返利对应的项目代码
    */
    private String resultDefineCode;

    /**
    * 是否模板
    */
    private String templeteFlag;

    /**
    * 创建人
    */
    private String createdBy;

    /**
    * 创建时间
    */
    private Date creationDate;

    /**
    * 最后修改人
    */
    private String lastUpdatedBy;

    /**
    * 最后修改时间
    */
    private Date lastUpdateDate;

    /**
    * 邮件模板ID
    */
    private BigDecimal mailTemplateId;

    /**
    * 报表结果自动计算频率
    */
    private String reportRate;

    /**
    * 预算流ID
    */
    private BigDecimal dataFlowId;

    /**
    * 应计返利对应的项目名称
    */
    private String resultDefineName;

    /**
    * 附件ID
    */
    private String appendixId;

    /**
    * 单据日期
    */
    private Date orderDate;

    /**
    * 是否自动计算
    */
    private String autoFlag;

    /**
    * 版本号
    */
    private BigDecimal version;

    /**
    * 预算占用标识
    */
    private String budgetFlag;

    /**
    * 项目登录号(多个登录号用英文逗号分割)
    */
    private String projectCode;

    /**
    * 是否客户资源
    */
    private String custSourceFlag;

    /**
    * 涉及机型(数据来源快码：REF_MODEL)
    */
    private String refModel;

    /**
    * 是否兑现至CCS客户
    */
    private String applyToCcsFlag;

    /**
    * 是否发布标识
    */
    private String policyReleaseFlag;

    /**
    * 上级政策ID
    */
    private BigDecimal parentPolicyId;

    /**
    * 政策算法分组名称
    */
    private String calculateGroupName;

    /**
    * 政策算法分组类型
    */
    private String calculateGroupType;

    /**
    * 归属返利周期
    */
    private String discountPeriod;

    /**
    * 算法有效标志(Y/N)
    */
    private String algoActiveFlag;

    /**
    * 政策资源ID
    */
    private BigDecimal policySourceId;

    /**
    * 分销统计
    */
    private String ccsStat;

    /**
    * MMP统计
    */
    private String mmpStat;

    /**
    * 门店id
    */
    private BigDecimal terminalId;

    /**
    * 门店编码
    */
    private String terminalCode;

    /**
    * 门店名称
    */
    private String terminalName;

    /**
    * 大数据盈利分析接口视图用
    */
    private BigDecimal biPolicyId;

    /**
    * 政策支出类型（码表：POL_EXPEND_TYPE)
    */
    private String polExpendType;

    /**
    * 来源单据ID
    */
    private BigDecimal srcBillId;

    /**
    * 来源单据编码
    */
    private String srcBillNum;

    /**
    * 来源单据类型
    */
    private String srcBillType;

    /**
    * 经营单位ID
    */
    private BigDecimal ouId;

    /**
    * 补亏政策补贴比例
    */
    private BigDecimal subsidyRate;

    /**
    * 政策大类
    */
    private String policyMainType;

    /**
    * 政策小类
    */
    private String policySubType;

    /**
    * 是否发MIP公文
    */
    private String mipDocFlag;

    /**
    * 锁定标识(跳转MIP发公文后锁定政策)
    */
    private String mipLockFlag;

    /**
    * MIP公文编号
    */
    private String mipDocNum;

    /**
    * MIP公文名称
    */
    private String mipDocName;

    /**
    * MIP实例id
    */
    private String mipInstanceId;
}