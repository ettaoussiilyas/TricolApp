Fournisseur Management System
Project Overview
Tricol is a company specialized in designing and manufacturing professional clothing. This application provides efficient supply chain management, starting with a comprehensive supplier management module as the foundation for a complete supply management system that will later include product, order, and inventory management.

This initial phase focuses on developing a robust supplier management module using Spring Core fundamentals, with an architecture designed for future system expansion.

Features
Supplier Management
Add Supplier: Register suppliers with complete information including company name, address, contact person, email, phone, city, and ICE (Business Enterprise Identifier)

Edit Supplier: Update existing supplier information

Delete Supplier: Remove suppliers from the system

View Suppliers: Display all suppliers with sorting options (by name)

Technical Stack
Core Technologies
Java with Spring Core

Spring IoC Container for dependency management

Spring Beans with configurable scopes

ApplicationContext and BeanFactory

Configuration
Spring configuration supports all three approaches:

XML configuration

Annotations

Java Config

Component Scanning

Architecture
Layered Architecture (Repository, Service, Controller)

Spring Data JPA repositories

Service and Controller patterns

Spring MVC

Persistence
Spring Data JPA for data access layer

Automatic standard query generation (findAll(), findById(), count(), etc.)

Custom query methods using Query Methods (findByNom(), findByEmailEndingWith(), etc.)

REST API Endpoints
Supplier Endpoints
Method	Endpoint	Description
GET	/api/v1/fournisseurs	Get all suppliers
GET	/api/v1/fournisseurs/{id}	Get supplier by ID
POST	/api/v1/fournisseurs	Create new supplier
PUT	/api/v1/fournisseurs/{id}	Update existing supplier
DELETE	/api/v1/fournisseurs/{id}	Delete supplier
Performance Criteria
Properly structured layered architecture

Implementation of all three Spring configuration types (XML, annotations, Java)

Efficient dependency management via Spring IoC

Functional REST API

Clean, well-commented code following best practices

Future Extensions
This supplier management module serves as the foundation for future enhancements including:

Product management

Order management

Inventory management

Advanced reporting and analytics