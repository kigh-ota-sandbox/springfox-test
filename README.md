パラメータのLocationだけが違うようなAPIが複数ある場合に片方しかSwagger出力されない件の調査用

```bash
$ curl -H'Content-Type:application/json' http://localhost:8080/greeting -d'{"name": "HOGE"}'
$ curl -XGET -H'Content-Type:application/json' http://localhost:8080/v2/api-docs
```
