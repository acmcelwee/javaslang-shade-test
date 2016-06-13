# javaslang-shade-test

Tests Javaslang in conjunction with the Maven shade plugin.

**Usage:**

1. Build the Uber jar

```bash
$ mvn package
```

2. Execute the Uber jar

```bash
$ java -jar target/shade-test-0.0.1-SNAPSHOT.jar 
```

The output should be

```bash
HI!
```
