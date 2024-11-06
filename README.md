# OTA_observatory

The backend of the OTA Observatory Platform will serve as the engine that handles data processing, interaction with the database, and serves the necessary APIs to the front-end (React.js or any other front-end framework). Below is an outline of the back-end functionality, using Spring Boot to provide RESTful APIs for the platform.

<b> 1. Overview </b> <br/> <br/>
The backend will be responsible for:
  Managing the database of regions, prefectures, and related statistical data.
  Exposing RESTful APIs that allow the front-end to retrieve and interact with data.
  Performing data aggregation and statistical analysis on various variables (e.g., land registry, mortgages, foreclosures, etc.).
  Handling user queries on boundaries and displaying relevant charts/statistics.

<b> 2. Key Technologies  </b>
  <li>Spring Boot: For building the backend API.</li>
  <li>Spring Data JPA: For database interaction and ORM (Object Relational Mapping).</li>
  <li>H2 Database or PostgreSQL: For storing geographic and statistical data.</li>
  <li>Spring Security (optional): For securing APIs if authentication/authorization is needed.</li>
  <li>Jackson (for JSON processing): For sending and receiving data in JSON format.</li>
  <li>Spring Web (REST APIs): For building RESTful services to communicate with the front-end.</li>
