## Chavis 구조 소개

### **프로젝트 동작방식**

[![img](https://postfiles.pstatic.net/MjAxOTEwMThfMjU2/MDAxNTcxMzY1NDMzODIz.Kku3-43jmE-HI_5HBA3x_W1RLeX5I_7k8Vm_9ISimJUg.z0B3LW85OwXnDMOoJ9tmUQbR0w70oSv0Rq1IV0IUfIYg.PNG.ehdwnd02/image.png?type=w773)](https://blog.naver.com/PostView.nhn?blogId=ehdwnd02&logNo=221681605957&categoryNo=26&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1&from=postView&userTopListOpen=true&userTopListCount=5&userTopListManageOpen=false&userTopListCurrentPage=1#)

동작 방식은 위의 그림처럼 서버, 자동차(CAN장비,LattePanda), 사용자app, 정비소app으로 구성되어 서로 통신을 하며 동작한다.



### **프로젝트 구성도**

[![img](https://postfiles.pstatic.net/MjAxOTEwMThfMjI3/MDAxNTcxMzY1MzA3NzE3.FBdo9jmRFoLEV5On6_Pn8L5e6E6wSN63YPgYcEDxCjcg.2Ldytt8JNhM9qz54QXBELmpZTtTwtmVyIM5HMk7-23wg.PNG.ehdwnd02/image.png?type=w773)](https://blog.naver.com/PostView.nhn?blogId=ehdwnd02&logNo=221681605957&categoryNo=26&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1&from=postView&userTopListOpen=true&userTopListCount=5&userTopListManageOpen=false&userTopListCurrentPage=1#)

구성도를 보면 구성요소들이 어떤 방식으로 통신하는지 어떤 구성요소들이 있는지 알 수 있도록 표시했다.

서버는 TCP통신의 서버와 HTTP통신의 서버 둘로 나눴다.



### **프로젝트 DB구조**

[![img](https://postfiles.pstatic.net/MjAxOTEwMThfMTYx/MDAxNTcxMzc3OTYyNzU3.y1RT-ca07QXIH6gKUuNNI3tP2I2KuKLnG-9EhlVa-2gg.jQtrg_OHE41J-Ngjm3QZis31zDc_Ajf7w7FVK1rHgmYg.PNG.ehdwnd02/image.png?type=w773)](https://blog.naver.com/PostView.nhn?blogId=ehdwnd02&logNo=221681605957&categoryNo=26&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1&from=postView&userTopListOpen=true&userTopListCount=5&userTopListManageOpen=false&userTopListCurrentPage=1#)

위의 그림과 같이 6개의 DB Table을 사용하였다.







## Chavis HTTP Server 소개

Chavis HTTP서버는 Spring framework를 사용하여 구현했으며, 사용자 및 정비사용 앱에서 로그인 기능 및 예약 서비스를 관리하고 정보를 표시할 수 있도록 앱으로부터의 정보를 요청 시 컨트롤러를 통해 정보를 보내준다.

##### DB는 oracle11g을 사용했으며, DB접근은 mybatis를 사용했습니다.









## 정비사용 웹 소개

![img](https://postfiles.pstatic.net/MjAxOTEwMThfMTU4/MDAxNTcxMzc4MjYyMDQ0.vKtTJxCp-XYqGaegWvywnbv3_QTgSJc0Yiv53NP9x24g.5YE2SYfIjH0XSCBw5BD0g5U0MjBdXy-jletUkOv-B28g.PNG.ehdwnd02/image.png?type=w773)

![img](https://postfiles.pstatic.net/MjAxOTEwMThfNyAg/MDAxNTcxMzc4MjkzOTM1.B5spbdRw10xTBDy-ktitjBdmoeObsJjdoh8w3ChAF2Yg.LTHf4VH4NIU7MdjUybdFIBt3OCUQKPlwl11lKcpbtZAg.PNG.ehdwnd02/image.png?type=w773)

정비사용 웹으로 정비소에 할당된 아이디와 비밀번호로 로그인하여 예약 현황을 확인할 수 있다.