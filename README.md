# CMPE 202-Starbucks-Team-Project README

Swati Shukla
Vanushri Rawat
Odkhuu Batmunkh

Team work distribution
1) POST Add Card API - Vanushri
2) POST Manage order API - Odkhuu
3) POST Make a Payment API - Swati
5) GET Store API - Everyone
6) Deploy to AutoScaled EC2 cluster with load balancer - Everyone
7) Deploy as a Docker Container in AWS-Elastic Container Services - Everyone

Task one: implement APIs

We have used the base code in our individual starbucks app. 
The base code we have migrated it from a Gradle project into a Maven project.
Inside the new maven project we have imported SpringBoot libraries. 
Inside the pom.xml we have specified all the dependencies. 

Using springboot libraries we have mapped each Java methods into API calls by creating Controller classes. 
We have mapped all 3 POST methods (add card, manager order, and make payment) and 1 GET method (store) inside each corresponding Controller class. There is no token authentication for REST-APIs; however, all the variables for each REST-API call is passed on through body in JSON format. 

Please find our Maven project with Spring Boot implementation here:
https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/workspace-spring-tool-suite-4-4.2.1.RELEASE.zip

Task two: Deploy to AWS (ec2 cluster + docker containers)

1) 

2)

