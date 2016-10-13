package TestPackage;

import java.util.Properties;  
import kafka.producer.KeyedMessage;  
import kafka.producer.ProducerConfig;  
import kafka.javaapi.producer.Producer;
  

public class KafkaProducer extends Thread  
{  
    private final Producer<Integer, String> producer;  
    private final String topic;  
    private final ProducerConfig config;
    private final Properties props = new Properties();  
  
    public KafkaProducer(String topic)  
    {  
    	props.put("metadata.broker.list", "192.168.0.126:9092");  
    	props.put("serializer.class", "kafka.serializer.StringEncoder");
    	
        config=new ProducerConfig(props);
        producer = new Producer<Integer, String>(config);  
        this.topic = topic;  
    }  
  
    @Override  
    public void run() {  
        int messageNo = 1;  
        while (true)  
        {  
            String messageStr = new String("Message_" + messageNo);  
            System.out.println("Send:" + messageStr);  
            producer.send(new KeyedMessage<Integer, String>(topic, messageStr));  
            messageNo++;  
            try {  
                sleep(1000);  
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
    }  
  
}  