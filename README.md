# Course
## Servic层命名规范
```
获取数据库所有信息用listAll
通过字段获取数据库多条信息用list..By
通过字段获取数据库一条信息用get..By
新增一条信息用add
修改一条信息用update
删除一条信息用delete/delete..By
```

## 数据库各表即各字段含义
### course_priv_history
```
字段：
user_id：会员id
order_priv_id：私教课订单id（一个会员有可能有多个私教，用于区分上的是哪个课）
current_num：已上节数
total_num：总节数
date：上课时间
```
### course_private私教课课程信息表
```
字段：
id:唯一标识符
name：私教课课名
price：课程单价
teacher_id：教师id
```
### course_public公共课课程信息表
```
字段：
id：唯一标识符
teacher_id：教师id
name：公共课课名
type：公共课类型
max_person：最大上课人数
price：课程单价
date_range：具体上课时间
addr：上课地点
intro：课程介绍
what_day：周几
```
### order_private私教课购买记录
```
字段：
course_priv_id：私教课id
user_id：会员id：
pay_money：付款节次
total_class：剩余节数
```
### order_public公共课预约记录表
```
字段：
course_pub_id：课程id
user_id：会员id
pay_money：付款总额
status：课程状态（待上课还是已上课）
people_number：总参与人数（例如带了一个人就是2）
```
### pay_info 充值记录表
```
字段：
id：唯一标识符
user_id：用户id
date：日期
pay_money：充值金额
```
### teacher 教师表
```
字段：
id：唯一标识符
name：姓名
teacher_url：教师图片
intro：个人介绍
phone：电话号码
```
### user  会员信息表
```
字段：
id：唯一标识符
open_id:用户账号（类似QQ号）
vip：vip等级
discount：折扣等级
wx_name：微信名称
wx_url：微信图片
phone：电话号码
email：电子邮箱
```
### user_account 会员账户表
```
字段：
id：唯一标示符
balance：剩余节次
```
