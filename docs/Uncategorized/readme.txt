Commands
Queries

User Interface

Commands
Command Bus
Command
Command Handler

Domain Model
Aggregates
Repository
Events
Event Store
Event Bus
Event Handler

Query
DTO/Resource
Querty Facade
Thin Data Layer/Thin Read Layer
Data

Application Services
------------------------------------------------------------------------------------------------------------------------

DDD (Domain-Driven Design)
CQRS (Command Query Responsibility Segregation)
SEDA(Staged Event-Driven Architecture)
Unit Of Work 模式
Repository 模式

RESTful
HATEOAS

ESB (Enterprise Service Bus，即企业服务总线)
JBI (Java Business Integration)是SUN公司解决SOA的方案
EAI (Enterprise Application Integration 企业应用集成)
EIP (Enterprise Integeration Patterns 企业集成模式)

SCA (Service Component Architecture)

SOA 面向服务的体系结构(service-oriented architecture，SOA)

Cloud
Grid Computing 网格计算
Distributed Computation 分布式计算

SaaS
IaaS
PaaS
互联网+

MapReduce

Thrift
Mule
Activiti
JBMP (Java Business Process Management 业务流程管理)

Windows
Unix
Linux
Raspberry Pi

NoSQL
Cassandra
Hadoop
Docker
Mesos
OpenStack
OpenWrt
OpenGL
OpenAL
Unity3D
OpenCV
OpenVPN
OpenSSL
OpenID
OAuth
YARN
ZooKeeper
HBase
MongoDB
OrientDB
Memcached
Redis

Apache ActiveMQ
ActiveMQ Apollo
RabbitMQ
ZeroMQ
IBM WebSphere MQ

JMS (Java Messaging Service)
RPC (Remote Procedure Call Protocol)
WebService
RMI (Java Remote Method Protocol)
Hessian
Burlap
Httpinvoker

HTTP (HTTP-Hypertext transfer protocol)
HTTPS (Hyper Text Transfer Protocol over Secure Socket Layer)
FTP (File Transfer Protocol)
SFTP (Secure File Transfer Protocol)
TCP (Transmission Control Protocol 传输控制协议)
IP (Internet Protocol)
UDP (User Datagram Protocol 用户数据报协议)
OSI (Open System Interconnection 开放式系统互联)
SNMP (Simple Network Management Protocol 简单网络管理协议)
ARP (Address Resolution Protocol 地址解析协议)
NAT (Network Address Translation 网络地址转换)
SLIP (Serial Line Internet Protocal 串行线路国际协议)
PPP(Port to Port Protocal 点到点协议)
X.25 X.25交换网
RARP(Rerserve Address Resolution Protocal 反向地址转换协议)
Frame Relay 帧中继
PPTP (Point to Point Tunneling Protocol 即点对点隧道协议)
PPPoE 以太网上的点对点协议
POP3，全名为"Post Office Protocol - Version 3"，即"邮局协议版本3"
IMAP(Internet Mail Access Protocol 互联网邮件访问协议)以前称作交互邮件访问协议(Interactive Mail Access Protocol)
SMTP（Simple Mail Transfer Protocol）即简单邮件传输协议
CardDAV CalDAV 通讯录同步的开放协议
Exchange ActiveSync 是一种 Microsoft Exchange 同步协议，可以同步移动设备的邮件、通讯录、日历、任务等。
安全传输层协议(TLS  Transport Layer Security )
SSL(Secure Sockets Layer 安全套接层)协议,及其继任者TLS（Transport Layer Security传输层安全）协议，

JAX-WS
JAX-RS

Google SPDY

Netty
Grizzly
NIO
BIO

Coroutine 协程

NodeJS
Golang
Dart

CMD
AMD

MVC

负载均衡
反向代理
LVS(Linux Virtual Server)

序列化/反序列化

分库分表规则ID算法
CAP原则

B+树
LSM树

BDD (Behavior-Driven Development 行为驱动开发)
TDD (Test-Driven Development 测试驱动开发)
DDD (Domain-Driven Design 领域驱动设计)
EDA (Event Driven Architecture 事件(消息)驱动架构)

MVP(SC),MVP(PV),PM,MVVM 和 MVC 表现模式架构
MVP 模式
MVC 模式
PM 模式
MVVM 模式

tcpburn 模拟千万级别并发用户
TCPCopy 请求复制(所有基于tcp的packets)工具，把在线流量导入到测试系统中去。

Gradle
Maven
Ant

Tapestry
Java Batch System
Spring Batch
Querydsl

YAWL(Yet Another Workflow Language)
Spring Batch

网格计算核心技术
------------------------------------------------------------------------------------------------------------------------

-Xlint:unchecked
-Dspring.profiles.active=development

@SuppressWarnings("unchecked")
@SuppressWarnings("serial")
@SuppressWarnings("deprecation")
@SuppressWarnings({"unchecked", "deprecation"})
@SuppressWarnings("static-access")

Eclipse中的一些特殊的注释技术包括：
1. // TODO  —— 表示尚未完成的待办事项。
2. // XXX   —— 表示被注释的代码虽然实现了功能，但是实现方案有待商榷，希望将来能改进。
3. // FIXME —— 表示被注释的代码需要被修正。
4.自定义标签
window-->preferences-->java-->compiler-->Task tags

// TODO Auto-generated method stub

Smoke Testing(冒烟测试)
UnStable (不稳定测试)

------------------------------------------------------------------------------------------------------------------------


生产库 production，历史库 history，临时库 temporary
1、把生产库中的数据导入到临时库中，作为资料反演用。
2、定期把生产库中的过时数据移到历史库中，并且把历史库中的过期数据删除。

参考数据库 Reference Database
指南数据库 Referral Database

分片 sharding
shard0,shard1,shard2

logic

集群
replication 复制,重复,主从复制
Worklight

话说天下大势，分久必合，合久必分

实时数据交换 移动设备（手机）、Web、智能设备、即时通讯、桌面应用、监控系统、天气预报、物联网、提醒、备忘录
Communication

message
hashkey/accesskey
type
from
to
title
content
timestamp

