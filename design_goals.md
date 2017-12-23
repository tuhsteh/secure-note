
#  Secure Note Sharing Service

## Design goals.

1. Simple API
1. Simple Database
1. Encryption throughout
1. Destruction as soon as the id is requested
1. Engineered to avoid accidentally leaving the note in memory, cache, or other storage
1. Spring Boot (not necessarily part of design, but a goal)

## Future goals.

1. Web Interface that calls on the API
1. Encryption throughout, including https
1. Consideration for possible attacks, including CORS and others noted on OWASP Top 10

## Futurer goals.  

1. A chat client that relies on the same ephemeral and shredded note sharing API




