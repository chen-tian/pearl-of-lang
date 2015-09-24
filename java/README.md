# Add a new module

1. Run ./create_module MOD

2. Modify pom.xml in your module, and start writing the code 

3. Create env file if necessary to define JAVADEF (tranlsated to -D) and CLASSPATH environment variable

The MOD name follows CamelCase naming convention, and in the source code, the package name must be camelcase so that the run script can pick it up.
