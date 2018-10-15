# pet-clinic
Proyecto de curso de Spring Framework.

Instructor: John Thompson.

 ## Proyecto multi modulos maven
 
 Este proyecto consta de varios módulos maven.
 
 Dividir la aplicación en módulos ayuda a lo siguiente:
 
 - Cuando una determinada parte del proyecto necesita tener nuevas funcionalidades o correcciones de errores, simplemente puede concentrarse en ese módulo y ejecutar las pruebas correspondientes. Compilar una fracción de todo el código y ejecutar solo las pruebas relacionadas acelera su trabajo.
 
 - Puede reutilizar el código de los módulos en diferentes proyectos. Supongamos que su proyecto contiene algún código suficientemente genérico para el envío de correo. Si luego tiene otro proyecto que necesita la funcionalidad de envío de correo, simplemente puede reutilizar su módulo existente o desarrollarlo (en otro módulo agregándolo como una dependencia).
 
 - Facilidad de mantenimiento a largo plazo. Tal vez ahora parezca un pequeño proyecto. En unos pocos meses, las cosas pueden verse diferentes y luego tendrá que hacer más refactorización para dividir las cosas en unidades lógicas (módulos).
 
 - Claridad conceptual.
 
 - Al deployear en WAR: puede tener un módulo de ensamblaje que reúne las cosas y produce un archivo WAR final de todos los módulos relacionados.
 
 Inicialmente, esto puede parecer más trabajo, pero a largo plazo, los proyectos modularizados son más fáciles de trabajar y mantener. Los desarrolladores más sanos preferirían este enfoque.
 
 > Fuente: https://stackoverflow.com/questions/6675821/is-there-any-benefit-in-using-maven-multimodule-when-working-in-a-small-applicat
 
  ## Dependencias
  
  Dependencias de módulo pet-clinic-data:
  
    `SQL > JPA`    
    `SQL > MySQL`    
    `SQL > H2`
    `Core > Lombok`
    `spring-boot-starter-test`
    
  Dependencias de módulo pet-clinic-web:
  
    `pet-clinic-data`
    `Ops > Actuator`
    `Template Engines > Thymeleaf`
    `Web > Web`
    `Core > DevTools`
    `spring-boot-starter-test`