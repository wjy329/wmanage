# wmanage
## 基于Spring Boot+MyBatis+Shiro+LayUI的后台管理系统

之前也抽出一个系统，但是发现问题很多，毕竟不是自己的，现在这个从头构建，刚有起色，哈哈。<br>  
目前实现的功能有：<br>  
1.用户管理<br>  
2.角色分配<br>  
3.权限/菜单管理<br>  

之前抽离出来的系统，权限管理那块一直有问题，由于是别人弄的，改了大半天也没改明白，所以自己决定重新整理一下，重构一次，就当是熟悉了代码了。<br>  
基本思路就是：用户-角色-权限；用户分配角色，角色分配权限，一个用户可有多种角色。实现权限的灵活配置。<br>  
目前只支持二级菜单，等项目完善后，再做成三级菜单甚至无限极。。。（貌似意义不大）。<br>  


下一步有时间完成:<br>  
1.角色管理<br>  
2.角色分配权限<br> 

登录界面：<br>
![](https://github.com/wjy329/wmanage/raw/master/w-web/src/main/resources/picture/login.png)  <br>
主界面：<br>
![](https://github.com/wjy329/wmanage/raw/master/w-web/src/main/resources/picture/main.png)  <br>
菜单/权限界面：<br>
![](https://github.com/wjy329/wmanage/raw/master/w-web/src/main/resources/picture/menu.png)  <br>
注册界面：<br>
![](https://github.com/wjy329/wmanage/raw/master/w-web/src/main/resources/picture/register.png)  <br>
左侧导航隐藏：<br>
![](https://github.com/wjy329/wmanage/raw/master/w-web/src/main/resources/picture/suojin.png)  <br>
用户界面：<br>
![](https://github.com/wjy329/wmanage/raw/master/w-web/src/main/resources/picture/user.png)  <br>
角色分配权限界面：<br>
![](https://github.com/wjy329/wmanage/raw/master/w-web/src/main/resources/picture/quanxian.png)  <br>







