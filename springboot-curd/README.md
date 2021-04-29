### 项目介绍

使用 Map 集合模拟数据库，编写 curd 接口，实现数据增删改查。

### 使用 postman 软件进行接口测试

#### 1.接口地址

- 获取所有数据：http://localhost:8099/student/findAll

- 添加数据：http://localhost:8099/student/save

    ```json
    {
      "id":"4",
      "name":"赵六",
      "age":"25"
    }
    ```
  
- 修改数据：http://localhost:8099/student/update

    ```json
    {
      "id":"4",
      "name":"田七",
      "age":"25"
    }
    ```

- 删除数据：http://localhost:8099/student/deleteById/4

