# Observer Pattern

*The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.*

## Principles
1. Strive for loosely coupled designs between objects that interact.

## In Order to Impress Someone
```
The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.
```

## Easy to understand diagram
<p align="center">
 Below Diagram is from Head First Design Pattern
</p>

*Publisher* + *Subscribers* = *Observer Pattern*
Publisher = Subject
Subscribers = Observers

![Image](observerPatternDiag.png)

## Class diagram for the Oberver Pattern
<p align="center">
 Below Diagram is from Head First Design Pattern
</p>

![Image](observerPattern.png)

## Important Points
* When two objects are loosely coupled they can interact, but have very little knowledge of each other. The Observer Pattern provides an object design where subject and observers are loosely coupled.

## Refrences
* https://www.geeksforgeeks.org/strategy-pattern-set-1/
* https://en.wikipedia.org/wiki/Strategy_pattern
