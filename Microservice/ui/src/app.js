import React from "react";
import CreatePost from "./CreatePost";
import DisplayPost from "./DisplayPost";

export default () => {
    return (
        <div className="container">
            <h1>Blog App</h1>
            <CreatePost></CreatePost>
            <DisplayPost></DisplayPost>
        </div>
    );
};
