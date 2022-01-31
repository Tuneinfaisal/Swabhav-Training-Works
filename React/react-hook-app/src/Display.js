import React from "react";
import { useEffect } from "react/cjs/react.development";


export const Display = ({counter}) => {

    console.log("display loaded");
    useEffect(()=>{
        console.log("side effect code of display");
    });

    return (
        <div>
            counter value is : {counter}
        </div>
    )
}