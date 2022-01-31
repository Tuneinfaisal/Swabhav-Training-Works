import React from "react";
import Menu from "./Menu";
import { Switch, Route, Redirect } from "react-router-dom";
import Home from "./Home";
import About from "./About";
import Career from "./Career";
import PageNotFound from "./PageNotFound";

export default () => {
    return (
        <div>
            <Menu></Menu>
            <Switch>
                <Route exact path="/">
                    <Home />
                </Route>

                <Route exact path="/about">
                    <About />
                </Route>

                <Route exact path="/career">
                    <Career />
                </Route>

                <Route path="*">
                    <PageNotFound />
                </Route>
            </Switch>
        </div>
    );
};
