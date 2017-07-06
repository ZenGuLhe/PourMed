Rest API
_____________________________________
`http://localhost:8080/rest/user`   			: users list
`http://localhost:8080/rest/user?id=med`		: get user where id=med
`http://localhost:8080/rest/user/create`      : create new user (POST + json format + body)
body example :
```
{"profile": 
  {"id": "jonny1",
  "firstName":"John",
  "lastName":"Doe",
  "email":"aNewEmailAddress"},
"credentials": 
  {"password":"s3cret"}
}
```
`http://localhost:8080/rest/process-definition/loanApprovalSpringBoot:1:14903/start` : start a process instance from a proces definition (POST + json format + body)
body example :
```
{"variables":
    {"aVariable" : {"value" : "aStringValue", "type": "String"},
     "anotherVariable" : {"value" : true, "type": "Boolean"}},
 "businessKey" : "myBusinessKey"
}
```

`http://localhost:8080/rest/task/` : get tasks list

`http://localhost:8080/rest/task/14941/complete`       : complete a task from a proces instance (POST + json format + body)
body example :
```
{"variables":
    {"aVariable": {"value": "aStringValue"},
    "anotherVariable": {"value": 42},
    "aThirdVariable": {"value": true}}
}
```
