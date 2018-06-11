# calendar-events
This project has JWT token and swagger configured.

Swagger URI: http://localhost:8080/swagger-ui.html
To generate token please use following post URI or use swagger UI to generate token using following API.
http://localhost:8080/auth
USER NAME: user
PASSWORD: password

Then to access events please add Authorization header as follow

Authorization: Bearer {ACCESS_TOKEN}
