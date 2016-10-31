Theoretical Questions

1. What is the Java Virtual Machine? What is Bytecode?

    Answer: Java Virtual Machine also known as JVM is a program developed by Sun Microsystems.
    JVM is the program who runs programs written in Java. Bytecode is a type of JAR-fil related to
    Geneious developed by Biomatters, ldt for Windows OS.

2. What is the Java Classpath?

    Answer: The class path is the path that the Java runtime environment searches for classes and other resource files.
    The class search path can be set using either the -classpath option when calling a JDK tool or by setting the CLASSPATH
    environment variable.

3. How do you compile and run your java program without the help of an Integrated Development Environment (IDE) (e.g., an IDE like Eclipse)?

    Answer:  To compile and run your java program without the help of an Integrated Development Environment
    you make a .jar file when your done with the project.

4. What is a JAR file?

    Answer: In software, JAR also known as Java Archive is a package file format typically used to aggregate many Java class files
    and associated metadata and resources into one to distribute application software or libraries on the Java platform.

5. How do you declare the starting point of a Java application?

    Answer: The starting point is declared by the method: public static void main(String[] args)

6. What is a package? Why is important to declare classes inside packages?

    Answer: A package is a namespace that organizes a set of related classes and interfaces.
    Conceptually you can think of packages as being similar to different folders on your computer.
    Java packages can be stored in compressed files called JAR files, allowing classes to be downloaded
    faster as groups rather than individually. A package provides a unique namespace for the types it contains.
    Classes in the same package can access each other's package-private and protected members.

7. What is an interface? Why is it important to not change them?

    Answer: In its most common form, an interface is a group of related methods with empty bodies.
    In the Java programming language, an interface is a reference type, similar to a class, that can contain only
    constants, method signatures, default methods, static methods, and nested types and can only be implemented by classes
    or extended by other interfaces.

    Interfaces form a contract between the class and the outside world, and this contract is enforced
    at build time by the compiler. If your class claims to implement an interface, all methods defined
    by that interface must appear in its source code before the class will successfully compile.

8. Which visibility levels are available in Java? What is the default visibility for classes, methods, and fields?

    Answer: There are 4 visibility levels in java, (public, protected, no modifier, private).
    If a class, method or a field has no modifier the default visibility is package-private which means its visible for everything
    in the package the class is in.

9. In the context of Java, what is an Exception? And what is an Error?

    Answer: An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.
    An Error is a subclass of Throwable that indicates serious problems that a reasonable application should not try to catch.

10. What happened if your program terminates with an OutOfMemoryError, or NoClassDefFoundError or NullPointerException?

    Answer:
    OutOfMemoryError is thrown when the Java Virtual Machine cannot allocate an object because it is out of memory,
    and no more memory could be made available by the garbage collector.

    NoClassDefFoundError is thrown if the Java Virtual Machine or a ClassLoader instance tries to load in the definition of a class
    (as part of a normal method call or as part of creating a new instance using the new expression) and no
    definition of the class could be found.

    NullPointerException is thrown when an application attempts to use null in a case where an object is required.
    These include:
                   - Calling the instance method of a null object.
                   - Accessing or modifying the field of a null object.
                   - Taking the length of null as if it were an array.
                   - Accessing or modifying the slots of null as if it were an array.
                   - Throwing null as if it were a Throwable value.

11. How do you handle Exceptions in your program?

    Answer: Exceptions is handled by a try-catch statement.

    try()
    {
    }
    catch(Write error to handle)
    {
    }

12. Why is it important to test your code/application/product, before you deliver it to your customer/boss/teacher?

    Answer: It is important to test code/application/product before final delivery to see if the code/application/product
    works as its supposed to do.

13. What is JavaDoc? How do you write documentation with it?

    Answer: Javadoc is a tool which comes with JDK and it is used for generating Java code documentation in
    HTML format from Java source code which has required documentation in a predefined format.

    JavaDoc documentation can look like:

        /**
        * <h1>Add Two Numbers!</h1>
        * The AddNum program implements an application that
        * simply adds two given integer numbers and Prints
        * the output on the screen.
        * <p>
        * <b>Note:</b> Giving proper comments in your program makes it more
        * user friendly and it is assumed as a high quality code.
        *
        * @author  Anton Larsson
        * @version 1.0
        * @since   2016-09-12
        */




