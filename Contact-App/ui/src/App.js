import React from "react";
import Menu from "./Menu";
import { Switch, Route, Redirect } from "react-router-dom";

import Home from "./Home";
import Contacts from "./Contacts";
import Login from "./Login";
import Guest from "./Guest";

export default () => {
    return (
        <div>
            <Menu></Menu>
            <Switch>
                <Route exact path="/">
                    <Home />
                </Route>

                <Route exact path="/contacts">
                    <Contacts />
                </Route>

                <Route exact path="/login">
                    <Login />
                </Route>

                <Route exact path="/guest">
                    <Guest />
                </Route>

            </Switch>
        </div>
    );
};
