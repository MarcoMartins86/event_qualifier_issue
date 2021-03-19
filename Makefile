all:
	mvn clean install -f qualifier_issue_lib/pom.xml
	mvn clean compile -f runner-module/pom.xml quarkus:dev