import React from "react";
import { NavLink } from "react-router-dom";
import classes from "./Menu.module.css";
export default (props) => {
  return (
    <nav className={classes.nav}>
      <div>
        <NavLink to="/home" className={classes.navigationlink}>
          Home
        </NavLink>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <NavLink exact to="/" className={classes.navigationlink}>
          Login
        </NavLink>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <NavLink to="/register" className={classes.navigationlink}>
          Register
        </NavLink>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <NavLink to="/dashboard" className={classes.navigationlink}>
          Dashboard
        </NavLink>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <NavLink to="/admin" className={classes.navigationlink}>
          Admin
        </NavLink>
      </div>
      <div className={classes.username}>{props.logedinUser || "Guest"}</div>
    </nav>
  );
};
