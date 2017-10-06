ANNOTATIONS
===========

### `@Component`
Indicates that an annotated class is a "component".
Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.


### `@Service`
Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design (Evans, 2003) as
"an operation offered as an interface that stands alone in the model, with no encapsulated state."
May also indicate that a class is a "Business Service Facade" (in the Core J2EE patterns sense), or something similar.
This annotation is a general-purpose stereotype and individual teams may narrow their semantics and use as appropriate.
This annotation serves as a specialization of `@Component`, allowing for implementation classes to be autodetected through
classpath scanning.


### `@Value`
This annotation can be used for injecting values into fields in Spring-managed beans and it can be applied at
the field or constructor/method parameter level.
Typically used for expression-driven dependency injection. Also supported for dynamic resolution of handler method
parameters, e.g. in Spring MVC.
A common use case is to assign default field values using `"#{systemProperties.myProp}"` style expressions.


### `@Controller`
indicates that an annotated class is a "Controller" (e.g. a web controller).
This annotation serves as a specialization of `@Component`, allowing for implementation classes to be autodetected
through classpath scanning.
It is typically used in combination with annotated handler methods based on the
`org.springframework.web.bind.annotation.RequestMapping` annotation.


### `@Autowired`
Marks a constructor, field, setter method or config method as to be autowired by Spring's dependency
injection facilities.


### `@Configuration`
Indicates that a class declares one or more `@Bean` methods and may be processed by the Spring
container
to generate bean definitions and service requests for those beans at runtime, for example:

```java
@Configuration
 public class AppConfig {

     @Bean
     public MyBean myBean() {
         // instantiate, configure and return bean ...
     }
 }
```

### `@ComponentScan`
`@ComponentScan` tells Spring in which packages you have annotated classes which should be managed by
Spring.
So, for example, if you have a class annotated with `@Controller` which is in a package which is not scanned by Spring,
you will not be able to use it as Spring controller.


### `@PropertySource`
`@PropertySource("classpath:application.properties")` is an annotation to load your properties file
when the application context of Spring is loaded, so it should be used in a configuration class, you need
@Configuration


### `@Bean`
A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. 


### `@RequestMapping`
Annotation for mapping web requests onto specific handler classes and/or handler methods.
Provides a consistent style between Servlet and Portlet environments, with the semantics adapting to the concrete environment.


### `public interface ApplicationContext`
Central interface to provide configuration for an application. This is read-only while the application is running,
but may be reloaded if the implementation supports this.
An ApplicationContext provides:
- Bean factory methods for accessing application components. Inherited from `ListableBeanFactory`.
- The ability to load file resources in a generic fashion. Inherited from the `ResourceLoader` interface.
- The ability to publish events to registered listeners. Inherited from the `ApplicationEventPublisher` interface.
- The ability to resolve messages, supporting internationalization. Inherited from the `MessageSource` interface.
- Inheritance from a parent context. Definitions in a descendant context will always take priority. This means,
for example, that a single parent context can be used by an entire web application,
while each servlet has its own child context that is independent of that of any other servlet.


### `public ClassPathXmlApplicationContext(String configLocation)`
Create a new `ClassPathXmlApplicationContext`, loading the definitions from the given XML file and automatically
refreshing the context.


BEANS XML
=========


### Tag name: `component-scan`
Description : Scans the classpath for annotated components that will be auto-registered as Spring beans. 
By default, the Spring-provided `@Component`, `@Repository`, `@Service`, `@Controller`, `@RestController`, `@ControllerAdvice`,
and `@Configuration` stereotypes will be detected.


### Tag name: `property-placeholder` 
Description : Activates replacement of ${...} placeholders by registering a `PropertySourcesPlaceholderConfigurer` within
the application context.
Properties will be resolved against the specified properties file or Properties object -- so called "local properties",
if any, and against the Spring Environment's current set of `PropertySources`.


### Tag name: `bean` 
Description : Defines a single (usually named) bean.
A bean definition may contain nested tags for constructor arguments, property values, lookup methods, and replaced
methods.
Mixing constructor injection and setter injection on the same bean is explicitly supported.


### Tag name: `property` 
Description : Bean definitions can have zero or more properties.
Property elements correspond to JavaBean setter methods exposed by the bean classes.
Spring supports primitives, references to other beans in the same or related factories, lists, maps and properties.


### Tag name: `constructor-arg`
Description : Bean definitions can specify zero or more constructor arguments.
This is an alternative to "autowire constructor".
Arguments correspond to either a specific index of the constructor argument list or are supposed to
be matched generically by type.
Note: A single generic argument value will just be used once, rather than potentially matched multiple times
(as of Spring 1.1).
constructor-arg elements are also used in conjunction with the factory-method element to construct beans using static
or instance factory methods.


### Tag name: `factory-method`
Description : The name of a factory method to use to create this object.
Use constructor-arg elements to specify arguments to the factory method, if it takes arguments.
Autowiring does not apply to factory methods.


### Tag name: `factory-bean`
Description : Alternative to class attribute for factory-method usage.
If this is specified, no class attribute should be used.
This must be set to the name of a bean in the current or ancestor factories that contains the relevant factory method.
This allows the factory itself to be configured using Dependency Injection, and an instance (rather than static) method to be used.


### Tag name: `scope`
Description : The scope of this bean: typically "singleton"
(one shared instance, which will be returned by all calls to getBean with the given id),
or "prototype" (independent instance resulting from each call to getBean).
By default, a bean will be a singleton, unless the bean has a parent bean definition in which case it will inherit
the parent's scope.  Singletons are most commonly used, and are ideal for multi-threaded service objects.
Further scopes, such as "request" or "session", might be supported by extended bean factories (e.g. in a web environment).


