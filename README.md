# Executing Code on Spring Boot Application Startup

## Application Listener
This approach can be used for running logic after the Spring context has been initialized, so we are not focusing on any particular bean, but waiting for all of them to initialize.  
In order to achieve this you need to create a bean that implements the ApplicationListener<ContextRefreshedEvent> interface:
```
class MyApplicationListener implements ApplicationListener<ApplicationReadyEvent>
```

The same results can be achieved by using the newly-introduced _@EventListener_ annotation:

```

```