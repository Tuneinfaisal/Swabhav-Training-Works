import React from "react";
import { NavLink } from "react-router-dom";
import "./Menu.css";

export default () => {
    return (
        <>
            
            <div class="topnav" id="myTopnav">
                <nav>
                    <NavLink exact to="/">Acme product management</NavLink>
                    <NavLink to="/home">Home</NavLink>
                    <NavLink to="/Products">Products</NavLink>
                </nav>
            </div>
        </>
    )
}