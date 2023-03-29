package cz.mkral.coffeeshop.business.configuration;

import org.ocpsoft.rewrite.config.ConfigurationBuilder;
import org.ocpsoft.rewrite.servlet.config.DispatchType;
import org.ocpsoft.rewrite.servlet.config.HttpConfigurationProvider;
import org.ocpsoft.rewrite.servlet.config.Path;
import org.ocpsoft.rewrite.servlet.config.SendStatus;
import org.ocpsoft.rewrite.servlet.config.rule.Join;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import javax.servlet.ServletContext;

@Configuration
public class AppConfiguration extends HttpConfigurationProvider {

    @Override
    public org.ocpsoft.rewrite.config.Configuration getConfiguration(ServletContext context) {
        return ConfigurationBuilder.begin()
                // We want to prevent direct accessing of .xhtml files
                .addRule().when(DispatchType.isRequest().and(Path.matches("/{path}")))
                .perform(SendStatus.code(404))
                .where("path").matches("^/jsf/.*\\.xhtml$")

                // We want to map the root URI to our index page
                .addRule(Join.path("/").to("/index.xhtml"));
    }

    @Override
    public int priority() {
        return 10;
    }
}