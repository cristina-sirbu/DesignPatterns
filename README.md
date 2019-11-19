#Design Patterns documentation

###Singleton

##### 1. Concepts
* Only one instance is created
* Guarantees control of a resource
* (Not necessary) lazy loaded

Examples: Runtime, Logger, Spring beans

##### 2. Design
* Class is responsible for lifecycle
* Static in nature
* Needs to be thread safe
* Private instance
* Private constructor
* No parameters required for construction

Tip to check if it's a singleton => create two objects of the same type and do an if a equals b. If printed, it should have the same memory address 

Another way to check if it is a singleton => try to do a new instantiation of the class: DBSingleton db = new DBSingleton(). It should not allow you.

To make the singleton lazy loading in getInstance() check if it is null, then create the instance.

To make the singleton thread safe make the static instance volatile and when you check for null in getInstance() method do a syncronized to check if another thread has instantiated the singleton already.

##### 3. Pitfalls
* Often overused
* Difficult to unit test
* If not careful, not thread-safe
* Sometimes confused with Factory (when getInstance() needs an argument it is no longer a Singleton)
* java.util.Calendar is NOT a singleton. It is a Prototype

##### 4. Contrast
* Singleton: returns same instance (has one constructor method with no arguments)
* Factory: returns various instances (has multiple constructors)
* Singleton: No interface
* Factory: Interface driven and it is adaptable to environment more easily

##### 5. Example
Check DBSingleton.java and run DBSingletonDemo.java to see stuff running.