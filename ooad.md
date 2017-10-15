OO Principles
=============
1. Encapsulate what varies.
2. Code to an interface rather than to an implementation.
3. Each class in your application should have only one reason to change.
4. Classes are about behaviour and functionality.

Analysis and Design
===================
1. Well-designed software is easy to change and extend.
2. Use OO principles like encapsulation and inheritance to make the software more flexible.
3. If a design isn't flexible, then CHANGE IT!
4. Make sure each of your classes is cohesive: Each of your classes should focus on doing ONE THING really well.
5. Always strive for higher cohesion as you move through your software design life cycle.

Solving Big Problems
====================
1. Listen to the customer and figure out what they want to build.
2. Put together a feature list, in language the customer understands.
3. Make sure the features are what the customers actually really want.
4. Create Use case diagrams.
5. Break the big system up into lots of smaller sections.
6. Apply design pattern to the smaller sections.
7. Use basic OOA&D principles to design and code each smaller section.

3 Q’s of architecture
=====================
1. Is it part of the essence of the system?
2. What does it mean?
3. How do i do it?

3 steps
=======
1. Ask the customer (what does the feature mean?)
2. Commonality analysis
3. Implementation plan (How do i realize that feature in my system?)

Design Principles
=================
**The open-closed principle (OCP)**

- Classes should be open for extension, and closed for modification.

**Don't repeat yourself principle (DRY)**

- Avoid duplicate code by abstracting out things that are common and place those things in a single location.

**Single Responsibility Principle (SRP) (The [class] [method] itself)**

- Every object in your system should have a single responsibility, and all the object's services should be focused on carrying out that single responsibility.

**Composition && Aggregation**

- Composition
```java
    final class Car {
      private final Engine engine;
      Car(EngineSpecs specs) {
        engine = new Engine(specs);
      }
      void move() {
        engine.work();
      }
    }
```

- Aggregation
```java
    final class Car {
      private Engine engine;
      void setEngine(Engine engine) {
        this.engine = engine;
      }
      void move() {
        if (engine != null)
          engine.work();
      }
    }
```
**The Liskov Substitution Principle (LSP)**

Sub types must be substitute for their base types.

Iterating and Testing
=====================

- **Feature driven development**
  - Work on a single feature at time, and then iterate, knocking off features one at time until you've
  finished up the functionality of an application.
  
- **Use case driven development**
  - With **use case driven development**, you work on completing a single scenario through a use case.
  Then you take another scenario and work through it, until all of the use case scenarios are complete.
  Then you iterate to the next use case, until all the use cases are working.
  
- **Test driven development**
  - Focuses on getting the behaviour of your classes right. 
 
 Programming practices
 ====================
 
- **Programming by contract**
  - Programming by contract sets up an agreement about how your software behaves that you and users of
  your software agree to abide by.

- **Programming defensively**
  - Defensive programming doesn't trust other software, and does extensive error and data checking
  to ensure the other software doesn't give you bad or unsafe information. (CHECKED exceptions)