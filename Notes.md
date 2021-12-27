# Java Learning Notes

Original author of the study material is by Eko Kurniawan Khannedy

- YouTube Video Link: [TUTORIAL JAVA DASAR BAHASA INDONESIA - YouTube](https://youtu.be/jiUxHm9l1KY) 

The notes here is meant to be my personal learning notes when learning the material.

## Target Audience

- Beginner Programmer

- Android, Backend, Data Engineer

## Outline

- Introduction to Java

- Installation

- Data types, Operator, Switch condition, Loop, Method

## Introduction

- By James Gosling, at Sun Microsystem, released in 1995

- It is Object Oriented programming language, and supports for automatic memory management

- Java is famous for write once, run anywhere, binary program can be generated in any JVM installed in any VM

- There are different technology: Java Standard Edition, Java Enterprise Edition, Java Micro Edition

- Current version is Java 16 (March 2021), released every 6 months, has backward compatible, has LTS version

- Commonly used as backend application in Twitter, Netflix, Spotify, Amazon, Alibaba, Blibli, etc.

- Big Data technology using Java like Apache Hadoop, Elasticsearch, Apache Cassandra, Apache Spark, Apacke Kafka, and Android

### JRE vs JDK

- JDK Java Development Kit, used to develop Java application (usually also comes with JRE)

- JRE Java Runtime Environment, used to run Java application, usually run in server production

### JVM

- Java is the name of the programming language, but its core technology is Java VIrtual Machine (JVM)

- JVM is used to run Java executable, and it only recognized binary file

- Other programming languate like Kotlin, Scala, Groovy is using JVM technology too, as it is proven to be stable and runs well

### Development Process

1. Write code in `sample.java` file

2. Then we use JDK to compile `sample.java` file, and generates a `sample.class` Java binary file

3. The `sample.class` binary file is what we run with JRE, but if the file is huge, we can use archiving and package it into a single `sample.jar` Java archieve file

## Installation

- One of the most popular is OpenJDK, open source solution

### Steps

1. Download the tarball from https://jdk.java.net/ (I picked JDK 17)

2. Extract the table to a directory of your choice
   
   ```bash
   mkdir ~/tools && cd ~/tools
   tar -C ~/tools -xzvf openjdk-17.0.1_linux-x64_bin.tar.gz jdk-17.0.1/
   ```

3. Set the environment variable `PATH`
   
   ```bash
   # Add to .bashrc or .zshrc
   
   export JAVA_HOME=$PATH:/home/tim/tools/jdk-17.0.1/
   export PATH=$PATH:$JAVA_HOME/bin
   ```

4. Then check and validate if Java can run
   
   ```bash
   java -version
   javac -version
   ```

## Hello World

- In Java, we will create a class. And the name of the class **has to be the same** with the name of the file!

- A class name in Java also can't contain any space.

- The norm for class name follows sentence case (e.g.: `public class HelloWorld{}`)

- Also, inside a class, there needs to be a `main` function, just like other programming language like C, or go.

- Note that Java is case-sensitive!

- Every line ends with a semicolon `;`
