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


**Notes By**

```yaml

Mbugua Caleb

```