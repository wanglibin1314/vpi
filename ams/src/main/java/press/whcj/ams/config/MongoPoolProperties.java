package press.whcj.ams.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xyyxhcj@qq.com
 * @since 2019/12/3
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "spring.data.mongodb.option")
public class MongoPoolProperties {
	private String[] address;
	private String database;
	private String authenticationDatabase;
	private String gridFsDatabase;
	private String username;
	private char[] password;
	private int minConnectionsPerHost;
	private int maxConnectionsPerHost;
	private int threadsAllowedToBlockForConnectionMultiplier;
	private int serverSelectionTimeout;
	private int maxWaitTime;
	private int maxConnectionIdleTime;
	private int maxConnectionLifeTime;
	private int connectTimeout;
	private int socketTimeout;
	private Boolean sslEnabled;
	private Boolean sslInvalidHostNameAllowed;
	private int heartbeatFrequency;
	private int minHeartbeatFrequency;
	private int heartbeatConnectTimeout;
	private int heartbeatSocketTimeout;
	private int localThreshold;
}
