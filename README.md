The project has been divided into the following microservices:

![Diagram](/img/Bank_diagram.png)

The Entry Point server requests first the Security service to verify that the request is authorised (the account holder is the owner of the account or for third party transactions that the secretKey is correct).
Next depending on the User doing the request AccountHolder,  ThirdParty and Admin service would be accessed. Each has access to the database to verify the user details. Here is registered all the logic for the action each can perform,
Then Bank Service holds the logic for the operations affecting the bank accounts and the access to the data base containing them.
The Logging Service is accessed to log everything. The logging has been centralised on this microservice in order to facilitate the configuration.
Finally, Fraud Service verifies for every transaction that there is not a fraud pattern happening. 
