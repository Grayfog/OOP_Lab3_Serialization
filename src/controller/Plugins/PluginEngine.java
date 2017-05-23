package controller.Plugins;

import java.io.File;

/**
 * Created by dmitry on 22.05.17.
 */
public class PluginEngine {

    public PluginEngine(){}

    public void initialize(PluginLoader loader) throws ClassNotFoundException {

        File dir = new File("plugins");
        String[] plugins = dir.list();

        for (String plugin : plugins) {


            try {

                String moduleName = plugin.split(".class")[0];

                Class clazz = loader.loadClass(moduleName);

                Plugin execute = (Plugin) clazz.newInstance();

                //execute.load();


            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

    }
}
