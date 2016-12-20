kAUthentification Module: JAX-RS Services Documentation 
=======================================================
Author: Bertrand Pestre

AuthService End Points
------------------------

### Authenticate user (no hash)
#### /rest/auth

* Request type: POST
* Request type: JSON
* Return type: JSON
* Request example:

```JavaScript
{"login":"jean","pwd":"claude"}
```
* Response example:
 * Success: 200 OK
 * Validation error: Collection of `<field name>:<error msg>` for each error

```JavaScript
{	"id": 2,"login": "jean","firstName": "tp","lastName": "tp","role": "MANAGER","token": "0515611561654160846410" }
```

### List all members
#### /rest/members

* Request type: GET
* Return type: JSON
* Response example:

```javascript
[{"id":1,"name":"Jane Smith","email":"jane.smith@mailinator.com","phoneNumber":"2125551212"},{"id":0,"name":"John Smith","email":"john.smith@mailinator.com","phoneNumber":"2125551212"}]
```


### List all members
#### /rest/members

* Request type: GET
* Return type: JSON
* Response example:

```javascript
[{"id":1,"name":"Jane Smith","email":"jane.smith@mailinator.com","phoneNumber":"2125551212"},{"id":0,"name":"John Smith","email":"john.smith@mailinator.com","phoneNumber":"2125551212"}]
```

### Create a new member
#### /rest/members

* Request type: POST
* Request type: JSON
* Return type: JSON
* Request example:

```JavaScript
[{"name":"Jane Smith","email":"jane.smith@mailinator.com","phoneNumber":"4160000000"}]

* Response example:
 * Success: 200 OK
 * Validation error: Collection of `<field name>:<error msg>` for each error

```JavaScript
{"phoneNumber":"10-12 Numbers","email":"Invalid format"}
```

#### /rest/members/\<id>
* Request type: GET
* Return type: JSON
* Response example:

```javascript
{"id":0,"name":"John Smith","email":"john.smith@mailinator.com","phoneNumber":"2125551212"}
```