reminders
notes
repositories
relationships
presentation
hypermedia
infinite
limitless
boundless
kernel
lattice
pixel

strategies
legend
concepts



AccessKey





http://www.enterpriseintegrationpatterns.com/downloads.html
http://www.workflowpatterns.com/
http://martinfowler.com/eaaDev/EventSourcing.html

http://www.hsqldb.org/
http://www.ruanyifeng.com/blog/2011/09/restful

http://kb.cnblogs.com/page/117717/

AggregateRoot

Entities and Identity, Value Objects
Aggregate Root
Bounded context

private static final Logger logger = LoggerFactory.getLogger(SimpleCommandBus.class);

OrderNumber

DomainEvent
创建定单
OrderCreatedEvent
删除定单
OrderDeletedEvent
修改定单
OrderModifiedEvent
取消定单
OrderCanceledEvent
确认定单
OrderConfirmedEvent
派遣定单
OrderDispatchedEvent
接收定单
OrderReceiptedEvent
定单过期
OrderExpiredEvent


public class OrderDispatchedEventHandler implements DomainEventHandler<OrderDispatchedEvent> {

    private SalesOrderRepository salesOrderRepository;
 
    public orderDispatchedEventHandler(SalesOrderRepository salesOrderRepository) {
        this.salesOrderRepository = salesOrderRepository;
    }
 
    public void handle(OrderDispatchedEvent evnt) {
        // this.salesOrderRepository.Find(xxxx);
    }
}

Dispatch

Ubiquitous Language

Archetype

Event Sourcing

Version

Disruptor

Saga
Storage Store

User 用户
ReceivingAddress 收货地址
Account 账户 balance 余额 password 支付密码
Warehouse 仓库
Returns 退换商品
Refunds 退款
Order 定单
Order Item
Shopping Cart 购物车
Cart Item
Coupon 优惠券
Friend Link 友情链接
Commodity 在工厂里 PRODUCT
Goods 在运输过程中 GOODS
Product 在商店里 COMMODITY
Merchandise
Freight
Ware
Gift 礼品、赠品
Gift Item
Tax Special Invoice 增值税发票
Delivery 发货
Payment 支付
Brand
Category/Types
tag

TAG LABEL
landmark
historical
research
featured

Courier
Logistics
Express
Freight transport
Parcel Service
Supply chain
Middleman
Agent Agency
Distributor

goods,commodity,product,merchandise,wares这些名词都可表示“商品，货物”之意。
但是products是产品，goods是物品，commodity是日用品，merchandise是货物
详细点就是:goods一般生活或商业用词，指销售或购入的商品。Goods 货物!
commodity作“商品”解时系经济学名词，也可指日用品。
product一般指工业产品，也可泛指各种各样的产品。
merchandise正式用词，指商业上销售或商家拥有货物的总称。
wares 指上市待卖的商品或货物。多用复数形式。
merchandise 商品，泛指商品，不特指某一商品

^l 换行
^p 回车

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

view
find
search
look
query
see
watch
read
get
count
list

add
create
insert
new
write
record
put
set

delete
remove
clean
discard
abandon
destroy

update
modify
alter
change
revise
amend
rewrite
save
merge

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

