/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.ms.anotaciones;

import com.sample.ms.MSVentas.entity.SaludoRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author B142837
 */
@Aspect
@Component
@Scope("prototype")
public class Aspecto {
    
    public Aspecto(){
        super();
    }
    
    @Around("execution(* com.sample.ms..*(..)) && @annotation(trazable)")
    public Object trazable(ProceedingJoinPoint point, Interceptor trazable) throws Throwable{
        System.out.println("Entra al aspecto...");
        for (Object item : point.getArgs()) {
            if(item instanceof SaludoRequest){
                SaludoRequest request = (SaludoRequest)item;
                if(request.getPss().equals("digi") && request.getUss().equals("digi")){
                    System.out.println("Simona la cacariza.");
                    Object[] args = {request};
                    return point.proceed(args);                   
                }
                else{
                    System.out.println("nellll");
                }
            }
        }
        return null;
    }
}
