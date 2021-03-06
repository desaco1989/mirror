[chapter Annotations]

Annotation Manipulation using Mirror.

[section Reflecting]

You can easily reflect all annotations from a class:

[java]
Class<T> clazz;
List<Annotation> annotations = new Mirror().on(clazz).reflectAll()
									.annotations().atClass();
[/java]

As you can also easily reflect all annotations from a field or from a method:

[java]
Class<T> clazz;
List<Annotation> methodAnnotations = new Mirror().on(clazz).reflectAll()
							.annotations().atMethod("methodName").withoutArgs();
							
List<Annotation> fieldAnnotations = new Mirror().on(clazz).reflectAll()
							.annotations().atField("fieldName");
[/java]

It's also possible to retrieve a value from an annotation property, 
just like the following snippet:

[java]
FooAnnotation annotation = new Mirror().on(clazz).reflect()
									.annotation(FooAnnotation.class).atClass();
String propertyValue = annotation.aProperty();
[/java]

And it also works similarly for fields and methods annotations:

[java]
FooAnnotation annotation = new Mirror().on(clazz).reflect()
						.annotation(FooAnnotation.class).atField("fieldName");
String fieldPropertyValue = annotation.aProperty();

FooAnnotation annotation = new Mirror().on(clazz).reflect()
						.annotation(FooAnnotation.class)
						.atMethod("methodName").withoutArgs();
String methodPropertyValue = annotation.aProperty();
[/java]