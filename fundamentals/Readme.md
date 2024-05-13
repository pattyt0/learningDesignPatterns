# APIE

## Abstraction
- Constant removal of specifics or specific details for the sake of **generalization** 
- Vehicle describes a common functionality that all types of vehicles can include.
- Abstracting Vehicle can have positive impact like code reduction and reusability
  - Abstract classes with abstract methods
  - Using interfaces with generic abstract method
## Polymorphism
- Many forms
- Ability to perform a particular action in many ways. Depending on the context 
- Vehicle.move can behave differently on different kinds of vehicle (many kinds of context)
### Overloading
- Static polymorphism because method is resolved during **compilation**.
  - Changing the input argument **type**
  - Changing the number of method **arguments**
### Overriding
- Dynamic polymorphism because method is resolved at **runtime**.
- Method is called through reference to the object instance of belongingness.
- Example: Car move method, overriding it the car behaves different from generic Vehicle

## Inheritance
- Deriving all attributes and functions to a child class. In order to create non-perfect and unique replicas,
re-using attributes and functionality from a parent class e.g. needed to create a new Motor.     

## Encapsulation
- It only exposes the functionality it serves, all internal elements and internal functions are hidden. 