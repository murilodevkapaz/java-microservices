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
	@mvn clean spring-boot:run \
  -s settings-clean.xml \
  -Dspring-boot.run.jvmArguments="-Dserver.port=8001 -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"	

mvnInstall:
	@mvn clean install -U -s settings-clean.xml

