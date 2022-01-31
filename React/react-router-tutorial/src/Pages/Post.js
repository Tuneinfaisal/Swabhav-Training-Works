import React from 'react';
import { useLocation, useParams } from 'react-router-dom/cjs/react-router-dom.min';

const Post = () => {

    const { id } = useParams();

    const query = new URLSearchParams(useLocation().search);

    return (
        <>
            <h2>Id is = {id}</h2>
            <h2>{query.get("firstName")}</h2>
            <h2>{query.get("lastName")}</h2>
        </>
    );
};

export default Post;
