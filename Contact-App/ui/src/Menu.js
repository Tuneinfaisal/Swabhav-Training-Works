import React from "react";
import { NavLink } from "react-router-dom";

export default () => {
    return(
        <nav>
            <NavLink exact to="/">Home</NavLink> &nbsp;|&nbsp;
            <NavLink to="/contacts">Contacts</NavLink> &nbsp;|&nbsp;
            <NavLink to="/login">Login</NavLink> &nbsp;|&nbsp;
            <NavLink to="/guest">Guest</NavLink> &nbsp;|&nbsp;
        </nav>
    );
}