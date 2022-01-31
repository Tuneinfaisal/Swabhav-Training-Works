import React, { useState, useEffect } from "react";
import axios from "axios";
import CreateComment from "./CreateComment";
import DisplayComment from "./DisplayComment";

export default () => {
    console.log("display post reload");
    const [posts, updatePosts] = useState({});
    const getPosts = async () => {
        const resp = await axios.get("http://localhost:5002/api/v1/blog/post");
        updatePosts(resp.data);
    };

    useEffect(() => {
        getPosts();
    }, []);

    const cardOfPosts = Object.values(posts).map((p) => {
        return (
            <div
                className="card"
                style={{ width: "30%", marginBottom: "20px" }}
                key={p.postId}
            >
                <div className="card-body">
                    <h3>
                        {p.title} - {p.postId}
                    </h3>
                    <DisplayComment comments={p.comments}></DisplayComment>
                    <CreateComment postId={p.postId}></CreateComment>
                </div>
            </div>
        );
    });

    console.log(cardOfPosts);

    return (
        <div className="d-flex flex-row flex-wrap justify-content">
            {cardOfPosts}
        </div>
    );
};
