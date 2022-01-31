import React from "react";
import { useEffect } from "react/cjs/react.development";

import { App } from "./App";

export const AppWrapper = () => {
    console.log("App wrapper loaded");

    useEffect(() => {
        console.log("inside side effects code1 of wrapper");
    });
    useEffect(() => {
        console.log("inside side effects code2 of wrapper");
    });
    
    return (
        <div>
            Inside Wrapper...

            <App/>
        </div>
    )
}