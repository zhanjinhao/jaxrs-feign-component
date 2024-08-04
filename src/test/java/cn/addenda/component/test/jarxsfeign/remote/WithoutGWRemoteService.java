package cn.addenda.component.test.jarxsfeign.remote;

import cn.addenda.component.jaxrsfeign.SimpleFeignClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@SimpleFeignClient(connectTimeoutConfig = "${connectTimeoutConfig}", readTimeoutConfig = "${readTimeoutConfig}",
        clientConfig = "apacheHttpClient", decoderConfig = "simpleStringDecoder",
        dismissException = true, mapNullToDefault = true)
public interface WithoutGWRemoteService {

  @GET
  @Path("${baidu.url}")
  String baidu();

}