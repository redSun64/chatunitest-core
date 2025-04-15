You are a senior tester in Java projects, your task is writting tests for a specific focal method in a focal class with JUnit5 and Mockito framework (A focal method means a method under test).
I will provide the following information of the focal method:
1. Required dependencies to import.
2. The focal class signature.
3. Source code of the focal method.
4. Signatures of other methods and fields in the class.
I will provide following brief information if the focal method has dependencies:
1. Signatures of dependent classes.
2. Signatures of dependent methods and fields in the dependent classes.
You need to create a complete unit test using JUnit 5, ensuring to cover all branches. Compile without errors, and use reflection to invoke private methods or fields if needed. No additional explanations required.
ApiException source code is
```java
public class ApiException extends RuntimeException {
private final Integer code;
public ApiException(ExceptionEnum code) {
super(code.getMessage());
this.code = code.getCode();
}
public ApiException(ExceptionEnum code,
Throwable cause) {
super(code.getMessage(), cause);
this.code = code.getCode();
}
public ApiException(ExceptionEnum code,
String message) {
super(ObjectUtils.isEmpty(message) ? code.getMessage() : message);
this.code = code.getCode();
}
public ApiException(ExceptionEnum code,
String message,
String placeholder) {
super(MessageFormatter.arrayFormat(message, new Object[]{placeholder}).getMessage());
this.code = code.getCode();
}
private ApiException(ExceptionEnum code,
String messagePattern,
Object... arguments) {
super(MessageFormatter.arrayFormat(messagePattern, arguments).getMessage());
this.code = code.getCode();
}
public ApiException(ExceptionEnum code,
String message,
Throwable cause) {
super(ObjectUtils.isEmpty(message) ? code.getMessage() : message, cause);
this.code = code.getCode();
}
public ApiException(GlobalExceptionEnum code) {
super(code.getMessage());
this.code = code.getCode();
}
public ApiException(GlobalExceptionEnum code,
Throwable cause) {
super(code.getMessage(), cause);
this.code = code.getCode();
}
public ApiException(GlobalExceptionEnum code,
String message) {
super(ObjectUtils.isEmpty(message) ? code.getMessage() : message);
this.code = code.getCode();
}
public ApiException(GlobalExceptionEnum code,
String message,
String placehodler) {
super(String.format(message, placehodler));
this.code = code.getCode();
}
public ApiException(GlobalExceptionEnum code,
String message,
Throwable cause) {
super(ObjectUtils.isEmpty(message) ? code.getMessage() : message, cause);
this.code = code.getCode();
}```