package tn.aymax.saptechnique.kaddemproject.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import tn.aymax.saptechnique.kaddemproject.entities.Etudiant;

@Component
@Aspect
@Slf4j
public class PerformanceAspect {
    @Around("execution(* tn.aymax.saptechnique.kaddemproject.Services.IEtudiantServicesImp.*(..))")
    public Etudiant profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Etudiant obj =(Etudiant)pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }
    
}
