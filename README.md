# start zookeeper & kafka
./bin/zookeeper-server-start.sh ./config/zookeeper.properties \n
./bin/kafka-server-start.sh ./config/server.properties

# message format
{"id":"1","eventTime":"20230329223910205","temperature":0.89}
{"id":"2","eventTime":"20230329223911208","temperature":0.93}
{"id":"2","eventTime":"20230329223912214","temperature":0.44}
{"id":"4","eventTime":"20230329223913218","temperature":0.23}
{"id":"1","eventTime":"20230329223914222","temperature":0.89}
{"id":"1","eventTime":"20230329223915225","temperature":0.44}
{"id":"4","eventTime":"20230329223916228","temperature":0.88}
{"id":"2","eventTime":"20230329223917232","temperature":0.88}
{"id":"4","eventTime":"20230329223918235","temperature":0.44}
{"id":"4","eventTime":"20230329223919241","temperature":0.44}
{"id":"4","eventTime":"20230329223920246","temperature":0.99}
{"id":"4","eventTime":"20230329223921254","temperature":0.99}
{"id":"1","eventTime":"20230329223922259","temperature":0.44}
{"id":"4","eventTime":"20230329223923260","temperature":0.99}
{"id":"1","eventTime":"20230329223924263","temperature":0.23}
{"id":"4","eventTime":"20230329223925267","temperature":0.93}
{"id":"1","eventTime":"20230329223926270","temperature":0.93}
