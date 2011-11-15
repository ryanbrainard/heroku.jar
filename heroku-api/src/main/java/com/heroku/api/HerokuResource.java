package com.heroku.api;

import com.heroku.api.command.AppCommand;

/**
 * TODO: Enter JavaDoc
 *
 * @author Naaman Newbold
 */
public enum HerokuResource {
    Login("/login"),
    Apps("/apps"),
    App("/apps/%s"),
    User("/user"),
    Key(User.value + "/keys/%s"),
    Keys(User.value + "/keys"),
    Collaborators(App.value + "/collaborators"),
    Collaborator(Collaborators.value + "/%s"),
    ConfigVars(App.value + "/config_vars"),
    Logs(App.value + "/logs"),
    Process(App.value + "/ps"),
    Restart(Process.value + "/restart"),
    Stop(Process.value + "/stop"),
    Scale(Process.value + "/scale");

    public final String value;
    
    HerokuResource(String value) {
        this.value = value;
    }
}
