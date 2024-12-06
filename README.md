# Scala Generics Type Erasure Bug

This repository demonstrates a subtle bug that can arise from type erasure in Scala when comparing objects of generic types.

The `MyClass` class uses a generic type `T`. The `myMethod` attempts to compare the values of two instances of this class. Due to type erasure, at runtime the compiler loses the specific type information which may lead to unexpected results. 

The solution involves using type-safe equality checks or avoiding direct comparison of generic types, as illustrated in the `BugSolution.scala` file.

## How to Reproduce

1. Clone the repository.
2. Compile and run `Bug.scala`. Observe the unexpected output in some scenarios.
3. Compile and run `BugSolution.scala`. Observe the corrected behavior.

## Solution

The solution is to utilize an appropriate equals method that considers the actual generic type. This typically involves overriding `equals` and `hashCode` within the generic class.