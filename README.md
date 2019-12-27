# springbootelasticsearch
用于整合springboot2.2.2和 elasticsearch7.5.0
jdk 1.8 / mysql8.0.16

es相关工具为es的搭建过程 及相关工具

es相关工具为es的搭建过程 及相关工具  
获取链接百度云盘： 链接：https://pan.baidu.com/s/1rZHCkO55AF4tY5ICV18TQQ 
提取码：6vae 


启动es  步骤
1. 进入D:\java\elasticsearch-7.5.0\bin  目录下 ，双击elasticsearch.bat
2.进入 D:\java\elasticsearch-head   目录下  执行grunt server
3. 访问 http://127.0.0.1:9100 (讲es的9200 换成 9900 ，点击连接)

4.cmd进入 D:\java\logstash-7.5.1   目录下 执行bin\logstash.bat -f mysqletc\mysql.conf命令，在http://127.0.0.1:9100页面，连接的9900端口，点击
数据浏览，即可看见刚刚同步的mysql数据的索引（cmscontent）；
5.在本地新建数据库 eladmin
导入失去了文件（建百度网盘链接）
链接：https://pan.baidu.com/s/1vgggUV8IRo1gMrUptesYZQ 
提取码：fu1m
