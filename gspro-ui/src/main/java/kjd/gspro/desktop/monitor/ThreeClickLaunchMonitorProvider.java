package kjd.gspro.desktop.monitor;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

import kjd.gspro.monitor.LaunchMonitor;
import kjd.gspro.monitor.LaunchMonitorProvider;

public class ThreeClickLaunchMonitorProvider implements LaunchMonitorProvider {

    private Properties defaultProperties;

    @Override
    public LaunchMonitor create(Properties properties) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Properties getDefaultProperties() {
        if (defaultProperties == null) {
            defaultProperties = new Properties();
        }

        return defaultProperties;
    }
    
    @Override
    public String getName(Locale locale) {
        return ResourceBundle.getBundle("form_launch_monitor", locale).getString("name");
    }

    @Override
    public String getDescription(Locale locale) {
        return ResourceBundle.getBundle("form_launch_monitor", locale).getString("description");
    }

}
