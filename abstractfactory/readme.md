# Abstract Factory Design Pattern

> objectif de ce design pattern est de permet de rassembler des méthodes communes à des familles d’objets différents dans une classe commune : la fabrique abstraite, afin d’éviter au client d’appeler des méthodes différentes (concrètes) par famille d’objets.

![](diagrmme%20de%20classe.png)
**AbstractFactory** :une interface qui regroupe toutes les méthodes de fabriquation des objets

**ConcreteFactory1** et **ConcreteFactory2** :sont des classes concrete qui fabrique les même objets mes de différentes familles **ConcreteFactory1**=>famille 1, **ConcreteFactory2**=>famille 2.

**ProductB** et **ProductA** : sont des interfaces qui represent les objets qu'on veut les crés.