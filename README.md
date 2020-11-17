# Executing Code on Spring Boot Application Startup

## Application Listener
This approach can be used for running logic after the Spring context has been initialized, so we are not focusing on any particular bean, but waiting for all of them to initialize.  
In order to achieve this you need to create a bean that implements the ApplicationListener<ContextRefreshedEvent> interface:
```
class MyApplicationListener implements ApplicationListener<ApplicationReadyEvent>
```

The same results can be achieved by using the newly-introduced _@EventListener_ annotation:

```
@EventListener
public void onApplicationEvent(ApplicationReadyEvent event) {
```


## Construction Injection
If you are injecting fields using Constructor Injection, you can simply include your logic in a constructor:


## Combining Mechanisms
In order to achieve full control over your beans, you might want to combine the above mechanisms together.

The order of execution is as follows:

1. The constructor
2. the @PostConstruct annotated methods
3. the InitializingBean's afterPropertiesSet() method
4. the initialization method specified as init-method in XML

Let's create a Spring bean that combines all mechanisms:

```
@Component
@Scope(value = "prototype")
public class AllStrategiesExampleBean implements InitializingBean {
 
    private static final Logger LOG 
      = Logger.getLogger(AllStrategiesExampleBean.class);
 
    public AllStrategiesExampleBean() {
        LOG.info("Constructor");
    }
 
    @Override
    public void afterPropertiesSet() throws Exception {
        LOG.info("InitializingBean");
    }
 
    @PostConstruct
    public void postConstruct() {
        LOG.info("PostConstruct");
    }
 
    public void init() {
        LOG.info("init-method");
    }
}
```