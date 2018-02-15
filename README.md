# docker-test
Just a test using Docker

Initial Step: Execute the load_dok_rep.bat (for Windows) to get the image from repository. It will be executed automatically.

Take the IP from Docker Machine: docker-machine ls
e.g.: 
```sh
$ docker-machine ls
```

| NAME | ACTIVE | DRIVER | STATE | URL | SWARM | DOCKER | ERRORS |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
default | * | virtualbox | Running | tcp://192.168.99.100:2376 | | v1.12.2 | |

IP_ADDRESS = 192.168.99.100

Jenkins URL: http://IP_ADDRESS:8282 
e.g.: http://192.168.99.100:8282

--
Use the following Jenkins credentials to log in and build a new release or to start a new build
Username: guest
Password: guest

* The Unit Tests are automatically performed by the build job.

--
The REST Operations can be acessed using the following endpoints:
Parent URL: http://IP_ADDRESS:8888/application-test/calculator

### GET /sum
	Params: value1 (double)
		    value2 (double)
	e.g.: http://IP_ADDRESS:8888/application-test/calculator/sum?value1=5&value2=0

### GET /subtract
	Params: value1 (double)
		    value2 (double)
	e.g.: http://IP_ADDRESS:8888/application-test/calculator/subtract?value1=5&value2=0

### GET /multiply
	Params: value1 (double)
		    value2 (double)
	e.g.: http://IP_ADDRESS:8888/application-test/calculator/multiply?value1=5&value2=0

### GET /divide
	Params: value1 (double)
		    value2 (double)
	e.g.: http://IP_ADDRESS:8888/application-test/calculator/divide?value1=5&value2=4
