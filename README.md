# demo
I've set this project up for [a stackoverflow question](https://stackoverflow.com/questions/47715472/stackoverflow-exception-while-loading-relationshipentity-in-ogm?noredirect=1#comment82735246_47715472)

All you have to do, to set it up, is have a Neo4j running without credentials under localhost.
Run this Cypher statement to get the test-data:
```merge (u:User {name:'Some name'})
 create (u)-[:LIKES {how:'Very'}]->(:Book {title:'Some Book'})
 create (u)-[:LIKES {how:'Very'}]->(:Book {title:'Some other Book'})
 create (u)-[:LIKES {how:'Very'}]->(:Book {title:'Another Book'})
 create (u)-[:LIKES {how:'Very'}]->(:Book {title:'The latest Book'})
```

Afterwards run `mvn clean package` followed by `java -jar target/demo-swarm.jar`.
This starts a Wildfly, and sending a GET to `localhost:8080/users/{userId}` (where `{userId}` is the Id, the User got
 in your DB) should throw the 
`Stackoverflow`-Exception.

Thanks for the help :-)
