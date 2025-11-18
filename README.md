# AnyTypeMergeSort (Java)

This project provides a generic implementation of the Merge Sort algorithm in Java using type parameters constrained by the `Comparable` interface. The class supports sorting arrays of any object type that implements `Comparable<T>`.

## Overview

`AnyTypeMergeSort<T>` is a generic merge sort class that:

* Recursively divides an array into halves
* Sorts each half
* Merges them back together in sorted order

The implementation works with any data type that provides a natural ordering through the `compareTo()` method.

---

## Features

* Generic type support (`T extends Comparable<T>`) ensuring type safety
* Classic merge sort algorithm
* Stable sorting behavior
* Demonstration using a `String` array

---

## File Structure

```
AnyTypeMergeSort.java
```

---

## How It Works

### 1. `mergeSort(T[] A, int p, int r)`

* Recursively splits the array into two halves
* Sorts left and right halves
* Calls `merge` to combine them

### 2. `merge(T[] A, int p, int q, int r)`

* Creates temporary arrays `L` and `R`
* Merges them into the original array `A`
* Preserves stable ordering (equal elements maintain original order)

### 3. `main()` Demonstration

* Creates a `AnyTypeMergeSort<String>` instance
* Sorts an array of `String` values
* Prints original and sorted arrays

---

## Example Output

```
Original array:
banana apple orange grape

Sorted array:
apple banana grape orange
```

---

## How to Compile and Run

Compile:

```bash
javac AnyTypeMergeSort.java
```

Run:

```bash
java AnyTypeMergeSort
```

---

## Key Points

* Merge sort runs in **O(n log n)** time
* Requires additional space for temporary arrays
* Works for any `Comparable` type (e.g., `String`, `Integer`, custom classes)

---

If you need a version that sorts custom objects or want diagrams explaining the merge process, I can add those as well.
