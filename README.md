### 查詢目前 Docker 使用的 MySQL 版本

```bash
docker ps
docker exec <your container id> bash
mysql --version
```
### 修改 `application.properties` MySQL 連線資訊

請將以下資訊換成您自己的：

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/TRAM  # 換成自己的資訊
spring.datasource.username=root  # 換成自己的帳號
spring.datasource.password=root  # 換成自己的密碼
