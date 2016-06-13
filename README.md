# javaslang-shade-test

Tests Javaslang in conjunction with the Maven shade plugin.

## Prerequisites

* Maven 3+
* Java 8+

## Usage

Build the Uber jar

```bash
$ mvn package
```

Execute the Uber jar

```bash
$ java -jar target/shade-test-0.0.1-SNAPSHOT.jar 
```

The output should be

```bash
HI!
```
