echo 'cleaning..'
rm -f *.class
echo "compiling..."
javac -cp ../junit-4.10.jar *.java
if [ $? != 0 ] 
	then exit
fi
echo "running tests.."
java -cp ".;../junit-4.10.jar" org.junit.runner.JUnitCore WcTest
java -cp ".;../junit-4.10.jar" org.junit.runner.JUnitCore ArgsSepratorTest
java -cp ".;../junit-4.10.jar" org.junit.runner.JUnitCore HandleArgsTest

echo $?