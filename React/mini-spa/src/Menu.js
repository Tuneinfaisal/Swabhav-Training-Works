import React from "react";
import { NavLink } from "react-router-dom";

export default () => {
    return(
        <nav>
            <NavLink exact to="/">Home</NavLink> &nbsp;|&nbsp;
            <NavLink to="/about">About</NavLink> &nbsp;|&nbsp;
            <NavLink to="/career">Career</NavLink> &nbsp;|&nbsp;
            <NavLink to="/contact">Contact</NavLink> &nbsp;|&nbsp;
        </nav>
    );
}