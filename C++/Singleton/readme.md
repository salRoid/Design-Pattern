Single Design Pattern

Definition :

Define a class that has only one instance and provides a global point of access of that instance.

Requirements:

1. One and only Instance
2. Global Access
3. No Ownership
4. Lazy Initialization

Advantages:

1. Saves Memory
2. Single access point
3. Flexibility

Usage 

1. Multi Threaded Environments
2. Database Appplications
3. Configuration Settings

To create a Singleton class

1. Static Member
2. Private Constructor
3. Static Function


Delete the singleton pointer to avoid leak