import React, { useState, useEffect } from "react";
import axios from "axios";

export default ({ comments }) => {
    const liOfComments = comments.map(c=>{
        return (<li key={c.commentId}>
                {c.description}
        </li>);
    });
    return (<ul>
        {liOfComments}
    </ul>);
};
