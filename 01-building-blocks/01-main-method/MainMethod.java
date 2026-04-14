/**
 * MainMethod.java
 *
 * Author: Jada Holloway
 * Topic: The main() Method (Java SE 17)
 *
 * The main() method lets the JVM call into your code.
 * It is the entry point for any standalone Java application.
 *
 * Simplest valid declaration:
 *
 *   public static void main(String[] args)
 *
 *   public       - accessible by the JVM from anywhere
 *   static       - called without needing to create an instance of the class
 *   void         - returns nothing to the JVM
 *   main         - the exact name the JVM looks for
 *   String[] args - command-line arguments passed in as a String array
 *
 * File and Class Rules:
 *   - Each file can contain only ONE public class
 *   - The filename must exactly match the public class name (case-sensitive)
 *   - If the class is the entry point of the program, it must contain a valid main() method
 *
 * Optional Modifiers:
 *   The modifier order can vary and additional modifiers like final are allowed:
 *
 *   public final static void main(final String[] args)   <- valid
 *   static public void main(String... args)              <- valid (varargs)
 *   public static void main(String args[])               <- valid (brackets after name)
 *
 * Key Points for the Exam:
 *   - main() must be public, static, void, and named exactly "main"
 *   - The String array parameter can use [] before or after the name, or varargs (...)
 *   - The parameter variable name does not matter — only the type matters
 *   - A class compiles without main(), but the JVM throws an error at runtime if it is missing
 *   - Without static, the class compiles but the JVM cannot invoke main() at startup
 */
public class MainMethod {

    public static void main(String[] args) {

        // ── 1. Confirm entry point ───────────────────────────────────────────
        System.out.println("main() reached — JVM entry point is working.");

        // ── 2. Reading command-line arguments ────────────────────────────────
        // Compile:  javac MainMethod.java
        // Run with args:  java MainMethod Hello World
        System.out.println("Argument count: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }

        // ── 3. args is never null — only ever empty ──────────────────────────
        if (args.length == 0) {
            System.out.println("No arguments passed — args is empty, not null.");
        }
    }
}