基于各种不同平台、用不同方案建立的异构应用集成,通过建立底层结构，来联系横贯整个内外部异构系统、应用、数据源等，通过MQ，FTP、数据库、数据仓库、文件交换以实现内部系统、外部系统之间无缝地共享和交换数据。将所有核心应用和新的 Internet 解决方案结合在一起。
系统错误，请稍后再试！
啊哦，您没有任何扩展程序 :-(

HTTP/2 标准和 Javascript ES6 标准
http://es6.ruanyifeng.com/
https://ye11ow.gitbooks.io/http2-explained/content/index.html

http://treelib.com/book-detail-id-49.html
http://treelib.com/book-detail-id-96.html
http://babeljs.io/

SPDY Indicator for chrome
http://www.devthought.com/2012/03/10/chrome-spdy-indicator/
http://www.ishadowsocks.com/

http://www.editthiscookie.com/start/

unspecified

------------------------------------------------------------------------------------------------------------------------
生活，精挑细选
快乐，等你发现
我的，就是我的

roomba 美国iRobot Roomba网络超值版家用全自动智能扫地机器人吸尘器
全新Kindle Paperwhite电子书阅读器

http://developer.51cto.com/art/201104/252871.htm
http://yanwt.iteye.com/blog/550877

http://www.lovelucy.info/angularjs-best-practices.html

以前文章没有出轨的时候， 我觉得全世界好男人就我们两个人，TMD现在文章一出轨， 就剩下我自己了'，心里孤独又害怕！

为大漠贡献我的肥皂！

小学语文题关联词填空：他____牺牲生命，____出卖组织。
60后填“宁可 也不”，
70后填“害怕 所以”，
80后填“与其 不如”，
90后填“即使 也要”，
00后填“白白 忘了”  。
这就叫代沟。

怎样跟一个不认识但一眼就喜欢上的女生搭讪呢?
神回复：走过去直接躺地上：同学，你男朋友掉了……

班里有个女生把网名改成“像风一样的女子”，我看了后二话没说就把自己网名改成“被风吹过的男子”

我喜欢把人分为两类，一种是看见任何社会现象都会嘲弄一把（或者叫黑一把），另一种是看见任何事情都能想想自己从中学到什么的。前者是话语的世界，后者是沉默的世界。
------------------------------------------------------------------------------------------------------------------------
您访问的网页出错了！
网络连接异常、网站服务器失去响应
您提交的链接可能因为网络或者其他原因，暂时无法访问。
------------------------------------------------------------------------------------------------------------------------
测试驱动开发 (Test-Driven Development, TDD)
事件驱动设计 (EDD)
领域驱动设计 (DDD:Domain-Driven Design)
面向数据结构的设计方法 (JSD)

DDD：指架构图中的domain model，采用DDD的思想去分析设计实现，enode框架会提供实现DDD所必要的基类聚合根以及触发领域事件的支持；
CQRS：指整个enode架构实现的是CQRS架构中的command端，CQRS架构的查询端，enode框架没做任何限制，我们可以随意设计；
EDA：指整个编程模型的思路，都要基于事件驱动的思想，也就是领域模型的状态更改是基于响应事件的，聚合根之间的交互，也不是基于事务，而是基于事件驱动和响应；
Event Sourcing：中文意思是事件溯源，关于什么是事件溯源，可以看一下 这篇 文章。通过事件溯源，我们可以不用ORM来持久化聚合根，而是只要持久化领域事件即可，当我们要还原聚合根时只要对该聚合根进行一次事件溯源即可；
In Memory：是指整个domain model的所有数据都存储在内存缓存中，比如分布式缓存redis中，且缓存永远不会被释放。这样当我们要获取聚合根时，只要从内存缓存拿即可，所以叫in memory；
NoSQL：是指enode用到了redis，mongodb这样的nosql产品；
负载均衡支持：是指，基于enode框架的应用程序，可以方便的支持负载均衡；因为应用程序本身是无状态的，in memory是存储在全局的redis分布式缓存中，独立于应用本身；而event store则是用MongoDB，同样也是全局的，且也支持集群。所以，我们可以将基于enode框架开发的应用程序部署任意多份在不同的机器，然后做负载均衡，从而让我们的应用程序支撑更高的并发访问。
------------------------------------------------------------------------------------------------------------------------
offset
head
data

联华日彩

surefire
archiver
reports
target
settings
generated
sources

SNAPSHOT

sprites

Chromium/Chrome 48.0.2560.0
Elements
Console
Sources
Network
Timeline
Profiles
Resources
Security
Audits

Service Workers
Cache Storage
Refresh Caches
Application Cache
Cookies
Session Storage
Local Storage
IndexedDB
Web SQL
Frames

Images
Other
Scripts
Stylesheets

Overview
Security Overview
Main Origin
Non-Secure Origins
This page is not secure.

Network Utilization
Web Page Performance

Dock to right
Dock to bottom
Undock into separate window
Show console
Search all files
More tools
Inspect devices
Network conditions

Accessibility
Manage certificates...
Learn more
Ask where to save each file before downloading
An error occurred while checking for updates: Update check failed to start (error code 3: 0x80040154)

Dictionaries
VisualElementsManifest
Extensions
Installer
Locales

A web browser built for speed, simplicity, and security
Report an issue
Get help with using Chrome

This webpage is not available
ERR_TUNNEL_CONNECTION_FAILED

Copyright 2015 Google Inc. All rights reserved.

The following error occurred while trying to access http://support.google.com/
504 Connect to support.google.com:80 failed: SOCKS protocol error

History
Extensions
Developer mode
Boo... You have no extensions :-( Want to browse the Chrome Web Store instead?
Settings
About

Find...
Zoom
Recently closed
Task Manager
Reload frame
View page source
View frame source
Save as...
Back
Sign in to Chrome
Sign in to get your bookmarks, history, passwords and other settings on all your devices. You'll also automatically be signed in to your Google services.

On startup
Open the New Tab page
Continue where you left off
Open a specific page or set of pages. Set pages

Appearance
Get themes
Reset to default theme
Show Home button
New Tab page Change
Always show the bookmarks bar

Search
Set which search engine is used when searching from the omnibox
Manage search engines...

People
Enable Guest browsing
Let anyone add a person to Chrome
Add person...
Edit...
Remove...
Import bookmarks and settings...

Default browser
Make Google Chrome the default browser
Google Chrome is not currently your default browser.

Show advanced settings...

Privacy
Content settings...
Clear browsing data...
Google Chrome may use web services to improve your browsing experience.
Use a web service to help resolve navigation errors
Use a prediction service to help complete searches and URLs typed in the address bar or the app launcher search box
Prefetch resources to load pages more quickly
Automatically report details of possible security incidents to Google
Protect you and your device from dangerous sites
Use a web service to help resolve spelling errors
Automatically send usage statistics and crash reports to Google
Send a "Do Not Track" request with your browsing traffic

Passwords and forms
Enable Autofill to fill out web forms in a single click.
Manage Autofill settings

Offer to save your web passwords.
Manage passwords

Web content
Font size:
Page zoom:
Customize fonts...
Very Small
Small
Medium
Large
Very Large

Network
Google Chrome is using your computer's system proxy settings to connect to the network.
Change proxy settings...

Languages
Change how Chrome handles and displays languages.
Language and input settings...
Offer to translate pages that aren't in a language you read.
Manage languages

Downloads
Download location: Change...
Ask where to save each file before downloading

HTTPS/SSL
Manage certificates...

Google Cloud Print
Manage
Show notifications when new printers are detected on the network

Accessibility
Add additional accessibility features

System
Continue running background apps when Google Chrome is closed
Use hardware acceleration when available

Reset settings
Restore settings to their original defaults.
Reset settings

Hide advanced settings...


Configure throttling
Zoom to fit
Screen


current

Style
Computed
Event Listeners
DOM Breakpoints
No Breakpoints
Properties

Rest all overrides
Toggle device mode
Select an element in the page to inspect it

Disk cache Disable cache

Offline
Online
No throttling

Sensors
Emulate geolocation coordinates
Emulate accelerometer
Rendering
Enable paint flashing
Show layer borders
Show FPS meter
Show scrolling perf issues
Emulate print media

Network conditions
User agnet spoofing
Auto user agent
Custom user agent

Preserve log

Hide console
Shortcuts
Settings
Help

Watch
Call Stack
Scope

Not Watch Expressions
Not Paused

Animation
Clipboard
Control
Device
DOM Mutation
Drag / drop
Keyboard
Load
Mouse
Parse
Pointer
Script
Timer
Touch
WebGL
Window
XHR

Add expression
Pause on exceptions
Deactivate breakpoints
Pause script execution
Step over next function call
Step into next function call
Step out of current function

Hide debugger
Hit Ctrl+P to open a file
Content scripts
Snippets

Hide navigator
Filter
Hide overview
Capture screenshots
Clear
Stop recording network log
Network conditions

Capture
Flame chart view
Collect garbage
Clear recording
Record
Frame rate
JS Profile
Memory
Paint
Screenshots

Select profiling type

Continue
Discard

Sample Pictures
Customer Support Software UserDeck
SpeakerDeck

Relaxation continue
Relaxation modulus

stress relaxation modulus master curve
应力松弛模量主曲线
------------------------------------------------------------------------------------------------------------------------
Java CAPS
Enterprise Integration Patterns: Designing, Building, and Deploying Messaging Solutions

HTTP 2.0
GOOGLE SPDY

Netty
Jetty
Tomcat

YouTrack

verdana
小型大写字母字体
font-variant: small-caps;

Follow us

matrix
Terminal
Version Control
Application Servers
Event log
Local Changes
Incoming
Outgoing
Steward
Community

------------------------------------------------------------------------------------------------------------------------
背景图大小 1710 x 926 pixels

来宾 Guest
匿名 Anonymous

Ratpack 1.0 Launches Aiming to make Asynchronous Programming Easier on the JVM
http://ratpack.io/
Event Loop Group
Cluster
processing stream
continuation
sub-processing stream
Reactive Streams
ExtensionLoader

Sign In
Documentation
Help & Support
Getting Started
DEVELOPMENT

Need help?
Questions?

Resources
Toolkit

On your website
Start accepting payments on your website with our JavaScript libraries. Learn more
In your mobile app
We have toolkits for native iPhone and Android applications. Learn more
------------------------------------------------------------------------------------------------------------------------
benchmark

Project List

Type
1 Bug
2 Feature
3 Usability
4 Document

Priority
5 Very High
4 High
3 Normal
2 Low
1 Very Low

Status
33 Circle
39 Closed
40 Internal Review
34 Low
32 Middle
38 Open
37 block
41 中文顯示測試

Status
0
1 Open
2 In process
3 Suspended
4 Closed

Reproducibility
0 I Didn't Try
1 Rarely
2 Sometimes
3 Always

Description
Area/Minor Area
Reported By Customer
File Upload
Created Date
Logs
Created By
Summary



问题处理

折叠Bug报告分类
待确认的(Unconfirmed)
新提交的(New)
已分配的(Assigned)
问题未解决的(Reopened)
待返测的(Resolved)
待归档的(Verified)
已归档的(Closed)
折叠Bug处理意见
已修改的(Fixed)
不是问题(Invalid)
无法修改(Wontfix)
以后版本解决(Later)
保留(Remind)
重复(Duplicate)
无法重现(Worksforme)
折叠指定处理人
可以指定一个处理人
如不指定处理人，则系统指定管理员为默认处理人

折叠链接
输入超链接地址，引导处理人找到与报告相关联的信息

折叠概述
概述部分"Summary"的描述，应保证处理人在阅读时能够清楚提交者在进行什么操作的时候发现了什么问题。
如果是通用组件部分的测试，则必须将这一通用组件对应的功能名称写入概述中，以便今后查询。
------------------------------------------------------------------------------------------------------------------------
The service is unavailable.

Media Type: application/x-java-serialized-object

http://www.icepdf.org/
http://www.lighttpd.net/

汇率查询
http://www.boc.cn/sourcedb/whpj/

------------------------------------------------------------------------------------------------------------------------
IBM WebSphere MQ
RabbitMQ、ActiveMQ和ZeroMQ
ActiveMQ下一代产品为Apollo
------------------------------------------------------------------------------------------------------------------------
YAML http://www.yaml.org/

------------------------------------------------------------------------------------------------------------------------
http://www.tuicool.com/articles/3eeIVfi

https://letsencrypt.org

keytool -genkey -alias tomcat -keyalg RSA -keystore c:/mykey
keytool -genkeypair -alias "test1" -keyalg "RSA" -keystore "test.keystore"
查看证书
keytool -list -keystore test.keystore
导出到证书文件
keytool -export -alias test1 -file test.crt -keystore test.keystore
导入证书的信息,将证书文件test.crt导入到名为test_cacerts的证书库中
keytool -import -keystore test_cacerts -file test.crt
查看证书信息
keytool -printcert -file "test.crt"
删除密钥库test.keystore中别名为test2的证书条目
keytool -delete -keystore test.keystore -alias test2
修改证书条目的口令
keytool -keypasswd -alias test1 -keystore test.keystore
将密钥库test.keystore中别名为test1的证书条目的密码修改为testtesttest1
keytool -keypasswd -alias test1 -keypass testtesttest1 -new testtest1 -storepass testtest -keystore test.keystore


常用的Java Keytool Keystore命令
Java keytool是密钥和证书管理工具。它使用户能够管理自己的公钥/私钥对及相关证书，用于（通过数字签名）自我认证（用户向别的用户/服务认证自己）或数据完整性以及认证服务。它还允许用户储存他们的通信对等者的公钥（以证书形式）。

一. Keytool创建和导入命令

创建keystore和密钥对
Generate a Java keystore and key pair
keytool -genkey -alias mydomain -keyalg RSA -keystore keystore.jks -keysize 2048

为存在的keystore生成证书请求文件CSR
Generate a certificate signing request (CSR) for an existing Java keystore
keytool -certreq -alias mydomain -keystore keystore.jks -file mydomain.csr

导入根证书或中级证书到keystore
Import a root or intermediate CA certificate to an existing Java keystore
keytool -import -trustcacerts -alias root -file mydomain.crt -keystore keystore.jks

导入SSL服务器证书到keystore
Import a signed primary certificate to an existing Java keystore
keytool -import -trustcacerts -alias mydomain -file mydomain.crt -keystore keystore.jks

为存在的keystore生成自签名证书
Generate a keystore and self-signed certificate
keytool -genkey -keyalg RSA -alias selfsigned -keystore keystore.jks -storepass password -validity 360 -keysize 2048

二. Keytool查看命令

查看单个证书
Check a stand-alone certificate
keytool -printcert -v -file mydomain.crt

列出keystore存在的所有证书
Check which certificates are in a Java keystore
keytool -list -v -keystore keystore.jks

使用别名查看keystore特定条目
Check a particular keystore entry using an alias
keytool -list -v -keystore keystore.jks -alias mydomain

三. 其他Keytool命令
删除keystore里面指定证书
Delete a certificate from a Java Keytool keystore
keytool -delete -alias mydomain -keystore keystore.jks

更改keysore密码
Change a Java keystore password
keytool -storepasswd -new new_storepass -keystore keystore.jks

导出keystore里面的指定证书
Export a certificate from a keystore
keytool -export -alias mydomain -file mydomain.crt -keystore keystore.jks

列出信任的CA证书
List Trusted CA Certs
keytool -list -v -keystore $JAVA_HOME/jre/lib/security/cacerts

导入新的CA到信任证书
Import New CA into Trusted Certs
keytool -import -trustcacerts -file /path/to/ca/ca.pem -alias CA_ALIAS -keystore $JAVA_HOME/jre/lib/security/cacerts

Keytool介绍
Keytool 是一个Java数据证书的管理工具 ,Keytool将密钥（key）和证书（certificates）存在一个称为keystore的文件中在keystore里，包含两种数据:密钥实体（Key entity）-密钥（secret key）或者是私钥和配对公钥（采用非对称加密）可信任的证书实体（trusted certificate entries）-只包含公钥.

JDK中keytool常用参数说明（不同版本有差异，详细可参见【附录】中的官方文档链接）:

-genkey 在用户主目录
-genkey 在用户主目录中创建一个默认文件”.keystore”,还会产生一个mykey的别名，mykey中包含用户的公钥、私钥和证书(在没有指定生成位置的情况下,keystore会存在用户系统默认目录)
-alias 产生别名 每个keystore都关联这一个独一无二的alias，这个alias通常不区分大小写
-keystore 指定密钥库的名称(产生的各类信息将不在.keystore文件中)
-keyalg 指定密钥的算法 (如 RSA DSA，默认值为：DSA)
-validity 指定创建的证书有效期多少天(默认 90)
-keysize 指定密钥长度 （默认 1024）
-storepass 指定密钥库的密码(获取keystore信息所需的密码)
-keypass 指定别名条目的密码(私钥的密码)
-dname 指定证书发行者信息 其中： “CN=名字与姓氏,OU=组织单位名称,O=组织名称,L=城市或区域名 称,ST=州或省份名称,C=单位的两字母国家代码”
-list 显示密钥库中的证书信息 keytool -list -v -keystore 指定keystore -storepass 密码
-v 显示密钥库中的证书详细信息
-export 将别名指定的证书导出到文件 keytool -export -alias 需要导出的别名 -keystore 指定keystore -file 指定导出的证书位置及证书名称 -storepass 密码
-file 参数指定导出到文件的文件名
-delete 删除密钥库中某条目 keytool -delete -alias 指定需删除的别 -keystore 指定keystore – storepass 密码
-printcert 查看导出的证书信息 keytool -printcert -file g:\sso\michael.crt
-keypasswd 修改密钥库中指定条目口令 keytool -keypasswd -alias 需修改的别名 -keypass 旧密码 -new 新密码 -storepass keystore密码 -keystore sage
-storepasswd 修改keystore口令 keytool -storepasswd -keystore g:\sso\michael.keystore(需修改口令的keystore) -storepass pwdold(原始密码) -new pwdnew(新密码)
-import 将已签名数字证书导入密钥库 keytool -import -alias 指定导入条目的别名 -keystore 指定keystore -file 需导入的证书
中创建一个默认文件”.keystore”,还会产生一个mykey的别名，mykey中包含用户的公钥、私钥和证书(在没有指定生成位置的情况下,keystore会存在用户系统默认目录)
-alias 产生别名 每个keystore都关联这一个独一无二的alias，这个alias通常不区分大小写
-keystore 指定密钥库的名称(产生的各类信息将不在.keystore文件中)
-keyalg 指定密钥的算法 (如 RSA DSA，默认值为：DSA)
-validity 指定创建的证书有效期多少天(默认 90)
-keysize 指定密钥长度 （默认 1024）
-storepass 指定密钥库的密码(获取keystore信息所需的密码)
-keypass 指定别名条目的密码(私钥的密码)
-dname 指定证书发行者信息 其中： “CN=名字与姓氏,OU=组织单位名称,O=组织名称,L=城市或区域名 称,ST=州或省份名称,C=单位的两字母国家代码”
-list 显示密钥库中的证书信息 keytool -list -v -keystore 指定keystore -storepass 密码
-v 显示密钥库中的证书详细信息
-export 将别名指定的证书导出到文件 keytool -export -alias 需要导出的别名 -keystore 指定keystore -file 指定导出的证书位置及证书名称 -storepass 密码
-file 参数指定导出到文件的文件名
-delete 删除密钥库中某条目 keytool -delete -alias 指定需删除的别 -keystore 指定keystore – storepass 密码
-printcert 查看导出的证书信息 keytool -printcert -file g:\sso\michael.crt
-keypasswd 修改密钥库中指定条目口令 keytool -keypasswd -alias 需修改的别名 -keypass 旧密码 -new 新密码 -storepass keystore密码 -keystore sage
-storepasswd 修改keystore口令 keytool -storepasswd -keystore g:\sso\michael.keystore(需修改口令的keystore) -storepass pwdold(原始密码) -new pwdnew(新密码)
-import 将已签名数字证书导入密钥库 keytool -import -alias 指定导入条目的别名 -keystore 指定keystore -file 需导入的证书
keytool英文介绍
Java Keytool is a key and certificate management utility. It allows users to manage their own public/private key pairs and certificates. It also allows users to cache certificates. Java Keytool stores the keys and certificates in what is called a keystore. By default the Java keystore is implemented as a file. It protects private keys with a password. A Keytool keystore contains the private key and any certificates necessary to complete a chain of trust and establish the trustworthiness of the primary certificate.

Each certificate in a Java keystore is associated with a unique alias. When creating a Java keystore you will first create the .jks file that will initially only contain the private key. You will then generate a CSR and have a certificate generated from it. Then you will import the certificate to the keystore including any root certificates. Java Keytool also several other functions that allow you to view the details of a certificate or list the certificates contained in a keystore or export a certificate.


------------------------------------------------------------------------------------------------------------------------
Shenzhen City, CloudKit Technology Co., Ltd.
F/2, 9 Building, Zhiheng Industrial Park, Nantou Guankou Two Road, Nanshan District, Shenzhen, Guangdong
深圳市前海深港合作区前湾一路1号A栋201室（入驻深圳市前海商务秘书有限公司）

深圳市前海商务秘书限公司
Shēnzhèn Qiánhǎi Commerce Secretariat Co., Ltd.

Room 201, Block A, No.1, Qiánwān Road 1,
Qiánhǎishēn Port Cooperative District,
Shēnzhèn, China.

------------------------------------------------------------------------------------------------------------------------
http://php.net/


Loading canvas...
preloader
preloader-progress
preloader-message
track
preloader-bar

passport
credentials
account
unitivesignup
unitivelogin

account
user
consumer
people
person
identity

OAuthGetRequestToken
OAuthAuthorizeToken
OAuthGetAccessToken

retrievepassword
service=www&continue=https://

Initializing
Checking
Searching

unattached
Add-ons
NO Add-ons
Purchase Now
Pre-Purchase Now
Customer Privacy Policy

Asia Pacific
The United States, Canada, & Puerto Rico
Latin America & the Caribbean
Europe
Africa, Middle East & India

DELETE FROM CERT_RULES WHERE ID NOT IN (SELECT * FROM (SELECT MIN(ID) FROM CERT_RULES GROUP BY TRADE_TYPE_CODE) A);

Authentication
Authorization

hyperlinks
hypermedia
profiles
assets


RWD Responsive Web Design

------------------------------------------------------------------------------------------------------------------------
This XML file does not appear to have any style information associated with it. The document tree is shown below.
<?xml version="1.0" encoding="UTF-8"?>
<Error>
    <Code>NoSuchKey</Code>
    <Message>The specified key does not exist.</Message>
    <Key>distributions/gradle-2.10-bin.zip</Key>
    <RequestId>700FAB655702608E</RequestId>
    <HostId>pCKVP3keqeFOMBdxLmtgv6JaS+lv99FPfzDv7/57Ufu+pQfUEHM22+D5HI5dOzPkDAvCqtKuanE=</HostId>
</Error>


BSS:Business support system 业务支撑系统
OSS:Operation support system 运营支撑系统
MSS:Management Support System 管理支撑系统
(前二者又合称 BOSS:Business and Operation support system ,电信业务运营支持系统)


编程技术及生态发展的三个阶段
最初的时候人们忙着补全各种API，代表着他们拥有的东西还很匮乏，需要在语言跟基础设施上继续完善
然后就开始各种模式，标志他们做的东西逐渐变大变复杂，需要更好的组织了
然后就是各类分层MVC，MVP，MVVM之类，可视化开发，自动化测试，团队协同系统等等，说明重视生产效率了，也就是所谓工程化

React
WebAssembly

Java混淆器 yGuard
ZFS文件系统

Access、H2、HSQLDB、Firebird、Sybase、Derby、SQLite、MySQL、DB4O


// Layout: fixed | fluid
// The Economist 经济学人 http://ecocn.org/portal.php


Webpack browserify
JavaScript 直接上 ES6 或者 TypeScript；模块化就上 browserify 或者 webpack，如果非要用 requirejs/seajs，那就用 requirejs，当然我的建议是不用。

https://nodejs.org/en/
https://www.npmjs.com/
http://www.ruanyifeng.com/blog/2015/03/react.html
https://github.com/reflux/refluxjs

http://www.jcodecraeer.com/a/javascript/2015/0311/2581.html
https://cnodejs.org/getstart
https://github.com/nqdeng/7-days-nodejs
https://github.com/misnet/react-cart-example/


gulp是工具链，可以配合各种插件做js压缩，css压缩，less编译等工作
webpack是文件打包工具，可以把项目的各种js文、css文件等打包合并成一个或多个文件 browserify
bower是包管理器，用来管理你项目里的那些外部依赖的。

http://coolshell.cn/
https://www.meteor.com/

http://cn.redux.js.org/
http://facebook.github.io/flux/
http://facebook.github.io/immutable-js/
http://facebook.github.io/jest/

Netflix/Hystrix

RxJS的异步、LINQ和未来

疯狂动物城
ntpdate -u time.nist.gov


http://kilim.ow2.org/ 一种用于实现 Java 并发性的角色框架

协程（Coroutine）
协程和异步
例程的作用类似于函数，但含义更为丰富一些。例程是某个系统对外提供的功能接口或服务的集合。比如操作系统的API、服务等就是例程;

子例程
过程有两种，一种叫子例程 (Subroutine)，我们通常叫做 Sub;另外一种叫函数，通常叫 Function两者区别在于，Sub 只执行操作，没有返回值;Function 不但执行操作，并且有返回值

http://coolshell.cn/articles/933.html

互联网之子

http://es6.ruanyifeng.com/
https://github.com/kuitos/kuitos.github.io/issues/32
http://coolshell.cn/
http://www.ruanyifeng.com/blog/2010/03/dmca.html
http://www.jackcallister.com/2015/01/05/the-react-quick-start-guide.html
http://facebook.github.io/react/docs/getting-started.html
http://reactjs.cn/react/docs/tutorial.html

http://blog.csdn.net/kobejayandy/article/details/11856735
http://www.iteye.com/topic/960532
http://www.iteye.com/topic/959751
http://webpack.github.io/docs/tutorials/getting-started/#development-server

http://www.oreilly.com/
https://www.behance.net/


Content Security Policy Level 2

日彩
社交购物、青春秀购物、青春代名词

五彩汽球、气泡、阳光、光环、线条、颜料、印像、春天、绿草

青春写真
MTV
微电影

晒晒太阳,溜溜狗,散散步、听听音乐、看看书、读读报、喝喝咖啡、唱唱歌、打打招呼、写写作业、打打球、透透气、说说话、聊聊天、摆摆手、帮帮忙、点点头

加菲猫
泰迪熊
兔斯基
倒霉熊
机器猫

http://www.zealer.com/
http://www.dajie.com/
http://www.duitang.com/
http://www.guoku.com/selected/
http://dongxi.douban.com/
http://www.lifevc.com/
https://fancy.com
------------------------------------------------------------------------------------------------------------------------
/login?redirect_after_login=
POST /sessions

/signup
/account/begin_password_reset
/account/create

https://support.example.com/articles
/about
/privacy

------------------------------------------------------------------------------------------------------------------------

http://fis.baidu.com/
https://github.com/google/systemjs
Meteor
http://vuejs.org/
http://seajs.org/

------------------------------------------------------------------------------------------------------------------------
相约星期二
《时光尽头的恋人》（The Age of Adaline）
《最好的告别：关于衰老与死亡，你必须知道的常识》 Being Mortal:Medicine and What Matters in the End
库切的《青春》

------------------------------------------------------------------------------------------------------------------------
http://zh.forvo.com/
http://www.unicode.org/
The Pragmatic Programmer
Extreme programming
Refactoring
Joel on Software
OOP之五大原则
http://www.ituring.com.cn/book/1533
http://rusty.ozlabs.org/?p=236
软件随想录
http://www.joelonsoftware.com/articles/ThePerilsofJavaSchools.html
functional programming
recursive programming
Structure and Interpretation of Computer Programs
Lisp
Skynet
http://www.paulgraham.com/avg.html
http://www.joelonsoftware.com/
http://fsharpforfunandprofit.com/fppatterns/
http://www.inc.com/magazine/20100301/lets-take-this-offline.html
http://nethack4.org/blog/building-c.html

http://tianchunbinghe.blog.163.com/
http://www.ruanyifeng.com/blog/2011/06/birth_of_javascript.html

uptime
http://www.ruanyifeng.com/blog/2011/07/linux_load_average_explained.html

------------------------------------------------------------------------------------------------------------------------
理解面向对象三大基本特性是理解面向对象五大基本原则的基础.

三大特性是：封装,继承,多态
所谓封装，也就是把客观事物封装成抽象的类，并且类可以把自己的数据和方法只让可信的类或者对象操作，对不可信的进行信息隐藏。封装是面向对象的特征之一，是对象和类概念的主要特性。 简单的说，一个类就是一个封装了数据以及操作这些数据的代码的逻辑实体。在一个对象内部，某些代码或某些数据可以是私有的，不能被外界访问。通过这种方式，对象对内部数据提供了不同级别的保护，以防止程序中无关的部分意外的改变或错误的使用了对象的私有部分。
所谓继承是指可以让某个类型的对象获得另一个类型的对象的属性的方法。它支持按级分类的概念。继承是指这样一种能力：它可以使用现有类的所有功能，并在无需重新编写原来的类的情况下对这些功能进行扩展。 通过继承创建的新类称为“子类”或“派生类”，被继承的类称为“基类”、“父类”或“超类”。继承的过程，就是从一般到特殊的过程。要实现继承，可以通过“继承”（Inheritance）和“组合”（Composition）来实现。继承概念的实现方式有二类：实现继承与接口继承。实现继承是指直接使用基类的属性和方法而无需额外编码的能力；接口继承是指仅使用属性和方法的名称、但是子类必须提供实现的能力；
所谓多态就是指一个类实例的相同方法在不同情形有不同表现形式。多态机制使具有不同内部结构的对象可以共享相同的外部接口。这意味着，虽然针对不同对象的具体操作不同，但通过一个公共的类，它们（那些操作）可以通过相同的方式予以调用。

面向对象五大基本原则 设计模式的五大原则
单一职责原则(Single Responsibility Principle SRP)
是指一个类的功能要单一，不能包罗万象。如同一个人一样，分配的工作不能太多，否则一天到晚虽然忙忙碌碌的，但效率却高不起来。

开放封闭原则(Open－Close Principle OCP)
一个模块在扩展性方面应该是开放的而在更改性方面应该是封闭的。比如：一个网络模块，原来只服务端功能，而现在要加入客户端功能，
那么应当在不用修改服务端功能代码的前提下，就能够增加客户端功能的实现代码，这要求在设计之初，就应当将服务端和客户端分开，公共部分抽象出来。

替换原则(the Liskov Substitution Principle LSP)
子类应当可以替换父类并出现在父类能够出现的任何地方。比如：公司搞年度晚会，所有员工可以参加抽奖，那么不管是老员工还是新员工，
也不管是总部员工还是外派员工，都应当可以参加抽奖，否则这公司就不和谐了。

依赖原则(the Dependency Inversion Principle DIP) 具体依赖抽象，上层依赖下层。假设B是较A低的模块，但B需要使用到A的功能，
这个时候，B不应当直接使用A中的具体类： 而应当由B定义一抽象接口，并由A来实现这个抽象接口，B只使用这个抽象接口：这样就达到
了依赖倒置的目的，B也解除了对A的依赖，反过来是A依赖于B定义的抽象接口。通过上层模块难以避免依赖下层模块，假如B也直接依赖A的实现，那么就可能造成循环依赖。一个常见的问题就是编译A模块时需要直接包含到B模块的cpp文件，而编译B时同样要直接包含到A的cpp文件。

接口分离原则(the Interface Segregation Principle ISP)
模块间要通过抽象接口隔离开，而不是通过具体的类强耦合起来

------------------------------------------------------------------------------------------------------------------------
GoF23种设计模式
1．创建型模式
前面讲过，社会化的分工越来越细，自然在软件设计方面也是如此，因此对象的创建和对象的使用分开也就成为了必然趋势。因为对象的创建会消耗掉系统的很多资源，所以单独对对象的创建进行研究，从而能够高效地创建对象就是创建型模式要探讨的问题。这里有6个具体的创建型模式可供研究，它们分别是：
简单工厂模式（Simple Factory）；
工厂方法模式（Factory Method）；
抽象工厂模式（Abstract Factory）；
创建者模式（Builder）；
原型模式（Prototype）；
单例模式（Singleton）。

说明：严格来说，简单工厂模式不是GoF总结出来的23种设计模式之一。

2．结构型模式
在解决了对象的创建问题之后，对象的组成以及对象之间的依赖关系就成了开发人员关注的焦点，因为如何设计对象的结构、继承和依赖关系会影响到后续程序的维护性、代码的健壮性、耦合性等。对象结构的设计很容易体现出设计人员水平的高低，这里有7个具体的结构型模式可供研究，它们分别是：
外观模式（Facade）；
适配器模式（Adapter）；
代理模式（Proxy）；
装饰模式（Decorator）；
桥模式（Bridge）；
组合模式（Composite）；
享元模式（Flyweight）。

3．行为型模式
在对象的结构和对象的创建问题都解决了之后，就剩下对象的行为问题了，如果对象的行为设计的好，那么对象的行为就会更清晰，它们之间的协作效率就会提高，这里有11个具体的行为型模式可供研究，它们分别是：
模板方法模式（Template Method）；
观察者模式（Observer）；
状态模式（State）；
策略模式（Strategy）；
职责链模式（Chain of Responsibility）；
命令模式（Command）；
访问者模式（Visitor）；
调停者模式（Mediator）；
备忘录模式（Memento）；
迭代器模式（Iterator）；
解释器模式（Interpreter）。

------------------------------------------------------------------------------------------------------------------------
/**
 * PughFail.java
 * 线程安全的单例模式
 * http://en.wikipedia.org/wiki/Initialization_on_demand_holder_idiom
 *
 * @author hongquanli <hongquanli@qq.com>
 * @version 1.0 2016/1/15 17:20
 */
public class PughFail {

    public static class Something {
        private Something() {
            super();
            System.out.println(this.getClass().getName() + " called");
            if (System.currentTimeMillis() > 0) {
                System.out.println("EMULATING INIT FAILURE");
                throw new RuntimeException("EMULATING INIT FAILURE");
            }
        }

        private static class LazyHolder {
            private static final Something INSTANCE = new Something();
        }

        public static Something getInstance() {
            return LazyHolder.INSTANCE;
        }
    }

    public static void main(String[] args) {
        System.out.println("First try");
        try {
            Something.getInstance();
        } catch (Throwable t) {
            System.out.println(t);
        }

        System.out.println("Second try");
        try {
            Something.getInstance();
        } catch (Throwable t) {
            System.out.println(t);
        }
    }
}

------------------------------------------------------------------------------------------------------------------------
SOA设计十大原则
日前国外网站报道介绍了面向服务架构(SOA)的基本原则，提出了公共接口与内部实现要有明确界限等原则。虽然这些原则并不是绝对的真理，但可作为一个应用开发参考。

一、明确的边界
通过跨越定义明确的边界进行显式消息传递，服务得以彼此交互。有时候，跨越服务边界可能要耗费很大的成本，这要视地理、信任或执行因素而定。边界是指服务的公共接口与其内部专用实现之间的界线。服务的边界通过 WSDL 发布，可能包括说明特定服务之期望的声明。

二、服务共享和合约架构
服务交互应当只以服务的策略、架构和基于合约的行为为基础。服务的合约通常使用 WSDL 定义，而服务聚合的合约则可以使用 BPEL 定义(进而，对聚合的每个服务使用 WSDL)。服务使用者将依靠服务的合约来调用服务及与服务交互。鉴于这种依赖性，服务合约必须长期保持稳定。在利用 XML 架构 (xsd:any) 和 SOAP 处理模型(可选标头)的可扩展性的同时，合约的设计应尽可能明确。

三、策略驱动
尽管它往往被认为是最不为人所了解的原则，但对于实现灵活的 Web 服务，它或许是最有力的。单纯依靠 WSDL 无法交流某些业务交互要求。可以使用策略表达式将结构兼容性(交流的内容)与语义兼容性(如何交流消息或者将消息交流给谁)分隔开来。

四、自治
服务是独立进行部署、版本控制和管理的实体。开发人员应避免对服务边界之间的空间进行假设，因为此空间比边界本身更容易改变。

五、采用可传输的协议格式，而不是API
通常,服务提供商基于某种传输协议(例如HTTP)提供服务,而服务消费者只能通过另一种不同的协议(比如MQ)通信。因此，也许需要在服务提供商与消费者之间建立一座异步起动同步运行的连接桥梁,超越HTTP和Java Messaging Service消息服务(JMS)等协议.从技术角度讲，Java Messaging Service消息服务(JMS)并不是一种传输协议,而是一组供应商中立(vendor-neutral)的通信APIs。

六、面向文档
消息被构造为“纯文本的”XML文档(换句话说，数据的格式只对XML有意义)。 消息通常用于传输业务文档，比如购买订单、发票和提单。这种交互类型与同步消息排队系统的兼容性很好，比如MQ Series、MSMQ、JMS、TIBCO、IMS等等。

七、松耦合
服务之间要求最小的依赖性，只要求它们之间能够相互知晓。

八、符合标准
当通过Web的服务实现时，最原始的(基本的)面向服务的架构(SOA)的模型仅仅提供了很低程度上的关于可靠性、安全性以及事务管理的标准化机制。第二代的技术条件和框架，如WS-ReliableMessaging规范、 WS-Security规范和WS-Coordination规范 (与WS-AtomicTransaction规范和WS-BusinessActivity规范相联系)，它们试图以工业标准的方式定位存在的缺陷。

九、独立软件供应商
向SOA的转变正在深刻改变了经济现实。客户们会期待更合理的费用以及不必重新进行投资就能改进业务的能力。因此，独立软件供应商没有选择，只能使自己的业务更加灵活，以期让自己的客户也变得同样灵活。于是，面向服务不仅是简单的在现有的、紧耦合的、复杂的、不灵活的以及非组件化的业务功能上添加基于标准的接口。更重要的是，为了兑现SOA的承诺，独立软件供应商必须改变他们构建、打包、销售、交付、管理和支持自身产品的方式。

十、元数据驱动
开发元数据本身并不是元数据驱动应用程序的本意。使用元数据来驱动服务在系统边界的传播是一个更为正确的方法。
