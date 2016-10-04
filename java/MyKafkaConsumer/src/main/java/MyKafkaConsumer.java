package mykafkaconsumer;

import org.apache.kafka.clients.consumer.Consumer; 
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.ConsumerRecord; 
import org.apache.kafka.clients.consumer.ConsumerRecords; 

import org.apache.kafka.common.errors.WakeupException;

import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Properties; 
import java.util.Arrays; 

public class MyKafkaConsumer {
  public static void main (String[] args) {
    Properties props = new Properties();
    props.put("bootstrap.servers", "localhost:9092");
    props.put("group.id", "testGroup");
    props.put("key.deserializer", StringDeserializer.class.getName());
    props.put("value.deserializer", StringDeserializer.class.getName());
    KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props); 

    try {
      consumer.subscribe(Arrays.asList("test"));
      while (true) {
      ConsumerRecords<String, String> records = consumer.poll(Long.MAX_VALUE);
      for (ConsumerRecord<String, String> record : records)
        System.out.println(record.offset() + ": " + record.value());
      }
    } catch (WakeupException e) {
      // ignore for shutdown
    } finally {
      consumer.close();
    }
  }
}
