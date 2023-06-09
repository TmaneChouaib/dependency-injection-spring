<h2 align="center">IoC - DI with Spring</h2>

## 🔎 Table of Contents :

- [About](#about)
- [Features](#features)
- [Architecture](#architecture)
- [Contributions](#contributions)

## <a name="about"></a> 📎 About :

<img src="IoC-part-02/public-doc/DI.png" align="right" width="400px">

- 🏋️‍♂️ This lab, focuses on dependency injection using <strong>Spring Framework</strong> in Java.It builds upon the concepts explored in the <strong>
<a href="https://github.com/TmaneChouaib/Injection-of-dependencies-01.git">first Lab</a></strong>, where the basics of dependency injection and <strong>inversion of control (IoC)</strong> were covered. To understand The fundamental concepts and features of <strong>dependency injection</strong>, please refer to the <strong><a href="https://github.com/TmaneChouaib/Injection-of-dependencies-01.git">first Lab</a></strong>.

## <a name="features"></a> 📎 Features :

- <strong>SpringXMLPresentation</strong> : Demonstrates dependency injection using Spring XML configuration. It reads the bean configurations from the <code>'applicationContext.xml'</code>
file, instantiates the <code>DAO</code> and <code>Business</code> implementations defined in the XML, and injects the dependencies accordingly.
- <strong>SpringAnnotationPresentation</strong> : Illustrates dependency injection using Spring annotations. It utilizes component scanning and
annotation-based configuration to automatically detect and wire the dependencies.
- <strong>Interface Abstraction</strong> : Continues to utilize the <code>IDao</code> and <code>IBusiness</code> interfaces for <strong>loose coupling</strong> and easy swapping of implementations, as established in the<strong>
<a href="https://github.com/TmaneChouaib/Injection-of-dependencies-01.git">First Lab</a></strong>.
- <strong>Multiple Implementations</strong> : Supports multiple implementations of <code>IDao</code> and <code>IBusiness</code> interfaces allowing flexibility in choosing the 
different implementations for retrieving data from various sources.
- <strong>Externalized Configuration</strong> : Utilizes externalized configuration files <code>applicationContex.xml</code> and annotations to define the bean dependencies and wiring
This enables easy modification and configuration without modifiying the source code.

## <a name="architecture"></a> 📎 Architecture Diagram : (DI) - Layer Structure :

<p align="center">
<img src="IoC-part-02/public-doc/IoC.png">
</p>


## <a name="contributions"></a> 📎 Contributions :

Contributions to this repository are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

### End

----------------------------------------------------------------------------------------------------------

<p align="right">Author: 🎬 Tmane Chouaib</p>