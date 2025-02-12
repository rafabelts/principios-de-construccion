# Actividad 1. Convenciones y código limpio (clean code)
Programa para llevar el control del personal de la selección Mexicana de Futbol.

![diagrama de clases control de personal de la seleccion mexicana](https://eminus.uv.mx/eminusapi/froala/cur_60174/Actividades/act_400103/froala/23eac07b-f27b-4a6d-addb-d5425c672c22.jpg)

## Diagrama propuesto
```mermaid
---
title: Control de personal de la selección mexicana
---
classDiagram
    Worker <|-- Footballer
    Worker <|-- Coach
    Worker <|-- Masseuse 

     class Worker{
        <<Abstract>>
        # Id: Integer
        # Name: String
        # Apellidos: String
        # Age: String
        + getId(): Integer
        + getName(): String
        + getAge(): Integer
        + toString(): String
        + focus()*: void
        + travel(destiny: String)*: void
    }

    class Footballer {
        - jersey: Integer
        - position: String
        + playMatch(): void
        + train(): void
        + getJersey(): Integer
        + getPosition(): String
    }
    
    class Coach {
        - federation: Integer
        + directMatch(): String
        + directTrainning(): void
        + getFederation(): Integer
    }

    class Masseuse {
        - speciality: String
        - experience: Integer
        + giveMassage(): void
        + getSpeciality: String
        + getExperience: String
    }
```
