
```
# Multithreading in Java with Locks

This repository contains a simple Java program demonstrating multithreading using locks for thread synchronization.

## Overview

The `MultiThreadedApp` Java class simulates concurrent access to a shared resource by spawning multiple threads. Each thread increments a shared integer variable in a synchronized manner using locks.

## Features

- **Thread Management**: Spawns multiple threads to concurrently update a shared resource.
- **Locking Mechanism**: Utilizes the `ReentrantLock` class for thread synchronization.
- **Demonstration**: Prints thread IDs along with the updated value of the shared resource to demonstrate concurrent behavior.

## Requirements

- Java Development Kit (JDK) installed on your system.
- IDE or text editor for Java development.

## How to Use

1. Clone the repository to your local machine:

```
git clone https://github.com/yourusername/multithreading-java-locks.git
```

2. Navigate to the cloned directory:

```
cd multithreading-java-locks
```

3. Compile the Java program:

```
javac MultiThreadedApp.java
```

4. Run the compiled program:

```
java MultiThreadedApp
```

