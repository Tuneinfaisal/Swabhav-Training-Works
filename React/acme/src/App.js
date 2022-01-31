import React from "react";
import Menu from "./Menu"
import { Switch,Route,Redirect } from "react-router-dom";
import Acme from "./Acme";
import Home from "./Home";
import Products from "./Products";

export default () => {
    return (
        <div>
            <Menu></Menu>
            <Switch>

                <Route exact path="/">
                    <Acme/>
                </Route>
                <Route exact path="/Home">
                    <Home/>
                </Route>
                <Route exact path="/Products">
                    <Products/>
                </Route>

            </Switch>
        </div>
    )
}