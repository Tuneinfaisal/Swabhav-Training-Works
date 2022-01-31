import React,{useEffect} from "react";

export const MyButton = ({incrementValue,incrementCounter}) => {
    console.log("button loaded");

    useEffect(() => {
        console.log("")
    })
    const handleClick = () => {
        console.log("button clicked");
        incrementCounter(incrementValue);
    }
    
    return (
        <button onClick={handleClick}>+{incrementValue}</button>
    )
}