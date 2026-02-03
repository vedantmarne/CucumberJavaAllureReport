mvn clean verify " -Dcucumber.filter.tag=@type=CM_ViewAll_Page" "-Dallure.results.directory=target/allure-results"
mvn allure:report

mvn clean test -Dtest=StepDefinitions.BackgroundDemoTest

mvn clean verify "-Dtest=StepDefinitions.BackgroundDemoTest" "-Dallure.results.directory=target/allure-results"
mvn allure:report

mvn clean test "-Dtest=StepDefinitions.BackgroundDemoTest" "-Dallure.results.directory=target/allure-results"

mvn allure:serve

mvn clean test -Dtest=StepDefinitions.BackgroundDemoTest -Dallure.results.directory=target/allure-results && mvn allure:report && start target\allure-report\index.html



mvn clean test -Dtest=StepDefinitions.BackgroundDemoTest -Dallure.results.directory=target/allure-results && mvn allure:serve

mvn clean verify -Dtest=StepDefinitions.BackgroundDemoTest -Dallure.results.directory=target/allure-results && mvn allure:report
mvn clean test -Dtest=StepDefinitions.BackgroundDemoTest -Dallure.results.directory=target/allure-results && mvn allure:report



mvn clean test -Dtest=StepDefinitions.BackgroundDemoTest -Dallure.results.directory=target/allure-results && mvn allure:serve

mvn clean test -Dtest=StepDefinitions.BackgroundDemoTest -Dallure.results.directory=target/allure-results && mvn allure:report && start target\site\allure-maven-plugin\index.html
