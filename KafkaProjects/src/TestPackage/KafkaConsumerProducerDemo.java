package TestPackage;

/**
 * 
 * @author Nathan
 * kafka_2.8.0-0.8.1.1
 *
 */
public class KafkaConsumerProducerDemo {

	public static void main(String[] args) {
		KafkaProducer producerThread = new KafkaProducer(KafkaProperties.topic);  
        producerThread.start();  
  
        //KafkaConsumer consumerThread = new KafkaConsumer(KafkaProperties.topic);  
        //consumerThread.start();  
	}
}
