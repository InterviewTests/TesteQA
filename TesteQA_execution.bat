%cd%
mvn install
mvn test -Dcucumber.options=" --tags @CalculoInternacional"

exit /b 0