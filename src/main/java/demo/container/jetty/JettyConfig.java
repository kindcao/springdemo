package demo.container.jetty;

/**
 * Created by kind on 2017/3/22.
 */
// @Configurable
public class JettyConfig {
    // @Profile("jetty")
    // @Bean
    // public JettyEmbeddedServletContainerFactory
    // jettyEmbeddedServletContainerFactory(
    // JettyServerCustomizer jettyServerCustomizer) {
    // JettyEmbeddedServletContainerFactory factory = new
    // JettyEmbeddedServletContainerFactory();
    // factory.addServerCustomizers(jettyServerCustomizer);
    // return factory;
    // }
    //
    // @Bean
    // public JettyServerCustomizer jettyServerCustomizer() {
    // return server -> {
    // // Tweak the connection config used by Jetty to handle incoming HTTP
    // // connections
    // final QueuedThreadPool threadPool =
    // server.getBean(QueuedThreadPool.class);
    // threadPool.setMaxThreads(100);
    // threadPool.setMinThreads(20);
    // };
    // }
}
