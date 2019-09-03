package vip.dtcloud.extractor.snmp.configuration;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

public class Configuration {
    public static Properties getConf(String path) {
        Properties prop = new Properties();
        try {
            //读取属性文件a.properties
            InputStream in = Configuration.class.getClassLoader().getResourceAsStream(path);
            prop.load(in);     ///加载属性列表
            Iterator<String> it = prop.stringPropertyNames().iterator();
            while (it.hasNext()) {
                String key = it.next();
//                System.out.println(key + ":" + prop.getProperty(key));
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return prop;
    }

    /*
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        Properties prop = conf.getConf("kafka-consumer.properties");
        System.out.println(prop.get("bootstrap.servers"));
    }
    */
}
