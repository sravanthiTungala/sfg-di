package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean,
        BeanFactoryAware, BeanNameAware, ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("## I am in the life cycle demo bean constructor.");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set.");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My bean Name is:" +name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The life cycle has been terminated.");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## post construct annotated method is called.");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## pre destroy annotated method is called.");
    }

    public void beforeInit(){
        System.out.println("## Before Init - called by bean post processor.");
    }

    public void afterInit(){
        System.out.println("## After Init - called by bean post processor.");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The Life Cycle has its properties set!!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application Context has been set !!");
    }
}
