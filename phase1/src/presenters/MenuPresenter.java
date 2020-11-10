package presenters;

import java.util.ArrayList;

/** A menu presenter that formats menu options to display */
public class MenuPresenter {

    /**
     * Create a new MenuPresenter
     */
    public MenuPresenter(){};

    /**
     * Format and return the given options
     *
     * @param options the list of options
     * @return the formatted string derived from the given options
     */
    public static String getOptions(ArrayList options){
        String formattedOptions = new String("");
        for (int i = 0; i < options.size(); i++){
            formattedOptions = formattedOptions + (String)options.get(i) + "\n";
        }
        return formattedOptions;
    }
}
