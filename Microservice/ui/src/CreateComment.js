import axios from "axios";
import React, { useState } from "react";

export default ({ postId }) => {
    const [description, updateDescription] = useState("comment#01");
    useState("comment#01");
    const onSubmitHandler = async (event) => {
        event.preventDefault();
        await axios
            .post(`http://localhost:5001/api/v1/blog/post/${postId}/comment`, {
                description,
            })
            .catch((e) => console.log(e.message));
        updateDescription("");
    };

    return (
        <form onSubmit={onSubmitHandler}>
            <div className="form-group">
                <label>Enter comment</label>
                <input
                    type="text"
                    value={description}
                    onChange={(e) => updateDescription(e.target.value)}
                    className="form-control"
                />

                <button className="btn btn-primary">Submit</button>
            </div>
        </form>
    );
};
