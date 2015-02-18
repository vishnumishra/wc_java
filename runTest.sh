echo 'cleaning..'
rm -f *.class

echo "compiling..."
javac -cp junit-4.10.jar *.java

echo "running tests.."
java -cp ".;junit-4.10.jar" org.junit.runner.JUnitCore WcTest
