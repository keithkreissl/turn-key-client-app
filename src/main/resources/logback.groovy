appender("CONSOLE", ConsoleAppender){
	println "i am in the groovy file"
	encoder(PatternLayoutEncoder){
		pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
   	 }
}

root(ERROR, ["CONSOLE"])
