import React, { useState } from "react";
import axios from "axios";

export default () => {
    const [title, updateTitle] = useState("First blog post");

    const onSubmitHandler = async (event) => {
        event.preventDefault();
        await axios
            .post("http://localhost:5000/api/v1/blog/post", {
                title,
            })
            .catch((e) => console.log(e.message));
        updateTitle("");
    };

    return (
        <form onSubmit={onSubmitHandler}>
            <div className="form-group">
                <label>Enter title</label>
                <input
                    type="text"
                    value={title}
                    onChange={(e) => updateTitle(e.target.value)}
                    className="form-control"
                ></input>
                <label>You entered:{title}</label>
                <button className="btn btn-primary">Submit</button>
            </div>
        </form>
    );
};
