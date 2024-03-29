<h2 align="center">DI - IoC with Spring</h2>

## 🔎 Table of Contents :

- [About](#about)
- [Features](#features)
- [Architecture](#architecture)
- [Contacts](#contacts)

## <a name="about"></a> 📎 About :

<img src="public-doc/DI.png" align="right" width="400px">

- 🏋️‍♂️ This lab, focuses on <strong>dependency injection (DI)</strong> using <strong>Spring Framework</strong> in Java. It builds upon the concepts explored in the <strong>
  <a href="https://github.com/TmaneChouaib/dependency-injection-exploration">first Lab</a></strong>, where the basics of dependency injection and <strong>inversion of control (IoC)</strong> were covered. To understand The fundamental concepts and features of <strong>dependency injection</strong>, please refer to the <strong><a href="https://github.com/TmaneChouaib/dependency-injection-exploration">first Lab</a></strong>.

## <a name="features"></a> 📎 Features :

- <strong>SpringXMLPresentation</strong> : Demonstrates dependency injection using Spring XML configuration. It reads the bean configurations from the <code>'applicationContext.xml'</code>
  file, instantiates the <code>DAO</code> and <code>Business</code> implementations defined in the XML, and injects the dependencies accordingly.
- <strong>SpringAnnotationPresentation</strong> : Illustrates dependency injection using Spring annotations. It utilizes component scanning and
  annotation-based configuration to automatically detect and wire the dependencies.
- <strong>Interface Abstraction</strong> : Continues to utilize the <code>IDao</code> and <code>IBusiness</code> interfaces for <strong>loose coupling</strong> and easy swapping of implementations, as established in the<strong>
  <a href="https://github.com/TmaneChouaib/dependency-injection-exploration">First Lab</a></strong>.
- <strong>Multiple Implementations</strong> : Supports multiple implementations of <code>IDao</code> and <code>IBusiness</code> interfaces allowing flexibility in choosing the
  different implementations for retrieving data from various sources.
- <strong>Externalized Configuration</strong> : Utilizes externalized configuration files <code>applicationContex.xml</code> and annotations to define the bean dependencies and wiring
  This enables easy modification and configuration without modifying the source code.

## <a name="architecture"></a> 📎 Architecture Diagram : (DI/DIP) - Layer Structure :

<p align="center">
<img src="public-doc/IOC.png">
</p>


## <a name="contacts"></a> 📎 Contacts:

- For any inquires or feedback regarding this project, please contact me on: chouaib.tmane@hotmail.com.


<p align="right" style="font-size: x-large; font-weight: bold"> End </p>

----------------------------------------------------------------------------------------------------------

<p align="center">
<img src="public-doc/Brand.png">
</p>