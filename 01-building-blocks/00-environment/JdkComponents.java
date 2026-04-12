/**
 * JdkComponents.java
 *
 * Author: Jada Holloway
 * Topic: Major Components of the JDK (Java SE 17)
 *
 * The JDK is the foundational toolkit required to write and run Java programs.
 * While the JDK alone is sufficient, most developers pair it with an IDE
 * for a smoother development experience.
 *
 * Core JDK Commands:
 *
 *   javac   - Translates .java source files into .class bytecode
 *             Usage: javac Hello.java
 *
 *   java    - Starts the JVM and runs a compiled program
 *             Usage: java Hello
 *
 *   jar     - Bundles compiled files into a single .jar archive
 *             Usage: jar -cvf MyApp.jar *.class
 *
 *   javadoc - Produces HTML documentation from code comments
 *             Usage: javadoc Hello.java
 *
 * Compilation Flow:
 *   .java source file
 *       -> javac compiles it
 *   .class bytecode file
 *       -> java launches the JVM
 *   JVM reads and executes the bytecode on the host machine
 *
 * Bytecode is machine-neutral — the JVM handles translating it
 * to instructions the underlying hardware understands.
 */
public class JdkComponents {}