### Tag name: `annotation-config`
Description : Activates various annotations to be detected in bean classes: Spring's `@Required` and `@Autowired`,
as well as JSR 250's `@PostConstruct`, `@PreDestroy` and `@Resource` (if available), JAX-WS's `@WebServiceRef` (if available),
EJB 3's `@EJB` (if available), and JPA's `@PersistenceContext` and `@PersistenceUnit` (if available).
Alternatively, you may choose to activate the individual `BeanPostProcessors` for those annotations.
Note: This tag does not activate processing of Spring's `@Transactional` or EJB 3's `@TransactionAttribute` annotation.
Consider the use of the <tx:annotation-driven> tag for that purpose.

PERSISTENCE
===========

### `@Repository`
`@Repository` is a specialized `@Component` and are used for the persistent layer.


### `public interface RowMapper<T>`
An interface used by `JdbcTemplate` for mapping rows of a `ResultSet` on a per-row basis. Implementations of this interface
perform the actual work of mapping each row to a result object, but don't need to worry about exception handling.
SQLExceptions will be caught and handled by the calling `JdbcTemplate`.
Typically used either for JdbcTemplate's query methods or for out parameters of stored procedures. `RowMapper` objects
are typically stateless and thus reusable; they are an ideal choice for implementing row-mapping logic in a single place.
Alternatively, consider subclassing `MappingSqlQuery` from the `jdbc.object` package: Instead of working with separate
`JdbcTemplate` and `RowMapper` objects, you can build executable query objects (containing row-mapping logic) in that style.


### `public class JdbcTemplate`
This is the central class in the JDBC core package. It simplifies the use of JDBC and helps to avoid common errors.
It executes core JDBC workflow, leaving application code to provide SQL and extract results.
This class executes SQL queries or updates, initiating iteration over `ResultSets` and catching JDBC exceptions and
translating them to the generic, more informative exception hierarchy defined in the `org.springframework.dao` package.
Code using this class need only implement callback interfaces, giving them a clearly defined contract.The
`PreparedStatementCreator` callback interface creates a prepared statement given a Connection, providing SQL and any
necessary parameters.
The `ResultSetExtractor` interface extracts values from a `ResultSet`. See also `PreparedStatementSetter` and `RowMapper`
for two popular alternative callback interfaces.
Can be used within a service implementation via direct instantiation with a `DataSource` reference, or get prepared
in an application context and given to services as bean reference. Note: The `DataSource` should always be configured
as a bean in the application context, in the first case given to the service directly, in the second case to the
prepared template.
Because this class is parameterizable by the callback interfaces and the `SQLExceptionTranslator` interface,
there should be no need to subclass it.
All SQL operations performed by this class are logged at debug level, using `org.springframework.jdbc.core
.JdbcTemplate` as log category.


### `public interface DataSource`
A factory for connections to the physical data source that this `DataSource` object represents. An alternative to the
 `DriverManager` facility, a `DataSource` object is the preferred means of getting a connection.
An object that implements the `DataSource` interface will typically be registered with a naming service based on the
Java™ Naming and Directory (JNDI) API.
The `DataSource` interface is implemented by a driver vendor. There are three types of implementations:
Basic implementation -- produces a standard Connection object
Connection pooling implementation -- produces a Connection object that will automatically participate in connection pooling.
This implementation works with a middle-tier connection pooling manager.
Distributed transaction implementation -- produces a Connection object that may be used for distributed transactions
and almost always participates in connection pooling.
This implementation works with a middle-tier transaction manager and almost always with a connection pooling manager.

### `public class NamedParameterJdbcTemplate`
Template class with a basic set of JDBC operations, allowing the use of named parameters rather than traditional `'?'`
placeholders.
This class delegates to a wrapped `JdbcTemplate` once the substitution from named parameters to JDBC style '?'
placeholders is done at execution time. It also allows for expanding a List of values to the appropriate number of
placeholders.


### `public interface SqlParameterSource`
Interface that defines common functionality for objects that can offer parameter values for named SQL parameters,
serving as argument for `NamedParameterJdbcTemplate` operations.
This interface allows for the specification of SQL type in addition to parameter values.
All parameter values and types are identified by specifying the name of the parameter.
Intended to wrap various implementations like a Map or a JavaBean with a consistent interface.


### `public class BeanPropertySqlParameterSource`
SqlParameterSource implementation that obtains parameter values from bean properties of a given `JavaBean` object.
The names of the bean properties have to match the parameter names.
Uses a Spring `BeanWrapper` for bean property access underneath.


### `public class MapSqlParameterSource`
SqlParameterSource implementation that holds a given Map of parameters.
This class is intended for passing in a simple Map of parameter values to the methods of the `NamedParameterJdbcTemplate` class.
The `addValue` methods on this class will make adding several values easier.
The methods return a reference to the `MapSqlParameterSource` itself,
so you can chain several method calls together within a single statement.


WEB XML
=======

### Complex type: `display-nameType`

Description : [ The display-name type contains a short name that is intended to be displayed by tools.
It is used by display-name elements. The display name need not be unique.


### Tag name: `load-on-startup`

Description : The `load-on-startup` element indicates that this servlet should be loaded
(instantiated and have its `init()` called) on the startup of the web application.
The optional contents of these element must be an integer indicating the order in which the servlet should be loaded.
If the value is a negative integer, or the element is not present, the container is free to load the servlet whenever
it chooses. If the value is a positive integer or 0, the container must load and initialize the servlet as the
application is deployed. The container must guarantee that servlets marked with lower integers are loaded before
servlets marked with higher integers. The container may choose the order of loading of servlets with the same
`load-on-start-up` value.


*******************************************************************
