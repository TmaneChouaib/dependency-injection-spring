<h2 align="center">DI - Spring IoC Demo</h2>

## 🔎 Table of Contents :

- [About](#about)
- [Features](#features)
- [Class Diagram](#class-diagram)
- [Project Structure](#project-structure)
- [Contacts](#contacts)

## <a name="about"></a> 📎 About :

<img src="public-doc/DI.png" align="right" width="400px">

- 🏋️‍♂️ This lab, focuses on <strong>dependency injection (DI)</strong> using <strong>Spring Framework</strong> in Java. It builds upon the concepts explored in the <strong>
  <a href="https://github.com/TmaneChouaib/dependency-injection-exploration">first Lab</a></strong>, where the basics of dependency injection and <strong>inversion of control (IoC)</strong> were covered. To understand The fundamental concepts and features of <strong>dependency injection</strong>, please refer to the <strong><a href="https://github.com/TmaneChouaib/dependency-injection-exploration">first Lab</a></strong>.

## <a name="features"></a> 📎 Features :

- <strong>SpringXMLPresentation</strong> : Demonstrates dependency injection using Spring XML configuration. It reads the bean configurations from the 'applicationContext.xml'
  file, instantiates the DAO and Business implementations defined in the XML, and injects the dependencies accordingly.
- <strong>SpringAnnotationPresentation</strong> : Illustrates dependency injection using Spring annotations. It utilizes component scanning and
  annotation-based configuration to automatically detect and wire the dependencies.
- <strong>Interface Abstraction</strong> : Continues to utilize the IDao and IBusiness interfaces for <strong>loose coupling</strong> and easy swapping of implementations, as established in the<strong>
  <a href="https://github.com/TmaneChouaib/dependency-injection-exploration">First Lab</a></strong>.
- <strong>Multiple Implementations</strong> : Supports multiple implementations of IDao and IBusiness interfaces allowing flexibility in choosing the
  different implementations for retrieving data from various sources.
- <strong>Externalized Configuration</strong> : Utilizes externalized configuration files applicationContex.xml and annotations to define the bean dependencies and wiring
  This enables easy modification and configuration without modifying the source code.

### <a name="class-diagram"></a>📎 Class Diagram : (DI/DIP) - Layer Structure :

<p align="center">
<img src="public-doc/IoC.jpg">
</p>

## <a name="project-structure"></a> 📎 Project Structure:

```
dependency-injection-demo/
│
├── src/
│   ├── business/
│   │   ├── IBusiness.java
│   │   └── BusinessImpl.java
│   │
│   ├── dao/
│   │   ├── IDao.java
│   │   └── DaoImpl_A.java
│   │
│   ├── extension/
│   │   ├── DaoImpl_B.java
│   │   └── DaoImpl_C.java
│   │
│   ├── presentation/
│   │   ├── DynamicPresentation.java
│   │   └── SpringAnnotationPresentation.java
│   │   └── SpringXmlPresentation.java
│   │   └── StaticPresentation.java
│   │
│   └── Main.java
│
├── config.txt
└── README.md
```

## <a name="contacts"></a> 📎 Contacts:

- For any inquires or feedback regarding this project, please contact me on: chouaib.tmane@hotmail.com.

<p align="right" style="font-size: x-large; font-weight: bold"> End </p>

---

<p align="end">
Author: Tmane Chouaib
</p>
