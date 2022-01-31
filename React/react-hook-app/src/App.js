import React, { useState, useEffect } from "react";
import { Display } from "./Display";
import { MyButton } from "./MyButton";

export const App = () => {
    console.log("App loaded");
    const [counter, updateCounter] = useState(0);

    useEffect(() => {
        console.log("Side effect1 code of App component");
        updateCounter(counter);
    },[]);

    useEffect(() => {
        console.log("Side effect2 code of App component");
        console.log("called whenever count changes");
        
    },[counter]);

    console.log("App loaded");

    const incrementCounter = (amt) => {
        updateCounter(counter+amt);
    }

    return (
        <div>
            App
            <MyButton incrementValue={5} incrementCounter={incrementCounter}></MyButton>
            <MyButton incrementValue={10} incrementCounter={incrementCounter}></MyButton>
            <MyButton incrementValue={100} incrementCounter={incrementCounter}></MyButton>
            <Display counter={counter}></Display>
        </div>
    );
};
