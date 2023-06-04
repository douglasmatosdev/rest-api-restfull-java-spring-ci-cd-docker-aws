# Rest API Restfull Java Spring CI/CD Docker AWS

## MySQL
User `root` and password `admin123` 

```bash
mysql -u root -p
CREATE DATABASE rest_with_spring_boot_udemy;
```

## API Routes/End-points

- GET
    - All person: `http://localhost:8080/person`
    - Person by id: `http://localhost:8080/person/1`
- POST
    - Create person `http://localhost:8080/person`
    
     body
    ```json
    {
        "firstName": "Anakin",
        "lastName": "Skywalker",
        "address": "another planet",
        "gender": "Male"
    }
    ```

- PUT
    - Update person `http://localhost:8080/person`
    
     body
    ```json
    {
        "id": "1",
        "firstName": "Anakin",
        "lastName": "Skywalker",
        "address": "another planet",
        "gender": "Male"
    }
    ```
- DELETE
    - Delete person `http://localhost:8080/person/1`

