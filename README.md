# CXF Restful + Spring dependencies: 
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-web</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-frontend-jaxrs</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-wsdl</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-ws-policy</artifactId>
			<version>${cxf.version}</version>
		</dependency>

# CXF WADL dependencies: 
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-rs-service-description</artifactId>
			<version>${cxf.version}</version>
		</dependency>
    
# CXF Json Response use jettison as default dependencies:
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-rs-extension-providers</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<dependency>
			<groupId>org.codehaus.jettison</groupId>
			<artifactId>jettison</artifactId>
			<version>1.3.8</version>
		</dependency>
    
