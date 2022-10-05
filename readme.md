```yaml

kafka is a distributed streaming platform that allows producers to send events of streams
to brokers and then consumers can receive those events.

It works through topics.

Kafka is a distributed platfrom since it can work with more than one broker.


With Kafka when messages are sent to the topic they do not disappear.


That is one difference that KAFKA has with RabbitMQ.


In a traditional message Queue, the messages are gone as soon as they have been consumed.


In Kafka Once the data is read off a topic,it still remains there unlike in a message Queue.

That is one difference that KAFKA has to a normal Message Queue.

A topic is a collection of events replicated and partitioned,Durable-hours,days,years/forever.Big or Small.

(A topic is like a log file in KAFKA)

Producer------------------->topic---------------consumer.
        {streams of data
          records}


A Topic is where i log the stream of events emmited by the Producer.


A Producer's Role is to send a Stream of events.

```


**Setting up a Kafka Topic**

```yaml


There are three steps involved in creation of the KAFKA Topic,

1.Producer Config

It is where i setUp my configuration including the broker URL.

i Also setUp the Key Value pairs of what i am sending.


2.Producer Configuration

It is Responsible for Creating Producer Instances

3.Kafka Template

It helps my producer to send messages to my Topic.


```

**Consumer**

```yaml

The Work of the Consumer is to Pull events from the Topic.

```
**Notes By**

```yaml

Mbugua Caleb

```