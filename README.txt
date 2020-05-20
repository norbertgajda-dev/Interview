1, My choice was python for data processing, because It is very easy to write some data manipulation scripts with it

2, For Test Automation I used simple Java project in Netbeans 8.2 and Selenium with chromedriver 81. It was the fastest way to implement the tests.
I did not create a proper framework, for report etc. Just the base test steps.

3, I used Jmeter for performance test.
If you would like to try, you need jmeter 5.3. Something was wrong with the earlier builds (5.1.1), and a random genereted variable was not working.
I used amazon.com for the test, but the response time for the request rather higher than 1sec. I set Duration Assertion to 1000ms because the test request it,
so if there is no request, you should change this value.
Right now there is one user in the test, and 10 loop count.


