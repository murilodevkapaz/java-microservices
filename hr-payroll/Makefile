############################################################################### Main
help:	      ## This help
	@clear
	@echo ""
	@echo " ##  ##    #####"
	@echo " #######  ##"
	@echo " ## # ##   #####"
	@echo " ##   ##       ##"
	@echo " ##   ##  ######"
	@echo ""
	@cat $(MAKEFILE_LIST) | grep -e "^[a-zA-Z_\-]*: *.*"
############################################################################### Project support

run: # iniciar projeto
	@echo "-- [RUN] Starting HR-WORKER"
	@mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8787"



mvnInstall:
	@mvn clean install -U -s ~/.m2/settings.xml
