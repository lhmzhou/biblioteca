# biblioteca

`biblioteca` is a Spring Boot application that demonstrates an implementation of GraphQL using HSQL JPA repository as the persistence layer. 

# Prerequisites

Spring Boot, Maven, HSQLDB, GraphQL-Java

## Sample Query 

The application exposes GraphQL at `http://localhost:8092/graphql` and you can pass the graphQL query as a request parameter. 

A sample GraphQL query:

```
{  
	allBooks{  
		title  
		authors  
	}  
	book(id: "1"){  
		title  
		publisher  
		authors  
	}  
}  
```

A sample mutation query:

```
mutation {
  createBook(input: {id: "5", title: "Mutation Example", publisher: "H.B.", authors: ["A", "B", "C"], publishedDate:"today"}) {
    isbn
    title
    publisher
    authors
    publishedDate
  }
}
```

You may use [urlencoder](https://www.urlencoder.io/) to encode URLs easily in composing GraphQL queries for request parameter.
 
