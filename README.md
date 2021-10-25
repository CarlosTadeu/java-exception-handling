# Java Exception Handling

![https://i.stack.imgur.com/nOffA.png](https://i.stack.imgur.com/nOffA.png)

**Error:**
An Error is an object that can be thrown by an application to indicate a serious problem that should not be caught. Errors, often indicate abnormal conditions that should never occur.

**Two common errors:**

**IOError:**  is thrown when there is an unrecoverable error with IO or input/output. It is thrown when it is best to terminate the program rather than attempt to handle the exception.

**Virtual Machine Error:** indicate an issue with the Java virtual machine or JVM. Running out of resources it needs to continue working. The subclasses of this error are internal error, unknown error, out of memory error and stack overflow error. Internal error, unknown error, and out of memory error are named appropriately. They're thrown whenever there's an internal issue, an unknown issue, or we have run out of memory. The stack overflow error has a name that is not as straightforward as the other three. Stack overflow occurs when an app is using too much of its memory stack causing the stack to overflow. The most common way for stack overflow errors to occur is through recursion. When an app recurses improperly or recurses too much, it runs out of stack.

**Exceptions:**
Are another object that can be thrown and indicates conditions that an application might want to catch and handle.
There are two subclasses to the exception object - checked exception and unchecked exception or runtime exception.

**Throwables:**
Both Errors and Exceptions are subclasses of the throwable class. The Throwable class is a superclass of all errors and exception in Java. These objects can be thrown using the throw statement, and they can be caught using the catch clause.

**Throwables, Errors and Exceptions:**
Throwables, errors, and exceptions are indicators that an application is not performing as expected. Not handling errors or exceptions can lead to unpredictable behavior of your app and unreliability. For instance, some errors will make your app non-responsive and may even shut the application down. Beyond knowing that errors and exceptions are throwables, we also need to define unchecked and checked throwables. Note, this is different from checked and unchecked exceptions as mentioned before.

**Checked Throwables:**
All checked exceptions are checked throwables in Java. They are checked at compile time. This means any checked exceptions must be declared in the method hitter, caught, or handled in some way. If a checked exception could potentially occur in a method or a class and that exception is not handled, the code will not compile at all. Apps can potentially recover from checked throwables and continue its work.

**Unchecked Throwables:**
Unchecked throwables include all errors and any runtime exceptions, which are not checked at compile time. Apps will likely not be able to recover at all from an unchecked throwable.
