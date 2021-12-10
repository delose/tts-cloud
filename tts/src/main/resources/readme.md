## schema.sql
- DEFAULT BEHAVIOR: this SQL script will be executed automatically when application starts

## data.sql
- DEFAULT BEHAVIOR: the SQL statements inside this file will automatically execute also

## banner.txt
- Spring automatically recognizes this file and displays the contents in the logs

## 4 ways to configure properties
- application.properties
- application.yml
- application command-line argument (e.g. java -jar tts-0.0.1.jar --server.port=9090) 
- operating system environment variable (e.g. export SERVER_PORT=9090)
***