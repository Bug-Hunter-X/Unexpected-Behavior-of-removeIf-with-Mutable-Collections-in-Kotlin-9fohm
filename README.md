# Unexpected Behavior of removeIf with Mutable Collections in Kotlin

This repository demonstrates a subtle issue related to the `removeIf` function in Kotlin when used with mutable collections. The issue arises due to the way `removeIf` interacts with iterators and can lead to unexpected results if not handled carefully.

## Description

The `removeIf` function is designed to remove elements from a collection based on a predicate. However, when used with mutable collections, unexpected behavior might occur if the predicate modifies the collection during iteration. The provided code examples highlight this behavior with `MutableList`, `MutableMap`, and `MutableSet`.

## Solution

The solution involves making a copy of the collection before applying the `removeIf` operation. This prevents concurrent modification exceptions and ensures expected behavior.

## How to Run

1. Clone this repository.
2. Open the project in your preferred Kotlin IDE.
3. Run the `main` function in `bug.kt` to see the initial behavior.
4. Run the `main` function in `bugSolution.kt` to see the corrected behavior.
