# Design Patterns documentation

### Singleton

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

### Builder

##### 1. Concepts
* Handles complex constructors
* Large number of parameter
* Immutability

Examples: StringBuilder, DocumentBuilder, Locale.Builder

##### 2. Design
* Flexibility over telescopic constructors (many constructors with variations of parameters)
* Static inner class
* Calls appropriate constructor
* Negates the need to expose setters
* Java 1.5+ can take advantage of Generics
##### 3. Pitfalls
* Immutable
* Inner static class
* Design first
* Complexity

##### 4. Contrast
* Builder: Handles complex constructors
* Prototype: Implemented around a clone
* Builder: No interface required
* Prototype: Avoids calling complex constructors
* Builder: Can be a separate class
* Prototype: Difficult to implement in legacy code
* Builder: Works with legacy code

### Prototype

##### 1. Concepts
* Avoid costly creation
* Avoids subclassing
* Typically doesn't use "new"
* Often utilizes an Interface
* Usually implemented with a Registry

Examples: java.lang.Object#clone()

##### 2. Design
* Clone/Cloneable
* Avoids keyword "new"
* Although a copy, each instance unique
* Costly construction not handled by client (Builder is the opposite of the Prototype pattern)
* Can still utilize parameters for construction
* Shallow vs Deep Copy

##### 3. Pitfalls
* Sometimes not clear when to use
* Used with other patterns
    * Registry
* Shallow vs Deep Copy

##### 4. Contrast
* Prototype: Lighter weight construction (Copy Constructor or Clone)
* Factory: Flexible Objects (Multiple constructors)
* Prototype: Shallow or Deep
* Factory: Concrete Instance
* Prototype: Copy of itself
* Factory: Fresh Instance

### Factory Method

##### 1. Concepts
* Doesn't expose instantiation logic
* Defer to subclasses
* Common interface
* Specified by architecture, implemented by user (often used in frameworks; the user of the framework will instantiate the object)

Examples: Calendar, ResourceBundle, NumberFormat

##### 2. Design
* Factory is responsible for lifecycle
* Common Interface
* Concrete Classes
* Parameterized create method

##### 3. Pitfalls
* Complexity
* Creation in subclass
* Refactoring (design first as a factory method)

##### 4. Contrast
* Singleton:
    * Returns same instance
        * One constructor method - no args
    * No interface
    * No subclasses
*  Factory:
    * Returns various instances
        * Multiple constructors
    * Interface driven
    * Subclasses
    * Adaptable to environment more easily (many frameworks are using this pattern)
### Builder

##### 1. Concepts
* Handles complex constructors
* Large number of parameter
* Immutability

Examples: StringBuilder, DocumentBuilder, Locale.Builder

##### 2. Design
* Flexibility over telescopic constructors (many constructors with variations of parameters)
* Static inner class
* Calls appropriate constructor
* Negates the need to expose setters
* Java 1.5+ can take advantage of Generics
##### 3. Pitfalls
* Immutable
* Inner static class
* Design first
* Complexity

##### 4. Contrast
* Builder: Handles complex constructors
* Prototype: Implemented around a clone
* Builder: No interface required
* Prototype: Avoids calling complex constructors
* Builder: Can be a separate class
* Prototype: Difficult to implement in legacy code
* Builder: Works with legacy code

### AbstractFactory Pattern

##### 1. Concepts
* Factory of Factories
* Factory of related objects
* Common Interface
* Defer to Subclasses

Examples: DocumentBuilder; often implemented in Frameworks

##### 2. Design
* Groups Factories together
* Factory is responsible for lifecycle
* Common Interface
* Concrete Classes
* Parameterized create method
* Composition

(Used also for same queries against different types of DBs)

##### 3. Pitfalls
* Complexity
* Runtime switch
* Problem specific
* Starts as a Factory

##### 4. Contrast
* Factory
    * Returns various instances
        * Multiple constructors
    * Interface driven
    * Adaptable to environment more easily
* AbstractFactory
    * Implemented with Factory
    * Hides the Factory
    * Abstracts Environment
    * Build through Composition